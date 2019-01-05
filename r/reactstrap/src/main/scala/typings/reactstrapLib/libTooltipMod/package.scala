package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTooltipMod {
  type Tooltip[T] = reactLib.reactMod.Component[TooltipProps[T], js.Object, js.Any]
  type TooltipProps[T] = UncontrolledTooltipProps[T] with reactstrapLib.Anon_Toggle
  type UncontrolledProps[T] = (reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement with stdLib.HTMLElement]) with reactstrapLib.Anon_Target with T
  type UncontrolledTooltipProps[T] = UncontrolledProps[T]
}
