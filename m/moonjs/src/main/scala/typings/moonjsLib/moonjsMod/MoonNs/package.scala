package typings
package moonjsLib.moonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MoonNs {
  type ComponentOptions[Props /* <: java.lang.String */, Data, Methods] = (ComponentOptionsProperties[Props, js.Function0[Data], Methods]) with (stdLib.ThisType[Instance[Data with Methods with (stdLib.Record[Props, _])]])
  type ConstructorOptions[Props /* <: java.lang.String */, Data, Methods] = (ComponentOptionsProperties[Props, js.Function0[Data] | Data, Methods]) with (stdLib.ThisType[Instance[Data with Methods with (stdLib.Record[Props, _])]])
}
