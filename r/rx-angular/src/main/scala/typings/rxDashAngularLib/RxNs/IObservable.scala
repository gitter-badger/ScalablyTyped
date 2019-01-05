package typings
package rxDashAngularLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservable[T] extends js.Object {
  def safeApply($scope: angularLib.angularMod.angularNs.IScope, callback: js.Function1[/* data */ T, scala.Unit]): rxDashLiteDashAggregatesLib.RxNs.Observable[T] with rxDashCoreLib.RxNs.Observable[T] with rxDashLiteLib.RxNs.Observable[T] with rxDashLiteDashExperimentalLib.RxNs.Observable[T] with rxDashLiteDashBackpressureLib.RxNs.Observable[T] with rxDashLiteDashJoinpatternsLib.RxNs.Observable[T] with rxDashLiteDashTimeLib.RxNs.Observable[T] with rxDashLiteDashCoincidenceLib.RxNs.Observable[T] with rxDashCoreDashBindingLib.RxNs.Observable[T]
}

