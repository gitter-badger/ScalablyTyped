package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparkPostError
  extends stdLib.Error {
  var errors: js.Array[ErrorWithDescription] | js.Array[ErrorWithParam]
  @JSName("name")
  var name_SparkPostError: sparkpostLib.sparkpostLibStrings.SparkPostError
  var statusCode: scala.Double
}

