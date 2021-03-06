package typings
package rxDashCoreLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverStatic extends js.Object {
  /**
    * Schedules the invocation of observer methods on the given scheduler.
    * @param scheduler Scheduler to schedule observer messages on.
    * @returns Observer whose messages are scheduled on the given scheduler.
    */
  def notifyOn[T](scheduler: IScheduler): Observer[T]
}

