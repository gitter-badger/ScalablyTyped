package typings
package reduxDashDevtoolsDashExtensionLib.logOnlyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools-extension/logOnly", JSImport.Namespace)
@js.native
object logOnlyModMembers extends js.Object {
  def composeWithDevTools(options: reduxDashDevtoolsDashExtensionLib.reduxDashDevtoolsDashExtensionMod.EnhancerOptions): reduxDashDevtoolsDashExtensionLib.Anon_A = js.native
  def composeWithDevTools[StoreExt, StateExt](funcs: (reduxLib.reduxMod.StoreEnhancer[StoreExt, js.Object])*): reduxLib.reduxMod.StoreEnhancer[StoreExt, js.Object] = js.native
  def devToolsEnhancer(options: reduxDashDevtoolsDashExtensionLib.reduxDashDevtoolsDashExtensionMod.EnhancerOptions): reduxLib.reduxMod.StoreEnhancer[_, js.Object] = js.native
}

