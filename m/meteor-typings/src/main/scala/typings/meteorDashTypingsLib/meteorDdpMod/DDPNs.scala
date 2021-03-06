package typings
package meteorDashTypingsLib.meteorDdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/ddp", "DDP")
@js.native
object DDPNs extends js.Object {
  trait DDPStatic extends js.Object {
    @JSName("apply")
    def apply(method: java.lang.String, parameters: js.Any*): scala.Unit
    def call(method: java.lang.String, parameters: js.Any*): scala.Unit
    def disconnect(): scala.Unit
    def methods(IMeteorMethodsDictionary: js.Any): js.Any
    def onReconnect(): scala.Unit
    def reconnect(): scala.Unit
    def status(): DDPStatus
    def subscribe(name: java.lang.String, rest: js.Any*): meteorDashTypingsLib.MeteorNs.SubscriptionHandle
  }
  
  trait DDPStatus extends js.Object {
    var connected: scala.Boolean
    var reason: js.UndefOr[java.lang.String] = js.undefined
    var retryCount: scala.Double
    var retryTime: js.UndefOr[scala.Double] = js.undefined
    var status: Status
  }
  
  def _allSubscriptionsReady(): scala.Boolean = js.native
  def connect(url: java.lang.String): DDPStatic = js.native
  type Status = meteorDashTypingsLib.meteorDashTypingsLibStrings.connected | meteorDashTypingsLib.meteorDashTypingsLibStrings.connecting | meteorDashTypingsLib.meteorDashTypingsLibStrings.failed | meteorDashTypingsLib.meteorDashTypingsLibStrings.waiting | meteorDashTypingsLib.meteorDashTypingsLibStrings.offline
}

