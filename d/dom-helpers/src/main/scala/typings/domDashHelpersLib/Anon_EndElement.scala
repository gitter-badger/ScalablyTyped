package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndElement extends js.Object {
  var default: Anon_End = js.native
  @JSName("end")
  var end_Original: Anon_ElementHandler = js.native
  var properties: Anon_Transform = js.native
  def end[T /* <: stdLib.Element */](element: T, handler: js.Function1[/* event */ Anon_Target[T], scala.Unit]): scala.Unit = js.native
  def end[T /* <: stdLib.Element */](element: T, handler: js.Function1[/* event */ Anon_Target[T], scala.Unit], duration: scala.Double): scala.Unit = js.native
}

