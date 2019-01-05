package typings
package yogDashBigpipeLib.yogDashBigpipeMod.yogBigpipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigPipe
  extends nodeLib.streamMod.Readable {
  var Pagelet: PageletConstructor[Pagelet] = js.native
  var map: org.scalablytyped.runtime.StringDictionary[Pagelet] = js.native
  var pagelets: js.Array[Pagelet] = js.native
  var parentQuicklings: js.Array[java.lang.String] = js.native
  var pipelines: js.Array[Pagelet] = js.native
  var rendered: js.Array[Pagelet] = js.native
  var state: yogDashBigpipeLib.yogDashBigpipeMod.yogBigpipeNs.PageletNs.status = js.native
  def _checkFinish(): scala.Unit = js.native
  def _markPageletRendered(pagelet: Pagelet): scala.Unit = js.native
  def _onPageletDone(pagelet: Pagelet): scala.Unit = js.native
  def addPagelet(obj: yogDashBigpipeLib.yogDashBigpipeMod.AddPageletConfig): scala.Unit = js.native
  def addQuicklingPagelets(pagelets: js.Array[java.lang.String]): scala.Unit = js.native
  def bind(id: java.lang.String, fn: yogDashBigpipeLib.Callback): BigPipe = js.native
  def bindPageOnly(fn: yogDashBigpipeLib.Callback): scala.Unit = js.native
  def format(pagelet: Pagelet): java.lang.String = js.native
  def isQuickingMode(): scala.Boolean = js.native
  def isQuicklingMode(): scala.Boolean = js.native
  def isQuicklingWidget(item: yogDashBigpipeLib.Anon_Mode): scala.Unit = js.native
  def outputPagelet(pagelet: Pagelet): scala.Unit = js.native
  def prepareAllSources(): js.Promise[_] = js.native
  def preparePageOnly(): js.Promise[_] = js.native
  def render(): scala.Unit = js.native
  def renderPagelet(pagelet: Pagelet): scala.Unit = js.native
}

