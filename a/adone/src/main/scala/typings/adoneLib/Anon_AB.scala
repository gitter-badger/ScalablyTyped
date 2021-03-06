package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AB extends js.Object {
  var EPSILON: scala.Double
  val INs: js.Any
  /**
    * 2x2 Matrix
    */
  val mat2Ns: Anon_AAddAdjoint
  /**
    * 2x3 Matrix
    */
  val mat2dNs: Anon_AAddB
  /**
    * 3x3 Matrix
    */
  val mat3Ns: Anon_AAddAdjointB
  /**
    * 4x4 Matrix
    */
  val mat4Ns: Anon_AAddAdjointAspect
  /**
    * Quaternion
    */
  val quatNs: Anon_AAddAxis
  /**
    * 2 Dimensional Vector
    */
  val vec2Ns: Anon_AAdd
  /**
    * 3 Dimensional Vector
    */
  val vec3Ns: Anon_AAddAngle
  /**
    * 4 Dimensional Vector
    */
  val vec4Ns: Anon_AAddArg
  /**
    * Tests whether or not the arguments have approximately the same value, within an absolute
    * or relative tolerance of EPSILON (an absolute tolerance is used for values less
    * than or equal to 1.0, and a relative tolerance is used for larger values)
    *
    * @param a - The first number to test.
    * @param b - The second number to test.
    * @returns True if the numbers are approximately equal, false otherwise.
    */
  def equals(a: scala.Double, b: scala.Double): scala.Boolean
  /**
    * Convert Degree To Radian
    *
    * @param a - Angle in Degrees
    */
  def toRadian(a: scala.Double): scala.Double
}

