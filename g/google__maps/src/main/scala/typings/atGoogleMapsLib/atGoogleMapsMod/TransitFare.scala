package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitFare extends js.Object {
  /** An [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217) indicating the currency that the amount is expressed in. */
  var currency: java.lang.String
  /** The total fare amount, formatted in the requested language. */
  var text: java.lang.String
  /** The total fare amount, in the currency specified above. */
  var value: scala.Double
}

