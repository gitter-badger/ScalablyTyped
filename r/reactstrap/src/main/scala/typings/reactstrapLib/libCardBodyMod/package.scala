package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCardBodyMod {
  type CardBody[T] = reactLib.reactMod.Component[CardBodyProps[T], js.Object, js.Any]
  type CardBodyProps[T] = (reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement with stdLib.HTMLElement]) with reactstrapLib.Anon_TagClassName with T
}
