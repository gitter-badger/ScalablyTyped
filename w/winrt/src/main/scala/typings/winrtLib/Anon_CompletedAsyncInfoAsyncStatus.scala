package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CompletedAsyncInfoAsyncStatus extends js.Object {
  @JSName("completed")
  var completed_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationCompletedHandler[winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage] = js.native
  def completed(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage],
    asyncStatus: winrtLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  def getResults(): winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage = js.native
}

