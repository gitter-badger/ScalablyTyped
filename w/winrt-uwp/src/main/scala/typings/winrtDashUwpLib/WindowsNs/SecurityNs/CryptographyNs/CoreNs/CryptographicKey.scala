package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a symmetric key or an asymmetric key pair. */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicKey")
@js.native
abstract class CryptographicKey () extends js.Object {
  /** Gets the size, in bits, of the key. */
  var keySize: scala.Double = js.native
  /**
    * Exports the key pair to a buffer.
    * @return Buffer that contains the key pair.
    */
  def export(): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
    * Exports the key pair to a buffer given a specified format.
    * @param BlobType A CryptographicPrivateKeyBlobType enumeration value that specifies the format of the key in the buffer. The default value is Pkcs8RawPrivateKeyInfo.
    * @return Buffer that contains the key pair.
    */
  def export(BlobType: CryptographicPrivateKeyBlobType): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
    * Exports a public key to a buffer.
    * @return Buffer that contains the public key.
    */
  def exportPublicKey(): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
    * Exports a public key to a buffer given a specified format.
    * @param BlobType A CryptographicPublicKeyBlobType enumeration value that specifies the format of the key in the buffer. The default value is X509SubjectPublicKeyInfo.
    * @return Buffer that contains the public key.
    */
  def exportPublicKey(BlobType: CryptographicPublicKeyBlobType): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
}

