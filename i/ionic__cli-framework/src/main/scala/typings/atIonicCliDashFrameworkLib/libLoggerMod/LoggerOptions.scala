package typings
package atIonicCliDashFrameworkLib.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  val handlers: js.UndefOr[
    nodeLib.Set[LoggerHandler] with lodashLib.lodashMod.Global.Set[LoggerHandler] with stdLib.Set[LoggerHandler]
  ] = js.undefined
  val level: js.UndefOr[LoggerLevelWeight] = js.undefined
}

