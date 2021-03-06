package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui/utils/colorManipulator", JSImport.Namespace)
@js.native
object utilsColorManipulatorMod extends js.Object {
  def convertColorToString(color: js.Any): java.lang.String = js.native
  def convertHexToRGB(color: java.lang.String): java.lang.String = js.native
  def darken(color: java.lang.String, coefficient: scala.Double): java.lang.String = js.native
  def decomposeColor(color: java.lang.String): materialDashUiLib.underscoreUnderscoreMaterialUINs.UtilsNs.ColorManipulatorNs.MuiColorObject = js.native
  def emphasize(color: java.lang.String): java.lang.String = js.native
  def emphasize(color: java.lang.String, coefficient: scala.Double): java.lang.String = js.native
  def fade(color: java.lang.String, value: scala.Double): java.lang.String = js.native
  def getContrastRatio(foreground: java.lang.String, background: java.lang.String): scala.Double = js.native
  def getLuminance(color: java.lang.String): scala.Double = js.native
  def lighten(color: java.lang.String, coefficient: scala.Double): java.lang.String = js.native
}

