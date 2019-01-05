package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDropdownMod {
  type Direction = reactstrapLib.reactstrapLibStrings.up | reactstrapLib.reactstrapLibStrings.down | reactstrapLib.reactstrapLibStrings.left | reactstrapLib.reactstrapLibStrings.right
  type Dropdown[T] = reactLib.reactMod.Component[DropdownProps[T], js.Object, js.Any]
  type DropdownProps[T] = Props[T]
  type Props[T] = UncontrolledProps[T] with reactstrapLib.Anon_Disabled
  type UncontrolledDropdownProps[T] = UncontrolledProps[T]
  type UncontrolledProps[T] = (reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement with stdLib.HTMLElement]) with reactstrapLib.Anon_IsOpenToggle with T
}
