import { registerRootComponent } from 'expo';
import App from './App';

// Registers the app as "main", the component Expo's MainActivity mounts. Launch options from the
// activity's intent (catalogStart, bridgeChecks) arrive as App's initial props.
registerRootComponent(App);
