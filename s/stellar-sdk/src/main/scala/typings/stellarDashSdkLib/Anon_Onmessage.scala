package typings
package stellarDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Onmessage[T /* <: stellarDashSdkLib.stellarDashSdkMod.ServerNs.Record */] extends js.Object {
  var onerror: js.UndefOr[js.Function1[/* error */ nodeLib.Error with stdLib.Error, scala.Unit]] = js.undefined
  var onmessage: js.UndefOr[js.Function1[/* record */ T, scala.Unit]] = js.undefined
}

