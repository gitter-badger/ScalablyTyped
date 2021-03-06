package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalElement extends js.Object {
  /**
    * Hide the modal
    */
  def hide(): scala.Unit
  /**
    * Return if the modal is active on the page
    * @return True if the modal is current active on the page, false otherwise
    */
  def isActive(): scala.Boolean
  /**
    * Show the modal
    */
  def show(): scala.Unit
}

