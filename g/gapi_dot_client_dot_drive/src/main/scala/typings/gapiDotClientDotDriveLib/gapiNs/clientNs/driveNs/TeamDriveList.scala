package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDriveList extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "drive#teamDriveList". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The page token for the next page of Team Drives. This will be absent if the end of the Team Drives list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of Team Drives. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var teamDrives: js.UndefOr[js.Array[TeamDrive]] = js.undefined
}

