package typings
package officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FocusZone/FocusZone", "FocusZone")
@js.native
class FocusZone protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZoneProps, 
      js.Object
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZone {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZoneProps) = this()
  /** The most recently focused child element. */
  var _activeElement: js.Any = js.native
  /** The child element with tabindex=0. */
  var _defaultFocusElement: js.Any = js.native
  var _focusAlignment: js.Any = js.native
  var _id: js.Any = js.native
  var _isInnerZone: js.Any = js.native
  var _onFocus: js.Any = js.native
  /**
    * Handle the keystrokes.
    */
  var _onKeyDown: js.Any = js.native
  var _onMouseDown: js.Any = js.native
  /** Used to allow us to move to next focusable element even when we're focusing on a input element when pressing tab */
  var _processingTabKey: js.Any = js.native
  var _root: js.Any = js.native
  /**
    * Traverse to find first child zone.
    */
  /* private */ def _getFirstInnerZone(): js.Any = js.native
  /* private */ def _getFirstInnerZone(rootElement: js.Any): js.Any = js.native
  /* private */ def _getOwnerZone(): js.Any = js.native
  /* private */ def _getOwnerZone(element: js.Any): js.Any = js.native
  /* private */ def _isElementInput(element: js.Any): js.Any = js.native
  /* private */ def _isImmediateDescendantOfZone(): js.Any = js.native
  /* private */ def _isImmediateDescendantOfZone(element: js.Any): js.Any = js.native
  /* private */ def _moveFocus(isForward: js.Any, getDistanceFromCenter: js.Any): js.Any = js.native
  /* private */ def _moveFocus(isForward: js.Any, getDistanceFromCenter: js.Any, ev: js.Any): js.Any = js.native
  /* private */ def _moveFocus(isForward: js.Any, getDistanceFromCenter: js.Any, ev: js.Any, useDefaultWrap: js.Any): js.Any = js.native
  /* private */ def _moveFocusDown(): js.Any = js.native
  /* private */ def _moveFocusLeft(): js.Any = js.native
  /* private */ def _moveFocusRight(): js.Any = js.native
  /* private */ def _moveFocusUp(): js.Any = js.native
  /**
    * Handle global tab presses so that we can patch tabindexes on the fly.
    */
  /* private */ def _onKeyDownCapture(ev: js.Any): js.Any = js.native
  /* private */ def _setActiveElement(element: js.Any): js.Any = js.native
  /* private */ def _setActiveElement(element: js.Any, forceAlignemnt: js.Any): js.Any = js.native
  /* private */ def _setFocusAlignment(element: js.Any): js.Any = js.native
  /* private */ def _setFocusAlignment(element: js.Any, isHorizontal: js.Any): js.Any = js.native
  /* private */ def _setFocusAlignment(element: js.Any, isHorizontal: js.Any, isVertical: js.Any): js.Any = js.native
  /* private */ def _shouldInputLoseFocus(element: js.Any): js.Any = js.native
  /* private */ def _shouldInputLoseFocus(element: js.Any, isForward: js.Any): js.Any = js.native
  /* private */ def _shouldWrapFocus(element: js.Any, noWrapDataAttribute: js.Any): js.Any = js.native
  /**
    * Walk up the dom try to find a focusable element.
    */
  /* private */ def _tryInvokeClickForFocusable(target: js.Any): js.Any = js.native
  /* private */ def _updateTabIndexes(): js.Any = js.native
  /* private */ def _updateTabIndexes(element: js.Any): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFocusZone(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MFocusZone(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/FocusZone/FocusZone", "FocusZone")
@js.native
object FocusZone extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZoneProps = js.native
}

