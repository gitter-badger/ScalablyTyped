package typings
package gapiDotClientDotPlaymoviespartnerLib.gapiNs.clientNs.playmoviespartnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /**
    * Get an Order given its id.
    *
    * See _Authentication and Authorization rules_ and
    * _Get methods rules_ for more information about this method.
    */
  def get(request: gapiDotClientDotPlaymoviespartnerLib.Anon_XgafvAccesstokenAccountId): gapiDotClientLib.gapiNs.clientNs.Request[Order]
  /**
    * List Orders owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: gapiDotClientDotPlaymoviespartnerLib.Anon_XgafvAccesstokenAccountIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListOrdersResponse]
}

