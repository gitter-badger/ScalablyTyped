package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromisifyPath extends js.Object {
  /**
    * Asynchronous truncate(2) - Truncate a file to a specified length.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param len If not specified, defaults to `0`.
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): js.Promise[scala.Unit] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, len: scala.Double): js.Promise[scala.Unit] = js.native
}

