package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.portlet")
@js.native
class portlet () extends baseview {
  @JSName("config")
  var config_portlet: portletConfig = js.native
  @JSName("$drag")
  def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
  def addView(view: js.Any): java.lang.String | scala.Double = js.native
  def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: portletEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: portletEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def index(obj: js.Any): scala.Double = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def markDropArea(target: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def movePortlet(target: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def reconstruct(): scala.Unit = js.native
  def removeView(id: js.Any): scala.Unit = js.native
  def resizeChildren(): scala.Unit = js.native
  def restore(state: js.Any, factory: webixLib.webixNs.WebixCallback): scala.Unit = js.native
  def serialize(): js.Any = js.native
  def serialize(serializer: webixLib.webixNs.WebixCallback): js.Any = js.native
  def showBatch(name: java.lang.String): scala.Unit = js.native
  def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

