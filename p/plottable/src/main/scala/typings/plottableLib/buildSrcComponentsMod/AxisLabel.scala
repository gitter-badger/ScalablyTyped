package typings
package plottableLib.buildSrcComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components", "AxisLabel")
@js.native
/**
  * @constructor
  * @param {string} [text]
  * @param {number} [angle] One of -90/0/90. 0 is horizontal.
  */
class AxisLabel ()
  extends plottableLib.buildSrcComponentsLabelMod.AxisLabel {
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, angle: scala.Double) = this()
}

@JSImport("plottable/build/src/components", "AxisLabel")
@js.native
object AxisLabel extends js.Object {
  var AXIS_LABEL_CLASS: java.lang.String = js.native
}

