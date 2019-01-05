package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V2Resource extends js.Object {
  /**
    * Gets Partners Status of the logged in user's agency.
    * Should only be called if the logged in user is the admin of the agency.
    */
  def getPartnersstatus(request: gapiDotClientDotPartnersLib.Anon_XgafvAccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[GetPartnersStatusResponse]
  /**
    * Update company.
    * Should only be called within the context of an authorized logged in user.
    */
  def updateCompanies(
    request: gapiDotClientDotPartnersLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
  ): gapiDotClientLib.gapiNs.clientNs.Request[Company]
  /** Updates the specified lead. */
  def updateLeads(
    request: gapiDotClientDotPartnersLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
  ): gapiDotClientLib.gapiNs.clientNs.Request[Lead]
}

