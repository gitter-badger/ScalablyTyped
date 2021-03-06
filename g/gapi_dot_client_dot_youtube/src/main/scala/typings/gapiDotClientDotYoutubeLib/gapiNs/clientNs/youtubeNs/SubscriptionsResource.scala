package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Deletes a subscription. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a subscription for the authenticated user's channel. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Returns subscription resources that match the API request criteria. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltChannelIdFieldsForChannelId): gapiDotClientLib.gapiNs.clientNs.Request[SubscriptionListResponse]
}

