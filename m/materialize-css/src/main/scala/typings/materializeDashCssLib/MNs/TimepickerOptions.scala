package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimepickerOptions extends js.Object {
  /**
    * Automatically close picker when minute is selected.
    * @default false;
    */
  var autoClose: scala.Boolean
  /**
    * Specify a selector for a DOM element to render the calendar in, by default it will be placed before the input.
    */
  var container: java.lang.String
  /**
    * Default time to set on the timepicker 'now' or '13:14'
    * @default 'now';
    */
  var defaultTime: java.lang.String
  /**
    * Duration of the transition from/to the hours/minutes view.
    * @default 350
    */
  var duration: scala.Double
  /**
    * Millisecond offset from the defaultTime.
    * @default 0
    */
  var fromNow: scala.Double
  /**
    * Internationalization options
    */
  var i18n: stdLib.Partial[InternationalizationOptions]
  /**
    * Show the clear button in the Timepicker
    * @default false
    */
  var showClearBtn: scala.Boolean
  /**
    * Use 12 hour AM/PM clock instead of 24 hour clock.
    * @default true
    */
  var twelveHour: scala.Boolean
  /**
    * Vibrate device when dragging clock hand.
    * @default true
    */
  var vibrate: scala.Boolean
  /**
    * Callback function called after modal is closed
    * @default null
    */
  def onCloseEnd(`this`: Modal, el: stdLib.Element): scala.Unit
  /**
    * Callback function called before modal is closed
    * @default null
    */
  def onCloseStart(`this`: Modal, el: stdLib.Element): scala.Unit
  /**
    * Callback function called after modal is opened
    * @default null
    */
  def onOpenEnd(`this`: Modal, el: stdLib.Element): scala.Unit
  /**
    * Callback function called before modal is opened
    * @default null
    */
  def onOpenStart(`this`: Modal, el: stdLib.Element): scala.Unit
  /**
    * Callback function when a time is selected
    * @default null
    */
  def onSelect(`this`: Modal, hour: scala.Double, minute: scala.Double): scala.Unit
}

