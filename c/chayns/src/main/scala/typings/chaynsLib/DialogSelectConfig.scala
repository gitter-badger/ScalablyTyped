package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.dialog.select()
trait DialogSelectConfig extends js.Object {
  var buttons: js.UndefOr[js.Array[_]] = js.undefined
  		// TODO interface for buttons
  var list: js.Array[DialogSelectConfigItem]
  var message: js.UndefOr[java.lang.String] = js.undefined
  var multiselect: js.UndefOr[scala.Boolean] = js.undefined
  var quickfind: js.UndefOr[scala.Boolean] = js.undefined
  var title: java.lang.String
}

