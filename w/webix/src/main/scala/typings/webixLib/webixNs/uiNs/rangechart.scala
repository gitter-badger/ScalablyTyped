package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.rangechart")
@js.native
class rangechart () extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var colormap: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  @JSName("config")
  var config_rangechart: rangechartConfig = js.native
  var data: webixLib.webixNs.DataStore = js.native
  @JSName("on_click")
  var on_click_Original: webixLib.webixNs.WebixCallback = js.native
  var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  @JSName("on_dblclick")
  var on_dblclick_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("on_mouse_move")
  var on_mouse_move_Original: webixLib.webixNs.WebixCallback = js.native
  var presets: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var waitData: js.Promise[_] = js.native
  def add(obj: js.Any): java.lang.String | scala.Double = js.native
  def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
  def addSeries(obj: js.Any): scala.Unit = js.native
  def attachEvent(`type`: rangechartEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: rangechartEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def clearAll(): scala.Unit = js.native
  def clearAll(soft: scala.Boolean): scala.Unit = js.native
  def clearCanvas(): scala.Unit = js.native
  def count(): scala.Double = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def exists(id: java.lang.String): scala.Boolean = js.native
  def exists(id: scala.Double): scala.Boolean = js.native
  def filter(text: webixLib.webixNs.WebixCallback | webixLib.webixNs.WebixTemplate): scala.Unit = js.native
  def filter(text: webixLib.webixNs.WebixCallback | webixLib.webixNs.WebixTemplate, value: java.lang.String): scala.Unit = js.native
  def filter(
    text: webixLib.webixNs.WebixCallback | webixLib.webixNs.WebixTemplate,
    value: java.lang.String,
    preserve: scala.Boolean
  ): scala.Unit = js.native
  def filter(text: java.lang.String): scala.Unit = js.native
  def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
  def find(criterion: webixLib.webixNs.WebixCallback): js.Any = js.native
  def find(criterion: webixLib.webixNs.WebixCallback, first: scala.Boolean): js.Any = js.native
  def getFirstId(): java.lang.String | scala.Double = js.native
  def getFrameData(): js.Array[_] = js.native
  def getFrameRange(): js.Any = js.native
  def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
  def getIndexById(id: java.lang.String): scala.Double = js.native
  def getIndexById(id: scala.Double): scala.Double = js.native
  def getItem(id: java.lang.String): js.Any = js.native
  def getItem(id: scala.Double): js.Any = js.native
  def getLastId(): java.lang.String | scala.Double = js.native
  def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
  def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
  def group(config: js.Any, mode: scala.Boolean): scala.Unit = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def hideSeries(index: scala.Double): scala.Unit = js.native
  def load(url: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixNs.WebixCallback): js.Promise[_] = js.native
  def loadNext(
    count: scala.Double,
    start: scala.Double,
    callback: webixLib.webixNs.WebixCallback,
    url: java.lang.String,
    now: scala.Boolean
  ): scala.Unit = js.native
  def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def on_click(args: js.Any*): js.Any = js.native
  def on_dblclick(args: js.Any*): js.Any = js.native
  def on_mouse_move(args: js.Any*): js.Any = js.native
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def refresh(id: java.lang.String): scala.Unit = js.native
  def refresh(id: scala.Double): scala.Unit = js.native
  def remove(id: java.lang.String): scala.Unit = js.native
  def remove(id: scala.Double): scala.Unit = js.native
  def removeAllSeries(): scala.Unit = js.native
  def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def serialize(): js.Array[_] = js.native
  def setFrameRange(range: js.Any): scala.Unit = js.native
  def showSeries(index: scala.Double): scala.Unit = js.native
  def sort(by: java.lang.String): scala.Unit = js.native
  def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
  def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
  def sync(source: js.Any, filter: webixLib.webixNs.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
  def ungroup(mode: scala.Boolean): scala.Unit = js.native
  def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
  def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
}

