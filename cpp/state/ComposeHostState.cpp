// ComposeHostState.cpp

#include "state/ComposeHostState.h"

#include <react/renderer/mapbuffer/MapBufferBuilder.h>

namespace jetpackcomposereactnative {

ComposeHostStateData::ComposeHostStateData(const ComposeHostStateData &previous, folly::dynamic data)
    : ComposeHostStateData(previous) {
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
          Size{static_cast<Float>(proposal["width"].asDouble()), static_cast<Float>(proposal["height"].asDouble())});
    }
  }
}

folly::dynamic ComposeHostStateData::getDynamic() const {
  return folly::dynamic::object();
}

facebook::react::MapBuffer ComposeHostStateData::getMapBuffer() const {
  return facebook::react::MapBufferBuilder::EMPTY();
}

} // namespace jetpackcomposereactnative
