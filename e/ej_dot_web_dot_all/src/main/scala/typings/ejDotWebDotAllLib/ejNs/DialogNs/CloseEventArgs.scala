package typings
package ejDotWebDotAllLib.ejNs.DialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Current event object.
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns true when the Dialog activated by user interaction otherwise returns false
    */
  var isInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /** Instance of the dialog model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

