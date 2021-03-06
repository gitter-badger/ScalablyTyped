package typings
package blockingDashProxyLib.builtLibWebdriverUnderscoreLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/webdriver_logger", "WebDriverLogger")
@js.native
class WebDriverLogger () extends js.Object {
  val logName: java.lang.String = js.native
  var logStream: nodeLib.streamMod.Writable = js.native
  /**
    * Log an arbitrary event to the log file.
    *
    * @param msg The message to log.
    * @param sessionId The session id associated with the event.
    * @param elapsedMs How long the event took, in ms.
    */
  def logEvent(msg: java.lang.String, sessionId: java.lang.String, elapsedMs: scala.Double): scala.Unit = js.native
  /**
    * Logs a webdriver command to the log file.
    *
    * @param command The command to log.
    */
  def logWebDriverCommand(command: blockingDashProxyLib.builtLibWebdriverUnderscoreCommandsMod.WebDriverCommand): scala.Unit = js.native
  /* private */ def renderData(command: js.Any): js.Any = js.native
  /* private */ def renderResponse(command: js.Any): js.Any = js.native
  /**
    * Start logging to the specified directory. Will create a file named
    * 'webdriver_log_<process id>.txt'
    *
    * @param logDir The directory to create log files in.
    */
  def setLogDir(logDir: java.lang.String): scala.Unit = js.native
  /* private */ def timestamp(): js.Any = js.native
}

