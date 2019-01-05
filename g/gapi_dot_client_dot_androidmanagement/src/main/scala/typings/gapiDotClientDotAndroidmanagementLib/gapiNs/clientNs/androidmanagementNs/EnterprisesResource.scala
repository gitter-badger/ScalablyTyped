package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterprisesResource extends js.Object {
  var applications: ApplicationsResource
  var devices: DevicesResource
  var enrollmentTokens: EnrollmentTokensResource
  var policies: PoliciesResource
  var webTokens: WebTokensResource
  /** Creates an enterprise by completing the enterprise signup flow. */
  def create(
    request: gapiDotClientDotAndroidmanagementLib.Anon_XgafvAccesstokenAltBearertokenCallbackEnterpriseToken
  ): gapiDotClientLib.gapiNs.clientNs.Request[Enterprise]
  /** Gets an enterprise. */
  def get(request: gapiDotClientDotAndroidmanagementLib.Anon_XgafvAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Enterprise]
  /** Updates an enterprise. */
  def patch(request: gapiDotClientDotAndroidmanagementLib.Anon_XgafvAccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Enterprise]
}

