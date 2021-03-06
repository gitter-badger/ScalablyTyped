package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.AABB")
@js.native
class AABB () extends js.Object {
  def this(options: IAABBOptions) = this()
  var lowerBound: Vec3 = js.native
  var upperBound: Vec3 = js.native
  def copy(aabb: AABB): scala.Unit = js.native
  def extend(aabb: AABB): scala.Unit = js.native
  def getCorners(a: Vec3, b: Vec3, c: Vec3, d: Vec3, e: Vec3, f: Vec3, g: Vec3, h: Vec3): scala.Unit = js.native
  def overlaps(aabb: AABB): scala.Boolean = js.native
  def setFromPoints(points: js.Array[Vec3]): AABB = js.native
  def setFromPoints(points: js.Array[Vec3], position: Vec3): AABB = js.native
  def setFromPoints(points: js.Array[Vec3], position: Vec3, quaternion: Quaternion): AABB = js.native
  def setFromPoints(points: js.Array[Vec3], position: Vec3, quaternion: Quaternion, skinSize: scala.Double): AABB = js.native
  def toLocalFrame(frame: Transform, target: AABB): AABB = js.native
  def toWorldFrame(frame: Transform, target: AABB): AABB = js.native
}

