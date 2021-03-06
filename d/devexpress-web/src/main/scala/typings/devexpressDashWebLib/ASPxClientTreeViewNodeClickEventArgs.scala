package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the NodeClick event.
  */
trait ASPxClientTreeViewNodeClickEventArgs extends ASPxClientTreeViewNodeProcessingModeEventArgs {
  /**
    * Gets the HTML object that contains the processed node.
    * Value: An object representing a container for the node related to the event.
    */
  var htmlElement: js.Object
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: An object that maintains DHTML event-specific information.
    */
  var htmlEvent: js.Object
}

