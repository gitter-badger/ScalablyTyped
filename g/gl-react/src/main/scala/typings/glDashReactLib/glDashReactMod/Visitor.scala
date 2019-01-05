package typings
package glDashReactLib.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react", "Visitor")
@js.native
class Visitor () extends js.Object {
  def onNodeDraw(node: Node, preparedUniforms: js.Array[_]): scala.Unit = js.native
  def onNodeDrawEnd(node: Node): scala.Unit = js.native
  def onNodeDrawSkipped(node: Node): scala.Unit = js.native
  def onNodeDrawStart(node: Node): scala.Unit = js.native
  def onNodeSyncDeps(node: Node, additions: js.Array[Node | Bus], deletions: js.Array[Node | Bus]): scala.Unit = js.native
  def onSurfaceDrawEnd(surface: Surface[_]): scala.Unit = js.native
  def onSurfaceDrawError(e: stdLib.Error): scala.Boolean = js.native
  def onSurfaceDrawSkipped(surface: Surface[_]): scala.Unit = js.native
  def onSurfaceDrawStart(surface: Surface[_]): scala.Unit = js.native
  def onSurfaceGLContextChange(surface: Surface[_]): scala.Unit = js.native
  def onSurfaceGLContextChange(surface: Surface[_], gl: reactLib.WebGLRenderingContext with stdLib.WebGLRenderingContext): scala.Unit = js.native
  def onSurfaceMount(surface: Surface[_]): scala.Unit = js.native
  def onSurfaceUnmount(surface: Surface[_]): scala.Unit = js.native
}

