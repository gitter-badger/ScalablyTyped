package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "FetchError")
@js.native
class FetchError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String, `type`: java.lang.String, systemError: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("name")
  var name_FetchError: nodeDashFetchLib.nodeDashFetchLibStrings.FetchError = js.native
}

