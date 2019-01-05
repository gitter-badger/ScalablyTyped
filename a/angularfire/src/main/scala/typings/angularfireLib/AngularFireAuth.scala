package typings
package angularfireLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AngularFireAuth extends js.Object {
  /**
  	 * Authenticates the Firebase reference anonymously.
  	 *
  	 * @param {Object} [options] An object containing optional client arguments, such as configuring
  	 * session persistence.
  	 * @return {Promise<Object>} A promise fulfilled with an object containing authentication data.
  	 */
  @JSName("$authAnonymously")
  def $authAnonymously(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  @JSName("$authAnonymously")
  def $authAnonymously(options: coreDashJsLib.Object with js.Object): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Authenticates the Firebase reference with a custom authentication token.
  	 *
  	 * @param {string} authToken An authentication token or a Firebase Secret. A Firebase Secret
  	 * should only be used for authenticating a server process and provides full read / write
  	 * access to the entire Firebase.
  	 * @param {Object} [options] An object containing optional client arguments, such as configuring
  	 * session persistence.
  	 * @return {Promise<Object>} A promise fulfilled with an object containing authentication data.
  	 */
  @JSName("$authWithCustomToken")
  def $authWithCustomToken(authToken: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  @JSName("$authWithCustomToken")
  def $authWithCustomToken(authToken: java.lang.String, options: coreDashJsLib.Object with js.Object): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Authenticates the Firebase reference with the OAuth popup flow.
  	 *
  	 * @param {string} provider The unique string identifying the OAuth provider to authenticate
  	 * with, e.g. google.
  	 * @param {Object} [options] An object containing optional client arguments, such as configuring
  	 * session persistence.
  	 * @return {Promise<Object>} A promise fulfilled with an object containing authentication data.
  	 */
  @JSName("$authWithOAuthPopup")
  def $authWithOAuthPopup(provider: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  @JSName("$authWithOAuthPopup")
  def $authWithOAuthPopup(provider: java.lang.String, options: coreDashJsLib.Object with js.Object): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Authenticates the Firebase reference with the OAuth redirect flow.
  	 *
  	 * @param {string} provider The unique string identifying the OAuth provider to authenticate
  	 * with, e.g. google.
  	 * @param {Object} [options] An object containing optional client arguments, such as configuring
  	 * session persistence.
  	 * @return {Promise<Object>} A promise fulfilled with an object containing authentication data.
  	 */
  @JSName("$authWithOAuthRedirect")
  def $authWithOAuthRedirect(provider: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  @JSName("$authWithOAuthRedirect")
  def $authWithOAuthRedirect(provider: java.lang.String, options: coreDashJsLib.Object with js.Object): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Authenticates the Firebase reference with an OAuth token.
  	 *
  	 * @param {string} provider The unique string identifying the OAuth provider to authenticate
  	 * with, e.g. google.
  	 * @param {string|Object} credentials Either a string, such as an OAuth 2.0 access token, or an
  	 * Object of key / value pairs, such as a set of OAuth 1.0a credentials.
  	 * @param {Object} [options] An object containing optional client arguments, such as configuring
  	 * session persistence.
  	 * @return {Promise<Object>} A promise fulfilled with an object containing authentication data.
  	 */
  @JSName("$authWithOAuthToken")
  def $authWithOAuthToken(provider: java.lang.String, credentials: coreDashJsLib.Object with js.Object): angularLib.angularMod.angularNs.IPromise[_] = js.native
  @JSName("$authWithOAuthToken")
  def $authWithOAuthToken(
    provider: java.lang.String,
    credentials: coreDashJsLib.Object with js.Object,
    options: coreDashJsLib.Object with js.Object
  ): angularLib.angularMod.angularNs.IPromise[_] = js.native
  @JSName("$authWithOAuthToken")
  def $authWithOAuthToken(provider: java.lang.String, credentials: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  @JSName("$authWithOAuthToken")
  def $authWithOAuthToken(
    provider: java.lang.String,
    credentials: java.lang.String,
    options: coreDashJsLib.Object with js.Object
  ): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Authenticates the Firebase reference with an email/password user.
  	 *
  	 * @param {Object} credentials An object containing email and password attributes corresponding
  	 * to the user account.
  	 * @param {Object} [options] An object containing optional client arguments, such as configuring
  	 * session persistence.
  	 * @return {Promise<Object>} A promise fulfilled with an object containing authentication data.
  	 */
  @JSName("$authWithPassword")
  def $authWithPassword(
    credentials: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify FirebaseCredentials */ js.Any
  ): angularLib.angularMod.angularNs.IPromise[_] = js.native
  @JSName("$authWithPassword")
  def $authWithPassword(
    credentials: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify FirebaseCredentials */ js.Any,
    options: coreDashJsLib.Object with js.Object
  ): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Changes the email for an email/password user.
  	 *
  	 * @param {Object} credentials An object containing the old email, new email, and password of
  	 * the user whose email is to change.
  	 * @return {Promise<>} An empty promise fulfilled once the email change is complete.
  	 */
  @JSName("$changeEmail")
  def $changeEmail(
    credentials: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify FirebaseChangeEmailCredentials */ js.Any
  ): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Changes the password for an email/password user.
  	 *
  	 * @param {Object} credentials An object containing the email, old password, and new password of
  	 * the user whose password is to change.
  	 * @return {Promise<>} An empty promise fulfilled once the password change is complete.
  	 */
  @JSName("$changePassword")
  def $changePassword(
    credentials: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify FirebaseChangePasswordCredentials */ js.Any
  ): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Creates a new email/password user. Note that this function only creates the user, if you
  	 * wish to log in as the newly created user, call $authWithPassword() after the promise for
  	 * this method has been resolved.
  	 *
  	 * @param {Object} credentials An object containing the email and password of the user to create.
  	 * @return {Promise<Object>} A promise fulfilled with the user object, which contains the
  	 * uid of the created user.
  	 */
  @JSName("$createUser")
  def $createUser(
    credentials: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify FirebaseCredentials */ js.Any
  ): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Synchronously retrieves the current authentication data.
  	 *
  	 * @return {Object} The client's authentication data.
  	 */
  @JSName("$getAuth")
  def $getAuth(): js.Any = js.native
  /**
  	 * Asynchronously fires the provided callback with the current authentication data every time
  	 * the authentication data changes. It also fires as soon as the authentication data is
  	 * retrieved from the server.
  	 *
  	 * @param {function} callback A callback that fires when the client's authenticate state
  	 * changes. If authenticated, the callback will be passed an object containing authentication
  	 * data according to the provider used to authenticate. Otherwise, it will be passed null.
  	 * @param {string} [context] If provided, this object will be used as this when calling your
  	 * callback.
  	 * @return {function} A function which can be used to deregister the provided callback.
  	 */
  @JSName("$onAuth")
  def $onAuth(callback: angularLib.angularMod.Global.Function with coreDashJsLib.Function with js.Function): angularLib.angularMod.Global.Function with coreDashJsLib.Function with js.Function = js.native
  @JSName("$onAuth")
  def $onAuth(
    callback: angularLib.angularMod.Global.Function with coreDashJsLib.Function with js.Function,
    context: js.Any
  ): angularLib.angularMod.Global.Function with coreDashJsLib.Function with js.Function = js.native
  /**
  	 * Removes an email/password user.
  	 *
  	 * @param {Object} credentials An object containing the email and password of the user to remove.
  	 * @return {Promise<>} An empty promise fulfilled once the user is removed.
  	 */
  @JSName("$removeUser")
  def $removeUser(
    credentials: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify FirebaseCredentials */ js.Any
  ): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Utility method which can be used in a route's resolve() method to require that a route has
  	 * a logged in client.
  	 *
  	 * @returns {Promise<Object>} A promise fulfilled with the client's current authentication
  	 * state or rejected if the client is not authenticated.
  	 */
  @JSName("$requireAuth")
  def $requireAuth(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Sends a password reset email to an email/password user.
  	 *
  	 * @param {Object} credentials An object containing the email of the user to send a reset
  	 * password email to.
  	 * @return {Promise<>} An empty promise fulfilled once the reset password email is sent.
  	 */
  @JSName("$resetPassword")
  def $resetPassword(
    credentials: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify FirebaseResetPasswordCredentials */ js.Any
  ): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Unauthenticates the Firebase reference.
  	 */
  @JSName("$unauth")
  def $unauth(): scala.Unit = js.native
  /**
  	 * Utility method which can be used in a route's resolve() method to grab the current
  	 * authentication data.
  	 *
  	 * @returns {Promise<Object|null>} A promise fulfilled with the client's current authentication
  	 * state, which will be null if the client is not authenticated.
  	 */
  @JSName("$waitForAuth")
  def $waitForAuth(): angularLib.angularMod.angularNs.IPromise[_] = js.native
}

