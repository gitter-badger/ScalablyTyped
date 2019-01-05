package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UrlTabId extends js.Object {
  /** Allow scripts to close the window. */
  var allowScriptsToClose: js.UndefOr[scala.Boolean] = js.undefined
  /** The CookieStoreId to use for all tabs that were created when the window is opened. */
  var cookieStoreId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, opens an active window. If false, opens an inactive window.
    * @deprecated Unsupported on Firefox at this time.
    */
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The height in pixels of the new window, including the frame. If not specified defaults to a natural height.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Whether the new window should be an incognito window. */
  var incognito: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of pixels to position the new window from the left edge of the screen. If not specified, the new
    * window is offset naturally from the last focused window. This value is ignored for panels.
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    * The initial state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined
    * with 'left', 'top', 'width' or 'height'.
    */
  var state: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.windowsNs.WindowState] = js.undefined
  /** The id of the tab for which you want to adopt to the new window. */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /** A string to add to the beginning of the window title. */
  var titlePreface: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of pixels to position the new window from the top edge of the screen. If not specified, the new
    * window is offset naturally from the last focused window. This value is ignored for panels.
    */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup
    * unless the '--enable-panels' flag is set.
    */
  var `type`: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.windowsNs.CreateType] = js.undefined
  /**
    * A URL or array of URLs to open as tabs in the window. Fully-qualified URLs must include a scheme (i.e.
    * 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within
    * the extension. Defaults to the New Tab Page.
    */
  var url: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The width in pixels of the new window, including the frame. If not specified defaults to a natural width.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

