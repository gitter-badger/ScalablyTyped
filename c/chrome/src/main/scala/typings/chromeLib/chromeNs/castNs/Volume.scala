package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.Volume")
@js.native
/**
  * @param {?number=} opt_level
  * @param {?boolean=} opt_muted
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Volume
  */
class Volume () extends js.Object {
  def this(level: scala.Double) = this()
  def this(level: scala.Double, muted: scala.Boolean) = this()
  var level: js.UndefOr[scala.Double] = js.native
  var muted: js.UndefOr[scala.Boolean] = js.native
}

