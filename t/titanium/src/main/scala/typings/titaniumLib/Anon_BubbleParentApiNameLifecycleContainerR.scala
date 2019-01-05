package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BubbleParentApiNameLifecycleContainerR extends js.Object {
  /**
  			 * The `R` namespace for application resources.
  			 */
  val R: titaniumLib.TitaniumNs.AppNs.AndroidNs.R = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: java.lang.String = js.native
  /**
  			 * The version number of the application.
  			 */
  val appVersionCode: scala.Double = js.native
  /**
  			 * The version name of the application.
  			 */
  val appVersionName: java.lang.String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: scala.Boolean = js.native
  /**
  			 * Return the intent that was used to launch the application.
  			 */
  val launchIntent: titaniumLib.TitaniumNs.AndroidNs.Intent = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.apiName> property.
  			 */
  def getApiName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.appVersionCode> property.
  			 */
  def getAppVersionCode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.appVersionName> property.
  			 */
  def getAppVersionName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.bubbleParent> property.
  			 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.launchIntent> property.
  			 */
  def getLaunchIntent(): titaniumLib.TitaniumNs.AndroidNs.Intent = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Android.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
}

