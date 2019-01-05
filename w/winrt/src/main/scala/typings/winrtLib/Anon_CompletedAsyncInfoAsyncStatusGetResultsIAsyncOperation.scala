package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CompletedAsyncInfoAsyncStatusGetResultsIAsyncOperation extends js.Object {
  @JSName("completed")
  var completed_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationCompletedHandler[winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs.UserIdentity] = js.native
  def completed(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs.UserIdentity],
    asyncStatus: winrtLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  def getResults(): winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs.UserIdentity = js.native
}

