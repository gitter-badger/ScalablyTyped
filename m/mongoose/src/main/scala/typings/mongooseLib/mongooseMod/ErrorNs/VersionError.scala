package typings
package mongooseLib.mongooseMod.ErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionError
  extends mongooseLib.mongooseMod.Error {
  var modifiedPaths: js.Array[_] = js.native
  var version: js.Any = js.native
}

