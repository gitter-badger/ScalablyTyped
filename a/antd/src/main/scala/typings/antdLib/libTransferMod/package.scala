package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransferMod {
  type TransferDirection = antdLib.antdLibStrings.left | antdLib.antdLibStrings.right
  type TransferRender = js.Function1[/* record */ TransferItem, reactLib.reactMod.ReactNs.ReactNode]
}
