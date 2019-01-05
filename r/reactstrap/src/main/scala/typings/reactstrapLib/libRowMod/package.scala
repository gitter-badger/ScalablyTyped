package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRowMod {
  type Row[T] = reactLib.reactMod.Component[RowProps[T], js.Object, js.Any]
  type RowProps[T] = (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement with stdLib.HTMLElement]) with reactstrapLib.Anon_ClassNameCssModuleTag with T
}
