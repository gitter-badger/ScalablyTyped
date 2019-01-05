package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCardDeckMod {
  type CardDeck[T] = reactLib.reactMod.Component[CardDeckProps[T], js.Object, js.Any]
  type CardDeckProps[T] = (reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement with stdLib.HTMLElement]) with reactstrapLib.Anon_TagClassName with T
}
