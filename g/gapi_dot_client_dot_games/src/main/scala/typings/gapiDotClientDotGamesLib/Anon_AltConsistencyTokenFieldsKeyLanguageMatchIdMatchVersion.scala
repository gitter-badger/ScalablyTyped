package typings
package gapiDotClientDotGamesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltConsistencyTokenFieldsKeyLanguageMatchIdMatchVersion extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The last-seen mutation timestamp. */
  var consistencyToken: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The preferred language to use for strings returned by this method. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the match. */
  var matchId: java.lang.String
  /** The version of the match being updated. */
  var matchVersion: scala.Double
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of another participant who should take their turn next. If not set, the match will wait for other player(s) to join via automatching; this is
    * only valid if automatch criteria is set on the match with remaining slots for automatched players.
    */
  var pendingParticipantId: js.UndefOr[java.lang.String] = js.undefined
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

