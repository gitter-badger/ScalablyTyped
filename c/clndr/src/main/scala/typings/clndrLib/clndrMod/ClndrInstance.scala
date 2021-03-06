package typings
package clndrLib.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClndrInstance extends js.Object {
  /**
    * Get clndr options
    */
  var options: ClndrOptions = js.native
  /**
    * Add events. Note that this triggers a re-render of the calendar.
    */
  def addEvents(events: js.Array[_]): this.type = js.native
  /**
    * Go to the previous month
    */
  def back(): this.type = js.native
  /**
    * Destroy the clndr instance. This will empty the DOM node containing the
    * calendar.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Go to the next month
    */
  def forward(): this.type = js.native
  /**
    * Go to the next year
    */
  def nextYear(): this.type = js.native
  /**
    * Go to the previous year
    */
  def previousYear(): this.type = js.native
  /**
    * Remove events.  All events for which the passed in function returns true will
    * be removed from the calendar. Note that this triggers a re-render of the
    * calendar.
    */
  def removeEvents(filter: js.Function1[/* event */ js.Any, scala.Boolean]): this.type = js.native
  /**
    * Re-render of the calendar.
    */
  def render(): scala.Unit = js.native
  /**
    * Change the events. Note that this triggers a re-render of the calendar.
    */
  def setEvents(events: js.Array[_]): this.type = js.native
  def setMonth(month: java.lang.String): this.type = js.native
  /**
    * Set the month using a number from 0-11 or a month name
    */
  def setMonth(month: scala.Double): this.type = js.native
  /**
    * Set the year
    */
  def setYear(year: scala.Double): this.type = js.native
  /**
    * Go to today
    */
  def today(): this.type = js.native
}

