package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferConfigsResource extends js.Object {
  var runs: RunsResource
  /** Creates a new data transfer configuration. */
  def create(request: gapiDotClientDotBigquerydatatransferLib.Anon_XgafvAccesstokenAltAuthorizationCode): gapiDotClientLib.gapiNs.clientNs.Request[TransferConfig]
  /**
    * Deletes a data transfer configuration,
    * including any associated transfer runs and logs.
    */
  def delete(request: gapiDotClientDotBigquerydatatransferLib.Anon_Xgafv): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Returns information about a data transfer config. */
  def get(request: gapiDotClientDotBigquerydatatransferLib.Anon_Xgafv): gapiDotClientLib.gapiNs.clientNs.Request[TransferConfig]
  /** Returns information about all data transfers in the project. */
  def list(request: gapiDotClientDotBigquerydatatransferLib.Anon_XgafvAccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListTransferConfigsResponse]
  /**
    * Updates a data transfer configuration.
    * All fields must be set, even if they are not updated.
    */
  def patch(
    request: gapiDotClientDotBigquerydatatransferLib.Anon_XgafvAccesstokenAltAuthorizationCodeBearertoken
  ): gapiDotClientLib.gapiNs.clientNs.Request[TransferConfig]
  /**
    * Creates transfer runs for a time range [range_start_time, range_end_time].
    * For each date - or whatever granularity the data source supports - in the
    * range, one transfer run is created.
    * Note that runs are created per UTC time in the time range.
    */
  def scheduleRuns(request: gapiDotClientDotBigquerydatatransferLib.Anon_XgafvAccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ScheduleTransferRunsResponse]
}

