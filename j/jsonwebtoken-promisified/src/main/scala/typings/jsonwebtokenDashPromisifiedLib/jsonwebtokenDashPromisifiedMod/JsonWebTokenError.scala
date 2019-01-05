package typings
package jsonwebtokenDashPromisifiedLib.jsonwebtokenDashPromisifiedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken-promisified", "JsonWebTokenError")
@js.native
class JsonWebTokenError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, error: nodeLib.Error with stdLib.Error) = this()
  var inner: nodeLib.Error with stdLib.Error = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

