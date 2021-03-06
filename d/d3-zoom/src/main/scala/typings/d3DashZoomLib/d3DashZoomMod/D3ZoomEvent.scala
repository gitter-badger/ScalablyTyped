package typings
package d3DashZoomLib.d3DashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait D3ZoomEvent[ZoomRefElement /* <: ZoomedElementBaseType */, Datum] extends js.Object {
  /**
    * The underlying input event, such as mousemove or touchmove.
    */
  var sourceEvent: js.Any = js.native
  /**
    * The ZoomBehavior associated with the event
    */
  @JSName("target")
  var target_Original: ZoomBehavior[ZoomRefElement, Datum] = js.native
   // Leave failsafe string type for cases like 'zoom.foo'
  /**
    * The current zoom transform
    */
  var transform: ZoomTransform = js.native
  /**
    * The event type for the zoom event
    */
  var `type`: d3DashZoomLib.d3DashZoomLibStrings.start | d3DashZoomLib.d3DashZoomLibStrings.zoom | d3DashZoomLib.d3DashZoomLibStrings.end | java.lang.String = js.native
  /**
    * Applies this zoom behavior to the specified selection, binding the necessary event listeners to
    * allow panning and zooming, and initializing the zoom transform on each selected element to the identity transform if not already defined. This function is typically not invoked directly,
    * and is instead invoked via selection.call.
    *
    * For details see: {@link https://github.com/d3/d3-zoom#_zoom}
    *
    * @param selection A D3 selection of elements.
    * @param args Optional arguments to be passed in.
    */
  /**
    * The ZoomBehavior associated with the event
    */
  def target(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[ZoomRefElement, Datum, _, _],
    args: js.Any*
  ): scala.Unit = js.native
}

