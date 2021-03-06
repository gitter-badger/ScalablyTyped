package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Adds a public key to the specified User resource with the data included in the request. */
  def addPublicKey(request: gapiDotClientDotClouduseraccountsLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes the specified User resource. */
  def delete(request: gapiDotClientDotClouduseraccountsLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified User resource. */
  def get(request: gapiDotClientDotClouduseraccountsLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[User]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: gapiDotClientDotClouduseraccountsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Creates a User resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotClouduseraccountsLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of users contained within the specified project. */
  def list(request: gapiDotClientDotClouduseraccountsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[UserList]
  /** Removes the specified public key from the user. */
  def removePublicKey(request: gapiDotClientDotClouduseraccountsLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: gapiDotClientDotClouduseraccountsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: gapiDotClientDotClouduseraccountsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TestPermissionsResponse]
}

