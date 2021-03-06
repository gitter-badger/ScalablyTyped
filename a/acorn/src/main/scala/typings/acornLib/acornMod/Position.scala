package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Position")
@js.native
class Position protected ()
  extends acornLib.acornMod.acornNs.Position {
  def this(line: scala.Double, col: scala.Double) = this()
  /** >= 0 */
  /* CompleteClass */
  override var column: scala.Double = js.native
  /** >= 1 */
  /* CompleteClass */
  override var line: scala.Double = js.native
  /* CompleteClass */
  override def offset(n: scala.Double): acornLib.acornMod.acornNs.Position = js.native
}

