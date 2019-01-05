package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCarouselMod {
  type Carousel[T] = reactLib.reactMod.Component[CarouselProps[T], js.Object, js.Any]
  type CarouselProps[T] = (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement with stdLib.HTMLElement]) with reactstrapLib.Anon_ActiveIndex with T
}
