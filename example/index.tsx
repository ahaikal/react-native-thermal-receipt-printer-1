import { AppRegistry, LogBox } from 'react-native';
import App from './src/App';
import { name as appName } from './app.json';

if (__DEV__) {
  LogBox.ignoreLogs(
    ["Remote debugger", "Picker has been", "EventEmitter.removeListener", "Require cycle:", "Setting a timer",
    "Async Storage", "onAnimatedValueUpdate", "VirtualizedLists",
    "Animated.event", "AsyncStorage", "VirtualizedLists should never be nested inside plain ScrollViews with the same orientation because it can break windowing and other functionality - use another VirtualizedList-backed container instead"]);
}

AppRegistry.registerComponent(appName, () => App);
