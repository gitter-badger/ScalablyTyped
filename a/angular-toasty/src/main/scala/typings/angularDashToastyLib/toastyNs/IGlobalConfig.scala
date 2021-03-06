package typings
package angularDashToastyLib.toastyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobalConfig extends js.Object {
  /**
    * Whether clicking the toast closes it.
    */
  var clickToClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether HTML is allowed in toast.
    */
  var html: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum number of toasts to show at once.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The toast's message.
    */
  var msg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The window position where the toast pops up.
    *
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to shake the toast.
    */
  var shake: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show the 'X' icon to close the toast.
    */
  var showClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to play a sound when a toast is added.
    */
  var sound: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * What theme to use.
    * - 'default'
    * - 'material'
    * - 'bootstrap'
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How long (in miliseconds) the toast shows before it's removed. Set to false to disable.
    */
  var timeout: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * The toast's title.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

