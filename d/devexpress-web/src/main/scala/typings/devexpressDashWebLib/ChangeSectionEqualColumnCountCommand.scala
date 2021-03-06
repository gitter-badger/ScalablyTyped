package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the number of section columns having the same width.
  */
trait ChangeSectionEqualColumnCountCommand extends CommandBase {
  /**
    * Executes the ChangeSectionEqualColumnCountCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param columnCount An interger number specifying the number of section columns having the same width.
    */
  def execute(columnCount: scala.Double): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

