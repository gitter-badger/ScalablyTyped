package typings
package ldclientDashJsLib.ldclientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDEvaluationDetail extends js.Object {
  /**
    * An object describing the main factor that influenced the flag evaluation value.
    * This will be null if you did not specify "explanationReasons: true" in your configuration.
    */
  var reason: LDEvaluationReason
  /**
    * The result of the flag evaluation. This will be either one of the flag's variations or
    * the default value that was passed to variationDetail().
    */
  var value: LDFlagValue
  /**
    * The index of the returned value within the flag's list of variations, e.g. 0 for the
    * first variation - or null if the default value was returned.
    */
  var variationIndex: js.UndefOr[scala.Double] = js.undefined
}

