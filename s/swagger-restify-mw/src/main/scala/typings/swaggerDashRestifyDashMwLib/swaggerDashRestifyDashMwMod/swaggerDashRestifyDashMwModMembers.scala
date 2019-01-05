package typings
package swaggerDashRestifyDashMwLib.swaggerDashRestifyDashMwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-restify-mw", JSImport.Namespace)
@js.native
object swaggerDashRestifyDashMwModMembers extends js.Object {
  def create(
    config: swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod.Config,
    cb: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error with stdLib.Error], 
      /* middleware */ swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod.RestifyMiddleware, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

