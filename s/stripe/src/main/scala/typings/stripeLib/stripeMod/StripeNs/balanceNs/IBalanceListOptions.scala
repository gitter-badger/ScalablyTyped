package typings
package stripeLib.stripeMod.StripeNs.balanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBalanceListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptions {
  var available_on: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For automatic Stripe payouts only, only returns transactions that were payed out on the specified payout ID.
    */
  var payout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only returns transactions that are related to the specified Stripe object ID
    * (e.g. filtering by a charge ID will return all related charge transactions).
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For automatic Stripe transfers only, only returns transactions that were
    * transferred out on the specified transfer ID.
    */
  var transfer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only returns transactions of the given type. One of: "charge", "refund",
    * "adjustment", "application_fee", "application_fee_refund", "transfer",
    * or "transfer_failure"
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

