package typings
package cpyLib.cpyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cpy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(files: java.lang.String | js.Array[java.lang.String], destination: java.lang.String): js.Promise[scala.Unit] with cpyLib.cpyMod.cpyNs.ProgressEmitter = js.native
  def apply(
    files: java.lang.String | js.Array[java.lang.String],
    destination: java.lang.String,
    opts: cpyLib.cpyMod.cpyNs.Options
  ): js.Promise[scala.Unit] with cpyLib.cpyMod.cpyNs.ProgressEmitter = js.native
}

