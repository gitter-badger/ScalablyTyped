package typings
package mithrilLib.mithrilMod.MithrilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  /** Routing parameters. If path has routing parameter slots, the properties of this object are interpolated into the path string. */
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  /** The state object to pass to the underlying history.pushState / history.replaceState call. */
  var state: js.UndefOr[js.Any] = js.undefined
  /** The title string to pass to the underlying history.pushState / history.replaceState call. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

