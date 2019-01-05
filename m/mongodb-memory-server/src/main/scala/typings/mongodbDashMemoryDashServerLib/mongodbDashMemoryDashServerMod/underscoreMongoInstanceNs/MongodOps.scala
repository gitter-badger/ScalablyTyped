package typings
package mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoInstanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongodOps extends js.Object {
  // mongo binary options
  var binary: js.UndefOr[
    mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoBinaryNs.MongoBinaryOpts
  ] = js.undefined
  var debug: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  // instance options
  var instance: mongodbDashMemoryDashServerLib.Anon_Port
  // child process spawn options
  var spawn: js.UndefOr[mongodbDashMemoryDashServerLib.Anon_Cwd] = js.undefined
}

