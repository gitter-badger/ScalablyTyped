package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewPermissionsEvent extends js.Object {
  /**
    * The set of permissions that the enterprise admin has already approved for this application. Use Permissions.Get on the EMM API to retrieve details
    * about these permissions.
    */
  var approvedPermissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The id of the product (e.g. "app:com.google.android.gm") for which new permissions were added. This field will always be present. */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /** The set of permissions that the app is currently requesting. Use Permissions.Get on the EMM API to retrieve details about these permissions. */
  var requestedPermissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

