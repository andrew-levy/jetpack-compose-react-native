// Replaces the ComponentDescriptors.h that Codegen writes for JpcSpec, so autolinking registers the
// measurable Compose shadow nodes. The implementation lives in cpp/ at the package root.

#pragma once

#include <react/renderer/componentregistry/ComponentDescriptorProviderRegistry.h>

#include "descriptors/ComposeComponentDescriptors.h"

namespace facebook::react {

void JpcSpec_registerComponentDescriptorsFromCodegen(
    std::shared_ptr<const ComponentDescriptorProviderRegistry> registry);

} // namespace facebook::react
