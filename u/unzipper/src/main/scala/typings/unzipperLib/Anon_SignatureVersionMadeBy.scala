package typings
package unzipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_SignatureVersionMadeBy extends js.Object {
  var comment: java.lang.String = js.native
  var compressedSize: scala.Double = js.native
  var compressionMethod: scala.Double = js.native
  var crc32: scala.Double = js.native
  var diskNumber: scala.Double = js.native
  var externalFileAttributes: scala.Double = js.native
  var extraFieldLength: scala.Double = js.native
  var fileCommentLength: scala.Double = js.native
  var fileNameLength: scala.Double = js.native
  var flags: scala.Double = js.native
  var internalFileAttributes: scala.Double = js.native
  var lastModifiedDate: scala.Double = js.native
  var lastModifiedTime: scala.Double = js.native
  var offsetToLocalFileHeader: scala.Double = js.native
  var path: java.lang.String = js.native
  var signature: scala.Double = js.native
  var uncompressedSize: scala.Double = js.native
  var versionMadeBy: scala.Double = js.native
  var versionsNeededToExtract: scala.Double = js.native
  def buffer(): js.Promise[nodeLib.Buffer] = js.native
  def buffer(password: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def stream(): unzipperLib.unzipperMod.Entry = js.native
  def stream(password: java.lang.String): unzipperLib.unzipperMod.Entry = js.native
}

