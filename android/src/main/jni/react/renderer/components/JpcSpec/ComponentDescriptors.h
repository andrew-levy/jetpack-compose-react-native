#pragma once

#include <algorithm>
#include <cmath>
#include <limits>
#include <unordered_map>
#include <type_traits>

#include <folly/dynamic.h>
#include <react/renderer/components/JpcSpec/EventEmitters.h>
#include <react/renderer/components/JpcSpec/Props.h>
#include <react/renderer/components/view/ConcreteViewShadowNode.h>
#include <react/renderer/core/ConcreteComponentDescriptor.h>
#include <react/renderer/componentregistry/ComponentDescriptorProviderRegistry.h>
#include <react/renderer/mapbuffer/MapBufferBuilder.h>

namespace facebook::react {

void JpcSpec_registerComponentDescriptorsFromCodegen(
    std::shared_ptr<const ComponentDescriptorProviderRegistry> registry);

struct JpcComposeLayoutState {
  Size measuredSize{};
  Float fittedWidth{-1};
  std::unordered_map<Tag, Size> childProposals;

  JpcComposeLayoutState() = default;

  JpcComposeLayoutState(const JpcComposeLayoutState &previous, folly::dynamic data)
      : JpcComposeLayoutState(previous) {
    if (data.count("measuredWidth")) {
      measuredSize = {
          static_cast<Float>(data["measuredWidth"].asDouble()),
          static_cast<Float>(data["measuredHeight"].asDouble())};
      fittedWidth = static_cast<Float>(data["fittedWidth"].asDouble());
    }
    if (data.count("childProposals")) {
      childProposals.clear();
      for (const auto &proposal : data["childProposals"]) {
        childProposals.emplace(
            static_cast<Tag>(proposal["tag"].asInt()),
            Size{static_cast<Float>(proposal["width"].asDouble()),
                 static_cast<Float>(proposal["height"].asDouble())});
      }
    }
  }

  folly::dynamic getDynamic() const { return folly::dynamic::object(); }
  MapBuffer getMapBuffer() const { return MapBufferBuilder::EMPTY(); }
};

inline constexpr char JpcComposeHostComponentName[] = "JpcComposeHost";
inline constexpr char JpcComposeNodeComponentName[] = "JpcComposeNode";

template <const char *Name, typename PropsT, typename EventEmitterT>
class JpcComposeShadowNode final
    : public ConcreteViewShadowNode<Name, PropsT, EventEmitterT, JpcComposeLayoutState> {
  using Base = ConcreteViewShadowNode<Name, PropsT, EventEmitterT, JpcComposeLayoutState>;
  static constexpr bool isHost = std::is_same_v<PropsT, JpcComposeHostProps>;

 public:
  using Base::Base;

  static ShadowNodeTraits BaseTraits() {
    auto traits = Base::BaseTraits();
    traits.set(ShadowNodeTraits::Trait::LeafYogaNode);
    traits.set(ShadowNodeTraits::Trait::MeasurableYogaNode);
    return traits;
  }

  Size measureContent(const LayoutContext &, const LayoutConstraints &constraints) const override {
    if constexpr (isHost) {
      const auto &state = this->getStateData();
      const auto &maximum = constraints.maximumSize;
      auto width = state.measuredSize.width;
      if (std::isfinite(maximum.width) && (width <= 0 || state.fittedWidth == maximum.width)) {
        width = maximum.width;
      }
      return constraints.clamp({width, state.measuredSize.height});
    }
    return constraints.clamp({});
  }

  void layout(LayoutContext context) override {
    this->ensureUnsealed();
    const auto children = this->getChildren();
    const auto &proposals = this->getStateData().childProposals;
    const auto infinity = std::numeric_limits<Float>::infinity();

    for (size_t index = 0; index < children.size(); ++index) {
      const auto &child = children[index];
      if (!dynamic_cast<const YogaLayoutableShadowNode *>(child.get())) {
        continue;
      }
      auto clone = child->clone({});
      auto &layoutable = static_cast<YogaLayoutableShadowNode &>(*clone);
      const auto props = dynamic_cast<const YogaStylableProps *>(child->getProps().get());
      if (props && props->yogaStyle.display() == yoga::Display::None) {
        LayoutMetrics metrics{};
        metrics.displayType = DisplayType::None;
        layoutable.setLayoutMetrics(metrics);
      } else {
        Size maximum{infinity, infinity};
        if (const auto proposal = proposals.find(child->getTag()); proposal != proposals.end()) {
          maximum.width = proposal->second.width < 0 ? infinity : proposal->second.width;
          maximum.height = proposal->second.height < 0 ? infinity : proposal->second.height;
        }
        LayoutConstraints constraints{};
        constraints.maximumSize = maximum;
        constraints.layoutDirection = this->getLayoutMetrics().layoutDirection;
        layoutable.layoutTree(context, constraints);
      }
      if (context.affectedNodes) {
        context.affectedNodes->push_back(&layoutable);
      }
      this->replaceChild(*child, clone, index);
    }
  }
};

using JpcComposeHostComponentDescriptor = ConcreteComponentDescriptor<
    JpcComposeShadowNode<JpcComposeHostComponentName, JpcComposeHostProps, JpcComposeHostEventEmitter>>;
using JpcComposeNodeComponentDescriptor = ConcreteComponentDescriptor<
    JpcComposeShadowNode<JpcComposeNodeComponentName, JpcComposeNodeProps, JpcComposeNodeEventEmitter>>;

} // namespace facebook::react
