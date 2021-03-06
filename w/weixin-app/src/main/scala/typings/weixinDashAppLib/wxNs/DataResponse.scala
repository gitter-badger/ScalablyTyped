package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region 基本参数
trait DataResponse extends js.Object {
  /** 回调函数返回的内容 */
  var data: js.Object | java.lang.String | stdLib.ArrayBuffer
  /** 开发者服务器返回的 HTTP Response Header */
  var header: js.Object
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: scala.Double
}

