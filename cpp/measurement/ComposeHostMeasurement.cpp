// ComposeHostMeasurement.cpp

#include "measurement/ComposeHostMeasurement.h"

#include <cmath>

namespace jetpackcomposereactnative {

Size measureComposeHost(const ComposeHostStateData &state, const LayoutConstraints &constraints) {
  const auto &maximum = constraints.maximumSize;
  auto width = state.measuredSize.width;
  if (std::isfinite(maximum.width) && (width <= 0 || state.fittedWidth == maximum.width)) {
    width = maximum.width;
  }
  return constraints.clamp({width, state.measuredSize.height});
}

} // namespace jetpackcomposereactnative
