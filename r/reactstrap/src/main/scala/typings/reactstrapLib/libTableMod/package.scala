package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTableMod {
  type Table[T] = reactLib.reactMod.Component[TableProps[T], js.Object, js.Any]
  type TableProps[T] = (reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement with stdLib.HTMLElement]) with reactstrapLib.Anon_ClassNameCssModuleSize with T
}
