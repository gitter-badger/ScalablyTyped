package typings
package applicationinsightsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Start
  extends org.scalablytyped.runtime.Instantiable0[applicationinsightsLib.applicationinsightsMod.Configuration] {
  /**
    * Sets the state of console and logger tracking (enabled by default for third-party loggers only)
    * @param value if true logger activity will be sent to Application Insights
    * @param collectConsoleLog if true, logger autocollection will include console.log calls (default false)
    * @returns {Configuration} this class
    */
  def setAutoCollectConsole(value: scala.Boolean): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setAutoCollectConsole(value: scala.Boolean, collectConsoleLog: scala.Boolean): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Sets the state of dependency tracking (enabled by default)
    * @param value if true dependencies will be sent to Application Insights
    * @returns {Configuration} this class
    */
  def setAutoCollectDependencies(value: scala.Boolean): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Sets the state of exception tracking (enabled by default)
    * @param value if true uncaught exceptions will be sent to Application Insights
    * @returns {Configuration} this class
    */
  def setAutoCollectExceptions(value: scala.Boolean): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Sets the state of performance tracking (enabled by default)
    * @param value if true performance counters will be collected every second and sent to Application Insights
    * @returns {Configuration} this class
    */
  def setAutoCollectPerformance(value: scala.Boolean): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Sets the state of request tracking (enabled by default)
    * @param value if true requests will be sent to Application Insights
    * @returns {Configuration} this class
    */
  def setAutoCollectRequests(value: scala.Boolean): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Sets the state of automatic dependency correlation (enabled by default)
    * @param value if true dependencies will be correlated with requests
    * @returns {Configuration} this class
    */
  def setAutoDependencyCorrelation(value: scala.Boolean): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Enables debug and warning logging for AppInsights itself.
    * @param enableDebugLogging if true, enables debug logging
    * @param enableWarningLogging if true, enables warning logging
    * @returns {Configuration} this class
    */
  def setInternalLogging(): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setInternalLogging(enableDebugLogging: scala.Boolean): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setInternalLogging(enableDebugLogging: scala.Boolean, enableWarningLogging: scala.Boolean): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Enable or disable disk-backed retry caching to cache events when client is offline (enabled by default)
    * Note that this method only applies to the default client. Disk-backed retry caching is disabled by default for additional clients.
    * For enable for additional clients, use client.channel.setUseDiskRetryCaching(true).
    * These cached events are stored in your system or user's temporary directory and access restricted to your user when possible.
    * @param value if true events that occured while client is offline will be cached on disk
    * @param resendInterval The wait interval for resending cached events.
    * @param maxBytesOnDisk The maximum size (in bytes) that the created temporary directory for cache events can grow to, before caching is disabled.
    * @returns {Configuration} this class
    */
  def setUseDiskRetryCaching(value: scala.Boolean): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setUseDiskRetryCaching(value: scala.Boolean, resendInterval: scala.Double): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setUseDiskRetryCaching(value: scala.Boolean, resendInterval: scala.Double, maxBytesOnDisk: scala.Double): /* import warning: ImportType.apply Failed type conversion: typeof Configuration */ js.Any = js.native
}

