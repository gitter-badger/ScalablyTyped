package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "DeferStream")
@js.native
class DeferStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamDeferStreamMod.DeferStream {
  def this(buildStreamFunc: js.Function) = this()
}

@JSImport("wonder-frp/dist/commonjs", "DeferStream")
@js.native
object DeferStream extends js.Object {
  def create(buildStreamFunc: js.Function): wonderDashFrpLib.distCommonjsStreamDeferStreamMod.DeferStream = js.native
}

