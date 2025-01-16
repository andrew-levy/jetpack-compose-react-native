import { View, Text as RNText, ScrollView } from "react-native";
import { Text, Modifier } from "jetpack-compose-react-native";

export default function Modifiers() {
  return (
    <ScrollView style={{ flex: 1, padding: 20 }}>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Shadow
      </RNText>
      <Text
        modifier={Modifier.shadow({
          ambientColor: "blue",
          clip: false,
          elevation: 10,
          shape: "rectangle",
          spotColor: "blue",
        })}
        fontSize={20}
      >
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Border
      </RNText>
      <Text
        modifier={Modifier.border({
          color: "red",
          width: 1,
          brush: "solid",
          shape: "rectangle",
        })}
        fontSize={20}
      >
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Padding
      </RNText>
      <Text
        modifier={Modifier.padding({ horizontal: 10, vertical: 20 })}
        fontSize={20}
      >
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Width
      </RNText>
      <Text modifier={Modifier.width(100)} fontSize={20}>
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Height
      </RNText>
      <Text modifier={Modifier.height(50)} fontSize={20}>
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Size
      </RNText>
      <Text modifier={Modifier.size(100)} fontSize={20}>
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Fill Max Height
      </RNText>
      <Text modifier={Modifier.fillMaxHeight()} fontSize={20}>
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Fill Max Width
      </RNText>
      <Text modifier={Modifier.fillMaxWidth()} fontSize={20}>
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Fill Max Size
      </RNText>
      <Text modifier={Modifier.fillMaxSize()} fontSize={20}>
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Alpha
      </RNText>
      <Text modifier={Modifier.alpha(0.5)} fontSize={20}>
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Background Color
      </RNText>
      <Text
        modifier={Modifier.backgroundColor({ color: "yellow" })}
        fontSize={20}
      >
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Background Brush
      </RNText>
      <Text
        modifier={Modifier.backgroundBrush({ brush: "gradient", alpha: 0.8 })}
        fontSize={20}
      >
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Clip To Bounds
      </RNText>
      <Text modifier={Modifier.clipToBounds()} fontSize={20}>
        Hello
      </Text>
      <RNText style={{ fontSize: 30, fontWeight: "bold", marginVertical: 20 }}>
        Z Index
      </RNText>
      <Text modifier={Modifier.zIndex(1)} fontSize={20}>
        Hello
      </Text>
    </ScrollView>
  );
}
