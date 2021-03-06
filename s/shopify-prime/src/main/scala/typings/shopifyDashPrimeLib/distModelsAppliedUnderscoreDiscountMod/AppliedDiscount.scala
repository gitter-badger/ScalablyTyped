package typings
package shopifyDashPrimeLib.distModelsAppliedUnderscoreDiscountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppliedDiscount extends js.Object {
  /**
    * The applied amount of the discount, based on the setting of value_type.
    * When ValueType is set to fixed_amount discount amount = quantity * value
    * When ValueType is set to percentage discount amount = floor(price * quantity * value) / 100
    */
  var amount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Reason for the discount.
    */
  var description: java.lang.String
  /**
    * Title of the discount.
    */
  var title: java.lang.String
  /**
    * he value of the discount. If the type of the discount is fixed_amount, then this is a fixed dollar amount. If the type is percentage, then this is the percentage.
    */
  var value: java.lang.String
  /**
    * The type of discount. Known values are "percentage" and "fixed_amount".
    */
  var value_type: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.percentage | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.fixed_amount
}

