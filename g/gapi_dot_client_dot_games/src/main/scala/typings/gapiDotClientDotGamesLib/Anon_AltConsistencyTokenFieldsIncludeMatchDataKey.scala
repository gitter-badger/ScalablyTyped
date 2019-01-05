package typings
package gapiDotClientDotGamesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltConsistencyTokenFieldsIncludeMatchDataKey extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The last-seen mutation timestamp. */
  var consistencyToken: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * True if match data should be returned in the response. Note that not all data will necessarily be returned if include_match_data is true; the server
    * may decide to only return data for some of the matches to limit download size for the client. The remainder of the data for these matches will be
    * retrievable on request.
    */
  var includeMatchData: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The preferred language to use for strings returned by this method. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of completed or canceled matches to return in the response. If not set, all matches returned could be completed or canceled. */
  var maxCompletedMatches: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of matches to return in the response, used for paging. For any response, the actual number of matches to return may be less than the
    * specified maxResults.
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The token returned by the previous request. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

