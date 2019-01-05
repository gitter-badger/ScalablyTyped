package typings
package reactDashAddonsDashTestDashUtilsLib.reactDashAddonsDashTestDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TestUtilsNs {
  type EventSimulator = js.Function2[
    /* element */ (reactLib.Element with stdLib.Element) | (reactLib.reactMod.Component[js.Any, js.Object, js.Any]), 
    /* eventData */ js.UndefOr[SyntheticEventData], 
    scala.Unit
  ]
}
