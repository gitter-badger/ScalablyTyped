package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The promise API implemented by this library.
  */
@js.native
trait IPromise[T] extends js.Object {
  /**
    * Cancels the pending request represented by the Promise, and triggers
    * the error callback if the promised event has not yet occurred.
    */
  def cancel(): scala.Unit = js.native
  /**
    * Adds event listeners for particular events.
    * @param onSuccess Called when the promised event successfully occurs.
    * @param onError Called when the promised event fails to occur. Could
    *   be an IError or an IJSError.
    * @param onProgress Called to indicate that the promised event is
    *   making progress toward completion.
    */
  def `then`(onSuccess: js.Function1[/* response */ T, scala.Unit]): IPromise[T] = js.native
  def `then`(
    onSuccess: js.Function1[/* response */ T, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): IPromise[T] = js.native
  def `then`(
    onSuccess: js.Function1[/* response */ T, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit],
    onProgress: js.Function1[/* progress */ js.Any, scala.Unit]
  ): IPromise[T] = js.native
}

