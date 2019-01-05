package typings
package angularDashModalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularModalNs {
  type AngularModalControllerDefinition = (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]) | (angularLib.angularMod.Global.Function with js.Function) | java.lang.String
  type AngularModalFactory = js.Function1[
    /* settings */ AngularModalSettingsWithTemplate | AngularModalSettingsWithTemplateUrl, 
    AngularModal
  ]
  type AngularModalJQuerySelector = java.lang.String | stdLib.Element | js.Array[stdLib.Element] | angularLib.JQuery | (angularLib.angularMod.Global.Function with js.Function) | js.Array[js.Any] | js.Object
}
