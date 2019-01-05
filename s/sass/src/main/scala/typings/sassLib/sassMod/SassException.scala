package typings
package sassLib.sassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SassException
  extends stdLib.Error {
  /**
    * The column number of error.
    */
  var column: scala.Double
  /**
    * The filename of error.
    *
    * In case file option was not set (in favour of `data`), this will reflect the value `stdin`.
    */
  var file: java.lang.String
  /**
    * The formatted error.
    */
  var formatted: java.lang.String
  /**
    * The line number of error.
    */
  var line: scala.Double
  /**
    * The status code.
    */
  var status: scala.Double
}

