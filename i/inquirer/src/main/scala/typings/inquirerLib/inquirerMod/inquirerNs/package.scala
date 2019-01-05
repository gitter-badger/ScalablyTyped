package typings
package inquirerLib.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inquirerNs {
  type ChoiceType = java.lang.String | inquirerLib.inquirerMod.inquirerNs.objectsNs.ChoiceOption | inquirerLib.inquirerMod.inquirerNs.objectsNs.Separator
  type Questions[T] = Question[T] | js.Array[Question[T]] | (rxDashLiteDashAggregatesLib.RxNs.Observable[Question[T]] with rxDashCoreLib.RxNs.Observable[Question[T]] with rxDashLiteLib.RxNs.Observable[Question[T]] with rxDashLiteDashExperimentalLib.RxNs.Observable[Question[T]] with rxDashLiteDashBackpressureLib.RxNs.Observable[Question[T]] with rxDashLiteDashJoinpatternsLib.RxNs.Observable[Question[T]] with rxDashLiteDashTimeLib.RxNs.Observable[Question[T]] with rxDashLiteDashCoincidenceLib.RxNs.Observable[Question[T]] with rxDashCoreDashBindingLib.RxNs.Observable[Question[T]])
  type StreamOptions = InputStreamOption | OutputStreamOption | (InputStreamOption with OutputStreamOption)
}
