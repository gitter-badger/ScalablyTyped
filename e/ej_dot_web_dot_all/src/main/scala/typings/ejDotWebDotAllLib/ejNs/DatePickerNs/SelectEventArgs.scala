package typings
package ejDotWebDotAllLib.ejNs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the selected date object.
    */
  var date: js.UndefOr[js.Any] = js.undefined
  /** returns whether the  currently selected date is special date or not.
    */
  var isSpecialDay: js.UndefOr[java.lang.String] = js.undefined
  /** returns the DatePicker model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the previously selected value.
    */
  var prevDate: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the current date value.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

