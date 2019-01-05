package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RegisterUserScriptOptions extends js.Object {
  /* userScripts functions */
  /**
    * Register a user script programmatically given its `userScripts.UserScriptOptions`, and resolves to a
    * `userScripts.RegisteredUserScript` instance
    */
  def register(userScriptOptions: firefoxDashWebextDashBrowserLib.browserNs.userScriptsNs.UserScriptOptions): js.Promise[firefoxDashWebextDashBrowserLib.browserNs.userScriptsNs.RegisteredUserScript]
  /**
    * Provides a set of custom API methods available to the registered userScripts
    *
    * Allowed in: Content scripts only
    */
  def setScriptAPIs(exportedAPIMethods: firefoxDashWebextDashBrowserLib.browserNs.userScriptsNs.ExportedAPIMethods): scala.Unit
}

