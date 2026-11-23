// ComposeComponentDescriptors.h
//
// Binds the two Codegen components (src/specs) to ComposeShadowNode. React Native's autolinking
// registers the descriptors named in react-native.config.js, in namespace facebook::react.

#pragma once

#include <react/renderer/components/JpcSpec/EventEmitters.h>
#include <react/renderer/components/JpcSpec/Props.h>
#include <react/renderer/core/ConcreteComponentDescriptor.h>

#include "shadownodes/ComposeShadowNode.h"

namespace jetpackcomposereactnative {

inline constexpr char ComposeHostComponentName[] = "JpcComposeHost";
inline constexpr char ComposeNodeComponentName[] = "JpcComposeNode";

using ComposeHostShadowNode = ComposeShadowNode<
    ComposeHostComponentName, facebook::react::JpcComposeHostProps, facebook::react::JpcComposeHostEventEmitter, true>;
using ComposeNodeShadowNode = ComposeShadowNode<
    ComposeNodeComponentName, facebook::react::JpcComposeNodeProps, facebook::react::JpcComposeNodeEventEmitter, false>;

} // namespace jetpackcomposereactnative

namespace facebook::react {

using JpcComposeHostComponentDescriptor = ConcreteComponentDescriptor<jetpackcomposereactnative::ComposeHostShadowNode>;
using JpcComposeNodeComponentDescriptor = ConcreteComponentDescriptor<jetpackcomposereactnative::ComposeNodeShadowNode>;

} // namespace facebook::react
