package typings
package lassoLib.lassoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso", "writers")
@js.native
object writersNs extends js.Object {
  def createWriter(writerImpl: js.Any): lassoLib.libWritersMod.Writer = js.native
  def fileWriter(fileWriterConfig: js.Any, lassoConfig: lassoLib.libLassoMod.LassoConfig): js.Any = js.native
}

