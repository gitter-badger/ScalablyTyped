package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashFormMod {
  type FieldType = reduxDashFormLib.reduxDashFormLibStrings.Field | reduxDashFormLib.reduxDashFormLibStrings.FieldArray
  type FormErrors[FormData, T] = reduxDashFormLib.reduxDashFormLibStrings.FormErrors with js.Any with ErrorOther[T]
  type FormWarnings[FormData, T] = reduxDashFormLib.reduxDashFormLibStrings.FormWarnings with js.Any
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[
    T, 
    /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
