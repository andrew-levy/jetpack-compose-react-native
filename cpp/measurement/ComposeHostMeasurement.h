// ComposeHostMeasurement.h
//
// Turns the measured Compose content in the host state into a size for Yoga's constraints.

#pragma once

#include <react/renderer/core/LayoutConstraints.h>
#include <react/renderer/graphics/Size.h>

#include "state/ComposeHostState.h"

namespace jetpackcomposereactnative {

using facebook::react::LayoutConstraints;

// A Compose root fills the available width once Compose has measured at that width, and takes the
// height Compose measured. Before the first measurement it fills the width with zero height.
Size measureComposeHost(const ComposeHostStateData &state, const LayoutConstraints &constraints);

} // namespace jetpackcomposereactnative
