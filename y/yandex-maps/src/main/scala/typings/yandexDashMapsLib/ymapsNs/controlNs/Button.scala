package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.ymapsNs.ICustomizable because var conflicts: events. Inlined options */ @JSGlobal("ymaps.control.Button")
@js.native
class Button ()
  extends yandexDashMapsLib.ymapsNs.ISelectableControl {
  def this(parameters: java.lang.String) = this()
  def this(parameters: IButtonParameters) = this()
  var data: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  var state: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IControlParent): this.type = js.native
}

