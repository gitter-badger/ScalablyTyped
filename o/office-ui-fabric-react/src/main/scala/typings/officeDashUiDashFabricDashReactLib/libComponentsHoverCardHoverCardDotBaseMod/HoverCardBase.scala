package typings
package officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.base", "HoverCardBase")
@js.native
class HoverCardBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotTypesMod.IHoverCardProps, 
      IHoverCardState
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotTypesMod.IHoverCardProps) = this()
  var _cardDismiss: js.Any = js.native
  var _cardOpen: js.Any = js.native
  var _classNames: js.Any = js.native
  var _currentMouseTarget: js.Any = js.native
  var _dismissTimerId: js.Any = js.native
  var _executeCardDismiss: js.Any = js.native
  var _executeCardOpen: js.Any = js.native
  var _hoverCard: js.Any = js.native
  var _instantOpenAsExpanded: js.Any = js.native
  var _openTimerId: js.Any = js.native
  /* private */ def _getTargetElement(): js.Any = js.native
  /* private */ def _shouldBlockHoverCard(): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MHoverCardBase(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MHoverCardBase(
    prevProps: officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotTypesMod.IHoverCardProps,
    prevState: IHoverCardState
  ): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.base", "HoverCardBase")
@js.native
object HoverCardBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.Anon_CardOpenDelay = js.native
}

