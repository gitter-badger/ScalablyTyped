package typings
package reactDashMdLib.libAutocompletesAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteComponent
  extends reactLib.reactMod.ReactNs.ComponentClass[AutocompleteProps, reactLib.reactMod.ReactNs.ComponentState] {
  var HorizontalAnchors: reactDashMdLib.Anon_LEFT = js.native
  var Positions: reactDashMdLib.Anon_TOPLEFT = js.native
  var VerticalAnchors: reactDashMdLib.Anon_TOP = js.native
  def caseInsensitiveFilter(data: DataType, filterText: java.lang.String): js.Array[java.lang.String] = js.native
  def caseInsensitiveFilter(data: DataType, filterText: java.lang.String, dataLabel: java.lang.String): js.Array[java.lang.String] = js.native
  def caseInsensitiveFilter(data: DataType, filterText: scala.Double): js.Array[java.lang.String] = js.native
  def caseInsensitiveFilter(data: DataType, filterText: scala.Double, dataLabel: java.lang.String): js.Array[java.lang.String] = js.native
  def findIgnoreCase(data: DataType, filterText: java.lang.String): java.lang.String = js.native
  def findIgnoreCase(data: DataType, filterText: java.lang.String, dataLabel: java.lang.String): java.lang.String = js.native
  def fuzzyFilter(data: DataType, filterText: java.lang.String): js.Array[java.lang.String] = js.native
  def fuzzyFilter(data: DataType, filterText: java.lang.String, dataLabel: java.lang.String): js.Array[java.lang.String] = js.native
  def fuzzyFilter(data: DataType, filterText: scala.Double): js.Array[java.lang.String] = js.native
  def fuzzyFilter(data: DataType, filterText: scala.Double, dataLabel: java.lang.String): js.Array[java.lang.String] = js.native
}

