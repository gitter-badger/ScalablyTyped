package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a view selector item. This object contains data that identifies a view. Use this as a parameter to
  * the ViewSelector.setCurrentView method.
  */
trait ViewSelectorItem extends js.Object {
  /**
    * Returns a LookupValue that references this view.
    * @returns The entity reference.
    */
  def getEntityReference(): xrmLib.XrmNs.LookupValue
}

