package typings
package gapiDotClientDotBigquerydatatransferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XgafvAccesstokenAltAuthorizationCodeBearertoken extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional OAuth2 authorization code to use with this transfer configuration.
    * If it is provided, the transfer configuration will be associated with the
    * gaia id of the authorizing user.
    * In order to obtain authorization_code, please make a
    * request to
    * https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?client_id=<datatransferapiclientid>&scope=<data_source_scopes>&redirect_uri=<redirect_uri>
    *
    * &#42; client_id should be OAuth client_id of BigQuery DTS API for the given
    * data source returned by ListDataSources method.
    * &#42; data_source_scopes are the scopes returned by ListDataSources method.
    * &#42; redirect_uri is an optional parameter. If not specified, then
    * authorization code is posted to the opener of authorization flow window.
    * Otherwise it will be sent to the redirect uri. A special value of
    * urn:ietf:wg:oauth:2.0:oob means that authorization code should be
    * returned in the title bar of the browser, with the page text prompting
    * the user to copy the code and paste it in the application.
    */
  var authorizationCode: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The resource name of the transfer config.
    * Transfer config names have the form
    * `projects/{project_id}/transferConfigs/{config_id}`.
    * Where `config_id` is usually a uuid, even though it is not
    * guaranteed or required. The name is ignored when creating a transfer
    * config.
    */
  var name: java.lang.String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Required list of fields to be updated in this request. */
  var updateMask: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

