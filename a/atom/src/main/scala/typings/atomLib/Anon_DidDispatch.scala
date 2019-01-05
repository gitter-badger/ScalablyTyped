package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DidDispatch[TargetType /* <: stdLib.EventTarget */] extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var hiddenInCommandPalette: js.UndefOr[scala.Boolean] = js.undefined
  def didDispatch(event: atomLib.atomMod.CommandEvent[TargetType]): scala.Unit | js.Promise[scala.Unit]
}

