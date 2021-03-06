package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FileUploaded event.
  */
trait ASPxClientFileManagerFileUploadedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the uploaded file.
    * Value: A string value that specifies the file name.
    */
  var fileName: java.lang.String
  /**
    * Gets the path to the folder where a file is uploaded.
    * Value: A string value specifying the uploaded file path.
    */
  var folder: java.lang.String
}

