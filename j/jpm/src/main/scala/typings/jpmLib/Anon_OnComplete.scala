package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnComplete extends js.Object {
  var formSubmitURL: js.UndefOr[java.lang.String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ jpmLib.FFAddonSDKNs.NSIException, _]] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var passwordField: js.UndefOr[java.lang.String] = js.undefined
  var realm: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var usernameField: js.UndefOr[java.lang.String] = js.undefined
  def onComplete(credentials: js.Array[jpmLib.passwordsMod.Credential]): js.Any
}

