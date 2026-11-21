import type { ViewProps } from "react-native";
import type { DirectEventHandler } from "react-native/Libraries/Types/CodegenTypes";
import codegenNativeComponent from "react-native/Libraries/Utilities/codegenNativeComponent";

type ComposeEvent = Readonly<{ payload: string }>;

interface NativeProps extends ViewProps {
  componentName?: string;
  slotName?: string;
  values?: string;
  onComposeEvent?: DirectEventHandler<ComposeEvent>;
}

export default codegenNativeComponent<NativeProps>("JpcComposeNode", {
  interfaceOnly: true,
});
