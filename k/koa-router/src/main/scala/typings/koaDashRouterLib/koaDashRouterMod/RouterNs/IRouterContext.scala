package typings
package koaDashRouterLib.koaDashRouterMod.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Lifted 0 members from Set(koa.koa.Application.ParameterizedContext<any, {}>) */ @js.native
trait IRouterContext
  extends koaLib.koaMod.ApplicationNs.BaseContext
     with koaLib.Anon_App[js.Any] {
  /**
    * url params
    */
  var params: js.Any = js.native
  /**
    * the router instance
    */
  var router: koaDashRouterLib.koaDashRouterMod.Router = js.native
}

