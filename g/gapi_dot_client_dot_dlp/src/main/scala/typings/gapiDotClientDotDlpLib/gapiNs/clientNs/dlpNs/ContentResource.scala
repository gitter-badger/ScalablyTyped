package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentResource extends js.Object {
  /**
    * De-identifies potentially sensitive info from a list of strings.
    * This method has limits on input size and output size.
    */
  def deidentify(request: gapiDotClientDotDlpLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GooglePrivacyDlpV2beta1DeidentifyContentResponse]
  /**
    * Finds potentially sensitive info in a list of strings.
    * This method has limits on input size, processing time, and output size.
    */
  def inspect(request: gapiDotClientDotDlpLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GooglePrivacyDlpV2beta1InspectContentResponse]
  /**
    * Redacts potentially sensitive info from a list of strings.
    * This method has limits on input size, processing time, and output size.
    */
  def redact(request: gapiDotClientDotDlpLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GooglePrivacyDlpV2beta1RedactContentResponse]
}

