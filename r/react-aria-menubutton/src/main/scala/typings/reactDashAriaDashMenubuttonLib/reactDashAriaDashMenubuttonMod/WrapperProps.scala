package typings
package reactDashAriaDashMenubuttonLib.reactDashAriaDashMenubuttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperProps[T /* <: reactLib.HTMLElement with stdLib.HTMLElement */]
  extends reactLib.reactMod.ReactNs.HTMLAttributes[T] {
  /**
  	 * By default, it does automatically close.
  	 * If false, the menu will not automatically close when it
  	 * blurs. Default: `true`.
  	 */
  var closeOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * By default, it does automatically close.
  	 * If false, the menu will not automatically close when a
  	 * selection is made. Default: `true`.
  	 */
  var closeOnSelection: js.UndefOr[scala.Boolean] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * A callback to run when the menu is opened or closed.
  	 */
  var onMenuToggle: js.UndefOr[js.Function1[/* obj */ WrapperState, _]] = js.undefined
  /**
  	 * A callback to run when the user makes a selection
  	 * (i.e. clicks or presses Enter or Space on a `MenuItem`).
  	 * It will be passed the value of the selected `MenuItem` and
  	 * the React `SyntheticEvent`.
  	 */
  var onSelection: js.UndefOr[
    js.Function2[
      /* value */ js.Any, 
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[T, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var tag: /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.undefined
}

