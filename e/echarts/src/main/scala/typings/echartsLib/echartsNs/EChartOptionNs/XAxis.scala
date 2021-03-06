package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The x axis in cartesian(rectangular) coordinate.
  * Usually a single grid component can place at most 2 x axis,
  * one on the bottom and another on the top.
  * offset can be used to avoid overlap when you need to put more
  * than two x axis.
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis
  */
trait XAxis
  extends echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxis {
  /**
    * The first x axis in grid defaults to be on the bottom of the grid,
    * and the second x axis is on the other side against the first x axis.
    *
    * @default ''
    */
  var position: js.UndefOr[echartsLib.echartsLibStrings.top | echartsLib.echartsLibStrings.bottom] = js.undefined
  /**
    * Options:
    * + 'value' - Numerical axis, suitable for continuous data.
    * + 'category' Category axis, suitable for discrete category data.
    *   Data should only be set via data for this type.
    * + 'time' Time axis, suitable for continuous time series data.
    *   As compared to value axis, it has a better formatting for time
    *   and a different tick calculation method.
    *   For example, it decides to use month, week, day or hour for tick
    *   based on the range of span.
    * + 'log' Log axis, suitable for log data.
    *
    * @default 'value'
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis.type
    */
  var `type`: js.UndefOr[echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Type] = js.undefined
}

