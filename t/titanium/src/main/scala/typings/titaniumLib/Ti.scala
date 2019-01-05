package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ti")
@js.native
object Ti extends js.Object {
  /**
  	 * The top-level API module, containing methods to output messages to the system log.
  	 */
  val APINs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerAddEventListenerName = js.native
  /**
  	 * The top-level Accelerometer module, used to determine the device's physical position.
  	 */
  val AccelerometerNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerAddEventListener = js.native
  /**
  	 * Used for transmitting developer-defined Analytics events to the Appcelerator Analytics product.
  	 */
  val AnalyticsNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerLastEvent = js.native
  /**
  	 * The top-level Android module.
  	 */
  val AndroidNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerACTIONAIRPLANEMODECHANGED = js.native
  /**
  	 * The top-level App module is mainly used for accessing information about the
  	 * application at runtime, and for sending or listening for system events.
  	 */
  val AppNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerEVENTACCESSIBILITYANNOUNCEMENT = js.native
  /**
  	 * The Calendar module provides an API for accessing the native calendar functionality.
  	 */
  val CalendarNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerMETHODALERTMETHODDEFAULT = js.native
  /**
  	 * A module for translating between primitive types and raw byte streams.
  	 */
  val CodecNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerCHARSETASCII = js.native
  /**
  	 * The top-level Contacts module, used for accessing and modifying the system contacts address book.
  	 */
  val ContactsNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerCONTACTSKINDORGANIZATION = js.native
  /**
  	 * The top-level `Database` module, used for creating and accessing the
  	 * in-application SQLite database.
  	 */
  val DatabaseNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerFIELDTYPEDOUBLE = js.native
  /**
  	 * The top level filesystem module, used to access files and directories on the device.
  	 */
  val FilesystemNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerMODEAPPEND = js.native
  /**
  	 * The top level Geolocation module. The Geolocation module is used for accessing device location based information.
  	 */
  val GeolocationNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerACCURACYBEST = js.native
  /**
  	 * The Gesture module is responsible for high-level device gestures such as orientation changes
  	 * and shake gestures.
  	 */
  val GestureNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerPortrait = js.native
  /**
  	 * The top level Locale module.
  	 */
  val LocaleNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerCurrentCountry = js.native
  /**
  	 * The top-level Media module.
  	 */
  val MediaNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerAUDIOFILEFORMAT3GP2 = js.native
  /**
  	 * Base type for all Titanium modules.
  	 */
  val ModuleNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerAddEventListener = js.native
  /**
  	 * The top level network module.
  	 */
  val NetworkNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerINADDRANY = js.native
  /**
  	 * The top-level Platform module.  The Platform module is used to access the device's platform-related
  	 * functionality.
  	 */
  val PlatformNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerBATTERYSTATECHARGING = js.native
  /**
  	 * Stream module containing stream utility methods.
  	 */
  val StreamNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerMODEREAD = js.native
  /**
  	 * The main <Titanium.UI> module.
  	 */
  val UINs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerANIMATIONCURVEEASEIN = js.native
  /**
  	 * The top-level Utils module, containing a set of JavaScript methods that are often useful when
  	 * building applications.
  	 */
  val UtilsNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerAddEventListenerNameCallbackParam0RemoveEventListener = js.native
  /**
  	 * Used to enable data and file transfers between a watchOS and iOS application.
  	 */
  val WatchSessionNs: titaniumLib.Anon_BubbleParentApiNameActivationState = js.native
  /**
  	 * The top level XML module.  The XML module is used for parsing and processing XML-based content.
  	 */
  val XMLNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerAddEventListenerNameCallbackParam0RemoveEventListenerFireEvent = js.native
  /**
  	 * The top level Yahoo module.  The Yahoo module is used for accessing Yahoo related API services.
  	 */
  val YahooNs: titaniumLib.Anon_BubbleParentApiNameLifecycleContainerAddEventListenerNameCallbackParam0RemoveEventListenerFireEventEvent = js.native
  /**
  	 * The name of the API that this proxy corresponds to.
  	 */
  val apiName: java.lang.String = js.native
  /**
  	 * Indicates if the proxy will bubble an event to its parent.
  	 */
  var bubbleParent: scala.Boolean = js.native
  /**
  	 * Date of the Titanium build.
  	 */
  val buildDate: java.lang.String = js.native
  /**
  	 * Git hash of the Titanium build.
  	 */
  val buildHash: java.lang.String = js.native
  /**
  	 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  	 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  	 * User-agent string used by Titanium.
  	 */
  var userAgent: java.lang.String = js.native
  /**
  	 * Version of Titanium that is executing.
  	 */
  val version: java.lang.String = js.native
  /**
  	 * Adds the specified callback as an event listener for the named event.
  	 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  	 * Applies the properties to the proxy.
  	 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  	 * Creates a new buffer based on the params.
  	 */
  def createBuffer(params: titaniumLib.CreateBufferArgs): titaniumLib.TitaniumNs.Buffer = js.native
  /**
  	 * Creates and returns an instance of <Titanium.Proxy>.
  	 */
  def createProxy(): titaniumLib.TitaniumNs.Proxy = js.native
  def createProxy(parameters: js.Any): titaniumLib.TitaniumNs.Proxy = js.native
  /**
  	 * Fires a synthesized event to any registered listeners.
  	 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  	 * Gets the value of the <Titanium.apiName> property.
  	 */
  def getApiName(): java.lang.String = js.native
  /**
  	 * Gets the value of the <Titanium.bubbleParent> property.
  	 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  	 * Gets the value of the <Titanium.buildDate> property.
  	 */
  def getBuildDate(): java.lang.String = js.native
  /**
  	 * Gets the value of the <Titanium.buildHash> property.
  	 */
  def getBuildHash(): java.lang.String = js.native
  /**
  	 * Gets the value of the <Titanium.lifecycleContainer> property.
  	 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  	 * Gets the value of the <Titanium.userAgent> property.
  	 */
  def getUserAgent(): java.lang.String = js.native
  /**
  	 * Gets the value of the <Titanium.version> property.
  	 */
  def getVersion(): java.lang.String = js.native
  /**
  	 * Removes the specified callback as an event listener for the named event.
  	 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  	 * Sets the value of the <Titanium.bubbleParent> property.
  	 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets the value of the <Titanium.lifecycleContainer> property.
  	 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  	 * Sets the value of the <Titanium.lifecycleContainer> property.
  	 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  	 * Sets the value of the <Titanium.userAgent> property.
  	 */
  def setUserAgent(userAgent: java.lang.String): scala.Unit = js.native
}

