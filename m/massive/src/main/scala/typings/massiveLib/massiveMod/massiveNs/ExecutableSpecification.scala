package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutableSpecification extends js.Object {
  /** A Database. */
  var db: Database
  /** True to enable single row/value results processing. */
  var enhancedFunctions: scala.Boolean
  /** Whether a database function accepts variable-length argument lists as the last parameter. */
  var isVariadic: scala.Boolean
  /** The table or view's name. */
  var name: java.lang.String
  /** Number of parameters the executable expects. */
  var paramCount: scala.Double
  /** The name of the schema owning the table or */
  var schema: java.lang.String
  /** If true, return the first result row as an object (with enhancedFunctions). */
  var singleRow: scala.Boolean
  /** If true, return results as a primitive or primitives (with enhancedFunctions). */
  var singleValue: scala.Boolean
  /** A function invocation statement or a pg-promise QueryFile. */
  var sql: js.Any
}

