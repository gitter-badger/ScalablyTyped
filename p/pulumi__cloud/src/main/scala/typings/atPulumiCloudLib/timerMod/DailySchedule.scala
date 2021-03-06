package typings
package atPulumiCloudLib.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DailySchedule extends js.Object {
  /**
    * The hour, in UTC, that the timer should fire.
    */
  var hourUTC: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minute, in UTC, that the timer should fire.
    */
  var minuteUTC: js.UndefOr[scala.Double] = js.undefined
}

