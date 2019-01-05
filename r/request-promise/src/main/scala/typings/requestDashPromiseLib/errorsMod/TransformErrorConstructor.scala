package typings
package requestDashPromiseLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformErrorConstructor
  extends stdLib.Error
     with org.scalablytyped.runtime.Instantiable3[
      /* cause */ js.Any, 
      /* options */ requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options, 
      /* response */ nodeLib.httpMod.IncomingMessage, 
      TransformError
    ] {
  def apply(
    cause: js.Any,
    options: requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options,
    response: nodeLib.httpMod.IncomingMessage
  ): TransformError = js.native
}

