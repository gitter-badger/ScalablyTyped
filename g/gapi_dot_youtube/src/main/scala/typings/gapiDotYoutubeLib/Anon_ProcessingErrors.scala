package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProcessingErrors extends js.Object {
  /**
    * A list of video editing operations that might improve the video quality or playback experience of the uploaded video.
    */
  var editorSuggestions: js.Array[java.lang.String]
  /**
    * A list of errors that will prevent YouTube from successfully processing the uploaded video. These errors indicate that, regardless of the videos current processing status, eventually, that status will almost certainly be failed.
    */
  var processingErrors: js.Array[java.lang.String]
  /**
    * A list of suggestions that may improve YouTubes ability to process the video.
    */
  var processingHints: js.Array[java.lang.String]
  /**
    * A list of reasons why YouTube may have difficulty transcoding the uploaded video or that might result in an erroneous transcoding. These warnings are generated before YouTube actually processes the uploaded video file. In addition, they identify issues that do not necessarily indicate that video processing will fail but that still might cause problems such as sync issues, video artifacts, or a missing audio track.
    */
  var processingWarnings: js.Array[java.lang.String]
  /**
    * A list of keyword tags that could be added to the videos metadata to increase the likelihood that users will locate your video when searching or browsing on YouTube.
    */
  var tagSuggestions: js.Array[Anon_Tag]
}

