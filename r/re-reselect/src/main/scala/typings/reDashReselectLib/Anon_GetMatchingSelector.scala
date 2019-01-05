package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetMatchingSelector[S, R, C] extends js.Object {
  var cache: reDashReselectLib.reDashReselectMod.ICacheObject
  def clearCache(): scala.Unit
  def getMatchingSelector(state: S, args: js.Any*): reDashReselectLib.reDashReselectMod.OutputSelector[S, R, C]
  def removeMatchingSelector(state: S, args: js.Any*): scala.Unit
}

