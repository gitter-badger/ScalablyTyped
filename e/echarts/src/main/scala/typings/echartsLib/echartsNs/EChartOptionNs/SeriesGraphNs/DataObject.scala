package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * Index of category which the data item belongs to.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.category
    */
  var category: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_ItemStyleLabelAnonColorBorderColorAnonShowPositionDistanceRotate] = js.undefined
  /**
    * If node are fixed when doing force directed layout.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.fixed
    */
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The style of this node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_ColorBorderColorBorderWidthBorderType] = js.undefined
  /**
    * The label style of this node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.label
    */
  var label: js.UndefOr[echartsLib.Anon_ShowPositionDistanceRotateOffsetColorFontStyle] = js.undefined
  /**
    * Name of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Symbol of node of this category.
    *
    * Icon types provided by ECharts includes `'circle'`, `'rect'`,
    * `'roundRect'`, `'triangle'`, `'diamond'`, `'pin'`, `'arrow'`,
    * `'none'`
    *
    * It can be set to an image with `'image://url'` , in which
    * URL is the link to an image, or `dataURI` of an image.
    *
    * An image URL example:
    *
    * ```
    * 'image://http://xxx.xxx.xxx/a/b.png'
    *
    * ```
    *
    * A `dataURI` example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.graph.data)
    *
    * Icons can be set to arbitrary vector path via `'path://'`
    * in ECharts.
    * As compared with raster image, vector paths prevent from
    * jagging and blurring when scaled, and have a better control
    * over changing colors.
    * Size of vectoer icon will be adapted automatically.
    * Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe Illustrator.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.graph.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.symbol
    */
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Offset of node of this category symbol relative to original
    * position.
    * By default, symbol will be put in the center position of
    * data.
    * But if symbol is from user-defined vector path or image,
    * you may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset to
    * default position.
    * It can be in absolute pixel value, or in relative percentage
    * value.
    *
    * For example, `[0, '50%']` means to move upside side position
    * of symbol height.
    * It can be used to make the arrow in the bottom to be at data
    * position when symbol is pin.
    *
    *
    * @default
    * [0, 0]
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Rotate degree of node of this category symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use
    * tangent angle.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.symbolRotate
    */
  var symbolRotate: js.UndefOr[scala.Double] = js.undefined
  /**
    * node of this category symbol size.
    * It can be set to single numbers like `10`, or use an array
    * to represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and height
    * is`10`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_Position] = js.undefined
  /**
    * Value of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.value
    */
  var value: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
  /**
    * `x` value of node position.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.x
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * `y` value of node position.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.y
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

