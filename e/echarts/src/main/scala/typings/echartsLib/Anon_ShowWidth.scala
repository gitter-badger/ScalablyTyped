package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ShowWidth extends js.Object {
  /**
    * Background color of the text fregment.
    *
    * Can be color string, like `'#123234'`, `'red'`, `rgba(0,23,11,0.3)'`.
    *
    * Or image can be used, for example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.gauge.detail)
    *
    * `width` or `height` can be specified when using background
    * image, or auto adapted by default.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.backgroundColor
    */
  var backgroundColor: js.UndefOr[js.Object | java.lang.String] = js.native
  /**
    * Border color of the text fregment.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.borderColor
    */
  var borderColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Border radius of the text fregment.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.borderRadius
    */
  var borderRadius: js.UndefOr[scala.Double] = js.native
  /**
    * Border width of the text fregment.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.borderWidth
    */
  var borderWidth: js.UndefOr[scala.Double] = js.native
  /**
    * text color.
    *
    *
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.color
    */
  var color: js.UndefOr[java.lang.String] = js.native
  /**
    * font family
    *
    * Can also be 'serif' , 'monospace', ...
    *
    *
    * @default
    * "sans-serif"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.fontFamily
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.native
  /**
    * font size
    *
    *
    * @default
    * 15
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.fontSize
    */
  var fontSize: js.UndefOr[scala.Double] = js.native
  /**
    * font style
    *
    * Options are:
    *
    * + `'normal'`
    * + `'italic'`
    * + `'oblique'`
    *
    *
    * @default
    * "normal"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.fontStyle
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.native
  /**
    * font thick weight
    *
    * Options are:
    *
    * + `'normal'`
    * + `'bold'`
    * + `'bolder'`
    * + `'lighter'`
    * + 100 | 200 | 300 | 400...
    *
    *
    * @default
    * "normal"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.fontWeight
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.native
  /**
    * Height of the text block.
    * It is the width of the text by default.
    * You may want to use it in some cases like using background
    * image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width and height
    * of the content, without `padding`.
    *
    * Notice, `width` and `height` only work when `rich` specified.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.height
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.native
  /**
    * Line height of the text fregment.
    *
    * If `lineHeight` is not set in `rich`, `lineHeight` in parent
    * level will be used. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.gauge.detail)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.lineHeight
    */
  var lineHeight: js.UndefOr[scala.Double] = js.native
  /**
    * The offset position relative to the center of gauge chart.
    * The first item of array is the horizontal offset; the second
    * item of array is the vertical offset.
    * It could be absolute value and also the percentage relative
    * to the radius of gauge chart.
    *
    *
    * @default
    * [0, '40%']
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.offsetCenter
    */
  var offsetCenter: js.UndefOr[js.Array[_]] = js.native
  /**
    * Padding of the text fregment, for example:
    *
    * + `padding: [3, 4, 5, 6]`: represents padding of `[top, right,
    * bottom, left]`.
    * + `padding: 4`: represents `padding: [4, 4, 4, 4]`.
    * + `padding: [3, 4]`: represents `padding: [3, 4, 3, 4]`.
    *
    * Notice, `width` and `height` specifies the width and height
    * of the content, without `padding`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.padding
    */
  var padding: js.UndefOr[js.Array[_] | scala.Double] = js.native
  /**
    * "Rich text styles" can be defined in this `rich` property.
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.gauge.detail)
    *
    * For more details, see
    * [Rich Text](https://ecomfe.github.io/echarts-doc/public/en/option.htmltutorial.html#Rich%20Text)
    * please.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.rich
    */
  var rich: /**
    * The text color. Defaults to use
    * [the color of section](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLine.lineStyle.color)
    * where the numerical value belongs to.
    *
    *
    * @todo check that the option is valid and should be here
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.rich.color
    */
  // color?: string;
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.rich.%3Cuser%20defined%20style%20name%3E
    */
  js.UndefOr[
    /**
    * The text color. Defaults to use
    * [the color of section](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLine.lineStyle.color)
    * where the numerical value belongs to.
    *
    *
    * @todo check that the option is valid and should be here
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.rich.color
    */
  // color?: string;
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.rich.%3Cuser%20defined%20style%20name%3E
    */
  org.scalablytyped.runtime.StringDictionary[Anon_ColorFontStyle]
  ] = js.native
  /**
    * Show blur of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow color of the text block.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Shadow X offset of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow Y offset of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.native
  /**
    * Whether to show the details.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.show
    */
  var show: js.UndefOr[scala.Boolean] = js.native
  /**
    * Storke color of the text.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.textBorderColor
    */
  var textBorderColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Storke line width of the text.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.textBorderWidth
    */
  var textBorderWidth: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow blue of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.textShadowBlur
    */
  var textShadowBlur: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow color of the text itself.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.textShadowColor
    */
  var textShadowColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Shadow X offset of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.textShadowOffsetX
    */
  var textShadowOffsetX: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow Y offset of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.textShadowOffsetY
    */
  var textShadowOffsetY: js.UndefOr[scala.Double] = js.native
  /**
    * Width of the text block.
    * It is the width of the text by default.
    * In most cases, there is no need to specify it.
    * You may want to use it in some cases like make simple table
    * or using background image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width and height
    * of the content, without `padding`.
    *
    * `width` can also be percent string, like `'100%'`, which
    * represents the percent of `contentWidth` (that is, the width
    * without `padding`) of its container box.
    * It is based on `contentWidth` because that each text fregment
    * is layout based on the `content box`, where it makes no sense
    * that calculating width based on `outerWith` in prectice.
    *
    * Notice, `width` and `height` only work when `rich` specified.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail.width
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.native
}

