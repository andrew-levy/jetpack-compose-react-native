module.exports = {
  dependency: {
    platforms: {
      ios: null,
      android: {
        packageImportPath: 'import com.jetpackcomposereactnative.ComposePackage;',
        packageInstance: 'new ComposePackage()',
        componentDescriptors: ['JpcComposeHostComponentDescriptor', 'JpcComposeNodeComponentDescriptor'],
        cmakeListsPath: 'src/main/jni/CMakeLists.txt',
      },
    },
  },
};
