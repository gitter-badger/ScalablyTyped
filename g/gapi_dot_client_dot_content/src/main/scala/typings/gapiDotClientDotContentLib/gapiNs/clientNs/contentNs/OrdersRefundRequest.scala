package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersRefundRequest extends js.Object {
  /** The amount that is refunded. */
  var amount: js.UndefOr[Price] = js.undefined
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  /** The reason for the refund. */
  var reason: js.UndefOr[java.lang.String] = js.undefined
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[java.lang.String] = js.undefined
}

