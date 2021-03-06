package typings
package atAngularRouterLib.srcEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/events", "GuardsCheckEnd")
@js.native
class GuardsCheckEnd protected () extends RouterEvent {
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  urlAfterRedirects: java.lang.String, /** @docsNotRequired */
  state: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot, /** @docsNotRequired */
  shouldActivate: scala.Boolean) = this()
  /** @docsNotRequired */
  var shouldActivate: scala.Boolean = js.native
  /** @docsNotRequired */
  var state: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot = js.native
  /** @docsNotRequired */
  var urlAfterRedirects: java.lang.String = js.native
}

