package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBreakpointByUrlReturnType extends js.Object {
  /**
    * Id of the created breakpoint for further reference.
    */
  var breakpointId: BreakpointId
  /**
    * List of the locations this breakpoint resolved into upon addition.
    */
  var locations: js.Array[Location]
}

