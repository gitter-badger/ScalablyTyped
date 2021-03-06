package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionIndicatorViewModel extends js.Object {
  @JSName("computeScreenSpacePosition")
  var computeScreenSpacePosition_Original: cesiumLib.cesiumMod.CesiumNs.SelectionIndicatorViewModelNs.ComputeScreenSpacePosition = js.native
  var container: stdLib.Element = js.native
  var isVisible: scala.Boolean = js.native
  var position: Cartesian3 = js.native
  var scene: Scene = js.native
  var selectionIndicatorElement: stdLib.Element = js.native
  var showSelection: scala.Boolean = js.native
  def animateAppear(): scala.Unit = js.native
  def animateDepart(): scala.Unit = js.native
  def computeScreenSpacePosition(position: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  def update(): scala.Unit = js.native
}

