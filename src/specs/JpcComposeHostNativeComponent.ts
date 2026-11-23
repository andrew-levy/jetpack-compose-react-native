import { codegenNativeComponent, type CodegenTypes, type ViewProps } from "react-native";

interface NativeProps extends ViewProps {
  fitContent?: CodegenTypes.WithDefault<boolean, false>;
}

export default codegenNativeComponent<NativeProps>("JpcComposeHost", {
  interfaceOnly: true,
});
