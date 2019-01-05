package typings
package gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  var reports: ReportsResource
  /** Creates a job and returns it. */
  def create(request: gapiDotClientDotYoutubereportingLib.Anon_XgafvAccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Job]
  /** Deletes a job. */
  def delete(request: gapiDotClientDotYoutubereportingLib.Anon_XgafvAccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a job. */
  def get(request: gapiDotClientDotYoutubereportingLib.Anon_XgafvAccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Job]
  /** Lists jobs. */
  def list(request: gapiDotClientDotYoutubereportingLib.Anon_XgafvAccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListJobsResponse]
}

