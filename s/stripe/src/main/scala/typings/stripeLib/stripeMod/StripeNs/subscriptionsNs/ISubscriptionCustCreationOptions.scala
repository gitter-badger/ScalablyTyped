package typings
package stripeLib.stripeMod.StripeNs.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionCustCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * A positive decimal (with at most two decimal places) between 1 and 100. This represents the percentage of the subscription invoice
    * subtotal that will be transferred to the application owner’s Stripe account. The request must be made with an OAuth key in order
    * to set an application fee percentage. For more information, see the application fees documentation.
    */
  var application_fee_percent: js.UndefOr[scala.Double] = js.undefined
  /**
    * Either "charge_automatically", or "send_invoice". When charging automatically, Stripe will attempt to pay this subscription at the end of the
    * cycle using the default source attached to the customer. When sending an invoice, Stripe will email your customer an invoice with payment
    * instructions. Defaults to "charge_automatically".
    */
  var billing: js.UndefOr[SubscriptionBilling] = js.undefined
  /**
    * A future timestamp to anchor the subscription’s billing cycle. This is used to determine the date of the first full invoice, and, for plans
    * with month or year intervals, the day of the month for subsequent invoices.
    */
  var billing_cycle_anchor: js.UndefOr[scala.Double] = js.undefined
  /**
    * The code of the coupon to apply to this subscription. A coupon applied to a subscription will only affect invoices created for that
    * particular subscription.
    */
  var coupon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of days a customer has to pay invoices generated by this subscription.
    * Only valid for subscriptions where billing=send_invoice.
    */
  var days_until_due: js.UndefOr[scala.Double] = js.undefined
  /**
    * List of subscription items, each with an attached plan.
    */
  var items: js.UndefOr[js.Array[ISubscriptionCreationItem]] = js.undefined
  /**
    * @deprecated Use items property instead.
    */
  var plan: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean (default true). Use with a billing_cycle_anchor timestamp to determine whether the customer will be invoiced a prorated amount until
    * the anchor date. If false, the anchor period will be free (similar to a trial).
    */
  var prorate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The quantity you'd like to apply to the subscription you're creating. For example, if your plan is £10/user/month, and your customer
    * has 5 users, you could pass 5 as the quantity to have the customer charged £50 (5 x £10) monthly. If you update a subscription but
    * don't change the plan ID (e.g. changing only the trial_end), the subscription will inherit the old subscription's quantity attribute
    * unless you pass a new quantity parameter. If you update a subscription and change the plan ID, the new subscription will not inherit
    * the quantity attribute and will default to 1 unless you pass a quantity parameter.
    */
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[stripeLib.stripeMod.StripeNs.sourcesNs.ISourceCreationOptions] = js.undefined
  /**
    * A positive decimal (with at most two decimal places) between 1 and 100. This represents the percentage of the subscription invoice
    * subtotal that will be calculated and added as tax to the final amount each billing period. For example, a plan which charges $10/month
    * with a tax_percent of 20.0 will charge $12 per invoice.
    */
  var tax_percent: js.UndefOr[scala.Double] = js.undefined
  /**
    * Unix timestamp representing the end of the trial period the customer will get before being charged for the first time. If set, trial_end
    * will override the default trial period of the plan the customer is being subscribed to. The special value now can be provided to end the
    * customer's trial immediately.
    */
  var trial_end: js.UndefOr[scala.Double | stripeLib.stripeLibStrings.now] = js.undefined
  /**
    * Indicates if a plan’s trial_period_days should be applied to the subscription. Setting trial_end per subscription is preferred,
    * and this defaults to false. Setting this flag to true together with trial_end is not allowed.
    */
  var trial_from_plan: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Integer representing the number of trial period days before the customer is charged for the first time.
    */
  var trial_period_days: js.UndefOr[scala.Double] = js.undefined
}

