// ComposeChildLayout.cpp

#include "layout/ComposeChildLayout.h"

#include "core/ComposeLayoutMath.h"

#include <react/renderer/components/view/YogaStylableProps.h>
#include <react/renderer/core/ComponentDescriptor.h>
#include <react/renderer/core/LayoutConstraints.h>
#include <react/renderer/core/LayoutMetrics.h>
#include <react/renderer/core/PropsParserContext.h>
#include <react/renderer/core/RawProps.h>

namespace jetpackcomposereactnative {

using namespace facebook::react;
namespace yoga = facebook::yoga;

void layoutComposeChildren(YogaLayoutableShadowNode &parent, LayoutContext context, const ComposeHostStateData &state) {
  parent.ensureUnsealed();

  // Copy: `replaceChild` mutates the list being iterated.
  const auto children = parent.getChildren();
  const auto layoutDirection = parent.getLayoutMetrics().layoutDirection;

  for (size_t index = 0; index < children.size(); ++index) {
    const auto &child = children[index];
    if (!dynamic_cast<const YogaLayoutableShadowNode *>(child.get())) {
      continue;
    }
    auto clone = cloneForComposePlacement(*child);
    auto &layoutable = static_cast<YogaLayoutableShadowNode &>(*clone);

    const auto props = dynamic_cast<const YogaStylableProps *>(child->getProps().get());
    if (props && props->yogaStyle.display() == yoga::Display::None) {
      LayoutMetrics metrics{};
      metrics.displayType = DisplayType::None;
      layoutable.setLayoutMetrics(metrics);
    } else {
      Size maximum{kInfinity, kInfinity};
      if (const auto proposal = state.childProposals.find(child->getTag()); proposal != state.childProposals.end()) {
        maximum = {proposalOrInfinity(proposal->second.width), proposalOrInfinity(proposal->second.height)};
      }
      LayoutConstraints constraints{};
      constraints.maximumSize = maximum;
      constraints.layoutDirection = layoutDirection;
      layoutable.layoutTree(context, constraints);

      auto metrics = layoutable.getLayoutMetrics();
      metrics.frame.origin = {};
      layoutable.setLayoutMetrics(metrics);
    }

    if (context.affectedNodes) {
      context.affectedNodes->push_back(&layoutable);
    }
    parent.replaceChild(*child, clone, index);
  }
}

std::shared_ptr<ShadowNode> cloneForComposePlacement(const ShadowNode &child) {
  if (child.getTraits().check(ShadowNodeTraits::Trait::FormsStackingContext)) {
    return child.clone({});
  }

  const auto &descriptor = child.getComponentDescriptor();
  PropsParserContext context{child.getSurfaceId(), *descriptor.getContextContainer()};
  auto rawProps = child.getProps()->rawProps;
  if (!rawProps.isObject()) {
    rawProps = folly::dynamic::object();
  }
  rawProps["collapsable"] = false;
  auto props = descriptor.cloneProps(context, child.getProps(), RawProps(std::move(rawProps)));
  return child.clone({.props = props});
}

} // namespace jetpackcomposereactnative
