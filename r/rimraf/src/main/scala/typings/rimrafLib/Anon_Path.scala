package typings
package rimrafLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Path extends js.Object {
  def apply(
    path: nodeLib.fsMod.PathLike,
    mode: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Asynchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, mode: java.lang.String): js.Promise[scala.Unit] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, mode: scala.Double): js.Promise[scala.Unit] = js.native
}

