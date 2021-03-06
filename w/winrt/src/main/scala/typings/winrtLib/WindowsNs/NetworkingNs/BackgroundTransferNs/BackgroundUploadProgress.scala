package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundUploadProgress extends js.Object {
  var bytesReceived: scala.Double
  var bytesSent: scala.Double
  var hasResponseChanged: scala.Boolean
  var hasRestarted: scala.Boolean
  var status: BackgroundTransferStatus
  var totalBytesToReceive: scala.Double
  var totalBytesToSend: scala.Double
}

