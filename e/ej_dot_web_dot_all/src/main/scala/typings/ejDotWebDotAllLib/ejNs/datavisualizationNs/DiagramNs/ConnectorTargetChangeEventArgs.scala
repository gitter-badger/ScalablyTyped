package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorTargetChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the change or not
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** returns the state of connection end point dragging(starting, dragging, completed)
    */
  var dragState: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the connector, the target point of which is being dragged
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the target node of the element
    */
  var node: js.UndefOr[js.Any] = js.undefined
  /** returns the target point of the element
    */
  var point: js.UndefOr[js.Any] = js.undefined
  /** returns the target port of the element
    */
  var port: js.UndefOr[js.Any] = js.undefined
}

