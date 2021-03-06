package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandManagerCommands extends js.Object {
  /** A method that defines whether the command is executable at the moment or not.
    */
  var canExecute: js.UndefOr[js.Any] = js.undefined
  /** A method that defines what to be executed when the key combination is recognized.
    */
  var execute: js.UndefOr[js.Any] = js.undefined
  /** Defines a combination of keys and key modifiers, on recognition of which the command will be executed
    */
  var gesture: js.UndefOr[CommandManagerCommandsGesture] = js.undefined
  /** Defines any additional parameters that are required at runtime
    * @Default {null}
    */
  var parameter: js.UndefOr[js.Any] = js.undefined
}

