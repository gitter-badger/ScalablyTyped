package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "CanvasChart")
@js.native
class CanvasChart protected () extends AbstractChart {
  def this(selector: java.lang.String) = this()
  def this(selector: stdLib.Element) = this()
  def this(selector: java.lang.String, options: ChartOptions) = this()
  def this(selector: stdLib.Element, options: ChartOptions) = this()
  def clear(): this.type = js.native
  def getContext2d(): d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D with stdLib.CanvasRenderingContext2D = js.native
}

@JSImport("d3kit", "CanvasChart")
@js.native
object CanvasChart extends js.Object {
  def getDefaultOptions(): d3kitLib.d3kitMod.ChartOptions = js.native
}

