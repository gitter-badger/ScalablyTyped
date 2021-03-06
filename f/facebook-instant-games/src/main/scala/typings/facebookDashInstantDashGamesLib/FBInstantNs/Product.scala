package typings
package facebookDashInstantDashGamesLib.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a game's product information.
  */
trait Product extends js.Object {
  /**
    * The product description
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A link to the product's associated image
    */
  var imageURI: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The price of the product
    */
  var price: java.lang.String
  /**
    * The currency code for the product
    */
  var priceCurrencyCode: java.lang.String
  /**
    * he product's game-specified identifier
    */
  var productID: java.lang.String
  /**
    * The title of the product
    */
  var title: java.lang.String
}

