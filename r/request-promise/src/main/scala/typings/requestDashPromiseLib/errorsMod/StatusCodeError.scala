package typings
package requestDashPromiseLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodeError
  extends stdLib.Error {
  var error: js.Any
  var options: requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options
  var response: nodeLib.httpMod.IncomingMessage
  var statusCode: scala.Double
}

