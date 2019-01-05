package typings
package atIonicCliDashFrameworkLib.cliDashFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "Logger")
@js.native
class Logger ()
  extends atIonicCliDashFrameworkLib.libMod.Logger {
  def this(hasLevelHandlers: atIonicCliDashFrameworkLib.libLoggerMod.LoggerOptions) = this()
}

@JSImport("@ionic/cli-framework", "Logger")
@js.native
object Logger extends js.Object {
  def cloneHandlers(
    handlers: nodeLib.ReadonlySet[atIonicCliDashFrameworkLib.libLoggerMod.LoggerHandler] with stdLib.ReadonlySet[atIonicCliDashFrameworkLib.libLoggerMod.LoggerHandler]
  ): nodeLib.Set[atIonicCliDashFrameworkLib.libLoggerMod.LoggerHandler] with lodashLib.lodashMod.Global.Set[atIonicCliDashFrameworkLib.libLoggerMod.LoggerHandler] with stdLib.Set[atIonicCliDashFrameworkLib.libLoggerMod.LoggerHandler] = js.native
}

