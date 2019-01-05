package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetAll extends js.Object {
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: chromeDashAppsLib.chromeNs.commandsNs.CommandEvent
  /**
    * Returns all the registered commands for this app and their shortcut (if active).
    * @param callback Called to return the registered commands.
    */
  def getAll(
    callback: js.Function1[/* commands */ js.Array[chromeDashAppsLib.chromeNs.commandsNs.Command], scala.Unit]
  ): scala.Unit
}

