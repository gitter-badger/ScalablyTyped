package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Resolve extends js.Object {
  /**
    * Resolves the given hostname or IP address literal.
    * @param hostname The hostname to resolve.
    * @param callback Called when the resolution operation completes.
    */
  def resolve(
    hostname: java.lang.String,
    callback: js.Function1[
      /* resolveInfo */ chromeDashAppsLib.chromeNs.dnsNs.ResolveCallbackResolveInfo, 
      scala.Unit
    ]
  ): scala.Unit
}

