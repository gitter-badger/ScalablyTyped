package typings
package easyDashXDashHeadersLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends easyDashXDashHeadersLib.netMod.Server {
  def addContext(hostName: java.lang.String, credentials: easyDashXDashHeadersLib.Anon_Key): scala.Unit = js.native
  def listen(port: scala.Double, host: java.lang.String, callback: js.Function): Server = js.native
}

