package typings
package atAngularCoreLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/core", "Injector")
@js.native
abstract class Injector ()
  extends atAngularCoreLib.srcDiMod.Injector

@JSImport("@angular/core/src/core", "Injector")
@js.native
object Injector extends js.Object {
  var NULL: atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  var THROW_IF_NOT_FOUND: js.Object = js.native
  /** @nocollapse */
  var ngInjectableDef: scala.Nothing = js.native
  def create(options: atAngularCoreLib.Anon_Providers): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  /**
    * @deprecated from v5 use the new signature Injector.create(options)
    */
  def create(providers: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def create(
    providers: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider],
    parent: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
}

