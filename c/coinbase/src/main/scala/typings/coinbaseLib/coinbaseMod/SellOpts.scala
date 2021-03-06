package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SellOpts extends js.Object {
  /**
    * Whether or not you would still like to sell if you have to wait for your money to arrive to lock in a price
    */
  var agree_btc_amount_varies: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sell amount without fees (alternative to total)
    */
  var amount: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to false, this sell will not be immediately completed. Use the commit call to complete it. Default value: true
    */
  var commit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: java.lang.String
  /**
    * The ID of the payment method that should be used for the sell.
    */
  var payment_method: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to true, response will return an unsave sell for detailed price quote. Default value: false
    */
  var quote: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sell amount with fees (alternative to amount)
    */
  var total: js.UndefOr[java.lang.String] = js.undefined
}

