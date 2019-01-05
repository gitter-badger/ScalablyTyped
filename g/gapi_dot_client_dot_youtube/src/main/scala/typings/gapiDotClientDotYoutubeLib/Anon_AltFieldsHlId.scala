package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsHlId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The hl parameter specifies the language that should be used for text values in the API response. */
  var hl: js.UndefOr[java.lang.String] = js.undefined
  /** The id parameter specifies a comma-separated list of video category IDs for the resources that you are retrieving. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The part parameter specifies the videoCategory resource properties that the API response will include. Set the parameter value to snippet. */
  var part: java.lang.String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The regionCode parameter instructs the API to return the list of video categories available in the specified country. The parameter value is an ISO
    * 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

