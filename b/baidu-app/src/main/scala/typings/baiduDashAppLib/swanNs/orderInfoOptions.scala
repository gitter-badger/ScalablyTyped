package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait orderInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * https://dianshang.baidu.com/platform/doclist/index.html#!/doc/nuomiplus_2_base/term_v2.md
  		 * 用以表示应用身份的唯一ID,在应用审
  		 * 核通过后进行分配,一经分配后不会发生更改,来唯一确定一个应
  		 * 用。详见核心参数
  		 * https://dianshang.baidu.com/platform/doclist/index.html#!/doc/nuomiplus_1_guide/mini_program_cashier/parameter.md
  		 */
  var appKey: java.lang.String
  /**
  		 * 订单详细信息，需要是一个可解析为JSON Object的字符串。字段
  		 * 内容见： https://dianshang.baidu.com/platform/doclist/index.html#!/doc/nuomiplus_1_guide/mini_program_cashier/parameter.md
  		 */
  var bizInfo: java.lang.String
  /**
  		 * 跳转百度收银台支付必带参数之一,是百度收银台的财务结算凭
  		 * 证,与账号绑定的结算协议一一对应,每笔交易将结算到dealId对
  		 * 应的协议主体。详见
  		 * https://dianshang.baidu.com/platform/doclist/index.html#!/doc/nuomiplus_1_guide/mini_program_cashier/parameter.md
  		 */
  var dealId: java.lang.String
  /**
  		 * 订单的名称
  		 */
  var dealTitle: java.lang.String
  /**
  		 * 对appKey+dealId+tpOrderId+totalAmount进行RSA加密后的签
  		 * 名，防止订单被伪造。签名过程见 百度电商开放平台：https://dianshang.baidu.com/platform/doclist/index.html#!/doc/nuomiplus_2_base/sign_v2.md
  		 */
  var rsaSign: java.lang.String
  /**
  		 * 固定值1
  		 */
  var signFieldsRange: baiduDashAppLib.baiduDashAppLibNumbers.`1`
  /**
  		 * 订单金额，单位为人民币分。
  		 */
  var totalAmount: java.lang.String
  /**
  		 * 商户平台自己记录的订单ID，当支付状态发生变化时，会通过此订
  		 * 单ID通知商户。
  		 */
  var tpOrderId: java.lang.String
}

