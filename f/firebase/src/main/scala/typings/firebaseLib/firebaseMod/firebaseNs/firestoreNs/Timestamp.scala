package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp extends js.Object {
  val nanoseconds: scala.Double
  val seconds: scala.Double
  /**
    * Returns true if this `Timestamp` is equal to the provided one.
    *
    * @param other The `Timestamp` to compare against.
    * @return true if this `Timestamp` is equal to the provided one.
    */
  def isEqual(other: Timestamp): scala.Boolean
  /**
    * Returns a new `Date` corresponding to this timestamp. This may lose
    * precision.
    *
    * @return JavaScript `Date` object representing the same point in time as
    *     this `Timestamp`, with millisecond precision.
    */
  def toDate(): coreDashJsLib.Date with stdLib.Date
  /**
    * Returns the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    *
    * @return The point in time corresponding to this timestamp, represented as
    *     the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    */
  def toMillis(): scala.Double
}

