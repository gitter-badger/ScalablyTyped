package typings
package gotLib.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPError extends StdError {
  var headers: nodeLib.httpMod.IncomingHttpHeaders
  @JSName("name")
  var name_HTTPError: gotLib.gotLibStrings.HTTPError
  var statusCode: scala.Double
  var statusMessage: java.lang.String
}

