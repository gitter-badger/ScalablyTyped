package typings
package adoneLib.adoneNs.compressorNs.deflateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.compressor.deflate")
@js.native
object deflateNsMembers extends js.Object {
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
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with adoneLib.Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateInfo] = js.native
  /**
               * Compresses the given string or buffer
               */
  def compress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Compresses the given string or buffer
               */
  def compress(
    buf: nodeLib.Buffer,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with adoneLib.Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateInfo] = js.native
  /**
               * Creates a compress stream
               */
  def compressStream(): nodeLib.zlibMod.Deflate = js.native
  /**
               * Creates a compress stream
               */
  def compressStream(options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressStreamOptions): nodeLib.zlibMod.Deflate = js.native
  /**
               * Synchronously compresses the given string or buffer
               */
  def compressSync(buf: java.lang.String): nodeLib.Buffer = js.native
  /**
               * Synchronously compresses the given string or buffer
               */
  def compressSync(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions): nodeLib.Buffer = js.native
  /**
               * Synchronously compresses the given string or buffer
               */
  def compressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
               * Synchronously compresses the given string or buffer
               */
  def compressSync(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions): nodeLib.Buffer = js.native
  /**
               * Synchronously compresses the given string or buffer
               */
  @JSName("compressSync")
  def compressSync_DeflateInfo(
    buf: java.lang.String,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with adoneLib.Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateInfo = js.native
  /**
               * Synchronously compresses the given string or buffer
               */
  @JSName("compressSync")
  def compressSync_DeflateInfo(
    buf: nodeLib.Buffer,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with adoneLib.Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateInfo = js.native
  /**
               * Decomrpesses the given string of buffer
               */
  def decompress(buf: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Decomrpesses the given string of buffer
               */
  def decompress(
    buf: java.lang.String,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with adoneLib.Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateInfo] = js.native
  /**
               * Decomrpesses the given string of buffer
               */
  def decompress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Decomrpesses the given string of buffer
               */
  def decompress(
    buf: nodeLib.Buffer,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with adoneLib.Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateInfo] = js.native
  /**
               * Creates a decompress stream
               */
  def decompressStream(): nodeLib.zlibMod.Inflate = js.native
  /**
               * Creates a decompress stream
               */
  def decompressStream(options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressStreamOptions): nodeLib.zlibMod.Inflate = js.native
  /**
               * Synchronously decomrpesses the given string of buffer
               */
  def decompressSync(buf: java.lang.String): nodeLib.Buffer = js.native
  /**
               * Synchronously decomrpesses the given string of buffer
               */
  def decompressSync(
    buf: java.lang.String,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with adoneLib.Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateInfo = js.native
  /**
               * Synchronously decomrpesses the given string of buffer
               */
  def decompressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
               * Synchronously decomrpesses the given string of buffer
               */
  def decompressSync(
    buf: nodeLib.Buffer,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with adoneLib.Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateInfo = js.native
  /**
               * Synchronously decomrpesses the given string of buffer
               */
  @JSName("decompressSync")
  def decompressSync_Buffer(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions): nodeLib.Buffer = js.native
  /**
               * Synchronously decomrpesses the given string of buffer
               */
  @JSName("decompressSync")
  def decompressSync_Buffer(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions): nodeLib.Buffer = js.native
  /**
               * Compresses data using deflate, and does not append a zlib header
               */
  def rawCompress(buf: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Compresses data using deflate, and does not append a zlib header
               */
  def rawCompress(
    buf: java.lang.String,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with adoneLib.Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateRawInfo] = js.native
  /**
               * Compresses data using deflate, and does not append a zlib header
               */
  def rawCompress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Compresses data using deflate, and does not append a zlib header
               */
  def rawCompress(
    buf: nodeLib.Buffer,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with adoneLib.Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateRawInfo] = js.native
  /**
               * Creates a raw compress stream
               */
  def rawCompressStream(): nodeLib.zlibMod.DeflateRaw = js.native
  /**
               * Creates a raw compress stream
               */
  def rawCompressStream(options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressStreamOptions): nodeLib.zlibMod.DeflateRaw = js.native
  /**
               * Synchronously compresses data using deflate, and does not append a zlib header
               */
  def rawCompressSync(buf: java.lang.String): nodeLib.Buffer = js.native
  /**
               * Synchronously compresses data using deflate, and does not append a zlib header
               */
  def rawCompressSync(
    buf: java.lang.String,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with adoneLib.Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateRawInfo = js.native
  /**
               * Synchronously compresses data using deflate, and does not append a zlib header
               */
  def rawCompressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
               * Synchronously compresses data using deflate, and does not append a zlib header
               */
  def rawCompressSync(
    buf: nodeLib.Buffer,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with adoneLib.Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateRawInfo = js.native
  /**
               * Synchronously compresses data using deflate, and does not append a zlib header
               */
  @JSName("rawCompressSync")
  def rawCompressSync_Buffer(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions): nodeLib.Buffer = js.native
  /**
               * Synchronously compresses data using deflate, and does not append a zlib header
               */
  @JSName("rawCompressSync")
  def rawCompressSync_Buffer(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions): nodeLib.Buffer = js.native
  /**
               * Decompresses raw compressed data
               */
  def rawDecompress(buf: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Decompresses raw compressed data
               */
  def rawDecompress(
    buf: java.lang.String,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with adoneLib.Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateRawInfo] = js.native
  /**
               * Decompresses raw compressed data
               */
  def rawDecompress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Decompresses raw compressed data
               */
  def rawDecompress(
    buf: nodeLib.Buffer,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with adoneLib.Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateRawInfo] = js.native
  /**
               * Creates a raw decompress stream
               */
  def rawDecompressStream(): nodeLib.zlibMod.InflateRaw = js.native
  /**
               * Creates a raw decompress stream
               */
  def rawDecompressStream(options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressStreamOptions): nodeLib.zlibMod.InflateRaw = js.native
  /**
               * Synchronously decompresses raw compressed data
               */
  def rawDecompressSync(buf: java.lang.String): nodeLib.Buffer = js.native
  /**
               * Synchronously decompresses raw compressed data
               */
  def rawDecompressSync(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions): nodeLib.Buffer = js.native
  /**
               * Synchronously decompresses raw compressed data
               */
  def rawDecompressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
               * Synchronously decompresses raw compressed data
               */
  def rawDecompressSync(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions): nodeLib.Buffer = js.native
  /**
               * Synchronously decompresses raw compressed data
               */
  @JSName("rawDecompressSync")
  def rawDecompressSync_InflateRawInfo(
    buf: java.lang.String,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with adoneLib.Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateRawInfo = js.native
  /**
               * Synchronously decompresses raw compressed data
               */
  @JSName("rawDecompressSync")
  def rawDecompressSync_InflateRawInfo(
    buf: nodeLib.Buffer,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with adoneLib.Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateRawInfo = js.native
}
