package typings
package soupbintcpLib.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", "Server")
@js.native
class Server protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: soupbintcpLib.Anon_Port) = this()
  def this(options: soupbintcpLib.Anon_Port, callback: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]) = this()
  def address(): soupbintcpLib.Anon_PortFamily = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

