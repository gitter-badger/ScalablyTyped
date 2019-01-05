package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object playcanvasLib {
  type BrowserMouseEvent = stdLib.MouseEvent
  type BrowserTouch = stdLib.Touch
  type BrowserTouchEvent = stdLib.TouchEvent
  type NativeVRDisplay = webvrDashApiLib.VRDisplay with stdLib.VRDisplay
  type NativeVRDisplayCapabilities = webvrDashApiLib.VRDisplayCapabilities with stdLib.VRDisplayCapabilities
}
