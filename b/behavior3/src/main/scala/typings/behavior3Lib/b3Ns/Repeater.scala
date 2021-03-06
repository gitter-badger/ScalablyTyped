package typings
package behavior3Lib.b3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Repeater is a decorator that repeats the tick signal until the child node
  * return `RUNNING` or `ERROR`. Optionally, a maximum number of repetitions
  * can be defined.
  *
  */
@JSGlobal("b3.Repeater")
@js.native
/**
  * Creates an instance of MaxTime.
  *
  * - **maxLoop** (*Integer*) Maximum number of repetitions. Default to -1 (infinite).
  * - **child** (*BaseNode*) The child node.
  *
  */
class Repeater () extends Decorator {
  def this(hasMaxLoopChild: behavior3Lib.Anon_ChildMaxLoopBaseNode) = this()
}

