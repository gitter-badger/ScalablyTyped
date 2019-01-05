package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesDragdropInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropHelper extends js.Object {
  def dispose(): scala.Unit
  def subscribe(
    root: reactLib.HTMLElement with stdLib.HTMLElement,
    events: officeDashUiDashFabricDashReactLib.libUtilitiesMod.EventGroup,
    options: IDragDropOptions
  ): officeDashUiDashFabricDashReactLib.Anon_KeyDispose
  def unsubscribe(root: reactLib.HTMLElement with stdLib.HTMLElement, key: java.lang.String): scala.Unit
}

