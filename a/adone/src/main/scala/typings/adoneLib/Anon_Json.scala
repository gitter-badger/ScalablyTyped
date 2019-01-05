package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Json extends js.Object {
  val INs: js.Any
  val base32Ns: Anon_Charmap
  val base58: adoneLib.adoneNs.dataNs.INs.BaseX
  /**
    * Base64 encoder
    */
  val base64Ns: Anon_IEncodeStr
  val base64urlNs: Anon_Unescape
  /**
    * BSON encoder
    */
  val bsonNs: Anon_IBinary
  /**
    * JSON5 encoder
    */
  val json5Ns: Anon_EncodeObj
  /**
    * JSON encoder
    */
  val jsonNs: Anon_IEncode
  /**
    * MessagePack encoder
    */
  val mpakNs: Anon_Encode
  val protobufNs: Anon_SchemaCreate
  val varintNs: Anon_EncodeNum
  val varintSignedNs: Anon_EncodeNum
  /**
    * YAML encoder
    */
  val yamlNs: Anon_Loader
  def basex(alphabet: java.lang.String): adoneLib.adoneNs.dataNs.INs.BaseX
}

