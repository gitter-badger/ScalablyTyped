package typings
package jsdomLib.jsdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsdom", "VirtualConsole")
@js.native
class VirtualConsole ()
  extends nodeLib.eventsMod.EventEmitter {
  def on[K /* <: java.lang.String */](
    method: K,
    callback: /* import warning: ImportType.apply Failed type conversion: node.Console & std.Console[K] */ js.Any
  ): this.type = js.native
  @JSName("on")
  def on_jsdomError(
    event: jsdomLib.jsdomLibStrings.jsdomError,
    callback: js.Function1[/* e */ nodeLib.Error with stdLib.Error, scala.Unit]
  ): this.type = js.native
  def sendTo(console: nodeLib.Console with stdLib.Console): this.type = js.native
  def sendTo(console: nodeLib.Console with stdLib.Console, options: VirtualConsoleSendToOptions): this.type = js.native
}

