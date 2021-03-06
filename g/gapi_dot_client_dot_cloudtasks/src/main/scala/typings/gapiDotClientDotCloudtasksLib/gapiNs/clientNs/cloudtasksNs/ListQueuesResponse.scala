package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueuesResponse extends js.Object {
  /**
    * A token to retrieve next page of results.
    *
    * To return the next page of results, call
    * CloudTasks.ListQueues with this value as the
    * ListQueuesRequest.page_token.
    *
    * If the next_page_token is empty, there are no more results.
    *
    * The page token is valid for only 2 hours.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of queues. */
  var queues: js.UndefOr[js.Array[Queue]] = js.undefined
}

