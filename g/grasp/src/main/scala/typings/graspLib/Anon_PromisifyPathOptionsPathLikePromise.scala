package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromisifyPathOptionsPathLikePromise extends js.Object {
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): js.Promise[nodeLib.Buffer] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: java.lang.String): js.Promise[java.lang.String] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFlag): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFlagString): js.Promise[java.lang.String] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFlagStringNull): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  def `__promisify__`(path: scala.Double): js.Promise[nodeLib.Buffer] = js.native
  def `__promisify__`(path: scala.Double, options: java.lang.String): js.Promise[java.lang.String] = js.native
  def `__promisify__`(path: scala.Double, options: nodeLib.Anon_EncodingFlag): js.Promise[nodeLib.Buffer] = js.native
  def `__promisify__`(path: scala.Double, options: nodeLib.Anon_EncodingFlagString): js.Promise[java.lang.String] = js.native
  def `__promisify__`(path: scala.Double, options: nodeLib.Anon_EncodingFlagStringNull): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
}

