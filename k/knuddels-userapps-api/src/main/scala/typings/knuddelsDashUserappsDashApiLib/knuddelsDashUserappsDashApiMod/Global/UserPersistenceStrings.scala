package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html
	 */
@JSGlobal("UserPersistenceStrings")
@js.native
class UserPersistenceStrings () extends js.Object

/**
	 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html
	 */
@JSGlobal("UserPersistenceStrings")
@js.native
object UserPersistenceStrings extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_deleteAll
  		 * @since AppServer 82478
  		 */
  def deleteAll(key: java.lang.String): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_exists
  		 * @since AppServer 88571
  		 */
  def exists(key: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def exists(key: java.lang.String, value: java.lang.String, ignoreCase: scala.Boolean): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_getAllKeys
  		 * @since AppServer 82483
  		 */
  def getAllKeys(): js.Array[java.lang.String] = js.native
  def getAllKeys(filterKey: java.lang.String): js.Array[java.lang.String] = js.native
}

