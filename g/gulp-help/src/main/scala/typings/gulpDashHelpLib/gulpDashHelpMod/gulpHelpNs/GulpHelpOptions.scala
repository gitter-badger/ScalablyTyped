package typings
package gulpDashHelpLib.gulpDashHelpMod.gulpHelpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GulpHelpOptions extends js.Object {
  /**
    * A function to run after the default help task runs
    */
  var afterPrintCallback: js.UndefOr[js.Function] = js.undefined
  /**
    * Adds aliases to the default help task
    */
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Modifies the default help message
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Hide all task dependencies
    */
  var hideDepsMessage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Hide all tasks with no help message defined. Useful when including 3rd party tasks
    */
  var hideEmpty: js.UndefOr[scala.Boolean] = js.undefined
}

