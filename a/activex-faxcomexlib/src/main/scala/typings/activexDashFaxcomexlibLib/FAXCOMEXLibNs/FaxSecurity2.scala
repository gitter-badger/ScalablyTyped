package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxSecurity2 Class */
@JSGlobal("FAXCOMEXLib.FaxSecurity2")
@js.native
class FaxSecurity2 protected () extends js.Object {
  /** Security descriptor */
  var Descriptor: js.Any = js.native
  var `FAXCOMEXLib.FaxSecurity2_typekey`: FaxSecurity2 = js.native
  /** Granted rights, a bit-wise combination */
  val GrantedRights: FAX_ACCESS_RIGHTS_ENUM_2 = js.native
  /** Security Information Type */
  var InformationType: scala.Double = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
}

