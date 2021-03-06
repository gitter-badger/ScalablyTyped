package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxDevices Class */
@js.native
trait FaxDevices extends js.Object {
  val Count: scala.Double = js.native
  def apply(vIndex: js.Any): FaxDevice = js.native
  def Item(vIndex: js.Any): FaxDevice = js.native
  /** Get device by its ID */
  def ItemById(lId: scala.Double): FaxDevice = js.native
}

