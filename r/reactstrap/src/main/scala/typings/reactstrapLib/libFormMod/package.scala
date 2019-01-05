package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormMod {
  type Form[T] = reactLib.reactMod.Component[FormProps[T], js.Object, js.Any]
  type FormProps[T] = (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLFormElement with stdLib.HTMLFormElement]) with reactstrapLib.Anon_Inline with T
}
