package typings
package googleDashDriveDashRealtimeDashApiLib.rtclientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientUtils extends js.Object {
  var RealtimeLoader: RealtimeLoaderFactory
  // INCOMPLETE
  var params: googleDashDriveDashRealtimeDashApiLib.Anon_FileIds
  /**
  		 * Creates a new Realtime file.
  		 * @param title {string} title of the newly created file.
  		 * @param mimeType {string} the MIME type of the new file.
  		 * @param callback {(file:DriveAPIFileResource) => void} the callback to call after creation.
  		 */
  def createRealtimeFile(
    title: java.lang.String,
    mimeType: java.lang.String,
    callback: js.Function1[/* file */ DriveAPIFileResource, scala.Unit]
  ): scala.Unit
}

