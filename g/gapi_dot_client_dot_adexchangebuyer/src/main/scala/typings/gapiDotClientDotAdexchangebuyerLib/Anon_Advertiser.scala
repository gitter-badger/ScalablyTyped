package typings
package gapiDotClientDotAdexchangebuyerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Advertiser extends js.Object {
  var advertiser: js.UndefOr[java.lang.String] = js.undefined
  /** The app icon, for app download ads. */
  var appIcon: js.UndefOr[Anon_Height] = js.undefined
  /** A long description of the ad. */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /** A label for the button that the user is supposed to click. */
  var callToAction: js.UndefOr[java.lang.String] = js.undefined
  /** The URL that the browser/SDK will load when the user clicks the ad. */
  var clickLinkUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The URL to use for click tracking. */
  var clickTrackingUrl: js.UndefOr[java.lang.String] = js.undefined
  /** A short title for the ad. */
  var headline: js.UndefOr[java.lang.String] = js.undefined
  /** A large image. */
  var image: js.UndefOr[Anon_Height] = js.undefined
  /** The URLs are called when the impression is rendered. */
  var impressionTrackingUrl: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A smaller image, for the advertiser logo. */
  var logo: js.UndefOr[Anon_Height] = js.undefined
  /** The price of the promoted app including the currency info. */
  var price: js.UndefOr[java.lang.String] = js.undefined
  /** The app rating in the app store. Must be in the range [0-5]. */
  var starRating: js.UndefOr[scala.Double] = js.undefined
  /** The URL to the app store to purchase/download the promoted app. */
  var store: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the XML VAST for a native ad. Note this is a separate field from resource.video_url. */
  var videoURL: js.UndefOr[java.lang.String] = js.undefined
}

