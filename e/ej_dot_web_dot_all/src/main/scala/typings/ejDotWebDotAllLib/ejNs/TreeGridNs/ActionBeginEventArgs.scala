package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBeginEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current grouped column field name.
    */
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the direction of sorting ascending or descending.
    */
  var columnSortDirection: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the data or deleting element.
    */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the value of expanding parent element.
    */
  var keyValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the TreeGrid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

