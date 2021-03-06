package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.gage")
@js.native
class gage () extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_gage: gageConfig = js.native
  def attachEvent(`type`: gageEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: gageEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def getValue(): scala.Double = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def setValue(new_value: scala.Double): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

