package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCarouselItemMod {
  type CarouselItem[T] = reactLib.reactMod.Component[CarouselItemProps[T], js.Object, js.Any]
  type CarouselItemProps[T] = (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement with stdLib.HTMLElement]) with Transition with reactstrapLib.Anon_TagIn with T
}
