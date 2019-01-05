package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 *
	 *
	 * see http://docs.angular-formly.com/docs/custom-templates#section-formlyconfig-settype-options
	 */
trait ITypeOptions extends js.Object {
  var apiCheck: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[angularLib.angularMod.Global.Function with js.Function]
  ] = js.undefined
  var apiCheckFunction: js.UndefOr[java.lang.String] = js.undefined
   //'throw' or 'warn
  var apiCheckInstance: js.UndefOr[js.Any] = js.undefined
  var apiCheckOptions: js.UndefOr[js.Object] = js.undefined
  var controller: js.UndefOr[
    (angularLib.angularMod.Global.Function with js.Function) | java.lang.String | js.Array[_]
  ] = js.undefined
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var defaultOptions: js.UndefOr[
    IFieldConfigurationObject | (angularLib.angularMod.Global.Function with js.Function)
  ] = js.undefined
  var `extends`: js.UndefOr[java.lang.String] = js.undefined
  var link: js.UndefOr[
    angularLib.angularMod.angularNs.IDirectiveLinkFn[
      angularLib.angularMod.angularNs.IScope, 
      angularLib.JQLite, 
      angularLib.angularMod.angularNs.IAttributes, 
      angularLib.angularMod.angularNs.IController
    ]
  ] = js.undefined
  var name: java.lang.String
  var overwriteOk: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[(angularLib.angularMod.Global.Function with js.Function) | java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[(angularLib.angularMod.Global.Function with js.Function) | java.lang.String] = js.undefined
  var validateOptions: js.UndefOr[angularLib.angularMod.Global.Function with js.Function] = js.undefined
  var wrapper: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

