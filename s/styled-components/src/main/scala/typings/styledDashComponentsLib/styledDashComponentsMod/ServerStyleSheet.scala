package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components", "ServerStyleSheet")
@js.native
class ServerStyleSheet () extends js.Object {
  val instance: this.type = js.native
  def collectStyles(tree: reactLib.reactMod.ReactNs.ReactNode): reactLib.reactMod.ReactNs.ReactElement[styledDashComponentsLib.Anon_Sheet] = js.native
  def getStyleElement(): js.Array[reactLib.reactMod.ReactNs.ReactElement[js.Object]] = js.native
  def getStyleTags(): java.lang.String = js.native
  def interleaveWithNodeStream(readableStream: nodeLib.NodeJSNs.ReadableStream): nodeLib.NodeJSNs.ReadableStream = js.native
}

