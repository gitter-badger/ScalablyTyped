package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.IconSetCondition")
@js.native
class IconSetCondition protected () extends js.Object {
  val Application: Application = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  val Creator: XlCreator = js.native
  var `Excel.IconSetCondition_typekey`: IconSetCondition = js.native
  var Formula: java.lang.String = js.native
  @JSName("IconCriteria")
  val IconCriteria_Original: IconCriteria = js.native
  @JSName("IconSet")
  var IconSet_Original: IconSets = js.native
  val PTCondition: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var PercentileValues: scala.Boolean = js.native
  var Priority: scala.Double = js.native
  var ReverseOrder: scala.Boolean = js.native
  var ScopeType: XlPivotConditionScope = js.native
  var ShowIconOnly: scala.Boolean = js.native
  val StopIfTrue: scala.Boolean = js.native
  val Type: scala.Double = js.native
  def AppliesTo(Address: java.lang.String): Range = js.native
  def AppliesTo(RowIndex: scala.Double): Range = js.native
  def AppliesTo(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Delete(): scala.Unit = js.native
  def IconCriteria(Index: scala.Double): IconCriterion = js.native
  def IconSet(Index: scala.Double): IconSet = js.native
  def ModifyAppliesToRange(Range: Range): scala.Unit = js.native
  def SetFirstPriority(): scala.Unit = js.native
  def SetLastPriority(): scala.Unit = js.native
}

