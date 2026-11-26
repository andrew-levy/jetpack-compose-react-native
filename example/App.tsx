import { View, StyleSheet, StatusBar } from 'react-native';
import {
  ListItem,
  Text,
  Icon,
  SwipeToDismissBox,
  Box,
  Modifier,
} from 'jetpack-compose-react-native';

StatusBar.setHidden(true);

export default function App() {
  return (
    <View style={styles.container}>
      <View style={{ padding: 16, paddingTop: 120 }}>
        <SwipeToDismissBox
          state={{ initialValue: 'settled' }}
          enableDismissFromStartToEnd={false} // only allow swiping right-to-left
          backgroundContent={
            <Box
              modifiers={Modifier.fillMaxSize()
                .background('#040101')
                .padding('horizontal', 16)}
            >
              <Text text="Delete" color="#ffffff" />
            </Box>
          }
        >
          <ListItem supportingContent={<Text text="Swipe left to delete" />}>
            <Text text="Inbox item" />
          </ListItem>
        </SwipeToDismissBox>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({ container: { flex: 1 } });
