package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMediaMod {
  type Media[T] = reactLib.reactMod.Component[MediaProps[T], js.Object, js.Any]
  type MediaProps[T] = (reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement with stdLib.HTMLElement]) with reactstrapLib.Anon_Body with T
}
