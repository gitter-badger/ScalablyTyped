package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Some properties are also expression containers (ExpressionContainers).
  * Expression containers can handle both normal strings and expressions.
  *
  * - StringExpressionContainer
  */
trait IStringExpressionContainer extends js.Object {
  /**
    * Expression for Example (Non-calculated string expression container):
    *
    * myTable.Properties.Title = "My Table Title";
    *
    * Result is:  stringValue = myTable.Title;
    */
  var qStringExpression: java.lang.String
}

