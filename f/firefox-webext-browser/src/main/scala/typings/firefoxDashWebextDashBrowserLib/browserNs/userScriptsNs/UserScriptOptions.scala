package typings
package firefoxDashWebextDashBrowserLib.browserNs.userScriptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* userScripts types */
/** Details of a user script */
trait UserScriptOptions extends js.Object {
  /**
    * If allFrames is `true`, implies that the JavaScript should be injected into all frames of current page. By
    * default, it's `false` and is only injected into the top frame.
    */
  var allFrames: js.UndefOr[scala.Boolean] = js.undefined
  var excludeGlobs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var excludeMatches: js.UndefOr[
    js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.MatchPattern]
  ] = js.undefined
  var includeGlobs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of JS files to inject */
  @JSName("js")
  var `js_`: js.UndefOr[
    js.Array[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.ExtensionFileOrCode]
  ] = js.undefined
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your
    * extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default
    * it is `false`.
    */
  var matchAboutBlank: js.UndefOr[scala.Boolean] = js.undefined
  var matches: js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.MatchPattern]
  /** The soonest that the JavaScript will be injected into the tab. Defaults to "document_idle". */
  var runAt: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.RunAt] = js.undefined
  /** An opaque user script metadata value */
  var scriptMetadata: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.PlainJSONValue] = js.undefined
}

