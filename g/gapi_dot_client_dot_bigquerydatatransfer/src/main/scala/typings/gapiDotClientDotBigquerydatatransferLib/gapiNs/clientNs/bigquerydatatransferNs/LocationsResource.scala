package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var dataSources: DataSourcesResource
  var transferConfigs: TransferConfigsResource
  /** Get information about a location. */
  def get(request: gapiDotClientDotBigquerydatatransferLib.Anon_Xgafv): gapiDotClientLib.gapiNs.clientNs.Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(
    request: gapiDotClientDotBigquerydatatransferLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsFilter
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
}

