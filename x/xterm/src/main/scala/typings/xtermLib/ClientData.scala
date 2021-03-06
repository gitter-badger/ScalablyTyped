package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientData extends js.Object {
  var challenge: java.lang.String
  var extensions: js.UndefOr[WebAuthnExtensions] = js.undefined
  var hashAlg: java.lang.String | Algorithm
  var origin: java.lang.String
  var rpId: java.lang.String
  var tokenBinding: js.UndefOr[java.lang.String] = js.undefined
}

