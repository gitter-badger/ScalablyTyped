package typings
package joiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  /**
    * Creates a joi error object.
    * Used in conjunction with custom rules.
    * @param type - the type of rule to create the error for.
    * @param context - provide properties that will be available in the `language` templates.
    * @param state - should the context passed into the `validate` function in a custom rule
    * @param options - should the context passed into the `validate` function in a custom rule
    */
  def createError(
    `type`: java.lang.String,
    context: joiLib.joiMod.Context,
    state: joiLib.joiMod.State,
    options: joiLib.joiMod.ValidationOptions
  ): joiLib.joiMod.Err
}

