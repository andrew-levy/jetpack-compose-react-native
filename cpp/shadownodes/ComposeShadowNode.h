// ComposeShadowNode.h
//
// The Fabric shadow node of both Compose components. A host (`JpcComposeHost`) is a state-measured
// Yoga leaf: Compose measures its content and reports the size through ComposeHostStateData. A node
// (`JpcComposeNode`) lives inside a host's composition and takes no space of its own in Yoga. Both
// lay out their embedded React children at the sizes Compose proposes.

#pragma once

#include <react/renderer/components/view/ConcreteViewShadowNode.h>
#include <react/renderer/core/LayoutConstraints.h>
#include <react/renderer/core/LayoutContext.h>

#include "layout/ComposeChildLayout.h"
#include "measurement/ComposeHostMeasurement.h"
#include "state/ComposeHostState.h"

namespace jetpackcomposereactnative {

template <const char *ComponentNameT, typename PropsT, typename EventEmitterT, bool IsHost>
class ComposeShadowNode final
    : public facebook::react::ConcreteViewShadowNode<ComponentNameT, PropsT, EventEmitterT, ComposeHostStateData> {
  using Base = facebook::react::ConcreteViewShadowNode<ComponentNameT, PropsT, EventEmitterT, ComposeHostStateData>;

 public:
  using Base::Base;

  static facebook::react::ShadowNodeTraits BaseTraits() {
    auto traits = Base::BaseTraits();
    traits.set(facebook::react::ShadowNodeTraits::Trait::LeafYogaNode);
    traits.set(facebook::react::ShadowNodeTraits::Trait::MeasurableYogaNode);
    return traits;
  }

  Size measureContent(const LayoutContext & /*context*/, const LayoutConstraints &constraints) const override {
    if constexpr (IsHost) {
      return measureComposeHost(this->getStateData(), constraints);
    }
    return constraints.clamp({});
  }

  void layout(LayoutContext context) override {
    layoutComposeChildren(*this, context, this->getStateData());
  }
};

} // namespace jetpackcomposereactnative
