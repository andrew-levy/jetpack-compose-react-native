import { codegenNativeComponent, type CodegenTypes, type ViewProps } from "react-native";

type ComposeEvent = Readonly<{ payload: string }>;

interface NativeProps extends ViewProps {
  componentName?: string;
  slotName?: string;
  values?: string;
  onComposeEvent?: CodegenTypes.DirectEventHandler<ComposeEvent>;
}

export default codegenNativeComponent<NativeProps>("JpcComposeNode", {
  interfaceOnly: true,
});
