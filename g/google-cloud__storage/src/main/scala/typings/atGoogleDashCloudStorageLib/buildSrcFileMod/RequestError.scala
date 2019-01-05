package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestError
  extends stdLib.Error {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var errors: js.UndefOr[js.Array[nodeLib.Error with stdLib.Error]] = js.undefined
}

