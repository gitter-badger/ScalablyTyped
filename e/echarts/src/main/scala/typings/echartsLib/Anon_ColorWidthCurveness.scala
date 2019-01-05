package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ColorWidthCurveness extends js.Object {
  /**
    * The color of the tree edge.
    *
    *
    * @default
    * ""#ccc""
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.lineStyle.color
    */
  var color: js.UndefOr[java.lang.String] = js.native
  /**
    * The curvature of the tree edge.
    *
    *
    * @default
    * 0.5
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.lineStyle.curveness
    */
  var curveness: js.UndefOr[scala.Double] = js.native
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tree.lineStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.native
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.lineStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.native
  /**
    * The width of the tree edge.
    *
    *
    * @default
    * 1.5
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.lineStyle.width
    */
  var width: js.UndefOr[scala.Double] = js.native
}

