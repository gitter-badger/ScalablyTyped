package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.CalendarView")
@js.native
class CalendarView protected () extends js.Object {
  val Application: Application = js.native
  val AutoFormatRules: AutoFormatRules = js.native
  var BoldDatesWithItems: scala.Boolean = js.native
  var BoldSubjects: scala.Boolean = js.native
  var CalendarViewMode: OlCalendarViewMode = js.native
  val Class: OlObjectClass = js.native
  val DayWeekFont: ViewFont = js.native
  val DayWeekTimeFont: ViewFont = js.native
  var DayWeekTimeScale: OlDayWeekTimeScale = js.native
  var DaysInMultiDayMode: scala.Double = js.native
  val DisplayedDates: js.Any = js.native
  var EndField: java.lang.String = js.native
  var Filter: java.lang.String = js.native
  var Language: java.lang.String = js.native
  var LockUserChanges: scala.Boolean = js.native
  val MonthFont: ViewFont = js.native
  var MonthShowEndTime: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  var `Outlook.CalendarView_typekey`: CalendarView = js.native
  val Parent: js.Any = js.native
  val SaveOption: OlViewSaveOption = js.native
  val SelectedEndTime: activexDashInteropLib.VarDate with stdLib.VarDate = js.native
  val SelectedStartTime: activexDashInteropLib.VarDate with stdLib.VarDate = js.native
  val Session: NameSpace = js.native
  val Standard: scala.Boolean = js.native
  var StartField: java.lang.String = js.native
  val ViewType: OlViewType = js.native
  var XML: java.lang.String = js.native
  def Apply(): scala.Unit = js.native
  def Copy(Name: java.lang.String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): scala.Unit = js.native
  def GoToDate(Date: activexDashInteropLib.VarDate with stdLib.VarDate): scala.Unit = js.native
  def Reset(): scala.Unit = js.native
  def Save(): scala.Unit = js.native
}

