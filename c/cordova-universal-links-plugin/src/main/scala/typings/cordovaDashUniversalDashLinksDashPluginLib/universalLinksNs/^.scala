package typings
package cordovaDashUniversalDashLinksDashPluginLib.universalLinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("universalLinks")
@js.native
object ^ extends js.Object {
  def subscribe(
    eventName: java.lang.String,
    callback: js.Function1[
      /* data */ cordovaDashUniversalDashLinksDashPluginLib.universalLinksNs.EventData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def subscribe(
    eventName: scala.Null,
    callback: js.Function1[
      /* data */ cordovaDashUniversalDashLinksDashPluginLib.universalLinksNs.EventData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def unsubscribe(): scala.Unit = js.native
  def unsubscribe(eventName: java.lang.String): scala.Unit = js.native
}

