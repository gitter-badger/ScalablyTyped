package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libColMod {
  type Col[T] = reactLib.reactMod.Component[ColProps[T], js.Object, js.Any]
  type ColProps[T] = (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLDivElement with stdLib.HTMLDivElement]) with reactstrapLib.Anon_TagXs with T
  type ColumnProps = java.lang.String | scala.Boolean | scala.Double | reactstrapLib.Anon_Size
}
