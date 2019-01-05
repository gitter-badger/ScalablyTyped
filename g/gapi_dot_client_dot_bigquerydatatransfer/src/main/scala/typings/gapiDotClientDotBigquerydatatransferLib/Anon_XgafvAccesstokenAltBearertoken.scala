package typings
package gapiDotClientDotBigquerydatatransferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XgafvAccesstokenAltBearertoken extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Page size. The default page size is the maximum value of 1000 results. */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Pagination token, which can be used to request a specific page
    * of `ListTransferRunsRequest` list results. For multiple-page
    * results, `ListTransferRunsResponse` outputs
    * a `next_page` token, which can be used as the
    * `page_token` value to request the next page of list results.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of transfer configuration for which transfer runs should be retrieved.
    * Format of transfer configuration resource name is:
    * `projects/{project_id}/transferConfigs/{config_id}`.
    */
  var parent: java.lang.String
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates how run attempts are to be pulled. */
  var runAttempt: js.UndefOr[java.lang.String] = js.undefined
  /** When specified, only transfer runs with requested states are returned. */
  var states: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

