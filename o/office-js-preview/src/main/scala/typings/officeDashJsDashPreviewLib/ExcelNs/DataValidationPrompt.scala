package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the user prompt properties for the data validation.
  *
  * [Api set: ExcelApi 1.8]
  */
trait DataValidationPrompt extends js.Object {
  /**
    *
    * Represents the message of the prompt.
    *
    * [Api set: ExcelApi 1.8]
    */
  var message: java.lang.String
  /**
    *
    * It determines showing the prompt or not when user selects a cell with the data validation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showPrompt: scala.Boolean
  /**
    *
    * Represents the title for the prompt.
    *
    * [Api set: ExcelApi 1.8]
    */
  var title: java.lang.String
}

