package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupAggregatedList extends js.Object {
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** A list of InstanceGroupsScopedList resources. */
  var items: js.UndefOr[stdLib.Record[java.lang.String, InstanceGroupsScopedList]] = js.undefined
  /** [Output Only] The resource type, which is always compute#instanceGroupAggregatedList for aggregated lists of instance groups. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the
    * nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to
    * continue paging through the results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Informational warning message. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Code] = js.undefined
}

