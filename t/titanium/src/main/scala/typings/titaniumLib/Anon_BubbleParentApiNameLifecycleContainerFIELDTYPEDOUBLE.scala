package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BubbleParentApiNameLifecycleContainerFIELDTYPEDOUBLE extends js.Object {
  /**
  		 * Constant for requesting a column's value returned in double form.
  		 */
  val FIELD_TYPE_DOUBLE: scala.Double = js.native
  /**
  		 * Constant for requesting a column's value returned in float form.
  		 */
  val FIELD_TYPE_FLOAT: scala.Double = js.native
  /**
  		 * Constant for requesting a column's value returned in integer form.
  		 */
  val FIELD_TYPE_INT: scala.Double = js.native
  /**
  		 * Constant for requesting a column's value returned in string form.
  		 */
  val FIELD_TYPE_STRING: scala.Double = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
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
  		 * Gets the value of the <Titanium.Database.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Database.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Database.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Installs an SQLite database to device's internal storage.
  		 */
  def install(path: java.lang.String, dbName: java.lang.String): titaniumLib.TitaniumNs.DatabaseNs.DB = js.native
  /**
  		 * Opens an SQLite database.
  		 */
  def open(dbName: java.lang.String): titaniumLib.TitaniumNs.DatabaseNs.DB = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Database.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Database.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Database.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
}

