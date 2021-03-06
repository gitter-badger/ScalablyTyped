package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encrypts, decrypts, and signs content, and verifies digital signatures. */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
@js.native
abstract class CryptographicEngine () extends js.Object

/** Encrypts, decrypts, and signs content, and verifies digital signatures. */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
@js.native
object CryptographicEngine extends js.Object {
  /**
    * Decrypts content that was previously encrypted by using a symmetric or asymmetric algorithm.
    * @param key Cryptographic key to use for decryption. This can be an asymmetric or a symmetric key. For more information, see AsymmetricKeyAlgorithmProvider and SymmetricKeyAlgorithmProvider .
    * @param data Buffer that contains the encrypted data.
    * @param iv Buffer that contains the initialization vector. If an initialization vector (IV) was used to encrypt the data, you must use the same IV to decrypt the data. For more information, see Encrypt .
    * @return Decrypted data.
    */
  def decrypt(
    key: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    iv: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
    * Decrypts and authenticates data. For more information and a complete code sample, see EncryptedAndAuthenticatedData .
    * @param key Symmetric key to use.
    * @param data Data to be decrypted and authenticated.
    * @param nonce Nonce to be used. This must be the same nonce used by the EncryptAndAuthenticate method.
    * @param authenticationTag Authentication tag.
    * @param authenticatedData Authenticated data. This can be Null.
    * @return A buffer that contains the decrypted data.
    */
  def decryptAndAuthenticate(
    key: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    nonce: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    authenticationTag: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    authenticatedData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
    * Decrypts the encrypted input data using the supplied key.
    * @param key The key to use to decrypt the encrypted input data.
    * @param data The encrypted data to decrypt.
    * @param iv The initial vector for a symmetric key. For an asymmetric key, set this value to null.
    * @return The decrypted data.
    */
  def decryptAsync(
    key: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    iv: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
  /**
    * Derives a key from another key by using a key derivation function. For more information, see the KeyDerivationAlgorithmProvider and KeyDerivationParameters classes.
    * @param key The symmetric or secret key used for derivation.
    * @param parameters Derivation parameters. The parameters vary depending on the type of KDF algorithm used.
    * @param desiredKeySize Requested size, in bytes, of the derived key.
    * @return Buffer that contains the derived key.
    */
  def deriveKeyMaterial(
    key: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    parameters: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.KeyDerivationParameters,
    desiredKeySize: scala.Double
  ): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
    * Encrypts data by using a symmetric or asymmetric algorithm.
    * @param key Cryptographic key to use for encryption. This can be an asymmetric or a symmetric key. For more information, see AsymmetricKeyAlgorithmProvider and SymmetricKeyAlgorithmProvider .
    * @param data Data to encrypt.
    * @param iv Buffer that contains the initialization vector. This can be null for a symmetric algorithm and should always be null for an asymmetric algorithm. If an initialization vector (IV) was used to encrypt the data, you must use the same IV to decrypt the data. You can use the GenerateRandom method to create an IV that contains random data. Other IVs, such as nonce-generated vectors, require custom implementation. For more information, see Cryptographic keys.
    * @return Encrypted data.
    */
  def encrypt(
    key: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    iv: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
    * Performs authenticated encryption.
    * @param key Symmetric key to use for encryption.
    * @param data Data to be encrypted and authenticated.
    * @param nonce Nonce to be used. A nonce is a variable that has minimal chance of repeating. For example, you can use a random value that is newly generated for each use, a time stamp, a sequence number, or some combination of these. The Microsoft GCM implementation requires a 12-byte nonce. The CCM implementation requires a 7- to 13- byte nonce.
    * @param authenticatedData Authenticated data. This can be Null.
    * @return The encrypted and authenticated data.
    */
  def encryptAndAuthenticate(
    key: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    nonce: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    authenticatedData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.EncryptedAndAuthenticatedData = js.native
  /**
    * Signs digital content. For more information, see MACs, hashes, and signatures.
    * @param key Key used for signing.
    * @param data Data to be signed.
    * @return The data's signature.
    */
  def sign(
    key: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
    * Computes a hash for the supplied input data, and then signs the computed hash using the specified key.
    * @param key The key to use to compute and sign the hash.
    * @param data The raw input data to sign. The data is not hashed.
    * @return An asynchronous operation to retrieve the hashed and signed data.
    */
  def signAsync(
    key: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
  /**
    * Signs the hashed input data using the specified key.
    * @param key The key to use to sign the hash. This key must be an asymmetric key obtained from a PersistedKeyProvider or AsymmetricKeyAlgorithmProvider .
    * @param data The input data to sign. The data is a hashed value which can be obtained through incremental hash.
    * @return The signed data.
    */
  def signHashedData(
    key: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
    * Signs the hashed input data using the specified key.
    * @param key The key to use to sign the hash. This key must be an asymmetric key obtained from a PersistedKeyProvider or AsymmetricKeyAlgorithmProvider .
    * @param data The input data to sign. The data is a hashed value which can be obtained through incremental hash.
    * @return An asynchronous operation to retrieve the signed data.
    */
  def signHashedDataAsync(
    key: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
  /**
    * Verifies a message signature.
    * @param key Key used for verification. This must be the same key previously used to sign the message.
    * @param data Message to be verified.
    * @param signature Signature previously computed over the message to be verified.
    * @return true if the message is verified.
    */
  def verifySignature(
    key: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    signature: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): scala.Boolean = js.native
  /**
    * Verifies the signature of the specified input data against a known signature.
    * @param key The key to use to retrieve the signature from the input data. This key must be an asymmetric key obtained from a PersistedKeyProvider or AsymmetricKeyAlgorithmProvider .
    * @param data The data to be verified. The data is a hashed value of raw data.
    * @param signature The known signature to use to verify the signature of the input data.
    * @return True if the signature is verified; otherwise false.
    */
  def verifySignatureWithHashInput(
    key: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    signature: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): scala.Boolean = js.native
}

