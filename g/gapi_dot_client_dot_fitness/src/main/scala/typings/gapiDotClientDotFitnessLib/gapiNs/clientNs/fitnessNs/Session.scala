package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  /**
    * Session active time. While start_time_millis and end_time_millis define the full session time, the active time can be shorter and specified by
    * active_time_millis. If the inactive time during the session is known, it should also be inserted via a com.google.activity.segment data point with a
    * STILL activity value
    */
  var activeTimeMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The type of activity this session represents. */
  var activityType: js.UndefOr[scala.Double] = js.undefined
  /** The application that created the session. */
  var application: js.UndefOr[Application] = js.undefined
  /** A description for this session. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** An end time, in milliseconds since epoch, inclusive. */
  var endTimeMillis: js.UndefOr[java.lang.String] = js.undefined
  /** A client-generated identifier that is unique across all sessions owned by this particular user. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** A timestamp that indicates when the session was last modified. */
  var modifiedTimeMillis: js.UndefOr[java.lang.String] = js.undefined
  /** A human readable name of the session. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** A start time, in milliseconds since epoch, inclusive. */
  var startTimeMillis: js.UndefOr[java.lang.String] = js.undefined
}

