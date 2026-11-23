cmake_minimum_required(VERSION 3.13)
project(JpcSpec)

# Codegen supplies props, event emitters and platform glue. Use the custom
# descriptor alongside them so the autolinker registers the measurable nodes.
add_subdirectory(
  "${CMAKE_CURRENT_SOURCE_DIR}/../../../build/generated/source/codegen/jni"
  "${CMAKE_CURRENT_BINARY_DIR}/codegen"
)

# The shared C++ (state, measurement, layout, shadow nodes, descriptors) lives in cpp/ at the package
# root. Its includes are relative to that folder, e.g. "layout/ComposeChildLayout.h".
set(JPC_CPP_DIR "${CMAKE_CURRENT_SOURCE_DIR}/../../../../cpp")
file(GLOB_RECURSE JPC_CPP_SOURCES CONFIGURE_DEPENDS "${JPC_CPP_DIR}/*.cpp")
target_sources(react_codegen_JpcSpec PRIVATE ${JPC_CPP_SOURCES})
target_include_directories(react_codegen_JpcSpec BEFORE PUBLIC "${CMAKE_CURRENT_SOURCE_DIR}" "${JPC_CPP_DIR}")
