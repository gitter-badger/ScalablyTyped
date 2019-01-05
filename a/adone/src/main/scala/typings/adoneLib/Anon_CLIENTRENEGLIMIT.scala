package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CLIENTRENEGLIMIT extends js.Object {
  val CLIENT_RENEG_LIMIT: scala.Double = js.native
  val CLIENT_RENEG_WINDOW: scala.Double = js.native
  val DEFAULT_ECDH_CURVE: java.lang.String = js.native
  var Server: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.tlsNs.Server] = js.native
  var TLSSocket: org.scalablytyped.runtime.Instantiable1[/* socket */ nodeLib.netMod.Socket, adoneLib.glossesStdMod.tlsNs.TLSSocket] = js.native
  /*
    * Verifies the certificate `cert` is issued to host `host`.
    * @host The hostname to verify the certificate against
    * @cert PeerCertificate representing the peer's certificate
    *
    * Returns Error object, populating it with the reason, host and cert on failure.  On success, returns undefined.
    */
  def checkServerIdentity(host: java.lang.String, cert: nodeLib.tlsMod.PeerCertificate): js.UndefOr[nodeLib.Error] = js.native
  def connect(options: nodeLib.tlsMod.ConnectionOptions): nodeLib.tlsMod.TLSSocket = js.native
  def connect(options: nodeLib.tlsMod.ConnectionOptions, secureConnectListener: js.Function0[scala.Unit]): nodeLib.tlsMod.TLSSocket = js.native
  def connect(port: scala.Double): nodeLib.tlsMod.TLSSocket = js.native
  def connect(port: scala.Double, host: java.lang.String): nodeLib.tlsMod.TLSSocket = js.native
  def connect(port: scala.Double, host: java.lang.String, options: nodeLib.tlsMod.ConnectionOptions): nodeLib.tlsMod.TLSSocket = js.native
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: nodeLib.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): nodeLib.tlsMod.TLSSocket = js.native
  def connect(port: scala.Double, options: nodeLib.tlsMod.ConnectionOptions): nodeLib.tlsMod.TLSSocket = js.native
  def connect(
    port: scala.Double,
    options: nodeLib.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): nodeLib.tlsMod.TLSSocket = js.native
  def createSecureContext(details: nodeLib.tlsMod.SecureContextOptions): nodeLib.tlsMod.SecureContext = js.native
  def createSecurePair(): nodeLib.tlsMod.SecurePair = js.native
  def createSecurePair(credentials: nodeLib.cryptoMod.Credentials): nodeLib.tlsMod.SecurePair = js.native
  def createSecurePair(credentials: nodeLib.cryptoMod.Credentials, isServer: scala.Boolean): nodeLib.tlsMod.SecurePair = js.native
  def createSecurePair(credentials: nodeLib.cryptoMod.Credentials, isServer: scala.Boolean, requestCert: scala.Boolean): nodeLib.tlsMod.SecurePair = js.native
  def createSecurePair(
    credentials: nodeLib.cryptoMod.Credentials,
    isServer: scala.Boolean,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): nodeLib.tlsMod.SecurePair = js.native
  def createServer(options: nodeLib.tlsMod.TlsOptions): nodeLib.tlsMod.Server = js.native
  def createServer(
    options: nodeLib.tlsMod.TlsOptions,
    secureConnectionListener: js.Function1[/* socket */ nodeLib.tlsMod.TLSSocket, scala.Unit]
  ): nodeLib.tlsMod.Server = js.native
  def getCiphers(): js.Array[java.lang.String] = js.native
}

