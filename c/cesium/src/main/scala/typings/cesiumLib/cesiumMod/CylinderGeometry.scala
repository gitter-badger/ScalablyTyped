package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CylinderGeometry")
@js.native
class CylinderGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.CylinderGeometry {
  def this(options: cesiumLib.Anon_Length) = this()
}

@JSImport("cesium", "CylinderGeometry")
@js.native
object CylinderGeometry extends js.Object {
  def createGeometry(cylinderGeometry: cesiumLib.cesiumMod.CesiumNs.CylinderGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.CylinderGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.CylinderGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.CylinderGeometry
  ): cesiumLib.cesiumMod.CesiumNs.CylinderGeometry = js.native
}

