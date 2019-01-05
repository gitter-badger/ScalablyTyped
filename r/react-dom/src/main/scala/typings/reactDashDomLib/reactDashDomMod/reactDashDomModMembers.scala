package typings
package reactDashDomLib.reactDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", JSImport.Namespace)
@js.native
object reactDashDomModMembers extends js.Object {
  val hydrate: Renderer = js.native
  val render: Renderer = js.native
  val version: java.lang.String = js.native
  def createPortal(children: reactLib.reactMod.ReactNs.ReactNode, container: reactLib.Element with stdLib.Element): reactLib.reactMod.ReactNs.ReactPortal = js.native
  def createPortal(
    children: reactLib.reactMod.ReactNs.ReactNode,
    container: reactLib.Element with stdLib.Element,
    key: java.lang.String
  ): reactLib.reactMod.ReactNs.ReactPortal = js.native
  def findDOMNode(instance: reactLib.reactMod.ReactNs.ReactInstance): (reactLib.Element with stdLib.Element) | scala.Null | (reactLib.Text with stdLib.Text) = js.native
  def unmountComponentAtNode(container: reactLib.Element with stdLib.Element): scala.Boolean = js.native
  def unstable_batchedUpdates(callback: js.Function0[_]): scala.Unit = js.native
  def unstable_batchedUpdates[A](callback: js.Function1[/* a */ A, _], a: A): scala.Unit = js.native
  def unstable_batchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, _], a: A, b: B): scala.Unit = js.native
  def unstable_renderSubtreeIntoContainer[T /* <: reactLib.Element with stdLib.Element */](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.ReactNs.DOMElement[reactLib.reactMod.ReactNs.DOMAttributes[T], T],
    container: reactLib.Element with stdLib.Element
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[T /* <: reactLib.Element with stdLib.Element */](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.ReactNs.DOMElement[reactLib.reactMod.ReactNs.DOMAttributes[T], T],
    container: reactLib.Element with stdLib.Element,
    callback: js.Function1[/* element */ T, _]
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[P](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.ReactNs.ReactElement[P],
    container: reactLib.Element with stdLib.Element
  ): (reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _]) | (reactLib.Element with stdLib.Element) | scala.Unit = js.native
  def unstable_renderSubtreeIntoContainer[P](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.ReactNs.ReactElement[P],
    container: reactLib.Element with stdLib.Element,
    callback: js.Function1[
      /* component */ js.UndefOr[
        (reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _]) | (reactLib.Element with stdLib.Element)
      ], 
      _
    ]
  ): (reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _]) | (reactLib.Element with stdLib.Element) | scala.Unit = js.native
  def unstable_renderSubtreeIntoContainer[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _] */](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.ReactNs.CElement[P, T],
    container: reactLib.Element with stdLib.Element
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _] */](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.ReactNs.CElement[P, T],
    container: reactLib.Element with stdLib.Element,
    callback: js.Function1[/* component */ T, _]
  ): T = js.native
}

