package typings
package nextLib.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextAppContext[Q /* <: nextDashServerLib.routerMod.DefaultQuery */] extends js.Object {
  var Component: nextLib.nextMod.nextNs.NextComponentType[_, _, nextLib.nextMod.nextNs.NextContext[Q]]
  var ctx: nextLib.nextMod.nextNs.NextContext[Q]
  var router: nextDashServerLib.routerMod.RouterProps[Q]
}

