package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSummaryMode extends js.Object

@JSGlobal("Word.WdSummaryMode")
@js.native
object WdSummaryMode extends js.Object {
  @js.native
  sealed trait wdSummaryModeCreateNew
    extends activexDashWordLib.WordNs.WdSummaryMode
  
  @js.native
  sealed trait wdSummaryModeHideAllButSummary
    extends activexDashWordLib.WordNs.WdSummaryMode
  
  @js.native
  sealed trait wdSummaryModeHighlight
    extends activexDashWordLib.WordNs.WdSummaryMode
  
  @js.native
  sealed trait wdSummaryModeInsert
    extends activexDashWordLib.WordNs.WdSummaryMode
  
  /* 3 */ val wdSummaryModeCreateNew: wdSummaryModeCreateNew with scala.Double = js.native
  /* 1 */ val wdSummaryModeHideAllButSummary: wdSummaryModeHideAllButSummary with scala.Double = js.native
  /* 0 */ val wdSummaryModeHighlight: wdSummaryModeHighlight with scala.Double = js.native
  /* 2 */ val wdSummaryModeInsert: wdSummaryModeInsert with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSummaryMode with scala.Double] = js.native
}

