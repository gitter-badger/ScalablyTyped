package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewProps
  extends ViewProps
     with ScrollViewPropsIOS
     with ScrollViewPropsAndroid {
  /**
    * These styles will be applied to the scroll view content container which
    * wraps all of the child views. Example:
    *
    *   return (
    *     <ScrollView contentContainerStyle={styles.contentContainer}>
    *     </ScrollView>
    *   );
    *   ...
    *   const styles = StyleSheet.create({
    *     contentContainer: {
    *       paddingVertical: 20
    *     }
    *   });
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * When true the scroll view's children are arranged horizontally in a row
    * instead of vertically in a column. The default value is false.
    */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If sticky headers should stick at the bottom instead of the top of the
    * ScrollView. This is usually used with inverted ScrollViews.
    */
  var invertStickyHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines whether the keyboard gets dismissed in response to a drag.
    *   - 'none' (the default) drags do not dismiss the keyboard.
    *   - 'onDrag' the keyboard is dismissed when a drag begins.
    *   - 'interactive' the keyboard is dismissed interactively with the drag
    *     and moves in synchrony with the touch; dragging upwards cancels the
    *     dismissal.
    */
  var keyboardDismissMode: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.interactive | reactDashNativeLib.reactDashNativeLibStrings.`on-drag`
  ] = js.undefined
  /**
    * When false tapping outside of the focused text input when the keyboard
    * is up dismisses the keyboard. When true the scroll view will not catch
    * taps and the keyboard will not dismiss automatically. The default value
    * is false.
    */
  var keyboardShouldPersistTaps: js.UndefOr[
    scala.Boolean | reactDashNativeLib.reactDashNativeLibStrings.always | reactDashNativeLib.reactDashNativeLibStrings.never | reactDashNativeLib.reactDashNativeLibStrings.handled
  ] = js.undefined
  /**
    * Called when scrollable content view of the ScrollView changes.
    * Handler function is passed the content width and content height as parameters: (contentWidth, contentHeight)
    * It's implemented using onLayout handler attached to the content container which this ScrollView renders.
    *
    */
  var onContentSizeChange: js.UndefOr[js.Function2[/* w */ scala.Double, /* h */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Fires when scroll view has begun moving
    */
  var onMomentumScrollBegin: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit]] = js.undefined
  /**
    * Fires when scroll view has finished moving
    */
  var onMomentumScrollEnd: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit]] = js.undefined
  /**
    * Fires at most once per frame during scrolling.
    * The frequency of the events can be contolled using the scrollEventThrottle prop.
    */
  var onScroll: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit]] = js.undefined
  /**
    * Fires if a user initiates a scroll gesture.
    */
  var onScrollBeginDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit]] = js.undefined
  /**
    * Fires when a user has finished scrolling.
    */
  var onScrollEndDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit]] = js.undefined
  /**
    * When true the scroll view stops on multiples of the scroll view's size
    * when scrolling. This can be used for horizontal pagination. The default
    * value is false.
    */
  var pagingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A RefreshControl component, used to provide pull-to-refresh
    * functionality for the ScrollView.
    */
  var refreshControl: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[RefreshControlProps]] = js.undefined
  /**
    * When false, the content does not scroll. The default value is true
    */
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When true, shows a horizontal scroll indicator.
    */
  var showsHorizontalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When true, shows a vertical scroll indicator.
    */
  var showsVerticalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
}

