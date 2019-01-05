package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDropdownMenuMod {
  type DropdownMenu[T] = reactLib.reactMod.Component[DropdownMenuProps[T], js.Object, js.Any]
  type DropdownMenuProps[T] = (reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement with stdLib.HTMLElement]) with reactstrapLib.Anon_TagRight with T
}
