cmake_minimum_required(VERSION 3.13)
project(JpcSpec)

# Codegen supplies props, event emitters and platform glue. Use the custom
# descriptor alongside them so the autolinker registers the measurable nodes.
add_subdirectory(
  "${CMAKE_CURRENT_SOURCE_DIR}/../../../build/generated/source/codegen/jni"
  "${CMAKE_CURRENT_BINARY_DIR}/codegen"
)
target_include_directories(react_codegen_JpcSpec BEFORE PUBLIC "${CMAKE_CURRENT_SOURCE_DIR}")
