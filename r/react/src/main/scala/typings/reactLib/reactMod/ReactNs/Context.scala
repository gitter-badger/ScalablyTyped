package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[T] extends js.Object {
  @JSName("Consumer")
  var Consumer_Original: Consumer[T] = js.native
  var Provider: Provider[T] = js.native
  var displayName: js.UndefOr[java.lang.String] = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def Consumer(props: ConsumerProps[T]): ReactElement[_] | scala.Null = js.native
}

