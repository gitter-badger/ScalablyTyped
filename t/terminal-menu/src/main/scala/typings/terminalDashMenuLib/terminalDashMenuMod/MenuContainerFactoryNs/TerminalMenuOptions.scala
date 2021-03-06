package typings
package terminalDashMenuLib.terminalDashMenuMod.MenuContainerFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalMenuOptions extends js.Object {
  /**
    * Background color for the menu.
    * Default = 'blue'
    */
  var bg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Foreground color for the menu.
    * Default = 'white'
    */
  var fg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Padding for the bounding rectangle.
    * If a number is passed, all elements of the Thickness structure will be set to
    * that value.
    * Default = {
    *      left: 2,
    *      right: 2,
    *      top: 1,
    *      bottom: 1
    * }
    */
  var padding: js.UndefOr[scala.Double | Thickness] = js.undefined
  /**
    * Index of the menu item to be selected.
    * Default = 0
    */
  var selected: js.UndefOr[scala.Double] = js.undefined
  /**
    * Menu width in columns.
    * Default = 50.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Horizontal offset for top-left corner.
    * Default = 1
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * Vertical offset for top-left corner.
    * Default = 1
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

