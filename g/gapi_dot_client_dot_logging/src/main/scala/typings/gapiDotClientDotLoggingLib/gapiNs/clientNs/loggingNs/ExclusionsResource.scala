package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExclusionsResource extends js.Object {
  /**
    * Creates a new exclusion in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions
    * in a resource.
    */
  def create(request: gapiDotClientDotLoggingLib.Anon_Xgafv): gapiDotClientLib.gapiNs.clientNs.Request[LogExclusion]
  /** Deletes an exclusion. */
  def delete(request: gapiDotClientDotLoggingLib.Anon_XgafvAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets the description of an exclusion. */
  def get(request: gapiDotClientDotLoggingLib.Anon_XgafvAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[LogExclusion]
  /** Lists all the exclusions in a parent resource. */
  def list(request: gapiDotClientDotLoggingLib.Anon_XgafvAccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListExclusionsResponse]
  /** Changes one or more properties of an existing exclusion. */
  def patch(request: gapiDotClientDotLoggingLib.Anon_XgafvAccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[LogExclusion]
}

