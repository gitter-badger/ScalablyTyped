package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAnalyticsResponse extends js.Object {
  /**
    * The list of analytics.
    * Sorted in ascending order of
    * Analytics.event_date.
    */
  var analytics: js.UndefOr[js.Array[Analytics]] = js.undefined
  /**
    * Aggregated information across the response's
    * analytics.
    */
  var analyticsSummary: js.UndefOr[AnalyticsSummary] = js.undefined
  /**
    * A token to retrieve next page of results.
    * Pass this value in the `ListAnalyticsRequest.page_token` field in the
    * subsequent call to
    * ListAnalytics to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
}

