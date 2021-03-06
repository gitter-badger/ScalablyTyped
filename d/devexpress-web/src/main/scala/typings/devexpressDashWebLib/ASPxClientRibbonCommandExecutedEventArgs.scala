package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CommandExecuted event.
  */
trait ASPxClientRibbonCommandExecutedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets an item object related to the event.
    * Value: An <see cref="ASPxClientRibbonItem" /> object, manipulations on which forced the event to be raised.
    */
  var item: ASPxClientRibbonItem
  /**
    * Gets an optional parameter that complements the processed command.
    * Value: A string value containing additional information about the processed command.
    */
  var parameter: java.lang.String
}

