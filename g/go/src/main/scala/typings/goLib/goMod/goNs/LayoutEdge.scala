package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An edge represents a link in a LayoutNetwork. It holds layout-specific data for the link. */
trait LayoutEdge extends js.Object {
  /**Gets or sets the model data, used only when virtualizing*/
  var data: js.Any
  /**Gets or sets the LayoutVertex that this edge comes from.*/
  var fromVertex: LayoutVertex
  /**Gets or sets the Link associated with this edge, if any.*/
  var link: Link
  /**Gets or sets the LayoutNetwork that owns this edge.*/
  var network: LayoutNetwork
  /**Gets or sets the LayoutVertex that this edge goes to.*/
  var toVertex: LayoutVertex
  /**
    * Commits the route of this edge to the corresponding Link, if any.
    */
  def commit(): scala.Unit
  /**
    * Returns the edge's vertex at the other of this edge from the given vertex.
    * @param {LayoutVertex} v
    */
  def getOtherVertex(v: LayoutVertex): scala.Unit
}

