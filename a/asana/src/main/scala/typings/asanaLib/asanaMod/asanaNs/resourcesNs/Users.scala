package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A _user_ object represents an account in Asana that can be given access to
  * various workspaces, projects, and tasks.
  *
  * Like other objects in the system, users are referred to by numerical IDs.
  * However, the special string identifier `me` can be used anywhere
  * a user ID is accepted, to refer to the current authenticated user.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Users extends Resource {
  /**
    * * Returns the user records for all users in all workspaces and organizations
    * * accessible to the authenticated user. Accepts an optional workspace ID
    * * parameter.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Number} [params.workspace] The workspace or organization to filter users on.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param params
    * @param dispatchOptions?
    * @return
    */
  def findAll(params: asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.FindAllParams): bluebirdLib.bluebirdMod.namespaced[SimpleResourceList] = js.native
  def findAll(params: asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.FindAllParams, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[SimpleResourceList] = js.native
  /**
    * * Returns the full user record for the single user with the provided ID.
    *   * @param {Number|String} user An identifier for the user. Can be one of an email address,
    *   * the globally unique identifier for the user, or the keyword `me`
    *   * to indicate the current user making the request.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param user
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(user: java.lang.String): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.Type] = js.native
  def findById(user: java.lang.String, params: Params): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.Type] = js.native
  def findById(user: java.lang.String, params: Params, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.Type] = js.native
  def findById(user: scala.Double): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.Type] = js.native
  def findById(user: scala.Double, params: Params): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.Type] = js.native
  def findById(user: scala.Double, params: Params, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.Type] = js.native
  /**
    * * Returns the user records for all users in the specified workspace or
    * * organization.
    *   * @param {Number} workspace The workspace in which to get users.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByWorkspace(workspace: scala.Double): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.Type]] = js.native
  def findByWorkspace(workspace: scala.Double, params: Params): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.Type]] = js.native
  def findByWorkspace(workspace: scala.Double, params: Params, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.Type]] = js.native
  /**
    * * Returns the full user record for the currently authenticated user.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def me(): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.Type] = js.native
  def me(params: Params): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.Type] = js.native
  def me(params: Params, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs.Type] = js.native
}

