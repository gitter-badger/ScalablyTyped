package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Gets information about a specific operation. */
  def get(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists all operations for a project. */
  def list(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[OperationsListResponse]
}

