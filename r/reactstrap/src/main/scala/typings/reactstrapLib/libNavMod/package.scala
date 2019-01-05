package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNavMod {
  type Nav[T] = reactLib.reactMod.Component[NavProps[T], js.Object, js.Any]
  type NavProps[T] = (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLUListElement with stdLib.HTMLUListElement]) with reactstrapLib.Anon_Tabs with T
}
