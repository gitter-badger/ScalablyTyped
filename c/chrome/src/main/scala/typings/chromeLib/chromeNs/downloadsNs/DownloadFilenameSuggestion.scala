package typings
package chromeLib.chromeNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFilenameSuggestion extends js.Object {
  /** Optional. The action to take if filename already exists.  */
  var conflictAction: js.UndefOr[java.lang.String] = js.undefined
  /** The DownloadItem's new target DownloadItem.filename, as a path relative to the user's default Downloads directory, possibly containing subdirectories. Absolute paths, empty paths, and paths containing back-references ".." will be ignored. */
  var filename: java.lang.String
}

