package typings
package rxDashLiteDashJoinpatternsLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern6[T1, T2, T3, T4, T5, T6] extends js.Object {
  def and[T7](other: Observable[T7]): Pattern7[T1, T2, T3, T4, T5, T6, T7]
  def thenDo[TR](
    selector: js.Function6[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      TR
    ]
  ): Plan[TR]
}

