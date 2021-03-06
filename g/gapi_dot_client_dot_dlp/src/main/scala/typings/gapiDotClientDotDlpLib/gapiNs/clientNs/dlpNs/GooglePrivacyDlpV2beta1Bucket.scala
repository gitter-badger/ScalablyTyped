package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Bucket extends js.Object {
  /** Upper bound of the range, exclusive; type must match min. */
  var max: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
  /**
    * Lower bound of the range, inclusive. Type should be the same as max if
    * used.
    */
  var min: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
  /**
    * Replacement value for this bucket. If not provided
    * the default behavior will be to hyphenate the min-max range.
    */
  var replacementValue: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
}

