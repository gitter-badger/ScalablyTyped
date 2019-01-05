package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ShowPeriod extends js.Object {
  /**
    * The color of special effect symbol, which defaults to be
    * same with
    * [lineStyle.color](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.lineStyle.color)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.effect.color
    */
  var color: js.UndefOr[java.lang.String] = js.native
  /**
    * If symbol movement of special effect has a constant speed,
    * which unit is pixel per second.
    * [period](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.effect.period)
    * will be ignored if `constantSpeed` is larger than 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.effect.constantSpeed
    */
  var constantSpeed: js.UndefOr[scala.Double] = js.native
  /**
    * Effect animation delay.
    * Can be number or callback function.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.effect.delay
    */
  var delay: js.UndefOr[js.Function | scala.Double] = js.native
  /**
    * Whether to loop the special effect animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.effect.loop
    */
  var loop: js.UndefOr[scala.Boolean] = js.native
  /**
    * The duration of special effect, which unit is second.
    *
    *
    * @default
    * 4
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.effect.period
    */
  var period: js.UndefOr[scala.Double] = js.native
  /**
    * Whether to show special effect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.effect.show
    */
  var show: js.UndefOr[scala.Boolean] = js.native
  /**
    * The symbol of special effect.
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.lines.effect)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.lines.effect)
    *
    * The above example uses a custom path of plane shape.
    *
    * **Tip:** Ahe angle of symbol changes as the tangent of track
    * changes.
    * If you use a custom path, you should make sure that the path
    * shape are upward oriented.
    * It would ensure that the symbol will always move toward the
    * right moving direction when the symbol moves along the track.
    *
    *
    * @default
    * "circle"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.effect.symbol
    */
  var symbol: js.UndefOr[java.lang.String] = js.native
  /**
    * The symbol size of special effect, which could be set as
    * single number such as `10`.
    * What's more, arrays could be used to decribe the width and
    * height respectively.
    * For instance, `[20, 10]` indicates `20` for width and `10`
    * for height.
    *
    *
    * @default
    * 3
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.effect.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | scala.Double] = js.native
  /**
    * The length of trail of special effect.
    * The values from 0 to 1 could be set.
    * Trail would be longer as the the value becomes larger.
    *
    *
    * @default
    * 0.2
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.effect.trailLength
    */
  var trailLength: js.UndefOr[scala.Double] = js.native
}

