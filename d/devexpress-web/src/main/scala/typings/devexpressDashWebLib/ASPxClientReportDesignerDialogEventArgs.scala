package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the events related to opening and saving reports in the Web Report Designer.
  */
trait ASPxClientReportDesignerDialogEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the report currently being processed.
    * Value: An object that specifies the report currently being processed.
    */
  var Report: js.Object
  /**
    * Specifies the URL of the report currently being processed.
    * Value: A string that specifies the URL of the report currently being processed.
    */
  var Url: java.lang.String
}

