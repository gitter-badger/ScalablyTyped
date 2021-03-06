package typings
package atAngularFormsLib.srcModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractControlOptions extends js.Object {
  /**
    * @description
    * The list of async validators applied to control.
    */
  var asyncValidators: js.UndefOr[
    atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn | js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn] | scala.Null
  ] = js.undefined
  /**
    * @description
    * The event name for control to update upon.
    */
  var updateOn: js.UndefOr[
    atAngularFormsLib.atAngularFormsLibStrings.change | atAngularFormsLib.atAngularFormsLibStrings.blur | atAngularFormsLib.atAngularFormsLibStrings.submit
  ] = js.undefined
  /**
    * @description
    * The list of validators applied to a control.
    */
  var validators: js.UndefOr[
    atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn | js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn] | scala.Null
  ] = js.undefined
}

