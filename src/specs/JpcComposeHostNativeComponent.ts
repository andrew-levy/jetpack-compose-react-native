import type { ViewProps } from "react-native";
import type { WithDefault } from "react-native/Libraries/Types/CodegenTypes";
import codegenNativeComponent from "react-native/Libraries/Utilities/codegenNativeComponent";

interface NativeProps extends ViewProps {
  fitContent?: WithDefault<boolean, false>;
}

export default codegenNativeComponent<NativeProps>("JpcComposeHost", {
  interfaceOnly: true,
});
