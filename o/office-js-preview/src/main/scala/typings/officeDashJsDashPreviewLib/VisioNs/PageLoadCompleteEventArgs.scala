package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the page that raised the PageLoadComplete event.
  *
  * [Api set:  1.1]
  */
trait PageLoadCompleteEventArgs extends js.Object {
  /**
    *
    * Gets the name of the page that raised the PageLoad event.
    *
    * [Api set:  1.1]
    */
  var pageName: java.lang.String
  /**
    *
    * Gets the success or failure of the PageLoadComplete event.
    *
    * [Api set:  1.1]
    */
  var success: scala.Boolean
}

