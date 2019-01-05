package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Promisify extends js.Object {
  /**
    * Asynchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def `__promisify__`(oldPath: nodeLib.fsMod.PathLike, newPath: nodeLib.fsMod.PathLike): js.Promise[scala.Unit]
}

