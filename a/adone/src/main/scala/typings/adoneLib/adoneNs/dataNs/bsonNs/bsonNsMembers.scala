package typings
package adoneLib.adoneNs.dataNs.bsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.bson")
@js.native
object bsonNsMembers extends js.Object {
  /**
               * BSON serializator instance
               */
  val serializer: BSON = js.native
  /**
               * Decodes the given buffer with enabled buffers and values promoting
               */
  def decode(buf: nodeLib.Buffer): js.Any = js.native
  /**
               * Decodes the given buffer with enabled buffers and values promoting
               */
  def decode(buf: nodeLib.Buffer, options: adoneLib.adoneNs.dataNs.bsonNs.INs.DeserializeOptions): js.Any = js.native
  /**
               * Encodes the given object
               */
  def encode(obj: js.Object): nodeLib.Buffer = js.native
  /**
               * Encodes the given object
               */
  def encode(obj: js.Object, options: adoneLib.adoneNs.dataNs.bsonNs.INs.SerializeOptions): nodeLib.Buffer = js.native
}
