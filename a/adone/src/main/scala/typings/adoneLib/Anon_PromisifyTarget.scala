package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromisifyTarget extends js.Object {
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def `__promisify__`(target: nodeLib.fsMod.PathLike, path: nodeLib.fsMod.PathLike): js.Promise[scala.Unit] = js.native
  def `__promisify__`(target: nodeLib.fsMod.PathLike, path: nodeLib.fsMod.PathLike, `type`: java.lang.String): js.Promise[scala.Unit] = js.native
}

