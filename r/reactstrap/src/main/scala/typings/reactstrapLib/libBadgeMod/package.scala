package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libBadgeMod {
  type Badge[T] = reactLib.reactMod.Component[BadgeProps[T], js.Object, js.Any]
  type BadgeProps[T] = (reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement with stdLib.HTMLElement]) with reactstrapLib.Anon_Color with T
}
