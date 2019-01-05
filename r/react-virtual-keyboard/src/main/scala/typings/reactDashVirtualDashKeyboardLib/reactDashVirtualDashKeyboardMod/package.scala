package typings
package reactDashVirtualDashKeyboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashVirtualDashKeyboardMod {
  type Keyboard = reactLib.reactMod.Component[KeyboardProps, KeyboardState, js.Any]
  type kbEvents = js.Function3[
    /* event */ js.UndefOr[java.lang.String | (reactLib.Event with stdLib.Event)], 
    /* keyboard */ js.UndefOr[reactLib.Element with stdLib.Element], 
    /* el */ js.UndefOr[reactLib.Element with stdLib.Element], 
    scala.Unit
  ]
}
