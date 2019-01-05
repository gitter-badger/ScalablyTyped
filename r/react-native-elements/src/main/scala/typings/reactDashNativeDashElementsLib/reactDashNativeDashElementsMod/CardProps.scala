package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
  /**
    * Outer container style
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Additional divider styling
    * (if title provided)
    */
  var dividerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Subtitle rendered over the image
    * (only works if image prop is present)
    */
  var featuredSubtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styling for featured subtitle
    */
  var featuredSubtitleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Title rendered over the image
    * (only works if image prop is present)
    */
  var featuredTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styling for featured title
    */
  var featuredTitleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Flex direction (row or column)
    *
    * @default 'column'
    */
  var flexDirection: js.UndefOr[
    reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.column | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.row
  ] = js.undefined
  /**
    * Specify different font family
    *
    * @default System font bold (iOS), Sans Serif Bold (android)
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Add an image as the heading with the image prop
    */
  var image: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageURISource] = js.undefined
  /**
    * Optional properties to pass to the image if provided e.g "resizeMode"
    */
  var imageProps: js.UndefOr[
    stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ImageProperties */ _
    ]
  ] = js.undefined
  /**
    * Specify image styling if image is provided
    */
  var imageStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageStyle] = js.undefined
  /**
    * Specify styling for view surrounding image
    */
  var imageWrapperStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Card title
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional title styling (if title provided)
    */
  var titleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Inner container style
    */
  var wrapperStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

