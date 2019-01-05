package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormMod {
  type FormProps[FormData, P, ErrorType] = (reduxDashFormLib.reduxDashFormMod.Omit[
    reactLib.reactMod.ReactNs.FormHTMLAttributes[reactLib.HTMLFormElement with stdLib.HTMLFormElement], 
    reduxDashFormLib.reduxDashFormLibStrings.onSubmit
  ]) with (FormSubmitProp[FormData, P, ErrorType])
}
