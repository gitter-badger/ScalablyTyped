package typings
package asyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrIteratorCallbackT extends js.Object {
  def apply[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def apply[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[T, E]
  ): scala.Unit = js.native
}

