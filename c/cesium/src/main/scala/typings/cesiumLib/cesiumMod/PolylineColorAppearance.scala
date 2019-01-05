package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineColorAppearance")
@js.native
class PolylineColorAppearance ()
  extends cesiumLib.cesiumMod.CesiumNs.PolylineColorAppearance {
  def this(options: cesiumLib.Anon_TranslucentVertexShaderSource) = this()
  /* CompleteClass */
  override val closed: scala.Boolean = js.native
  /* CompleteClass */
  override val fragmentShaderSource: java.lang.String = js.native
  /* CompleteClass */
  override var material: cesiumLib.cesiumMod.CesiumNs.Material = js.native
  /* CompleteClass */
  override val renderState: js.Any = js.native
  /* CompleteClass */
  override var translucent: scala.Boolean = js.native
  /* CompleteClass */
  override val vertexFormat: cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
  /* CompleteClass */
  override val vertexShaderSource: java.lang.String = js.native
  /* CompleteClass */
  override def getFragmentShaderSource(): java.lang.String = js.native
  /* CompleteClass */
  override def getRenderState(): js.Any = js.native
  /* CompleteClass */
  override def isTranslucent(): scala.Boolean = js.native
}

@JSImport("cesium", "PolylineColorAppearance")
@js.native
object PolylineColorAppearance extends js.Object {
  var VERTEX_FORMAT: cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
}

