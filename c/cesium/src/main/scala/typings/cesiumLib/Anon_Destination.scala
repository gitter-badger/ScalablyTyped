package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destination extends js.Object {
  var cancel: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.CameraNs.FlightCancelledCallback] = js.undefined
  var complete: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.CameraNs.FlightCompleteCallback] = js.undefined
  var destination: cesiumLib.cesiumMod.CesiumNs.Cartesian3 | cesiumLib.cesiumMod.CesiumNs.Rectangle
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easingFunction: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.EasingFunction] = js.undefined
  var endTransform: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Matrix4] = js.undefined
  var flyOverLongitude: js.UndefOr[scala.Double] = js.undefined
  var flyOverLongitudeWeight: js.UndefOr[scala.Double] = js.undefined
  var maximumHeight: js.UndefOr[scala.Double] = js.undefined
  var orientation: js.UndefOr[js.Any] = js.undefined
  var pitchAdjustHeight: js.UndefOr[scala.Double] = js.undefined
}

