package typings
package gapiDotClientDotClouderrorreportingLib.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Get the specified group. */
  def get(request: gapiDotClientDotClouderrorreportingLib.Anon_XgafvAccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ErrorGroup]
  /**
    * Replace the data for the specified group.
    * Fails if the group does not exist.
    */
  def update(request: gapiDotClientDotClouderrorreportingLib.Anon_XgafvAccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ErrorGroup]
}

