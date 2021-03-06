package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReports extends js.Object {
  /** A list of unsampled reports. */
  var items: js.UndefOr[js.Array[UnsampledReport]] = js.undefined
  /**
    * The maximum number of resources the response can contain, regardless of the actual number of resources returned. Its value ranges from 1 to 1000 with a
    * value of 1000 by default, or otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[scala.Double] = js.undefined
  /** Collection type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Link to next page for this unsampled report collection. */
  var nextLink: js.UndefOr[java.lang.String] = js.undefined
  /** Link to previous page for this unsampled report collection. */
  var previousLink: js.UndefOr[java.lang.String] = js.undefined
  /** The starting index of the resources, which is 1 by default or otherwise specified by the start-index query parameter. */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /** The total number of results for the query, regardless of the number of resources in the result. */
  var totalResults: js.UndefOr[scala.Double] = js.undefined
  /** Email ID of the authenticated user */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

