package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Socket extends js.Object {
  // https://github.com/nodejs/node/blob/master/lib/net.js
  var Server: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.netNs.Server] = js.native
  var Socket: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.netNs.Socket] = js.native
  def connect(options: nodeLib.netMod.NetConnectOpts): nodeLib.netMod.Socket = js.native
  def connect(options: nodeLib.netMod.NetConnectOpts, connectionListener: js.Function): nodeLib.netMod.Socket = js.native
  def connect(path: java.lang.String): nodeLib.netMod.Socket = js.native
  def connect(path: java.lang.String, connectionListener: js.Function): nodeLib.netMod.Socket = js.native
  def connect(port: scala.Double): nodeLib.netMod.Socket = js.native
  def connect(port: scala.Double, host: java.lang.String): nodeLib.netMod.Socket = js.native
  def connect(port: scala.Double, host: java.lang.String, connectionListener: js.Function): nodeLib.netMod.Socket = js.native
  def createConnection(options: nodeLib.netMod.NetConnectOpts): nodeLib.netMod.Socket = js.native
  def createConnection(options: nodeLib.netMod.NetConnectOpts, connectionListener: js.Function): nodeLib.netMod.Socket = js.native
  def createConnection(path: java.lang.String): nodeLib.netMod.Socket = js.native
  def createConnection(path: java.lang.String, connectionListener: js.Function): nodeLib.netMod.Socket = js.native
  def createConnection(port: scala.Double): nodeLib.netMod.Socket = js.native
  def createConnection(port: scala.Double, host: java.lang.String): nodeLib.netMod.Socket = js.native
  def createConnection(port: scala.Double, host: java.lang.String, connectionListener: js.Function): nodeLib.netMod.Socket = js.native
  def createServer(): nodeLib.netMod.Server = js.native
  def createServer(connectionListener: js.Function1[/* socket */ nodeLib.netMod.Socket, scala.Unit]): nodeLib.netMod.Server = js.native
  def createServer(options: nodeLib.Anon_AllowHalfOpen): nodeLib.netMod.Server = js.native
  def createServer(
    options: nodeLib.Anon_AllowHalfOpen,
    connectionListener: js.Function1[/* socket */ nodeLib.netMod.Socket, scala.Unit]
  ): nodeLib.netMod.Server = js.native
  def isIP(input: java.lang.String): scala.Double = js.native
  def isIPv4(input: java.lang.String): scala.Boolean = js.native
  def isIPv6(input: java.lang.String): scala.Boolean = js.native
}

