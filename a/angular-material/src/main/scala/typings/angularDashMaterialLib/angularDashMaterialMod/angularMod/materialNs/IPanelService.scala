package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelService extends js.Object {
  var absPosition: angularDashMaterialLib.Anon_TOP
  var animation: angularDashMaterialLib.Anon_SLIDE
  var closeReasons: angularDashMaterialLib.Anon_CLICKOUTSIDE
  var interceptorTypes: angularDashMaterialLib.Anon_CLOSE
  var xPosition: angularDashMaterialLib.Anon_CENTER
  var yPosition: angularDashMaterialLib.Anon_CENTERALIGNTOPS
  def create(opt_config: IPanelConfig): IPanelRef
  def newPanelAnimation(): IPanelAnimation
  def newPanelPosition(): IPanelPosition
  def open(opt_config: IPanelConfig): angularLib.angularMod.angularNs.IPromise[IPanelRef]
}

