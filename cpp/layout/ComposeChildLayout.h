// ComposeChildLayout.h
//
// Lays out the React children embedded in a Compose host or node. Compose places each child itself,
// so Yoga only sizes it: every child is laid out at the size Compose proposed for it, at the origin.

#pragma once

#include <react/renderer/components/view/YogaLayoutableShadowNode.h>
#include <react/renderer/core/LayoutContext.h>
#include <react/renderer/core/ShadowNode.h>

#include "state/ComposeHostState.h"

#include <memory>

namespace jetpackcomposereactnative {

using facebook::react::LayoutContext;
using facebook::react::ShadowNode;
using facebook::react::YogaLayoutableShadowNode;

void layoutComposeChildren(YogaLayoutableShadowNode &parent, LayoutContext context, const ComposeHostStateData &state);

// Clones a direct React child so its whole subtree stays one native view that Compose can place.
// A child that would be flattened is marked non-collapsable.
std::shared_ptr<ShadowNode> cloneForComposePlacement(const ShadowNode &child);

} // namespace jetpackcomposereactnative
