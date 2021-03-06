package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingContextConfig extends js.Object {
  /**
    * 表示是否抗锯齿
    */
  var antialias: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 抗锯齿样本数。最小值为 2，最大不超过系统限制数量，仅 iOS 支持
    */
  var antialiasSamples: js.UndefOr[scala.Double] = js.undefined
  /**
    * 表示是否绘图完成后是否保留绘图缓冲区
    */
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
}

