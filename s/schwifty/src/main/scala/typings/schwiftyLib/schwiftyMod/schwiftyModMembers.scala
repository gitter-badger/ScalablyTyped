package typings
package schwiftyLib.schwiftyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schwifty", JSImport.Namespace)
@js.native
object schwiftyModMembers extends js.Object {
  val plugin: hapiLib.hapiMod.Plugin[RegistrationOptions] = js.native
  def assertCompatible(ModelA: schwiftyLib.Anon_GetJoiSchema, ModelB: schwiftyLib.Anon_GetJoiSchema): scala.Unit | (nodeLib.Error with stdLib.Error) = js.native
  def assertCompatible(
    ModelA: schwiftyLib.Anon_GetJoiSchema,
    ModelB: schwiftyLib.Anon_GetJoiSchema,
    message: java.lang.String
  ): scala.Unit | (nodeLib.Error with stdLib.Error) = js.native
}

