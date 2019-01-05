package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CompressBuf extends js.Object {
  /**
    * Compresses the given string or buffer
    */
  def compress(buf: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def compress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Synchronously compresses the given string or buffer
    */
  def compressSync(buf: java.lang.String): nodeLib.Buffer = js.native
  def compressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Decompresses the given buffer
    */
  def decompress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Synchronously decompresses the given buffer
    */
  def decompressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Checks whether the given buffer is a valid compressed buffer
    */
  def isValidCompressed(buf: nodeLib.Buffer): js.Promise[scala.Boolean] = js.native
  /**
    * Synchronously checks whether the given buffer is a valid compressed buffer
    */
  def isValidCompressedSync(buf: nodeLib.Buffer): scala.Boolean = js.native
}

