package typings
package chromeLib.chromeNs.fileBrowserHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionResult extends js.Object {
  /** Optional. Selected file entry. It will be null if a file hasn't been selected.  */
  var entry: js.UndefOr[js.Object | scala.Null] = js.undefined
  /** Whether the file has been selected. */
  var success: scala.Boolean
}

