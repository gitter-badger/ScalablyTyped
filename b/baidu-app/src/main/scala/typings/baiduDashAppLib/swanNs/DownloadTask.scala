package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadTask extends js.Object {
  /**
  		 * 中断下载任务
  		 * @version 1.4.0
  		 */
  def abort(): scala.Unit = js.native
  /**
  		 * 监听下载进度变化
  		 * @version 1.4.0
  		 */
  def onProgressUpdate(): scala.Unit = js.native
  /**
  		 * 监听下载进度变化
  		 * @version 1.4.0
  		 */
  def onProgressUpdate(callback: js.Function1[/* res */ baiduDashAppLib.Anon_Progress, scala.Unit]): scala.Unit = js.native
}
