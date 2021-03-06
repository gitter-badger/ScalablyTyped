package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkData extends js.Object {
  /**
    * the last byte of the current chunk
    */
  var endByte: scala.Double
  /**
    * the 0-based index of the associated partition
    */
  var partIndex: scala.Double
  /**
    * the byte offset of the current chunk
    */
  var startByte: scala.Double
  /**
    * the total number of partitions associated with the `File` or `Blob`
    */
  var totalParts: scala.Double
}

