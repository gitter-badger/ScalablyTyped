package typings
package atReachRouterLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistorySource extends js.Object {
  var history: atReachRouterLib.Anon_StatePushState
  val location: WindowLocation
  def addEventListener(
    name: java.lang.String,
    listener: js.Function1[/* event */ reactLib.Event with stdLib.Event, scala.Unit]
  ): scala.Unit
  def removeEventListener(
    name: java.lang.String,
    listener: js.Function1[/* event */ reactLib.Event with stdLib.Event, scala.Unit]
  ): scala.Unit
}

