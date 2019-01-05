package typings
package rimrafLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Promisify extends js.Object {
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): js.Promise[scala.Unit]
}

