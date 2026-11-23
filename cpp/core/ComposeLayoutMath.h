// ComposeLayoutMath.h
//
// Small numeric helpers shared by the measurement and layout layers.

#pragma once

#include <react/renderer/graphics/Float.h>

#include <limits>

namespace jetpackcomposereactnative {

using facebook::react::Float;

inline constexpr Float kInfinity = std::numeric_limits<Float>::infinity();

// Kotlin encodes Compose's `Constraints.Infinity` as a negative proposal (see ComposeContainerView).
inline Float proposalOrInfinity(Float proposal) {
  return proposal < 0 ? kInfinity : proposal;
}

} // namespace jetpackcomposereactnative
