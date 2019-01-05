package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- rechartsLib.rechartsMod.CategoricalChartWrapper because var conflicts: onClick, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseUp. Inlined syncId, compact, width, height, data, layout, stackOffset, throttleDelay, margin, barCategoryGap, barGap, barSize, maxBarSize, style, className, children, reverseStackOrder */ trait PieChartProps extends EventAttributes {
  var barCategoryGap: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var barGap: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var barSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | js.Array[reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var cx: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var cy: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var innerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var layout: js.UndefOr[rechartsLib.rechartsLibStrings.centric] = js.undefined
  var margin: js.UndefOr[stdLib.Partial[Margin]] = js.undefined
  var maxBarSize: js.UndefOr[scala.Double] = js.undefined
  var outerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var reverseStackOrder: js.UndefOr[scala.Boolean] = js.undefined
  var stackOffset: js.UndefOr[StackOffsetType] = js.undefined
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var syncId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var throttleDelay: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

