package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /** Returns a string in the form '#abcdef'. */
  def toHexString(): java.lang.String
  /** Returns a string in the form 'rgba(25, 50, 75, .9)'. */
  def toRGBAString(): java.lang.String
}

