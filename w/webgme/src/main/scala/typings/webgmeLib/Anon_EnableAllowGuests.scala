package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableAllowGuests extends js.Object {
  /**
    * Generate a guest account for non-authenticated connections.
    *    config.authentication.allowGuests = true;
    */
  var allowGuests: scala.Boolean
  /**
    * Allow clients to create new users via the REST api.
    *    config.authentication.allowUserRegistration = true;
    */
  var allowUserRegistration: scala.Boolean
  var authorizer: Anon_Path
  /**
    * If true certain parts will require that users are authenticated.
    *    config.authentication.enable = false;
    */
  var enable: scala.Boolean
  /**
    * User account which non-authenticated connections will access the storage.
    *    config.authentication.guestAccount = 'guest';
    */
  var guestAccount: java.lang.String
  var jwt: Anon_CookieId
  /**
    * Where clients are redirected if not authenticated.
    *    config.authentication.logInUrl = '/profile/login';
    */
  var logInUrl: java.lang.String
  /**
    * Where clients are redirected after logout.
    *   config.authentication.logOutUrl = '/profile/login';
    */
  var logOutUrl: java.lang.String
  /**
    * Strength of the salting of the users' passwords bcrypt.
    *   config.authentication.salts = 10;
    */
  var salts: scala.Double
}

