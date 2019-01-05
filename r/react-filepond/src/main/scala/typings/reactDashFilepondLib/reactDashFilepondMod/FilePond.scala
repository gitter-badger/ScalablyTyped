package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-filepond", "FilePond")
@js.native
class FilePond ()
  extends reactLib.reactMod.Component[FilePondProps, js.Object, js.Any] {
  def addFile(source: File): scala.Unit = js.native
  def addFiles(source: js.Array[File]): scala.Unit = js.native
  def browse(): scala.Unit = js.native
  @JSName("context")
  def context_MFilePond(): scala.Unit = js.native
  def getFile(): File = js.native
  def getFiles(): js.Array[File] = js.native
  def processFile(query: java.lang.String): scala.Unit = js.native
  def processFiles(): scala.Unit = js.native
  def removeFile(query: java.lang.String): scala.Unit = js.native
  def removeFiles(): scala.Unit = js.native
  def setOptions(options: FilePondProps): scala.Unit = js.native
}

