package typings
package antdLib.libBackDashTopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackTop
  extends reactLib.reactMod.Component[BackTopProps, js.Any, js.Any] {
  var scrollEvent: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBackTop(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBackTop(): scala.Unit = js.native
  def getCurrentScrollTop(): scala.Double = js.native
  def handleScroll(): scala.Unit = js.native
  def scrollToTop(
    e: reactLib.reactMod.ReactNs.MouseEvent[
      reactLib.HTMLDivElement with stdLib.HTMLDivElement, 
      reactLib.MouseEvent with stdLib.MouseEvent
    ]
  ): scala.Unit = js.native
  def setScrollTop(value: scala.Double): scala.Unit = js.native
}

