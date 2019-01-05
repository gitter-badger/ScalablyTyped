package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PublishedAtChannelTitle extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the subscribers channel. The resource_id object identifies the channel that the user subscribed to.
    */
  var channelId: java.lang.String
  /**
    * The title of the channel that the subscription belongs to.
    */
  var channelTitle: java.lang.String
  /**
    * The subscriptions details.
    */
  var description: java.lang.String
  /**
    * The date and time that the subscription was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: java.lang.String
  /**
    * The id object contains information about the channel that the user subscribed to.
    */
  var resourceId: Anon_KindChannelId
  /**
    * A map of thumbnail images associated with the subscription. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The subscriptions title.
    */
  var title: java.lang.String
}

