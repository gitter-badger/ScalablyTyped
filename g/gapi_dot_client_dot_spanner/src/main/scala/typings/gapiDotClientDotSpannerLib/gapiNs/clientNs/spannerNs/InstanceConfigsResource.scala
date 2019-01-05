package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceConfigsResource extends js.Object {
  /** Gets information about a particular instance configuration. */
  def get(request: gapiDotClientDotSpannerLib.Anon_Xgafv): gapiDotClientLib.gapiNs.clientNs.Request[InstanceConfig]
  /** Lists the supported instance configurations for a given project. */
  def list(request: gapiDotClientDotSpannerLib.Anon_XgafvAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListInstanceConfigsResponse]
}

