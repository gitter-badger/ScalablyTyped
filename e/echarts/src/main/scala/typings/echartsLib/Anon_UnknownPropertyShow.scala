package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_UnknownPropertyShow
  extends /**
  * Some properties like "normal" or "emphasis" are not documented.
  * Please, write description for them
  */
/* unknownProperty */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Horizontal alignment of text, automatic by default.
    *
    * Options are:
    *
    * + `'left'`
    * + `'center'`
    * + `'right'`
    *
    * If `align` is not set in `rich`, `align` in parent level
    * will be used. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie.label)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.align
    */
  var align: js.UndefOr[java.lang.String] = js.native
  /**
    * Background color of the text fregment.
    *
    * Can be color string, like `'#123234'`, `'red'`, `rgba(0,23,11,0.3)'`.
    *
    * Or image can be used, for example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie.label)
    *
    * `width` or `height` can be specified when using background
    * image, or auto adapted by default.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.backgroundColor
    */
  var backgroundColor: js.UndefOr[js.Object | java.lang.String] = js.native
  /**
    * Border color of the text fregment.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.borderColor
    */
  var borderColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Border radius of the text fregment.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.borderRadius
    */
  var borderRadius: js.UndefOr[scala.Double] = js.native
  /**
    * Border width of the text fregment.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.borderWidth
    */
  var borderWidth: js.UndefOr[scala.Double] = js.native
  /**
    * text color.
    *
    *
    * @default
    * ""#fff""
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.color
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.fontFamily
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.native
  /**
    * font size
    *
    *
    * @default
    * 12
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.fontSize
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.fontStyle
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.fontWeight
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.native
  /**
    * Data label formatter, which supports string template and
    * callback function.
    * In either form, `\n` is supported to represent a new line.
    *
    * **String template**
    *
    * Model variation includes:
    *
    * + `{a}`: series name.
    * + `{b}`: the name of a data item.
    * + `{c}`: the value of a data item.
    * + `{d}`: the percent.
    * + `{@xxx}: the value of a dimension named`'xxx'`, for example,`{@product}`refers
    * the value of`'product'\` dimension。
    * + `{@[n]}: the value of a dimension at the index of`n`, for
    * example,`{@\[3\]}\` refers the value at dimensions\[3\].
    *
    * **example:**
    *
    * ```
    * formatter: '{b}: {d}'
    *
    * ```
    *
    * **Callback function**
    *
    * Callback function is in form of:
    *
    * ```
    * (params: Object|Array) => string
    *
    * ```
    *
    * where `params` is the single dataset needed by formatter,
    * which is formed as:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie.label)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.formatter
    */
  var formatter: js.UndefOr[js.Function | java.lang.String] = js.native
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.height
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.native
  /**
    * Line height of the text fregment.
    *
    * If `lineHeight` is not set in `rich`, `lineHeight` in parent
    * level will be used. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie.label)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.lineHeight
    */
  var lineHeight: js.UndefOr[scala.Double] = js.native
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.padding
    */
  var padding: js.UndefOr[js.Array[_] | scala.Double] = js.native
  /**
    * The position of label.
    *
    * **Options:**
    *
    * + `'outside'`
    *
    * Outside of sectors of pie chart, which relates to corresponding
    * sector through
    * [visual guide line](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.labelLine)
    * .
    *
    * + `'inside'`
    *
    * Inside the sectors of pie chart.
    *
    * + `'inner'` is the same with `'inside'`.
    *
    * + `'center'`
    *
    * In the center of pie chart. See
    * [pie-doughnut example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=pie-doughnut)
    *
    *
    * @default
    * "outside"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.position
    */
  var position: js.UndefOr[java.lang.String] = js.native
  /**
    * "Rich text styles" can be defined in this `rich` property.
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie.label)
    *
    * For more details, see
    * [Rich Text](https://ecomfe.github.io/echarts-doc/public/en/option.htmltutorial.html#Rich%20Text)
    * please.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.rich
    */
  var rich: /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.rich.%3Cuser%20defined%20style%20name%3E
    */
  js.UndefOr[
    /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.rich.%3Cuser%20defined%20style%20name%3E
    */
  org.scalablytyped.runtime.StringDictionary[Anon_ColorFontStyle]
  ] = js.native
  /**
    * Show blur of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow color of the text block.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Shadow X offset of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow Y offset of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.native
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.show
    */
  var show: js.UndefOr[scala.Boolean] = js.native
  /**
    * Storke color of the text.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.textBorderColor
    */
  var textBorderColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Storke line width of the text.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.textBorderWidth
    */
  var textBorderWidth: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow blue of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.textShadowBlur
    */
  var textShadowBlur: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow color of the text itself.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.textShadowColor
    */
  var textShadowColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Shadow X offset of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.textShadowOffsetX
    */
  var textShadowOffsetX: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow Y offset of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.textShadowOffsetY
    */
  var textShadowOffsetY: js.UndefOr[scala.Double] = js.native
  /**
    * Vertical alignment of text, automatic by default.
    *
    * Options are:
    *
    * + `'top'`
    * + `'middle'`
    * + `'bottom'`
    *
    * If `verticalAlign` is not set in `rich`, `verticalAlign`
    * in parent level will be used. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie.label)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.verticalAlign
    */
  var verticalAlign: js.UndefOr[java.lang.String] = js.native
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.width
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.native
}

