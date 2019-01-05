package typings
package reactDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Simulate extends js.Object {
  val SimulateNs: Anon_Abort = js.native
  def createRenderer(): reactDashDomLib.testDashUtilsMod.ShallowRenderer = js.native
  def findAllInRenderedTree(
    root: reactLib.reactMod.Component[_, js.Object, _],
    fn: js.Function1[/* i */ reactLib.reactMod.ReactNs.ReactInstance, scala.Boolean]
  ): js.Array[reactLib.reactMod.ReactNs.ReactInstance] = js.native
  def findRenderedComponentWithType[T /* <: reactLib.reactMod.Component[_, js.Object, _] */, C /* <: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] */](
    root: reactLib.reactMod.Component[_, js.Object, _],
    `type`: reactLib.reactMod.ReactNs.ClassType[_, T, C]
  ): T = js.native
  def findRenderedDOMComponentWithClass(root: reactLib.reactMod.Component[_, js.Object, _], className: java.lang.String): reactLib.Element with stdLib.Element = js.native
  def findRenderedDOMComponentWithTag(root: reactLib.reactMod.Component[_, js.Object, _], tagName: java.lang.String): reactLib.Element with stdLib.Element = js.native
  def isCompositeComponent(instance: reactLib.reactMod.ReactNs.ReactInstance): /* is react.react.Component<any, {}, any> */ scala.Boolean = js.native
  def isCompositeComponentWithType[T /* <: reactLib.reactMod.Component[_, js.Object, _] */, C /* <: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] */](
    instance: reactLib.reactMod.ReactNs.ReactInstance,
    `type`: reactLib.reactMod.ReactNs.ClassType[_, T, C]
  ): scala.Boolean = js.native
  def isDOMComponent(instance: reactLib.reactMod.ReactNs.ReactInstance): scala.Boolean = js.native
  def isElement(element: js.Any): scala.Boolean = js.native
  def isElementOfType[T /* <: reactLib.HTMLElement with stdLib.HTMLElement */](element: reactLib.reactMod.ReactNs.ReactElement[_], `type`: java.lang.String): /* is react.react.React.ReactHTMLElement<T> */ scala.Boolean = js.native
  def isElementOfType[P](element: reactLib.reactMod.ReactNs.ReactElement[_], `type`: reactLib.reactMod.ReactNs.SFC[P]): /* is react.react.React.SFCElement<P> */ scala.Boolean = js.native
  def isElementOfType[P, T /* <: reactLib.reactMod.Component[P, js.Object, _] */, C /* <: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState] */](
    element: reactLib.reactMod.ReactNs.ReactElement[_],
    `type`: reactLib.reactMod.ReactNs.ClassType[P, T, C]
  ): /* is react.react.React.CElement<P, T> */ scala.Boolean = js.native
  @JSName("isElementOfType")
  def `isElementOfType_PDOMAttributesT<intersection>`[P /* <: reactLib.reactMod.ReactNs.DOMAttributes[js.Object] */, T /* <: reactLib.Element with stdLib.Element */](element: reactLib.reactMod.ReactNs.ReactElement[_], `type`: java.lang.String): /* is react.react.React.DOMElement<P, T> */ scala.Boolean = js.native
  def mockComponent(mocked: reactDashDomLib.testDashUtilsMod.MockedComponentClass): /* import warning: ImportType.apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
  def mockComponent(mocked: reactDashDomLib.testDashUtilsMod.MockedComponentClass, mockTagName: java.lang.String): /* import warning: ImportType.apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
  def renderIntoDocument(element: reactLib.reactMod.ReactNs.SFCElement[_]): scala.Unit = js.native
  def renderIntoDocument[T /* <: reactLib.Element with stdLib.Element */](element: reactLib.reactMod.ReactNs.DOMElement[_, T]): T = js.native
  def renderIntoDocument[P](element: reactLib.reactMod.ReactNs.ReactElement[P]): (reactLib.reactMod.Component[P, js.Object, _]) | (reactLib.Element with stdLib.Element) | scala.Unit = js.native
  def renderIntoDocument[P, T /* <: reactLib.reactMod.Component[P, js.Object, _] */](element: reactLib.reactMod.ReactNs.CElement[P, T]): T = js.native
  def scryRenderedComponentsWithType[T /* <: reactLib.reactMod.Component[_, js.Object, _] */, C /* <: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] */](
    root: reactLib.reactMod.Component[_, js.Object, _],
    `type`: reactLib.reactMod.ReactNs.ClassType[_, T, C]
  ): js.Array[T] = js.native
  def scryRenderedDOMComponentsWithClass(root: reactLib.reactMod.Component[_, js.Object, _], className: java.lang.String): js.Array[reactLib.Element with stdLib.Element] = js.native
  def scryRenderedDOMComponentsWithTag(root: reactLib.reactMod.Component[_, js.Object, _], tagName: java.lang.String): js.Array[reactLib.Element with stdLib.Element] = js.native
}

