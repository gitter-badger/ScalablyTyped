package typings
package nodeLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", "TLSSocket")
@js.native
class TLSSocket protected ()
  extends nodeLib.netMod.Socket {
  /**
    * Construct a new tls.TLSSocket object from an existing TCP socket.
    */
  def this(socket: nodeLib.netMod.Socket) = this()
  def this(socket: nodeLib.netMod.Socket, options: nodeLib.Anon_SecureContext) = this()
  /**
    * String containing the selected ALPN protocol.
    * When ALPN has no selected protocol, tlsSocket.alpnProtocol equals false.
    */
  var alpnProtocol: js.UndefOr[java.lang.String] = js.native
  /**
    * The reason why the peer's certificate has not been verified.
    * This property becomes available only when tlsSocket.authorized === false.
    */
  var authorizationError: nodeLib.Error = js.native
  /**
    * A boolean that is true if the peer certificate was signed by one of the specified CAs, otherwise false.
    */
  var authorized: scala.Boolean = js.native
  /**
    * Static boolean value, always true.
    * May be used to distinguish TLS sockets from regular ones.
    */
  var encrypted: scala.Boolean = js.native
  @JSName("addListener")
  def addListener_OCSPResponse(
    event: nodeLib.nodeLibStrings.OCSPResponse,
    listener: js.Function1[/* response */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_secureConnect(event: nodeLib.nodeLibStrings.secureConnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("emit")
  def emit_OCSPResponse(event: nodeLib.nodeLibStrings.OCSPResponse, response: nodeLib.Buffer): scala.Boolean = js.native
  @JSName("emit")
  def emit_secureConnect(event: nodeLib.nodeLibStrings.secureConnect): scala.Boolean = js.native
  /**
    * Returns an object representing the cipher name and the SSL/TLS protocol version of the current connection.
    * @returns Returns an object representing the cipher name
    * and the SSL/TLS protocol version of the current connection.
    */
  def getCipher(): CipherNameAndProtocol = js.native
  def getPeerCertificate(): PeerCertificate | DetailedPeerCertificate = js.native
  def getPeerCertificate(detailed: nodeLib.nodeLibNumbers.`false`): PeerCertificate = js.native
  /**
    * Returns an object representing the peer's certificate.
    * The returned object has some properties corresponding to the field of the certificate.
    * If detailed argument is true the full chain with issuer property will be returned,
    * if false only the top certificate without issuer property.
    * If the peer does not provide a certificate, it returns null or an empty object.
    * @param detailed - If true; the full chain with issuer property will be returned.
    * @returns An object representing the peer's certificate.
    */
  def getPeerCertificate(detailed: nodeLib.nodeLibNumbers.`true`): DetailedPeerCertificate = js.native
  def getPeerCertificate(detailed: scala.Boolean): PeerCertificate | DetailedPeerCertificate = js.native
  @JSName("getPeerCertificate")
  def getPeerCertificate_PeerCertificate(): PeerCertificate = js.native
  /**
    * Returns a string containing the negotiated SSL/TLS protocol version of the current connection.
    * The value `'unknown'` will be returned for connected sockets that have not completed the handshaking process.
    * The value `null` will be returned for server sockets or disconnected client sockets.
    * See https://www.openssl.org/docs/man1.0.2/ssl/SSL_get_version.html for more information.
    * @returns negotiated SSL/TLS protocol version of the current connection
    */
  def getProtocol(): java.lang.String | scala.Null = js.native
  /**
    * Could be used to speed up handshake establishment when reconnecting to the server.
    * @returns ASN.1 encoded TLS session or undefined if none was negotiated.
    */
  def getSession(): js.Any = js.native
  /**
    * NOTE: Works only with client TLS sockets.
    * Useful only for debugging, for session reuse provide session option to tls.connect().
    * @returns TLS session ticket or undefined if none was negotiated.
    */
  def getTLSTicket(): js.Any = js.native
  @JSName("on")
  def on_OCSPResponse(
    event: nodeLib.nodeLibStrings.OCSPResponse,
    listener: js.Function1[/* response */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_secureConnect(event: nodeLib.nodeLibStrings.secureConnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_OCSPResponse(
    event: nodeLib.nodeLibStrings.OCSPResponse,
    listener: js.Function1[/* response */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_secureConnect(event: nodeLib.nodeLibStrings.secureConnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_OCSPResponse(
    event: nodeLib.nodeLibStrings.OCSPResponse,
    listener: js.Function1[/* response */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_secureConnect(event: nodeLib.nodeLibStrings.secureConnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_OCSPResponse(
    event: nodeLib.nodeLibStrings.OCSPResponse,
    listener: js.Function1[/* response */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_secureConnect(event: nodeLib.nodeLibStrings.secureConnect, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Initiate TLS renegotiation process.
    *
    * NOTE: Can be used to request peer's certificate after the secure connection has been established.
    * ANOTHER NOTE: When running as the server, socket will be destroyed with an error after handshakeTimeout timeout.
    * @param options - The options may contain the following fields: rejectUnauthorized,
    * requestCert (See tls.createServer() for details).
    * @param callback - callback(err) will be executed with null as err, once the renegotiation
    * is successfully completed.
    */
  def renegotiate(
    options: nodeLib.Anon_RejectUnauthorizedRequestCert,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): js.Any = js.native
  /**
    * Set maximum TLS fragment size (default and maximum value is: 16384, minimum is: 512).
    * Smaller fragment size decreases buffering latency on the client: large fragments are buffered by
    * the TLS layer until the entire fragment is received and its integrity is verified;
    * large fragments can span multiple roundtrips, and their processing can be delayed due to packet
    * loss or reordering. However, smaller fragments add extra TLS framing bytes and CPU overhead,
    * which may decrease overall server throughput.
    * @param size - TLS fragment size (default and maximum value is: 16384, minimum is: 512).
    * @returns Returns true on success, false otherwise.
    */
  def setMaxSendFragment(size: scala.Double): scala.Boolean = js.native
}

