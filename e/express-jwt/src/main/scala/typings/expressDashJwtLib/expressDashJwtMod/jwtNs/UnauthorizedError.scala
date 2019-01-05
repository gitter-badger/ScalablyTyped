package typings
package expressDashJwtLib.expressDashJwtMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnauthorizedError
  extends stdLib.Error {
  var code: ErrorCode
  var inner: expressDashJwtLib.Anon_Message
  @JSName("name")
  var name_UnauthorizedError: expressDashJwtLib.expressDashJwtLibStrings.UnauthorizedError
  var status: scala.Double
}

