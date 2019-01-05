package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError
  extends stdLib.Error {
  var data: js.UndefOr[ErrorHash | js.Any] = js.undefined
  var statusCode: scala.Double
  var `type`: ValidationErrorType
}

