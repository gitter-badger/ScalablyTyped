package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKey extends js.Object {
  var keyExpirationTime: js.UndefOr[scala.Double] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var privateKey: openpgpLib.openpgpMod.keyNs.Key
  var revocationCertificate: js.UndefOr[scala.Boolean] = js.undefined
  var userIds: js.UndefOr[js.Array[openpgpLib.openpgpMod.UserId]] = js.undefined
}

