package typings
package chromeDashAppsLib.chromeNs.fileSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseFileEntryOptions extends ChooseEntryOptionsBase {
  /**
    * Whether to accept multiple files. This is only supported for openFile and openWritableFile.
    * The callback to chooseEntry will be called with a list of entries if this is set to true.
    * Otherwise it will be called with a single Entry.
    * @default false
    * @since Chrome 30.
    */
  var acceptsMultiple: js.UndefOr[chromeDashAppsLib.chromeDashAppsLibNumbers.`false`] = js.undefined
  var `type`: chromeDashAppsLib.chromeDashAppsLibStrings.openFile | chromeDashAppsLib.chromeDashAppsLibStrings.openWritableFile
}

