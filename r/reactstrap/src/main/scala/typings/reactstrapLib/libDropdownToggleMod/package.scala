package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDropdownToggleMod {
  type DropdownToggle[T] = reactLib.reactMod.Component[DropdownToggleProps[T], js.Object, js.Any]
  type DropdownToggleProps[T] = (reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement with stdLib.HTMLElement]) with reactstrapLib.Anon_Caret with T
}
