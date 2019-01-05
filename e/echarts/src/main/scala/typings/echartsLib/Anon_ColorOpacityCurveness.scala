package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorOpacityCurveness extends js.Object {
  /**
    * The color of the edge in sankey graphs.
    *
    *
    * @default
    * "'#314656"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.emphasis.lineStyle.color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The curveness of the edge in sankey graph.
    *
    *
    * @default
    * 0.5
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.emphasis.lineStyle.curveness
    */
  var curveness: js.UndefOr[scala.Double] = js.undefined
  /**
    * The opacity of the edge in sankey graph.
    *
    *
    * @default
    * 0.2
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.emphasis.lineStyle.opacity
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.sankey.links.emphasis.lineStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.emphasis.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.emphasis.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.emphasis.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.emphasis.lineStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
}

