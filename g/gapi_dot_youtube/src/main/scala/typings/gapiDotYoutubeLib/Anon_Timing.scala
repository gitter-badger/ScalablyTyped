package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Timing extends js.Object {
  /**
    * The list of promoted items in the order that they will display across different playbacks to the same viewer.
    */
  var items: js.Array[Anon_TypeVideoId]
  /**
    * The position object encapsulates information about the spatial position within the video where the promoted item will be displayed.
    */
  var position: Anon_TypeCornerPosition
  /**
    * The timing object encapsulates information about the temporal position within the video when the promoted item will be displayed.
    */
  var timing: Anon_TypeOffsetMs
}

