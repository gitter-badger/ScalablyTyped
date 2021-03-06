package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /**
    * The identifier of the action.
    * Any string or CommonActionId for common actions.
    * @see CommonActionId
    **/
  var id: (chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_OFFLINENOTNECESSARY, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_OFFLINENOTNECESSARY[keyof chrome-apps.Anon_OFFLINENOTNECESSARY] */ js.Any
    ]
  ]) | java.lang.String
  /** The title of the action. It may be ignored for common actions.  */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

