package typings
package apnLib.apnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseFailure extends js.Object {
  var device: java.lang.String
  var error: js.UndefOr[nodeLib.Error with stdLib.Error] = js.undefined
  var response: js.UndefOr[apnLib.Anon_Reason] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

