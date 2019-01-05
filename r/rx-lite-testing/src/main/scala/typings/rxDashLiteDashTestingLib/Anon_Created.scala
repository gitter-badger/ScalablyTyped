package typings
package rxDashLiteDashTestingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Created extends js.Object {
  var created: scala.Double = js.native
  var disposed: scala.Double = js.native
  var subscribed: scala.Double = js.native
  def onCompleted(ticks: scala.Double): rxDashLiteDashTestingLib.RxNs.Recorded = js.native
  def onError(ticks: scala.Double, exception: js.Any): rxDashLiteDashTestingLib.RxNs.Recorded = js.native
  def onNext(ticks: scala.Double, value: js.Any): rxDashLiteDashTestingLib.RxNs.Recorded = js.native
  def subscribe(subscribeAt: scala.Double): rxDashLiteDashTestingLib.RxNs.Subscription = js.native
  def subscribe(subscribeAt: scala.Double, unsubscribeAt: scala.Double): rxDashLiteDashTestingLib.RxNs.Subscription = js.native
}

