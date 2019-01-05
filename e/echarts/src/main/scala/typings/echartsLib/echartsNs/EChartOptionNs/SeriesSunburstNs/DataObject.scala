package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesSunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * Children nodes, which is recursively defined.
    * In the same format to
    * [series-sunburst.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.children
    */
  var children: js.UndefOr[js.Array[DataObject]] = js.undefined
  /**
    * Item style when mouse is hovering unrelated items. See
    * [highlightPolicy](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.downplay
    */
  var downplay: js.UndefOr[echartsLib.Anon_LabelItemStyleAnonRotateAlign] = js.undefined
  /**
    * Item style when mouse is hovering. See
    * [highlightPolicy](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_LabelItemStyleAnonRotateAlign] = js.undefined
  /**
    * Item style when mouse is hovering related items. See
    * [highlightPolicy](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.highlight
    */
  var highlight: js.UndefOr[echartsLib.Anon_LabelItemStyleAnonRotateAlign] = js.undefined
  /**
    * Style of Sunburst sectors.
    *
    * Style can be set in
    * [series.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.itemStyle)
    * for sectors of this series, or
    * [series.levels.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.levels.itemStyle)
    * for the whole level, or
    * [series.data.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.itemStyle)
    * for single sector. If
    * [series.data.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.itemStyle)
    * is defined, it will cover the setting of
    * [series.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.itemStyle)
    * and
    * [series.levels.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.levels.itemStyle)
    * .
    *
    * **Priority:
    * [series.data.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.itemStyle)
    * >
    * [series.levels.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.levels.itemStyle)
    * >
    * [series.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.itemStyle)
    * .**
    *
    * In ECharts, _emphasis_ is for styles when mouse hovers.
    * For Sunburst charts, there are two extra states: _highlight_
    * for highlighting items that relates to the emphasized one,
    * and _downplay_ for others when emphasizing an item. See
    * [highlightPolicy](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_ColorBorderColorBorderWidthBorderType] = js.undefined
  /**
    * `label` sets the text style for every sectors.
    *
    * **Priority:
    * [series.data.label](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label)
    * >
    * [series.levels.label](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.levels.label)
    * >
    * [series.label](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.label)
    * .**
    *
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter,
    * `label`is taken to be at the same level with `itemStyle`,
    * and has `emphasis` as `itemStyle` does.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label
    */
  var label: js.UndefOr[echartsLib.Anon_Rotate] = js.undefined
  /**
    * Link address that redirects to when this sector is clicked.
    * Only useful when
    * [series-sunburst.nodeClick](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.nodeClick)
    * is set to be `'link'`.
    *
    * See
    * [series-sunburst.data.target](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.target)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.link
    */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name displayed in each sector.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Like `target` attribute of HTML `<a>`, which can either be
    * `'blank'` or `'self'`. See
    * [series-sunburst.data.link](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.link)
    * .
    *
    *
    * @default
    * "blank"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.target
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Value for each item.
    * If contains children, value can be left unset, and sum of
    * children values will be used in this case.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.value
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

