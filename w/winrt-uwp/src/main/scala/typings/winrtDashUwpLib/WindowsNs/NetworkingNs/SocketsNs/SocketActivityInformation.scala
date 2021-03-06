package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information on the transferred socket from the Socket Broker. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityInformation")
@js.native
abstract class SocketActivityInformation () extends js.Object {
  /** Get the context associated while transferring ownership of the socket. */
  var context: SocketActivityContext = js.native
  /** Based on the socket type, the app can reclaim the ownership of the appropriate DatagramSocket . */
  var datagramSocket: DatagramSocket = js.native
  /** A unique string for this app used to identify the transferred socket. This is passed by the app while transferring the socket ownership to the service. */
  var id: java.lang.String = js.native
  /** Gets a SocketActivityKind enumeration value that identifies socket kind. */
  var socketKind: SocketActivityKind = js.native
  /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocket . */
  var streamSocket: StreamSocket = js.native
  /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocketListener . */
  var streamSocketListener: StreamSocketListener = js.native
  /** The background task ID used while transferring ownership of the socket. */
  var taskId: java.lang.String = js.native
}

/** Provides information on the transferred socket from the Socket Broker. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityInformation")
@js.native
object SocketActivityInformation extends js.Object {
  /** Gets a list of all the sockets transferred to the socket brokering service by this app. */
  var allSockets: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
    java.lang.String, 
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityInformation
  ] = js.native
}

