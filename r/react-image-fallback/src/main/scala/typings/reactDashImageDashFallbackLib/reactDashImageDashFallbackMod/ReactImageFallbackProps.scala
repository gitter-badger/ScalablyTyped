package typings
package reactDashImageDashFallbackLib.reactDashImageDashFallbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactImageFallbackProps extends js.Object {
  var fallbackImage: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[java.lang.String] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]
  var initialImage: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var initialTimeout: js.UndefOr[scala.Double] = js.undefined
  var onError: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLImageElement with stdLib.HTMLImageElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onLoad: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLImageElement with stdLib.HTMLImageElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var src: java.lang.String
}

