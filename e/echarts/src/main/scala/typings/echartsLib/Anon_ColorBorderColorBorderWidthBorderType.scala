package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ColorBorderColorBorderWidthBorderType extends js.Object {
  /**
    * border color, whose format is similar to that of `color`.
    *
    *
    * @default
    * "#000"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Border type, which can be `'solid'`, `'dashed'`, or `'dotted'`.
    * `'solid'` by default.
    *
    *
    * @default
    * "solid"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.itemStyle.borderType
    */
  var borderType: js.UndefOr[java.lang.String] = js.native
  /**
    * border width. No border when it is set to be 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[scala.Double] = js.native
  /**
    * color. Color is taken from
    * [option.color Palette](https://ecomfe.github.io/echarts-doc/public/en/option.html#color)
    * by default.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for example
    * `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tree.data.itemStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.itemStyle.color
    */
  var color: js.UndefOr[java.lang.String] = js.native
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not
    * be drawn when set to 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.itemStyle.opacity
    */
  var opacity: js.UndefOr[scala.Double] = js.native
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tree.data.itemStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.native
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.native
}

