package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDebugCaptureRequest extends js.Object {
  /** The internal component id for which debug information is sent. */
  var componentId: js.UndefOr[java.lang.String] = js.undefined
  /** The encoded debug information. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** The location which contains the job specified by job_id. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** The worker id, i.e., VM hostname. */
  var workerId: js.UndefOr[java.lang.String] = js.undefined
}

