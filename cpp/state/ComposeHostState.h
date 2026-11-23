// ComposeHostState.h
//
// Fabric state of a Compose host or node. Kotlin writes it with `StateWrapper.updateState`
// (ComposeContainerView.requestFabricLayout): the size Compose measured for the root, the width it
// measured at, and the size Compose proposes to each embedded React child.

#pragma once

#include <folly/dynamic.h>
#include <react/renderer/core/ReactPrimitives.h>
#include <react/renderer/graphics/Float.h>
#include <react/renderer/graphics/Size.h>
#include <react/renderer/mapbuffer/MapBuffer.h>

#include <unordered_map>

namespace jetpackcomposereactnative {

using facebook::react::Float;
using facebook::react::Size;
using facebook::react::Tag;

struct ComposeHostStateData {
  // Size of the Compose content in points, as measured by the native host.
  Size measuredSize{};
  // Width the content was measured at, or -1 before the first measurement.
  Float fittedWidth{-1};
  // Size Compose proposes to each embedded React child, by React tag. A negative axis is unbounded.
  std::unordered_map<Tag, Size> childProposals;

  ComposeHostStateData() = default;
  ComposeHostStateData(const ComposeHostStateData &previous, folly::dynamic data);

  // State only flows from Kotlin to C++, so the native side never reads it back.
  folly::dynamic getDynamic() const;
  facebook::react::MapBuffer getMapBuffer() const;
};

} // namespace jetpackcomposereactnative
