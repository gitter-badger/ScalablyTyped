package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spend extends js.Object {
  /**
    * The cost or usage amount that is associated with a budget forecast, actual spend, or budget threshold.
    */
  var Amount: NumericValue
  /**
    * The unit of measurement that is used for the budget forecast, actual spend, or budget threshold, such as dollars or GB.
    */
  var Unit: UnitValue
}

