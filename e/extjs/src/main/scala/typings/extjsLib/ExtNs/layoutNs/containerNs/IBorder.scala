package typings
package extjsLib.ExtNs.layoutNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBorder extends IContainer {
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IBorder: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IBorder: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], extjsLib.ExtNs.layoutNs.ISizePolicy]] = js.undefined
  /** [Config Option] (Number/String/Object) */
  var padding: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var regionWeights: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var split: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var splitterResize: js.UndefOr[scala.Boolean] = js.undefined
}

