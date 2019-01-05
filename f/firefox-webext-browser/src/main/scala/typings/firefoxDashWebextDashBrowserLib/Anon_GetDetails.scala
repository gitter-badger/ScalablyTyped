package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetDetails extends js.Object {
  /* cookies events */
  /**
    * Fired when a cookie is set or removed. As a special case, note that updating a cookie's properties is
    * implemented as a two step process: the cookie to be updated is first removed entirely, generating a notification
    * with "cause" of "overwrite" . Afterwards, a new cookie is written with the updated values, generating a second
    * notification with "cause" "explicit".
    */
  val onChanged: WebExtEvent[js.Function1[/* changeInfo */ Anon_Removed, scala.Unit]]
  /* cookies functions */
  /**
    * Retrieves information about a single cookie. If more than one cookie of the same name exists for the given URL,
    * the one with the longest path will be returned. For cookies with the same path length, the cookie with the
    * earliest creation time will be returned.
    * @param details Details to identify the cookie being retrieved.
    */
  def get(details: Anon_Url): js.Promise[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.Cookie]
  /**
    * Retrieves all cookies from a single cookie store that match the given information. The cookies returned will be
    * sorted, with those with the longest path first. If multiple cookies have the same path length, those with the
    * earliest creation time will be first.
    * @param details Information to filter the cookies being retrieved.
    */
  def getAll(details: Anon_UrlName): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.Cookie]]
  /** Lists all existing cookie stores. */
  def getAllCookieStores(): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.CookieStore]]
  /**
    * Deletes a cookie by name.
    * @param details Information to identify the cookie to remove.
    */
  def remove(details: Anon_Url): js.Promise[js.UndefOr[Anon_UrlNameStoreId]]
  /**
    * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
    * @param details Details about the cookie being set.
    */
  def set(details: Anon_UrlNameValue): js.Promise[js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.Cookie]]
}

