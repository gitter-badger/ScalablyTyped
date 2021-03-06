package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Reminder class.
  */
trait ASPxClientReminder extends js.Object {
  /**
    * Switches the reminder off for the associated appointment.
    */
  def Dismiss(): scala.Unit
  /**
    * Returns the date and time when the reminder is alerted.
    */
  def GetAlertTime(): stdLib.Date
  /**
    * Gets the custom field bound to the reminder.
    * @param key A string object representing the custom field's ID.
    */
  def GetCustomField(key: java.lang.String): js.Object
  /**
    * Gets the reminder's ID.
    */
  def GetId(): java.lang.String
  /**
    * Gets the time interval before the appointment's start time.
    */
  def GetTimeBeforeStart(): stdLib.Date
  /**
    * Delays the reminder's alert until the alert time has increased by the specified interval.
    * @param remindAfter An integer value that is the time interval.
    */
  def Snooze(remindAfter: scala.Double): scala.Unit
}

