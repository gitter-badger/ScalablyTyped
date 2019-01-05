package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Compress extends js.Object {
  val Z_BEST_COMPRESSION: scala.Double = js.native
  val Z_BEST_SPEED: scala.Double = js.native
  val Z_BLOCK: scala.Double = js.native
  val Z_BUF_ERROR: scala.Double = js.native
  val Z_DATA_ERROR: scala.Double = js.native
  val Z_DEFAULT_COMPRESSION: scala.Double = js.native
  val Z_DEFAULT_STRATEGY: scala.Double = js.native
  val Z_ERRNO: scala.Double = js.native
  val Z_FILTERED: scala.Double = js.native
  val Z_FINISH: scala.Double = js.native
  val Z_FIXED: scala.Double = js.native
  val Z_FULL_FLUSH: scala.Double = js.native
  val Z_HUFFMAN_ONLY: scala.Double = js.native
  val Z_MEM_ERROR: scala.Double = js.native
  val Z_NEED_DICT: scala.Double = js.native
  val Z_NO_COMPRESSION: scala.Double = js.native
  val Z_NO_FLUSH: scala.Double = js.native
  val Z_OK: scala.Double = js.native
  val Z_PARTIAL_FLUSH: scala.Double = js.native
  val Z_RLE: scala.Double = js.native
  val Z_STREAM_END: scala.Double = js.native
  val Z_STREAM_ERROR: scala.Double = js.native
  val Z_SYNC_FLUSH: scala.Double = js.native
  val Z_TREES: scala.Double = js.native
  val Z_VERSION_ERROR: scala.Double = js.native
  /**
    * Compresses the given string or buffer
    */
  def compress(buf: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Compresses the given string or buffer
    */
  def compress(
    buf: java.lang.String,
    options: (adoneLib.adoneNs.compressorNs.INs.zlibNs.CompressOptions with Anon_Info) | adoneLib.adoneNs.compressorNs.INs.zlibNs.CompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.INs.zlibNs.GzipInfo] = js.native
  def compress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def compress(
    buf: nodeLib.Buffer,
    options: (adoneLib.adoneNs.compressorNs.INs.zlibNs.CompressOptions with Anon_Info) | adoneLib.adoneNs.compressorNs.INs.zlibNs.CompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.INs.zlibNs.GzipInfo] = js.native
  /**
    * Creates a compress stream
    */
  def compressStream(): nodeLib.zlibMod.Gzip = js.native
  def compressStream(options: adoneLib.adoneNs.compressorNs.INs.zlibNs.CompressStreamOptions): nodeLib.zlibMod.Gzip = js.native
  /**
    * Synchronously compreses the given string or buffer
    */
  def compressSync(buf: java.lang.String): nodeLib.Buffer = js.native
  def compressSync(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.INs.zlibNs.CompressOptions): nodeLib.Buffer = js.native
  def compressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  def compressSync(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.INs.zlibNs.CompressOptions): nodeLib.Buffer = js.native
  /**
    * Synchronously compreses the given string or buffer
    */
  @JSName("compressSync")
  def compressSync_GzipInfo(
    buf: java.lang.String,
    options: adoneLib.adoneNs.compressorNs.INs.zlibNs.CompressOptions with Anon_Info
  ): adoneLib.adoneNs.compressorNs.INs.zlibNs.GzipInfo = js.native
  @JSName("compressSync")
  def compressSync_GzipInfo(
    buf: nodeLib.Buffer,
    options: adoneLib.adoneNs.compressorNs.INs.zlibNs.CompressOptions with Anon_Info
  ): adoneLib.adoneNs.compressorNs.INs.zlibNs.GzipInfo = js.native
  /**
    * Decompresses the given string or buffer
    */
  def decompress(buf: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Decompresses the given string or buffer
    */
  def decompress(
    buf: java.lang.String,
    options: (adoneLib.adoneNs.compressorNs.INs.zlibNs.DecompressOptions with Anon_Info) | adoneLib.adoneNs.compressorNs.INs.zlibNs.DecompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.INs.zlibNs.GunzipInfo] = js.native
  def decompress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def decompress(
    buf: nodeLib.Buffer,
    options: (adoneLib.adoneNs.compressorNs.INs.zlibNs.DecompressOptions with Anon_Info) | adoneLib.adoneNs.compressorNs.INs.zlibNs.DecompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.INs.zlibNs.GunzipInfo] = js.native
  /**
    * Creates a decompress stream
    */
  def decompressStream(): nodeLib.zlibMod.Gunzip = js.native
  def decompressStream(options: adoneLib.adoneNs.compressorNs.INs.zlibNs.DecompressStreamOptions): nodeLib.zlibMod.Gunzip = js.native
  /**
    * Synchronously decompresses the given string or buffer
    */
  def decompressSync(buf: java.lang.String): nodeLib.Buffer = js.native
  /**
    * Synchronously decompresses the given string or buffer
    */
  def decompressSync(
    buf: java.lang.String,
    options: adoneLib.adoneNs.compressorNs.INs.zlibNs.DecompressOptions with Anon_Info
  ): adoneLib.adoneNs.compressorNs.INs.zlibNs.GunzipInfo = js.native
  def decompressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  def decompressSync(
    buf: nodeLib.Buffer,
    options: adoneLib.adoneNs.compressorNs.INs.zlibNs.DecompressOptions with Anon_Info
  ): adoneLib.adoneNs.compressorNs.INs.zlibNs.GunzipInfo = js.native
  @JSName("decompressSync")
  def decompressSync_Buffer(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.INs.zlibNs.DecompressOptions): nodeLib.Buffer = js.native
  @JSName("decompressSync")
  def decompressSync_Buffer(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.INs.zlibNs.DecompressOptions): nodeLib.Buffer = js.native
}

