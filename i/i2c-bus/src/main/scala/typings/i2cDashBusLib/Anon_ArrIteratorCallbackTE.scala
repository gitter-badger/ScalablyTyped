package typings
package i2cDashBusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrIteratorCallbackTE extends js.Object {
  def apply[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def apply[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: i2cDashBusLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
}

