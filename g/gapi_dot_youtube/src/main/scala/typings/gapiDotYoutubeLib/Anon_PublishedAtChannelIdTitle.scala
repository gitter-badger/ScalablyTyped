package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PublishedAtChannelIdTitle extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the channel that published the playlist.
    */
  var channelId: java.lang.String
  /**
    * The channel title of the channel that the video belongs to.
    */
  var channelTitle: java.lang.String
  /**
    * The playlists description.
    */
  var description: java.lang.String
  /**
    * The date and time that the playlist was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: java.lang.String
  /**
    * Keyword tags associated with the playlist.
    */
  var tags: js.Array[java.lang.String]
  /**
    * A map of thumbnail images associated with the playlist. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The playlists title.
    */
  var title: java.lang.String
}

