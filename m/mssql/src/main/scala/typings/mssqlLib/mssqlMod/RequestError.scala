package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- stdLib.Error because var conflicts: stack. Inlined message, name */ @JSImport("mssql", "RequestError")
@js.native
class RequestError protected ()
  extends nodeLib.Error {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, code: js.Any) = this()
  var code: java.lang.String = js.native
  var message: java.lang.String = js.native
  var name: java.lang.String = js.native
}

