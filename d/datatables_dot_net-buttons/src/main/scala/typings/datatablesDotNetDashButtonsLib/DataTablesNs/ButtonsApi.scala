package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonsApi extends ButtonApi {
  /**
    * Get a jQuery instance that contains a reference to the button container instance.
    */
  def container(): datatablesDotNetLib.JQuery with jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def containers(): datatablesDotNetLib.JQuery with jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
    * Destroy the selected button instances, removing the container and all button elements from the document.
    */
  def destroy(): Api = js.native
}

