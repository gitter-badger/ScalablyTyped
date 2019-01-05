package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XY extends js.Object {
  /**
    * 视频是否自动播放，默认false
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 视频是否显示控件，默认true
    */
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 默认值150
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频的初始播放位置，单位为 s 秒，默认值0
    */
  var initialTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频是否为直播，默认值0
    */
  var live: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频是否是否循环播放，默认值false
    */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 视频是否禁音播放，默认值false
    */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 视频的缩放模式
    * fill - 填充，视频拉伸填满整个容器，不保证保持原有长宽比例
    * contain - 包含，保持原有长宽比例。保证视频尺寸一定可以在容器里面放得下。因此，可能会有部分空白
    * cover - 覆盖，保持原有长宽比例。保证视频尺寸一定大于容器尺寸，宽度和高度至少有一个和容器一致。因此，视频有部分会看不见
    */
  var objectFit: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.contain | wegameDashApiLib.wegameDashApiLibStrings.cover | wegameDashApiLib.wegameDashApiLibStrings.fill
  ] = js.undefined
  /**
    * 视频的播放速率，有效值有 0.5、0.8、1.0、1.25、1.5默认值1.0
    */
  var playbackRate: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频的封面
    */
  var poster: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 视频的资源地址
    */
  var src: java.lang.String
  /**
    * 视频的宽度，默认值300
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频的左上角横坐标
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频的左上角纵坐标
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

