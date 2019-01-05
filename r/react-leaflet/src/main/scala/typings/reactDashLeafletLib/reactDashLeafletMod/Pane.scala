package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "Pane")
@js.native
class Pane[P /* <: PaneProps */, S /* <: PaneState */] ()
  extends reactLib.reactMod.Component[P, S, js.Any] {
  def createPane(props: P): scala.Unit = js.native
  def getChildContext(): reactDashLeafletLib.Anon_Pane = js.native
  def getPane(name: java.lang.String): js.UndefOr[reactLib.HTMLElement with stdLib.HTMLElement] = js.native
  def getParentPane(): js.UndefOr[reactLib.HTMLElement with stdLib.HTMLElement] = js.native
  def removePane(): scala.Unit = js.native
  def setStyle(arg: reactDashLeafletLib.Anon_Style): scala.Unit = js.native
}

