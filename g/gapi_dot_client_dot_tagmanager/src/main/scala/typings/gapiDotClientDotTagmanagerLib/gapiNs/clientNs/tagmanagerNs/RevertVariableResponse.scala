package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertVariableResponse extends js.Object {
  /**
    * Variable as it appears in the latest container version since the last workspace synchronization operation. If no variable is present, that means the
    * variable was deleted in the latest container version.
    */
  var variable: js.UndefOr[Variable] = js.undefined
}

