package typings
package atFeathersjsErrorsLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/errors", "PaymentError")
@js.native
class PaymentError () extends FeathersError {
  def this(msg: nodeLib.Error with stdLib.Error) = this()
  def this(msg: java.lang.String) = this()
  def this(msg: nodeLib.Error with stdLib.Error, data: js.Any) = this()
  def this(msg: java.lang.String, data: js.Any) = this()
}

