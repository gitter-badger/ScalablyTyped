package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormGroupMod {
  type FormGroup[T] = reactLib.reactMod.Component[FormGroupProps[T], js.Object, js.Any]
  type FormGroupProps[T] = (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLDivElement with stdLib.HTMLDivElement]) with reactstrapLib.Anon_Row with T
}
