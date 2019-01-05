package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShowPositionDistanceRotateOffset extends js.Object {
  /**
    * Horizontal alignment of text, automatic by default.
    *
    * Options are:
    *
    * + `'left'`
    * + `'center'`
    * + `'right'`
    *
    * If `align` is not set in `rich`, `align` in parent
    * level will be used. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markArea.data.1.label)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.align
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Background color of the text fregment.
    *
    * Can be color string, like `'#123234'`, `'red'`,
    * `rgba(0,23,11,0.3)'`.
    *
    * Or image can be used, for example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markArea.data.1.label)
    *
    * `width` or `height` can be specified when using
    * background image, or auto adapted by default.
    *
    * If set as `'auto'`, the color will assigned as
    * visual color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.backgroundColor
    */
  var backgroundColor: js.UndefOr[js.Object | java.lang.String] = js.undefined
  /**
    * Border color of the text fregment.
    *
    * If set as `'auto'`, the color will assigned as
    * visual color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.borderColor
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Border radius of the text fregment.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.borderRadius
    */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * Border width of the text fregment.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.borderWidth
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * text color.
    *
    * If set as `'auto'`, the color will assigned as
    * visual color, such as series color.
    *
    *
    * @default
    * ""#fff""
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Distance to the host graphic element.
    * Works when position is string value (like `'top'`、`'insideRight'`).
    *
    * See:
    * [label position](https://ecomfe.github.io/echarts-examples/public/editor.html?c=doc-example/label-position)
    * .
    *
    *
    * @default
    * 5
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.distance
    */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.emphasis
    */
  var emphasis: js.UndefOr[Anon_ShowPositionDistanceRotate] = js.undefined
  /**
    * font family
    *
    * Can also be 'serif' , 'monospace', ...
    *
    *
    * @default
    * "sans-serif"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.fontFamily
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * font size
    *
    *
    * @default
    * 12
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.fontSize
    */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.fontStyle
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.fontWeight
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Height of the text block.
    * It is the width of the text by default.
    * You may want to use it in some cases like using
    * background image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    * Notice, `width` and `height` only work when `rich`
    * specified.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.height
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Line height of the text fregment.
    *
    * If `lineHeight` is not set in `rich`, `lineHeight`
    * in parent level will be used. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markArea.data.1.label)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.lineHeight
    */
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to move text slightly.
    * For example: `[30, 40]` means move `30` horizontally
    * and move `40` vertically.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.offset
    */
  var offset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Padding of the text fregment, for example:
    *
    * + `padding: [3, 4, 5, 6]`: represents padding
    * of `[top, right, bottom, left]`.
    * + `padding: 4`: represents `padding: [4, 4, 4,
    * 4]`.
    * + `padding: [3, 4]`: represents `padding: [3,
    * 4, 3, 4]`.
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.padding
    */
  var padding: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
  /**
    * Label position.
    *
    * **Followings are the options:**
    *
    * + \[x, y\]
    *
    * Use relative percentage, or absolute pixel values
    * to represent position of label relative to top-left
    * corner of bounding box. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markArea.data.1.label)
    *
    * + 'top'
    *
    * + 'left'
    * + 'right'
    * + 'bottom'
    * + 'inside'
    * + 'insideLeft'
    * + 'insideRight'
    * + 'insideTop'
    * + 'insideBottom'
    * + 'insideTopLeft'
    * + 'insideBottomLeft'
    * + 'insideTopRight'
    * + 'insideBottomRight'
    *
    * See:
    * [label position](https://ecomfe.github.io/echarts-examples/public/view.html?c=doc-example/label-position)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.position
    */
  var position: js.UndefOr[js.Array[_] | java.lang.String] = js.undefined
  /**
    * "Rich text styles" can be defined in this `rich`
    * property. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markArea.data.1.label)
    *
    * For more details, see
    * [Rich Text](https://ecomfe.github.io/echarts-doc/public/en/option.htmltutorial.html#Rich%20Text)
    * please.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.rich
    */
  var rich: /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.rich.%3Cuser%20defined%20style%20name%3E
    */
  js.UndefOr[
    /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.rich.%3Cuser%20defined%20style%20name%3E
    */
  org.scalablytyped.runtime.StringDictionary[Anon_ColorFontStyle]
  ] = js.undefined
  /**
    * Rotate label, from -90 degree to 90, positive
    * value represents rotate anti-clockwise.
    *
    * See:
    * [label rotation](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-label-rotation)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.rotate
    */
  var rotate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Show blur of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow color of the text block.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Shadow X offset of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow Y offset of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to show label.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.show
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Storke color of the text.
    *
    * If set as `'auto'`, the color will assigned as
    * visual color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.textBorderColor
    */
  var textBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Storke line width of the text.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.textBorderWidth
    */
  var textBorderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow blue of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.textShadowBlur
    */
  var textShadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow color of the text itself.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.textShadowColor
    */
  var textShadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Shadow X offset of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.textShadowOffsetX
    */
  var textShadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow Y offset of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.textShadowOffsetY
    */
  var textShadowOffsetY: js.UndefOr[scala.Double] = js.undefined
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markArea.data.1.label)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.verticalAlign
    */
  var verticalAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width of the text block.
    * It is the width of the text by default.
    * In most cases, there is no need to specify it.
    * You may want to use it in some cases like make
    * simple table or using background image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    * `width` can also be percent string, like `'100%'`,
    * which represents the percent of `contentWidth`
    * (that is, the width without `padding`) of its
    * container box.
    * It is based on `contentWidth` because that each
    * text fregment is layout based on the `content
    * box`, where it makes no sense that calculating
    * width based on `outerWith` in prectice.
    *
    * Notice, `width` and `height` only work when `rich`
    * specified.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.label.width
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

