package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCardMod {
  type Card[T] = reactLib.reactMod.Component[CardProps[T], js.Object, js.Any]
  type CardProps[T] = (reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement with stdLib.HTMLElement]) with reactstrapLib.Anon_TagInverse with T
}
