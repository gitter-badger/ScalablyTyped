package typings
package smtpDashServerLib.smtpDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMTPServerAuthentication extends js.Object {
  /**
    *  the OAuth2 bearer access token if 'XOAUTH2' was used as the authentication method
    */
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * indicates the authentication method used, 'PLAIN', 'LOGIN' or 'XOAUTH2'
    */
  var method: smtpDashServerLib.smtpDashServerLibStrings.PLAIN | smtpDashServerLib.smtpDashServerLibStrings.LOGIN | smtpDashServerLib.smtpDashServerLibStrings.XOAUTH2
  /**
    * the password if LOGIN or PLAIN was used
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * the username of the user
    */
  var username: js.UndefOr[java.lang.String] = js.undefined
  /**
    * a function for validating CRAM-MD5 challenge responses.
    * Takes the password of the user as an argument and returns true if the response matches the password
    */
  def validatePassword(password: java.lang.String): scala.Boolean
}

