package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/focus", JSImport.Namespace)
@js.native
object libFocusMod extends js.Object {
  def doesElementContainFocus(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def focusAsync(): scala.Unit = js.native
  def focusAsync(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Unit = js.native
  def focusAsync(element: atUifabricUtilitiesLib.Anon_Focus): scala.Unit = js.native
  def focusFirstChild(rootElement: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def getFirstFocusable(
    rootElement: reactLib.HTMLElement with stdLib.HTMLElement,
    currentElement: reactLib.HTMLElement with stdLib.HTMLElement
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getFirstFocusable(
    rootElement: reactLib.HTMLElement with stdLib.HTMLElement,
    currentElement: reactLib.HTMLElement with stdLib.HTMLElement,
    includeElementsInFocusZones: scala.Boolean
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getFirstTabbable(
    rootElement: reactLib.HTMLElement with stdLib.HTMLElement,
    currentElement: reactLib.HTMLElement with stdLib.HTMLElement
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getFirstTabbable(
    rootElement: reactLib.HTMLElement with stdLib.HTMLElement,
    currentElement: reactLib.HTMLElement with stdLib.HTMLElement,
    includeElementsInFocusZones: scala.Boolean
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getLastFocusable(
    rootElement: reactLib.HTMLElement with stdLib.HTMLElement,
    currentElement: reactLib.HTMLElement with stdLib.HTMLElement
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getLastFocusable(
    rootElement: reactLib.HTMLElement with stdLib.HTMLElement,
    currentElement: reactLib.HTMLElement with stdLib.HTMLElement,
    includeElementsInFocusZones: scala.Boolean
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getLastTabbable(
    rootElement: reactLib.HTMLElement with stdLib.HTMLElement,
    currentElement: reactLib.HTMLElement with stdLib.HTMLElement
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getLastTabbable(
    rootElement: reactLib.HTMLElement with stdLib.HTMLElement,
    currentElement: reactLib.HTMLElement with stdLib.HTMLElement,
    includeElementsInFocusZones: scala.Boolean
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getNextElement(
    rootElement: reactLib.HTMLElement with stdLib.HTMLElement,
    currentElement: reactLib.HTMLElement with stdLib.HTMLElement,
    checkNode: js.UndefOr[scala.Boolean],
    suppressParentTraversal: js.UndefOr[scala.Boolean],
    suppressChildTraversal: js.UndefOr[scala.Boolean],
    includeElementsInFocusZones: js.UndefOr[scala.Boolean],
    allowFocusRoot: js.UndefOr[scala.Boolean],
    tabbable: js.UndefOr[scala.Boolean]
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getNextElement(
    rootElement: reactLib.HTMLElement with stdLib.HTMLElement,
    currentElement: scala.Null,
    checkNode: js.UndefOr[scala.Boolean],
    suppressParentTraversal: js.UndefOr[scala.Boolean],
    suppressChildTraversal: js.UndefOr[scala.Boolean],
    includeElementsInFocusZones: js.UndefOr[scala.Boolean],
    allowFocusRoot: js.UndefOr[scala.Boolean],
    tabbable: js.UndefOr[scala.Boolean]
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getPreviousElement(
    rootElement: reactLib.HTMLElement with stdLib.HTMLElement,
    currentElement: reactLib.HTMLElement with stdLib.HTMLElement,
    checkNode: js.UndefOr[scala.Boolean],
    suppressParentTraversal: js.UndefOr[scala.Boolean],
    traverseChildren: js.UndefOr[scala.Boolean],
    includeElementsInFocusZones: js.UndefOr[scala.Boolean],
    allowFocusRoot: js.UndefOr[scala.Boolean],
    tabbable: js.UndefOr[scala.Boolean]
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getPreviousElement(
    rootElement: reactLib.HTMLElement with stdLib.HTMLElement,
    currentElement: scala.Null,
    checkNode: js.UndefOr[scala.Boolean],
    suppressParentTraversal: js.UndefOr[scala.Boolean],
    traverseChildren: js.UndefOr[scala.Boolean],
    includeElementsInFocusZones: js.UndefOr[scala.Boolean],
    allowFocusRoot: js.UndefOr[scala.Boolean],
    tabbable: js.UndefOr[scala.Boolean]
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def isElementFocusSubZone(): scala.Boolean = js.native
  def isElementFocusSubZone(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def isElementFocusZone(): scala.Boolean = js.native
  def isElementFocusZone(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def isElementTabbable(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def isElementTabbable(element: reactLib.HTMLElement with stdLib.HTMLElement, checkTabIndex: scala.Boolean): scala.Boolean = js.native
  def isElementVisible(): scala.Boolean = js.native
  def isElementVisible(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  @JSName("shouldWrapFocus")
  def `shouldWrapFocus_data-no-horizontal-wrap`(
    element: reactLib.HTMLElement with stdLib.HTMLElement,
    noWrapDataAttribute: atUifabricUtilitiesLib.atUifabricUtilitiesLibStrings.`data-no-horizontal-wrap`
  ): scala.Boolean = js.native
  @JSName("shouldWrapFocus")
  def `shouldWrapFocus_data-no-vertical-wrap`(
    element: reactLib.HTMLElement with stdLib.HTMLElement,
    noWrapDataAttribute: atUifabricUtilitiesLib.atUifabricUtilitiesLibStrings.`data-no-vertical-wrap`
  ): scala.Boolean = js.native
}

