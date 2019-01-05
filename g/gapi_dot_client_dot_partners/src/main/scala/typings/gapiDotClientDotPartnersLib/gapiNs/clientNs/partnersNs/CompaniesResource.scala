package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompaniesResource extends js.Object {
  var leads: LeadsResource
  /** Gets a company. */
  def get(request: gapiDotClientDotPartnersLib.Anon_XgafvAccesstokenAddress): gapiDotClientLib.gapiNs.clientNs.Request[GetCompanyResponse]
  /** Lists companies. */
  def list(request: gapiDotClientDotPartnersLib.Anon_XgafvAccesstokenAddressAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListCompaniesResponse]
}

