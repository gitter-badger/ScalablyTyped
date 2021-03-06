package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartUnderlineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartUnderlineStyle")
@js.native
object ChartUnderlineStyle extends js.Object {
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.ChartUnderlineStyle
  
  @js.native
  sealed trait single
    extends officeDashJsLib.ExcelNs.ChartUnderlineStyle
  
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Single" */ val single: single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartUnderlineStyle with java.lang.String] = js.native
}

