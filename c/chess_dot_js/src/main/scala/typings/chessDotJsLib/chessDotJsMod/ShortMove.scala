package typings
package chessDotJsLib.chessDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortMove extends js.Object {
  /**
    * The location the piece is moving from.
    * Must be in san format, e.g "h8"
    */
  var from: Square
  /**
    * If this move results in a promotion, this will have the unit promotion.
    * - "n" for Knight
    * - "b" for Bishop
    * - "r" for Rook
    * - "q" for Queen
    */
  var promotion: js.UndefOr[
    chessDotJsLib.chessDotJsLibStrings.n | chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.r | chessDotJsLib.chessDotJsLibStrings.q
  ] = js.undefined
  /**
    * The location the piece is moving to.
    * Must be in san format, e.g "a1"
    */
  var to: Square
}

