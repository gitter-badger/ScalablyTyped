package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityAdWordsLinks extends js.Object {
  /** A list of entity AdWords links. */
  var items: js.UndefOr[js.Array[EntityAdWordsLink]] = js.undefined
  /**
    * The maximum number of entries the response can contain, regardless of the actual number of entries returned. Its value ranges from 1 to 1000 with a
    * value of 1000 by default, or otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[scala.Double] = js.undefined
  /** Collection type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Next link for this AdWords link collection. */
  var nextLink: js.UndefOr[java.lang.String] = js.undefined
  /** Previous link for this AdWords link collection. */
  var previousLink: js.UndefOr[java.lang.String] = js.undefined
  /** The starting index of the entries, which is 1 by default or otherwise specified by the start-index query parameter. */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /** The total number of results for the query, regardless of the number of results in the response. */
  var totalResults: js.UndefOr[scala.Double] = js.undefined
}

