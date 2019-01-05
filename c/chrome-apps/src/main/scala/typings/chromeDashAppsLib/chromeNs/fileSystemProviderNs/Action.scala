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
    chromeDashAppsLib.Anon_SAVEFOROFFLINE, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_SAVEFOROFFLINE[keyof chrome-apps.Anon_SAVEFOROFFLINE] */ js.Any
    ]
  ]) | java.lang.String
  /** The title of the action. It may be ignored for common actions.  */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

