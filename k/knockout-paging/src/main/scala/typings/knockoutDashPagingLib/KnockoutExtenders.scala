package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutExtenders extends js.Object {
  def notify(target: js.Any, notifyWhen: java.lang.String): js.Any = js.native
  def paged(target: KnockoutObservableArray[_], options: KnockoutPagedOptions): KnockoutObservableArray[_] = js.native
  def rateLimit(target: js.Any, options: Anon_Timeout): js.Any = js.native
  def rateLimit(target: js.Any, timeout: scala.Double): js.Any = js.native
  def throttle(target: js.Any, timeout: scala.Double): KnockoutComputed[_] = js.native
  def trackArrayChanges(target: js.Any): js.Any = js.native
}

