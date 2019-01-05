package typings
package atFeathersjsErrorsLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/errors", "FeathersError")
@js.native
class FeathersError protected ()
  extends stdLib.Error {
  def this(msg: nodeLib.Error with stdLib.Error, name: java.lang.String, code: scala.Double, className: java.lang.String, data: js.Any) = this()
  def this(msg: java.lang.String, name: java.lang.String, code: scala.Double, className: java.lang.String, data: js.Any) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

