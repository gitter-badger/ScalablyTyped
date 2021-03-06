package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeTouchEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var altKey: scala.Boolean
  var changedTouches: TouchList
  var ctrlKey: scala.Boolean
  var metaKey: scala.Boolean
  var shiftKey: scala.Boolean
  var targetTouches: TouchList
  var touches: TouchList
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: java.lang.String): scala.Boolean
}

