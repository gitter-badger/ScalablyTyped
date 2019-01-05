package typings
package fullcalendarLib.daygrideventrendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DayGridEventRenderer", "Default")
@js.native
class Default protected ()
  extends fullcalendarLib.eventrendererMod.default {
  def this(dayGrid: js.Any, fillRenderer: js.Any) = this()
  var dayGrid: js.Any = js.native
  var rowStructs: js.Any = js.native
  def buildSegLevels(segs: js.Any): js.Array[_] = js.native
  def groupSegRows(segs: js.Any): js.Array[_] = js.native
  def renderSegRow(row: js.Any, rowSegs: js.Any): fullcalendarLib.Anon_Row = js.native
  def renderSegRows(segs: js.Any): js.Array[_] = js.native
  def unrenderFgSegs(): scala.Unit = js.native
}

@JSImport("fullcalendar/DayGridEventRenderer", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(dayGrid: js.Any, fillRenderer: js.Any) = this()
}

