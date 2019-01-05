package typings
package reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewerMouseEvent[T] extends js.Object {
  var SVGViewer: reactLib.SVGSVGElement with stdLib.SVGSVGElement
  var originalEvent: reactLib.reactMod.ReactNs.MouseEvent[T, reactLib.NativeMouseEvent]
  var point: Point
  var scaleFactor: scala.Double
  var translationX: scala.Double
  var translationY: scala.Double
  var x: scala.Double
  var y: scala.Double
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

