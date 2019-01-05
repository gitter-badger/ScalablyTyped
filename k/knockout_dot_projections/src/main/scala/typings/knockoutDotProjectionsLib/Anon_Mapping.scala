package typings
package knockoutDotProjectionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mapping[T, TResult] extends js.Object {
  var disposeItem: js.UndefOr[js.Function1[/* mappedItem */ TResult, scala.Unit]] = js.undefined
  def mapping(value: T): TResult
}

