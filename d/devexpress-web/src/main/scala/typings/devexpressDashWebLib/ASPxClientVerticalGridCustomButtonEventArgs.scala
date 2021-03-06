package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomButtonClick event.
  */
trait ASPxClientVerticalGridCustomButtonEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the value which identifies the custom button.
    * Value: A string value that identifies the clicked custom button.
    */
  var buttonID: java.lang.String
  /**
    * Gets the value which identifies the record whose custom button has been clicked.
    * Value: An integer value that identifies the record whose custom button has been clicked.
    */
  var visibleIndex: scala.Double
}

