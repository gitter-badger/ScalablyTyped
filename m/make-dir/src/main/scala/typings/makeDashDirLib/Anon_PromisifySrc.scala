package typings
package makeDashDirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromisifySrc extends js.Object {
  /**
    * Asynchronously copies src to dest. By default, dest is overwritten if it already exists.
    * No arguments other than a possible exception are given to the callback function.
    * Node.js makes no guarantees about the atomicity of the copy operation.
    * If an error occurs after the destination file has been opened for writing, Node.js will attempt
    * to remove the destination.
    * @param src A path to the source file.
    * @param dest A path to the destination file.
    * @param flags An optional integer that specifies the behavior of the copy operation.
    * The only supported flag is fs.constants.COPYFILE_EXCL,
    * which causes the copy operation to fail if dest already exists.
    */
  def `__promisify__`(src: nodeLib.fsMod.PathLike, dst: nodeLib.fsMod.PathLike): js.Promise[scala.Unit] = js.native
  def `__promisify__`(src: nodeLib.fsMod.PathLike, dst: nodeLib.fsMod.PathLike, flags: scala.Double): js.Promise[scala.Unit] = js.native
}

