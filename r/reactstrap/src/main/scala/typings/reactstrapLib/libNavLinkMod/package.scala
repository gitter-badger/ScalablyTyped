package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNavLinkMod {
  type NavLink[T] = reactLib.reactMod.Component[NavLinkProps[T], js.Object, js.Any]
  type NavLinkProps[T] = (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLAnchorElement with stdLib.HTMLAnchorElement]) with reactstrapLib.Anon_TagInnerRefDisabled with T
}
