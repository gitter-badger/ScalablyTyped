package typings
package atFirebaseDatabaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_App extends js.Object {
  var Database: org.scalablytyped.runtime.Instantiable0[atFirebaseDatabaseDashTypesLib.databaseDashTypesMod.FirebaseDatabase] = js.native
  var ServerValue: atFirebaseDatabaseDashTypesLib.databaseDashTypesMod.ServerValue = js.native
  @JSName("enableLogging")
  var enableLogging_Original: Anon_Logger = js.native
  def apply(): atFirebaseDatabaseDashTypesLib.databaseDashTypesMod.FirebaseDatabase = js.native
  def apply(app: atFirebaseDatabaseLib.databaseMod.appDashTypesMod.FirebaseApp): atFirebaseDatabaseDashTypesLib.databaseDashTypesMod.FirebaseDatabase = js.native
  def enableLogging(): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ java.lang.String, _]): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ java.lang.String, _], persistent: scala.Boolean): js.Any = js.native
  def enableLogging(logger: scala.Boolean): js.Any = js.native
  def enableLogging(logger: scala.Boolean, persistent: scala.Boolean): js.Any = js.native
}

