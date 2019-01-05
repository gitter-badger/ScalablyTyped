package typings
package tarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OptionsFileListCallbackErr extends js.Object {
  def apply(options: tarLib.tarMod.ReplaceOptions): js.Promise[scala.Unit] = js.native
  def apply(options: tarLib.tarMod.ReplaceOptions, fileList: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def apply(
    options: tarLib.tarMod.ReplaceOptions,
    fileList: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error with stdLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def apply(
    options: tarLib.tarMod.ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error with stdLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
}

