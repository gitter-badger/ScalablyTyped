package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShippingInformation extends js.Object {
  /**
    * Shipping address.
    */
  var address: stripeLib.Anon_Line1
  /**
    * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
    */
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Recipient name.
    */
  var name: java.lang.String
  /**
    * Recipient phone (including extension).
    */
  var phone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tracking number for a physical product, obtained from the delivery service. If multiple
    * tracking numbers were generated for this purchase, please separate them with commas.
    */
  var tracking_number: js.UndefOr[java.lang.String] = js.undefined
}

