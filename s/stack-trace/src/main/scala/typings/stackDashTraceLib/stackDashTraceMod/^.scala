package typings
package stackDashTraceLib.stackDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stack-trace", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def get(): js.Array[stackDashTraceLib.stackDashTraceMod.StackFrame] = js.native
  def get(belowFn: js.Function0[scala.Unit]): js.Array[stackDashTraceLib.stackDashTraceMod.StackFrame] = js.native
  def parse(err: stdLib.Error): js.Array[stackDashTraceLib.stackDashTraceMod.StackFrame] = js.native
}

