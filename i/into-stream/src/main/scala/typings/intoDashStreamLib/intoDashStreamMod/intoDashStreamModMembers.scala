package typings
package intoDashStreamLib.intoDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("into-stream", JSImport.Namespace)
@js.native
object intoDashStreamModMembers extends js.Object {
  def apply(
    input: intoDashStreamLib.intoDashStreamMod.intoStreamNs.Input | js.Promise[intoDashStreamLib.intoDashStreamMod.intoStreamNs.Input]
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  def obj(input: nodeLib.Iterable[js.Object] with stdLib.Iterable[js.Object]): nodeLib.NodeJSNs.ReadableStream = js.native
  def obj(input: js.Object): nodeLib.NodeJSNs.ReadableStream = js.native
  def obj(input: js.Promise[js.Object | (nodeLib.Iterable[js.Object] with stdLib.Iterable[js.Object])]): nodeLib.NodeJSNs.ReadableStream = js.native
}

