package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Line")
@js.native
class Line ()
  extends p2Lib.p2Mod.p2Ns.Line {
  def this(options: p2Lib.p2Mod.p2Ns.LineOptions) = this()
  /* CompleteClass */
  override var angle: scala.Double = js.native
  /* CompleteClass */
  override var area: scala.Double = js.native
  /* CompleteClass */
  override var boundingRadius: scala.Double = js.native
  /* CompleteClass */
  override var collisionGroup: scala.Double = js.native
  /* CompleteClass */
  override var collisionMask: scala.Double = js.native
  /* CompleteClass */
  override var collisionResponse: scala.Boolean = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  /* CompleteClass */
  override var length: scala.Double = js.native
  /* CompleteClass */
  override var material: p2Lib.p2Mod.p2Ns.Material = js.native
  /* CompleteClass */
  override var position: js.Array[scala.Double] = js.native
  /* CompleteClass */
  override var sensor: scala.Boolean = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override def computeAABB(out: p2Lib.p2Mod.p2Ns.AABB, position: js.Array[scala.Double], angle: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def computeMomentOfInertia(mass: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def updateArea(): scala.Unit = js.native
  /* CompleteClass */
  override def updateBoundingRadius(): scala.Double = js.native
}

