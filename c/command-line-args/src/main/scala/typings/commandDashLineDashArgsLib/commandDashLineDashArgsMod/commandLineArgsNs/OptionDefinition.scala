package typings
package commandDashLineDashArgsLib.commandDashLineDashArgsMod.commandLineArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionDefinition extends js.Object {
  /**
    * A getopt-style short option name. Can be any single character except a digit or hyphen.
    */
  var alias: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Any values unaccounted for by an option definition will be set on the `defaultOption`. This flag is typically set
    * on the most commonly-used option to enable more concise usage.
    */
  var defaultOption: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An initial value for the option.
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /**
    * One or more group names the option belongs to.
    */
  var group: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Identical to `multiple` but with greedy parsing disabled.
    */
  var lazyMultiple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set this flag if the option accepts multiple values. In the output, you will receive an array of values each passed through the `type` function.
    */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The long option name.
    */
  var name: java.lang.String
  /**
    * A setter function (you receive the output from this) enabling you to be specific about the type and value received. Typical values
    * are `String` (the default), `Number` and `Boolean` but you can use a custom function. If no option value was set you will receive `null`.
    */
  var `type`: js.UndefOr[js.Function1[/* input */ java.lang.String, _]] = js.undefined
}

