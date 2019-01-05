package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IGz extends js.Object {
  val INs: Anon_Zlib
  /**
    * Brotli compressor (br)
    */
  val brotliNs: Anon_ICompressBuf
  /**
    * Deflate compressor
    */
  val deflateNs: Anon_ICompress
  /**
    * GZIP compressor
    */
  val gzNs: Anon_Compress
  /**
    * lzma compressor + common lzma functionality
    */
  val lzmaNs: Anon_AsyncCodeAvailable
  /**
    * Snappy compressor
    */
  val snappyNs: Anon_CompressBuf
  /**
    * xz compressor (lzma2) + common lzma functionality
    */
  val xzNs: Anon_AsyncCodeAvailableVersionNumber
}

