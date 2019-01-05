package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolesResource extends js.Object {
  /** Creates a new Role. */
  def create(request: gapiDotClientDotIamLib.Anon_Xgafv): gapiDotClientLib.gapiNs.clientNs.Request[Role] = js.native
  /**
    * Soft deletes a role. The role is suspended and cannot be used to create new
    * IAM Policy Bindings.
    * The Role will not be included in `ListRoles()` unless `show_deleted` is set
    * in the `ListRolesRequest`. The Role contains the deleted boolean set.
    * Existing Bindings remains, but are inactive. The Role can be undeleted
    * within 7 days. After 7 days the Role is deleted and all Bindings associated
    * with the role are removed.
    */
  def delete(request: gapiDotClientDotIamLib.Anon_XgafvAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Role] = js.native
  /** Gets a Role definition. */
  def get(request: gapiDotClientDotIamLib.Anon_XgafvAccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Role] = js.native
  /** Lists the Roles defined on a resource. */
  def list(request: gapiDotClientDotIamLib.Anon_XgafvAccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListRolesResponse] = js.native
  /** Lists the Roles defined on a resource. */
  def list(request: gapiDotClientDotIamLib.Anon_XgafvAccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ListRolesResponse] = js.native
  /** Updates a Role definition. */
  def patch(request: gapiDotClientDotIamLib.Anon_XgafvAccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Role] = js.native
  /**
    * Queries roles that can be granted on a particular resource.
    * A role is grantable if it can be used as the role in a binding for a policy
    * for that resource.
    */
  def queryGrantableRoles(request: gapiDotClientDotIamLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[QueryGrantableRolesResponse] = js.native
  /** Undelete a Role, bringing it back in its previous state. */
  def undelete(request: gapiDotClientDotIamLib.Anon_XgafvAccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Role] = js.native
}

