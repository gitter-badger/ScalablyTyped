package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelectFile extends js.Object {
  /**
    * Fired when file system action is executed from ChromeOS file browser.
    */
  val onExecute: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* id */ chromeDashAppsLib.chromeNs.fileBrowserHandlerNs.FileBrowserHandleExecuteId, 
      /* details */ Anon_Entries, 
      scala.Unit
    ]
  ]
  /**
    * Prompts user to select file path under which file should be saved.
    * When the file is selected, file access permission required to use
    * the file (read, write and create) are granted to the caller.
    * The file will not actually get created during the function call,
    * so function caller must ensure its existence before using it.
    * The function has to be invoked with a user gesture.
    * @param params Parameters that will be used while selecting the file.
    * @param callback Function called upon completion.
    */
  def selectFile(
    params: chromeDashAppsLib.chromeNs.fileBrowserHandlerNs.SelectFileParameters,
    callback: js.Function1[
      /* result */ chromeDashAppsLib.chromeNs.fileBrowserHandlerNs.SelectionResult, 
      scala.Unit
    ]
  ): scala.Unit
}

