package typings
package atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullKeybindingMatch extends js.Object {
  /** The KeyBinding that the keystrokes matched. */
  var binding: atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.KeyBinding
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: stdLib.Element
  /** The string of keystrokes that matched the binding. */
  var keystrokes: java.lang.String
}

