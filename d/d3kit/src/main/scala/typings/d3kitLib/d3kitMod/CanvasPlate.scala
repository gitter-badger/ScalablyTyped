package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "CanvasPlate")
@js.native
class CanvasPlate () extends AbstractPlate {
  def this(options: ChartOptions) = this()
  def clear(): this.type = js.native
  def getContext2d(): d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D with stdLib.CanvasRenderingContext2D = js.native
}

@JSImport("d3kit", "CanvasPlate")
@js.native
object CanvasPlate extends js.Object {
  def getDefaultOptions(): d3kitLib.d3kitMod.ChartOptions = js.native
  def getDefaultOptions(options: d3kitLib.d3kitMod.ChartOptions): d3kitLib.d3kitMod.ChartOptions = js.native
}

