package typings
package wepyLib.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContext extends js.Object {
  @JSName("getCenterLocation")
  var getCenterLocation_Original: CallbackFunction[LagLng] = js.native
  @JSName("getRegion")
  var getRegion_Original: CallbackFunction[wepyLib.Anon_Southwest] = js.native
  @JSName("getScale")
  var getScale_Original: CallbackFunction[wepyLib.Anon_Scale] = js.native
  def getCenterLocation(callbacks: wepyLib.Anon_SuccessRes): scala.Unit = js.native
  def getRegion(callbacks: wepyLib.Anon_SuccessResFail): scala.Unit = js.native
  def getScale(callbacks: wepyLib.Anon_SuccessResFailComplete): scala.Unit = js.native
  def includePoints(params: wepyLib.Anon_Padding): scala.Unit = js.native
  def moveToLocation(): scala.Unit = js.native
  def translateMarker(params: wepyLib.Anon_MarkerId): scala.Unit = js.native
}

