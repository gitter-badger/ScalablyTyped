package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Utilities", JSImport.Namespace)
@js.native
object libUtilitiesModMembers extends js.Object {
  val CustomizerContext: reactLib.reactMod.ReactNs.Context[atUifabricUtilitiesLib.libCustomizerMod.ICustomizerContext] = js.native
  val DATA_IS_SCROLLABLE_ATTRIBUTE: /* data-is-scrollable */ java.lang.String = js.native
  val DATA_PORTAL_ATTRIBUTE: /* data-portal-element */ java.lang.String = js.native
  val IsFocusVisibleClassName: /* ms-Fabric--isFocusVisible */ java.lang.String = js.native
  val KeyCodes: atUifabricUtilitiesLib.Anon_Backspace = js.native
  val anchorProperties: js.Array[java.lang.String] = js.native
  val baseElementEvents: js.Array[java.lang.String] = js.native
  val baseElementProperties: js.Array[java.lang.String] = js.native
  val buttonProperties: js.Array[java.lang.String] = js.native
  val divProperties: js.Array[java.lang.String] = js.native
  val htmlElementProperties: js.Array[java.lang.String] = js.native
  val imageProperties: js.Array[java.lang.String] = js.native
  val inputProperties: js.Array[java.lang.String] = js.native
  val textAreaProperties: js.Array[java.lang.String] = js.native
  def addDirectionalKeyCode(which: scala.Double): scala.Unit = js.native
  def addElementAtIndex[T](array: js.Array[T], index: scala.Double, itemToAdd: T): js.Array[T] = js.native
  def allowScrollOnElement(
    element: reactLib.HTMLElement with stdLib.HTMLElement,
    events: atUifabricUtilitiesLib.libEventGroupMod.EventGroup
  ): scala.Unit = js.native
  def allowScrollOnElement(element: scala.Null, events: atUifabricUtilitiesLib.libEventGroupMod.EventGroup): scala.Unit = js.native
  def arraysEqual[T](array1: js.Array[T], array2: js.Array[T]): scala.Boolean = js.native
  def asAsync[TProps](options: atUifabricUtilitiesLib.libAsAsyncMod.IAsAsyncOptions[TProps]): reactLib.reactMod.ReactNs.ComponentType[TProps with atUifabricUtilitiesLib.Anon_AsyncPlaceholder] = js.native
  def assertNever(x: scala.Nothing): scala.Nothing = js.native
  def assign(target: js.Any, args: js.Any*): js.Any = js.native
  def autobind[T /* <: js.Function */](target: js.Any, key: java.lang.String, descriptor: stdLib.TypedPropertyDescriptor[T]): atUifabricUtilitiesLib.Anon_Configurable[T] | scala.Unit = js.native
  def calculatePrecision(value: java.lang.String): scala.Double = js.native
  def calculatePrecision(value: scala.Double): scala.Double = js.native
  def classNamesFunction[TStyleProps /* <: js.Object */, TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](): js.Function2[
    /* getStyles */ js.UndefOr[
      atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[TStyleProps, TStyleSet]
    ], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet]
  ] = js.native
  def createArray[T](size: scala.Double, getItem: js.Function1[/* index */ scala.Double, T]): js.Array[T] = js.native
  def createRef[T](): atUifabricUtilitiesLib.libCreateRefMod.RefObject[T] = js.native
  def css(args: atUifabricUtilitiesLib.libCssMod.ICssInput*): java.lang.String = js.native
  def customizable(scope: java.lang.String, fields: js.Array[java.lang.String]): js.Function1[/* ComposedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], _] = js.native
  def customizable(scope: java.lang.String, fields: js.Array[java.lang.String], concatStyles: scala.Boolean): js.Function1[/* ComposedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], _] = js.native
  def disableBodyScroll(): scala.Unit = js.native
  def doesElementContainFocus(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
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
  def enableBodyScroll(): scala.Unit = js.native
  def filteredAssign(
    isAllowed: js.Function1[/* propName */ java.lang.String, scala.Boolean],
    target: js.Any,
    args: js.Any*
  ): js.Any = js.native
  def find[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ scala.Double, scala.Boolean]): js.UndefOr[T] = js.native
  def findElementRecursive(
    element: reactLib.HTMLElement with stdLib.HTMLElement,
    matchFunction: js.Function1[/* element */ reactLib.HTMLElement with stdLib.HTMLElement, scala.Boolean]
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def findElementRecursive(
    element: scala.Null,
    matchFunction: js.Function1[/* element */ reactLib.HTMLElement with stdLib.HTMLElement, scala.Boolean]
  ): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def findIndex[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ scala.Double, scala.Boolean]): scala.Double = js.native
  def findScrollableParent(): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def findScrollableParent(startingElement: reactLib.HTMLElement with stdLib.HTMLElement): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def fitContentToBounds(options: atUifabricUtilitiesLib.libMathMod.IFitContentToBoundsOptions): atUifabricUtilitiesLib.libISizeMod.ISize = js.native
  def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  def focusAsync(): scala.Unit = js.native
  def focusAsync(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Unit = js.native
  def focusAsync(element: atUifabricUtilitiesLib.Anon_Focus): scala.Unit = js.native
  def focusFirstChild(rootElement: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def format(s: java.lang.String, values: js.Any*): java.lang.String = js.native
  def getChildren(parent: reactLib.HTMLElement with stdLib.HTMLElement): js.Array[reactLib.HTMLElement with stdLib.HTMLElement] = js.native
  def getChildren(parent: reactLib.HTMLElement with stdLib.HTMLElement, allowVirtualChildren: scala.Boolean): js.Array[reactLib.HTMLElement with stdLib.HTMLElement] = js.native
  def getDistanceBetweenPoints(
    point1: atUifabricUtilitiesLib.libIPointMod.IPoint,
    point2: atUifabricUtilitiesLib.libIPointMod.IPoint
  ): scala.Double = js.native
  def getDocument(): js.UndefOr[reactLib.Document with stdLib.Document] = js.native
  def getDocument(rootElement: reactLib.HTMLElement with stdLib.HTMLElement): js.UndefOr[reactLib.Document with stdLib.Document] = js.native
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
  def getId(): java.lang.String = js.native
  def getId(prefix: java.lang.String): java.lang.String = js.native
  def getInitials(displayName: java.lang.String, isRtl: scala.Boolean): java.lang.String = js.native
  def getInitials(displayName: java.lang.String, isRtl: scala.Boolean, allowPhoneInitials: scala.Boolean): java.lang.String = js.native
  def getInitials(displayName: js.UndefOr[scala.Nothing], isRtl: scala.Boolean): java.lang.String = js.native
  def getInitials(displayName: js.UndefOr[scala.Nothing], isRtl: scala.Boolean, allowPhoneInitials: scala.Boolean): java.lang.String = js.native
  def getInitials(displayName: scala.Null, isRtl: scala.Boolean): java.lang.String = js.native
  def getInitials(displayName: scala.Null, isRtl: scala.Boolean, allowPhoneInitials: scala.Boolean): java.lang.String = js.native
  def getLanguage(): java.lang.String | scala.Null = js.native
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
  def getNativeProps[T](props: js.Object, allowedPropNames: js.Array[java.lang.String]): T = js.native
  def getNativeProps[T](
    props: js.Object,
    allowedPropNames: js.Array[java.lang.String],
    excludedPropNames: js.Array[java.lang.String]
  ): T = js.native
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
  def getParent(child: reactLib.HTMLElement with stdLib.HTMLElement): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
  def getParent(child: reactLib.HTMLElement with stdLib.HTMLElement, allowVirtualParents: scala.Boolean): (reactLib.HTMLElement with stdLib.HTMLElement) | scala.Null = js.native
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
  def getRTL(): scala.Boolean = js.native
  def getRTLSafeKeyCode(key: scala.Double): scala.Double = js.native
  def getRect(): js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.native
  def getRect(element: reactLib.HTMLElement with stdLib.HTMLElement): js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.native
  def getRect(element: stdLib.Window): js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.native
  def getResourceUrl(url: java.lang.String): java.lang.String = js.native
  def getScrollbarWidth(): scala.Double = js.native
  def getVirtualParent(child: reactLib.HTMLElement with stdLib.HTMLElement): js.UndefOr[reactLib.HTMLElement with stdLib.HTMLElement] = js.native
  def getWindow(): js.UndefOr[stdLib.Window] = js.native
  def getWindow(rootElement: reactLib.Element with stdLib.Element): js.UndefOr[stdLib.Window] = js.native
  def hasHorizontalOverflow(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def hasOverflow(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def hasVerticalOverflow(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def hoistMethods(destination: js.Any, source: js.Any): js.Array[java.lang.String] = js.native
  def hoistMethods(destination: js.Any, source: js.Any, exclusions: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def hoistStatics[TSource, TDest](source: TSource, dest: TDest): TDest = js.native
  def initializeFocusRects(): scala.Unit = js.native
  def initializeFocusRects(window: stdLib.Window): scala.Unit = js.native
  def isDirectionalKeyCode(which: scala.Double): scala.Boolean = js.native
  def isElementFocusSubZone(): scala.Boolean = js.native
  def isElementFocusSubZone(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def isElementFocusZone(): scala.Boolean = js.native
  def isElementFocusZone(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def isElementTabbable(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def isElementTabbable(element: reactLib.HTMLElement with stdLib.HTMLElement, checkTabIndex: scala.Boolean): scala.Boolean = js.native
  def isElementVisible(): scala.Boolean = js.native
  def isElementVisible(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def isIOS(): scala.Boolean = js.native
  def isMac(): scala.Boolean = js.native
  def isMac(reset: scala.Boolean): scala.Boolean = js.native
  def mapEnumByName[T](
    theEnum: js.Any,
    callback: js.Function2[
      /* name */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[java.lang.String | scala.Double], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[js.Array[js.UndefOr[T]]] = js.native
  def memoize[T /* <: js.Function */](target: js.Any, key: java.lang.String, descriptor: stdLib.TypedPropertyDescriptor[T]): atUifabricUtilitiesLib.Anon_ConfigurableGet[T] = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RET_TYPE] */, RET_TYPE](cb: T): T = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RET_TYPE] */, RET_TYPE](cb: T, maxCacheSize: scala.Double): T = js.native
  def merge[T](
    target: stdLib.Partial[T],
    args: (js.UndefOr[
      stdLib.Partial[T] | scala.Null | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`false`
    ])*
  ): T = js.native
  def mergeAriaAttributeValues(ariaAttributes: js.UndefOr[java.lang.String]*): js.UndefOr[java.lang.String] = js.native
  def mergeCustomizations(
    props: atUifabricUtilitiesLib.libCustomizerMod.ICustomizerProps,
    parentContext: atUifabricUtilitiesLib.libCustomizerMod.ICustomizerContext
  ): atUifabricUtilitiesLib.libCustomizerMod.ICustomizerContext = js.native
  def mergeSettings(): atUifabricUtilitiesLib.libCustomizationsMod.Settings = js.native
  def mergeSettings(oldSettings: atUifabricUtilitiesLib.libCustomizationsMod.Settings): atUifabricUtilitiesLib.libCustomizationsMod.Settings = js.native
  def mergeSettings(
    oldSettings: atUifabricUtilitiesLib.libCustomizationsMod.Settings,
    newSettings: atUifabricUtilitiesLib.libCustomizationsMod.Settings
  ): atUifabricUtilitiesLib.libCustomizationsMod.Settings = js.native
  def mergeSettings(
    oldSettings: atUifabricUtilitiesLib.libCustomizationsMod.Settings,
    newSettings: atUifabricUtilitiesLib.libCustomizationsMod.SettingsFunction
  ): atUifabricUtilitiesLib.libCustomizationsMod.Settings = js.native
  def nullRender(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def portalContainsElement(target: reactLib.HTMLElement with stdLib.HTMLElement): scala.Boolean = js.native
  def portalContainsElement(
    target: reactLib.HTMLElement with stdLib.HTMLElement,
    parent: reactLib.HTMLElement with stdLib.HTMLElement
  ): scala.Boolean = js.native
  def precisionRound(value: scala.Double, precision: scala.Double): scala.Double = js.native
  def precisionRound(value: scala.Double, precision: scala.Double, base: scala.Double): scala.Double = js.native
  def provideContext[TContext, TProps](
    contextTypes: propDashTypesLib.propDashTypesMod.ValidationMap[TContext],
    mapPropsToContext: js.Function1[/* props */ TProps, TContext]
  ): reactLib.reactMod.ReactNs.ComponentType[TProps] = js.native
  def removeIndex[T](array: js.Array[T], index: scala.Double): js.Array[T] = js.native
  def replaceElement[T](array: js.Array[T], newElement: T, index: scala.Double): js.Array[T] = js.native
  def resetIds(): scala.Unit = js.native
  def resetIds(counter: scala.Double): scala.Unit = js.native
  def resetMemoizations(): scala.Unit = js.native
  def setBaseUrl(baseUrl: java.lang.String): scala.Unit = js.native
  def setLanguage(language: java.lang.String): scala.Unit = js.native
  def setLanguage(language: java.lang.String, avoidPersisting: scala.Boolean): scala.Unit = js.native
  def setMemoizeWeakMap(weakMap: js.Any): scala.Unit = js.native
  def setPortalAttribute(element: reactLib.HTMLElement with stdLib.HTMLElement): scala.Unit = js.native
  def setRTL(isRTL: scala.Boolean): scala.Unit = js.native
  def setRTL(isRTL: scala.Boolean, persistSetting: scala.Boolean): scala.Unit = js.native
  def setSSR(isEnabled: scala.Boolean): scala.Unit = js.native
  def setVirtualParent(
    child: reactLib.HTMLElement with stdLib.HTMLElement,
    parent: reactLib.HTMLElement with stdLib.HTMLElement
  ): scala.Unit = js.native
  def setWarningCallback(): scala.Unit = js.native
  def setWarningCallback(warningCallback: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def shallowCompare[TA, TB](a: TA, b: TB): scala.Boolean = js.native
  @JSName("shouldWrapFocus")
  def `shouldWrapFocus_data-no-horizontal-wrap`(
    element: reactLib.HTMLElement with stdLib.HTMLElement,
    noWrapDataAttribute: officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.`data-no-horizontal-wrap`
  ): scala.Boolean = js.native
  @JSName("shouldWrapFocus")
  def `shouldWrapFocus_data-no-vertical-wrap`(
    element: reactLib.HTMLElement with stdLib.HTMLElement,
    noWrapDataAttribute: officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.`data-no-vertical-wrap`
  ): scala.Boolean = js.native
  def styled[TComponentProps /* <: atUifabricUtilitiesLib.libStyledMod.IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](
    Component: reactLib.reactMod.ReactNs.ComponentClass[TComponentProps, reactLib.reactMod.ReactNs.ComponentState],
    baseStyles: atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): js.Function1[/* props */ TComponentProps, reactLib.reactMod.Global.JSXNs.Element] = js.native
  def styled[TComponentProps /* <: atUifabricUtilitiesLib.libStyledMod.IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](
    Component: reactLib.reactMod.ReactNs.ComponentClass[TComponentProps, reactLib.reactMod.ReactNs.ComponentState],
    baseStyles: atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, stdLib.Partial[TComponentProps]]
  ): js.Function1[/* props */ TComponentProps, reactLib.reactMod.Global.JSXNs.Element] = js.native
  def styled[TComponentProps /* <: atUifabricUtilitiesLib.libStyledMod.IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](
    Component: reactLib.reactMod.ReactNs.ComponentClass[TComponentProps, reactLib.reactMod.ReactNs.ComponentState],
    baseStyles: atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, stdLib.Partial[TComponentProps]],
    customizable: atUifabricUtilitiesLib.libStyledMod.ICustomizableProps
  ): js.Function1[/* props */ TComponentProps, reactLib.reactMod.Global.JSXNs.Element] = js.native
  def styled[TComponentProps /* <: atUifabricUtilitiesLib.libStyledMod.IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](
    Component: reactLib.reactMod.ReactNs.StatelessComponent[TComponentProps],
    baseStyles: atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): js.Function1[/* props */ TComponentProps, reactLib.reactMod.Global.JSXNs.Element] = js.native
  def styled[TComponentProps /* <: atUifabricUtilitiesLib.libStyledMod.IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](
    Component: reactLib.reactMod.ReactNs.StatelessComponent[TComponentProps],
    baseStyles: atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, stdLib.Partial[TComponentProps]]
  ): js.Function1[/* props */ TComponentProps, reactLib.reactMod.Global.JSXNs.Element] = js.native
  def styled[TComponentProps /* <: atUifabricUtilitiesLib.libStyledMod.IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](
    Component: reactLib.reactMod.ReactNs.StatelessComponent[TComponentProps],
    baseStyles: atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, stdLib.Partial[TComponentProps]],
    customizable: atUifabricUtilitiesLib.libStyledMod.ICustomizableProps
  ): js.Function1[/* props */ TComponentProps, reactLib.reactMod.Global.JSXNs.Element] = js.native
  def toMatrix[T](items: js.Array[T], columnCount: scala.Double): js.Array[js.Array[T]] = js.native
  def unhoistMethods(source: js.Any, methodNames: js.Array[java.lang.String]): scala.Unit = js.native
  def values[T](obj: js.Any): js.Array[T] = js.native
  def warn(message: java.lang.String): scala.Unit = js.native
  def warnConditionallyRequiredProps[P](
    componentName: java.lang.String,
    props: P,
    requiredProps: js.Array[java.lang.String],
    conditionalPropName: java.lang.String,
    condition: scala.Boolean
  ): scala.Unit = js.native
  def warnDeprecations[P](
    componentName: java.lang.String,
    props: P,
    deprecationMap: atUifabricUtilitiesLib.libWarnMod.ISettingsMap[P]
  ): scala.Unit = js.native
  def warnMutuallyExclusive[P](
    componentName: java.lang.String,
    props: P,
    exclusiveMap: atUifabricUtilitiesLib.libWarnMod.ISettingsMap[P]
  ): scala.Unit = js.native
}

