package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpSender extends js.Object {
  val dtmf: RTCDTMFSender | scala.Null = js.native
  val rtcpTransport: RTCDtlsTransport | scala.Null = js.native
  val track: MediaStreamTrack | scala.Null = js.native
  val transport: RTCDtlsTransport | scala.Null = js.native
  def getParameters(): RTCRtpSendParameters = js.native
  def getStats(): js.Promise[RTCStatsReport] = js.native
  def replaceTrack(): js.Promise[scala.Unit] = js.native
  def replaceTrack(withTrack: MediaStreamTrack): js.Promise[scala.Unit] = js.native
  def setParameters(parameters: RTCRtpSendParameters): js.Promise[scala.Unit] = js.native
  def setStreams(streams: MediaStream*): scala.Unit = js.native
}

@JSGlobal("RTCRtpSender")
@js.native
object RTCRtpSender
  extends org.scalablytyped.runtime.Instantiable0[RTCRtpSender] {
  def getCapabilities(kind: java.lang.String): xtermLib.RTCRtpCapabilities | scala.Null = js.native
}

