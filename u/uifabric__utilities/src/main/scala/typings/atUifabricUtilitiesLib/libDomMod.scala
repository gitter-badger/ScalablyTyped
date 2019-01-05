package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom", JSImport.Namespace)
@js.native
object libDomMod extends js.Object {
  val DATA_PORTAL_ATTRIBUTE: /* data-portal-element */ java.lang.String = js.native
  def elementContains(): scala.Boolean = js.native
  def elementContains(parent: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def elementContains(
    parent: reactLib.HTMLElement with stdLib.HTMLElement,
    child: reactLib.HTMLElement with stdLib.HTMLElement
  ): scala.Boolean = js.native
  def elementContains(
    parent: reactLib.HTMLElement with stdLib.HTMLElement,
    child: reactLib.HTMLElement with stdLib.HTMLElement,
    allowVirtualParents: scala.Boolean
  ): scala.Boolean = js.native
  def elementContains(
    parent: reactLib.HTMLElement with stdLib.HTMLElement,
    child: scala.Null,
    allowVirtualParents: scala.Boolean
  ): scala.Boolean = js.native
  def elementContains(parent: scala.Null, child: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def elementContains(
    parent: scala.Null,
    child: reactLib.HTMLElement with stdLib.HTMLElement,
    allowVirtualParents: scala.Boolean
  ): scala.Boolean = js.native
  def elementContains(parent: scala.Null, child: scala.Null, allowVirtualParents: scala.Boolean): scala.Boolean = js.native
  def elementContainsAttribute(element: reactLib.HTMLElement with stdLib.HTMLElement, attribute: java.lang.String): java.lang.String | scala.Null = js.native
  def findElementRecursive(
    element: reactLib.HTMLElement with stdLib.HTMLElement,
    matchFunction: js.Function1[/* element */ reactLib.HTMLElement with stdLib.HTMLElement, scala.Boolean]
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def findElementRecursive(
    element: scala.Null,
    matchFunction: js.Function1[/* element */ reactLib.HTMLElement with stdLib.HTMLElement, scala.Boolean]
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getChildren(parent: reactLib.HTMLElement with stdLib.HTMLElement): js.Array[reactLib.HTMLElement with stdLib.HTMLElement] = js.native
  def getChildren(parent: reactLib.HTMLElement with stdLib.HTMLElement, allowVirtualChildren: scala.Boolean): js.Array[reactLib.HTMLElement with stdLib.HTMLElement] = js.native
  def getDocument(): js.UndefOr[reactLib.Document with stdLib.Document] = js.native
  def getDocument(rootElement: reactLib.HTMLElement with stdLib.HTMLElement): js.UndefOr[reactLib.Document with stdLib.Document] = js.native
  def getParent(child: reactLib.HTMLElement with stdLib.HTMLElement): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getParent(child: reactLib.HTMLElement with stdLib.HTMLElement, allowVirtualParents: scala.Boolean): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getRect(): js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.native
  def getRect(element: reactLib.HTMLElement with stdLib.HTMLElement): js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.native
  def getRect(element: stdLib.Window): js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.native
  def getVirtualParent(child: reactLib.HTMLElement with stdLib.HTMLElement): js.UndefOr[reactLib.HTMLElement with stdLib.HTMLElement] = js.native
  def getWindow(): js.UndefOr[stdLib.Window] = js.native
  def getWindow(rootElement: reactLib.Element with stdLib.Element): js.UndefOr[stdLib.Window] = js.native
  def portalContainsElement(target: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def portalContainsElement(
    target: reactLib.HTMLElement with stdLib.HTMLElement,
    parent: reactLib.HTMLElement with stdLib.HTMLElement
  ): scala.Boolean = js.native
  def setPortalAttribute(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Unit = js.native
  def setSSR(isEnabled: scala.Boolean): scala.Unit = js.native
  def setVirtualParent(
    child: reactLib.HTMLElement with stdLib.HTMLElement,
    parent: reactLib.HTMLElement with stdLib.HTMLElement
  ): scala.Unit = js.native
}

