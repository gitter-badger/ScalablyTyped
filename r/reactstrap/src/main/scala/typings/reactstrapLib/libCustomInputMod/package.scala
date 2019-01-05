package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCustomInputMod {
  type CustomInput[T] = reactLib.reactMod.Component[CustomInputProps[T], js.Object, js.Any]
  type CustomInputProps[T] = (reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement with stdLib.HTMLInputElement]) with reactstrapLib.Anon_Type with T
  type CustomInputType = reactstrapLib.reactstrapLibStrings.select | reactstrapLib.reactstrapLibStrings.file | reactstrapLib.reactstrapLibStrings.radio | reactstrapLib.reactstrapLibStrings.checkbox
}
