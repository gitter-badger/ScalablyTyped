package typings
package pDashCancelableLib.pDashCancelableMod.PCancelableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCancelFn extends js.Object {
  var shouldReject: scala.Boolean = js.native
  def apply(cancelHandler: js.Function0[scala.Unit]): scala.Unit = js.native
}

