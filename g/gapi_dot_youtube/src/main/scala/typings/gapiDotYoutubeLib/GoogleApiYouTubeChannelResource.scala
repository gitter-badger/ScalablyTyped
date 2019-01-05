package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeChannelResource extends js.Object {
  /**
    * The brandingSettings object encapsulates information about the branding of the channel.
    */
  var brandingSettings: Anon_Channel
  /**
    * The contentDetails object encapsulates information about the channels content.
    */
  var contentDetails: Anon_RelatedPlaylists
  /**
    * The ETag for the channel resource.
    */
  var etag: java.lang.String
  /**
    * The ID that YouTube uses to uniquely identify the channel.
    */
  var id: java.lang.String
  /**
    * The invideoPromotion object encapsulates information about a promotional campaign associated with the channel. A channel can use an in-video promotional campaign to display the thumbnail image of a promoted video in the video player during playback of the channels videos
    */
  var invideoPromotion: Anon_Timing
  /**
    * The type of the API resource. For channel resources, the value will be youtube#channel.
    */
  var kind: java.lang.String
  /**
    * The snippet object contains basic details about the channel, such as its title, description, and thumbnail images.
    */
  var snippet: Anon_Title
  /**
    * The statistics object encapsulates statistics for the channel.
    */
  var statistics: Anon_ViewCount
  /**
    * The status object encapsulates information about the privacy status of the channel.
    */
  var status: Anon_PrivacyStatus
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the channel.
    */
  var topicDetails: Anon_TopicIds
}

