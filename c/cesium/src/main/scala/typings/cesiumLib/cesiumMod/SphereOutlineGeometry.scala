package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SphereOutlineGeometry")
@js.native
class SphereOutlineGeometry ()
  extends cesiumLib.cesiumMod.CesiumNs.SphereOutlineGeometry {
  def this(options: cesiumLib.Anon_RadiusStackPartitions) = this()
}

@JSImport("cesium", "SphereOutlineGeometry")
@js.native
object SphereOutlineGeometry extends js.Object {
  def createGeometry(sphereGeometry: cesiumLib.cesiumMod.CesiumNs.SphereOutlineGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.SphereOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.SphereOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.SphereOutlineGeometry
  ): cesiumLib.cesiumMod.CesiumNs.SphereOutlineGeometry = js.native
}

