package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/instructions", JSImport.Namespace)
@js.native
object srcRender3InstructionsMod extends js.Object {
  val CLEAN_PROMISE: js.Promise[scala.Null] = js.native
  def addToViewTree[T /* <: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData | atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer */](
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    adjustedHostIndex: scala.Double,
    state: T
  ): T = js.native
  def allocExpando(view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): scala.Unit = js.native
  def bind[T](value: T): T | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def bindingUpdated(bindingIndex: scala.Double, value: js.Any): scala.Boolean = js.native
  def bindingUpdated2(bindingIndex: scala.Double, exp1: js.Any, exp2: js.Any): scala.Boolean = js.native
  def bindingUpdated3(bindingIndex: scala.Double, exp1: js.Any, exp2: js.Any, exp3: js.Any): scala.Boolean = js.native
  def bindingUpdated4(bindingIndex: scala.Double, exp1: js.Any, exp2: js.Any, exp3: js.Any, exp4: js.Any): scala.Boolean = js.native
  def checkNoChanges[T](component: T): scala.Unit = js.native
  def checkNoChangesInRootView(lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): scala.Unit = js.native
  def componentRefresh[T](adjustedElementIndex: scala.Double, parentFirstTemplatePass: scala.Boolean): scala.Unit = js.native
  def componentRefresh[T](
    adjustedElementIndex: scala.Double,
    parentFirstTemplatePass: scala.Boolean,
    rf: atAngularCoreLib.srcRender3InterfacesDefinitionMod.RenderFlags
  ): scala.Unit = js.native
  def container(index: scala.Double): scala.Unit = js.native
  def containerRefreshEnd(): scala.Unit = js.native
  def containerRefreshStart(index: scala.Double): scala.Unit = js.native
  def createEmbeddedViewAndNode[T](
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: T,
    declarationView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    queries: atAngularCoreLib.srcRender3InterfacesQueryMod.LQueries,
    injectorIndex: scala.Double
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createEmbeddedViewAndNode[T](
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: T,
    declarationView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    queries: scala.Null,
    injectorIndex: scala.Double
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createError(text: java.lang.String, token: js.Any): nodeLib.Error with stdLib.Error = js.native
  def createLContainer(
    hostNative: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment
  ): atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer = js.native
  def createLContainer(
    hostNative: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    isForViewContainerRef: scala.Boolean
  ): atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer = js.native
  def createLContainer(
    hostNative: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment
  ): atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer = js.native
  def createLContainer(
    hostNative: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    isForViewContainerRef: scala.Boolean
  ): atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer = js.native
  def createLContainer(
    hostNative: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment
  ): atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer = js.native
  def createLContainer(
    hostNative: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    isForViewContainerRef: scala.Boolean
  ): atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer = js.native
  def createLContainer(
    hostNative: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment
  ): atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer = js.native
  def createLContainer(
    hostNative: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    isForViewContainerRef: scala.Boolean
  ): atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer = js.native
  def createLContainer(
    hostNative: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment
  ): atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer = js.native
  def createLContainer(
    hostNative: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    isForViewContainerRef: scala.Boolean
  ): atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer = js.native
  def createLContainer(
    hostNative: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment
  ): atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer = js.native
  def createLContainer(
    hostNative: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    currentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    isForViewContainerRef: scala.Boolean
  ): atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer = js.native
  def createLViewData[T](
    parentViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: T,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: T,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: T,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer,
    injector: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: T,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags,
    sanitizer: scala.Null,
    injector: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: scala.Null,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: scala.Null,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: scala.Null,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer,
    injector: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: scala.Null,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags,
    sanitizer: scala.Null,
    injector: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: scala.Null,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: T,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: scala.Null,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: T,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: scala.Null,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: T,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer,
    injector: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: scala.Null,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: T,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags,
    sanitizer: scala.Null,
    injector: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: scala.Null,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: scala.Null,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: scala.Null,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: scala.Null,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: scala.Null,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: scala.Null,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer,
    injector: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createLViewData[T](
    parentViewData: scala.Null,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: scala.Null,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags,
    sanitizer: scala.Null,
    injector: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createNodeAtIndex(index: scala.Double, `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    name: java.lang.String
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    name: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    name: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    name: java.lang.String
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    name: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    name: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RText
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RText,
    name: java.lang.String
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RText,
    name: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RText,
    name: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: scala.Null,
    name: java.lang.String
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: scala.Null,
    name: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = js.native
  def createNodeAtIndex(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: scala.Null,
    name: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = js.native
  @JSName("createNodeAtIndex")
  def createNodeAtIndex_TElementContainerNode(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode = js.native
  @JSName("createNodeAtIndex")
  def createNodeAtIndex_TElementContainerNode(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment,
    name: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode = js.native
  @JSName("createNodeAtIndex")
  def createNodeAtIndex_TProjectionNode(index: scala.Double, `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType): atAngularCoreLib.srcRender3InterfacesNodeMod.TProjectionNode = js.native
  @JSName("createNodeAtIndex")
  def createNodeAtIndex_TProjectionNode(
    index: scala.Double,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    native: scala.Null,
    name: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TProjectionNode = js.native
  def createTNode(
    viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    adjustedIndex: scala.Double
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TNode = js.native
  def createTNode(
    viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    adjustedIndex: scala.Double,
    tagName: java.lang.String
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TNode = js.native
  def createTNode(
    viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    adjustedIndex: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TNode = js.native
  def createTNode(
    viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    adjustedIndex: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    tViews: js.Array[atAngularCoreLib.srcRender3InterfacesViewMod.TView]
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TNode = js.native
  def createTNode(
    viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    adjustedIndex: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    tViews: js.Array[atAngularCoreLib.srcRender3InterfacesViewMod.TView]
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TNode = js.native
  def createTNode(
    viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    adjustedIndex: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TNode = js.native
  def createTNode(
    viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    adjustedIndex: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    tViews: js.Array[atAngularCoreLib.srcRender3InterfacesViewMod.TView]
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TNode = js.native
  def createTNode(
    viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    `type`: atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType,
    adjustedIndex: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    tViews: js.Array[atAngularCoreLib.srcRender3InterfacesViewMod.TView]
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TNode = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[_]
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: scala.Null,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[_]
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: scala.Null,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: scala.Null,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[_]
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: scala.Null,
    pipes: scala.Null,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[_]
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(viewIndex: scala.Double, templateFn: scala.Null, consts: scala.Double, vars: scala.Double): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[_]
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: scala.Null,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[_]
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    directives: scala.Null,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    directives: scala.Null,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[_]
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createTView(
    viewIndex: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    directives: scala.Null,
    pipes: scala.Null,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[_]
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def createViewNode(index: scala.Double, view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): atAngularCoreLib.srcRender3InterfacesNodeMod.TViewNode = js.native
  def delegateToClassInput(tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode): scala.Double = js.native
  def detectChanges[T](component: T): scala.Unit = js.native
  def detectChangesInRootView(lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): scala.Unit = js.native
  def directiveInject[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T = js.native
  def directiveInject[T](
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T = js.native
  def directiveInject[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def directiveInject[T](
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T = js.native
  def element(index: scala.Double, name: java.lang.String): scala.Unit = js.native
  def element(
    index: scala.Double,
    name: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): scala.Unit = js.native
  def element(
    index: scala.Double,
    name: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def element(
    index: scala.Double,
    name: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def elementAttribute(index: scala.Double, name: java.lang.String, value: js.Any): scala.Unit = js.native
  def elementAttribute(
    index: scala.Double,
    name: java.lang.String,
    value: js.Any,
    sanitizer: atAngularCoreLib.srcRender3InterfacesSanitizationMod.SanitizerFn
  ): scala.Unit = js.native
  def elementClassProp(
    index: scala.Double,
    classIndex: scala.Double,
    value: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactory
  ): scala.Unit = js.native
  def elementClassProp(
    index: scala.Double,
    classIndex: scala.Double,
    value: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactory,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementClassProp(index: scala.Double, classIndex: scala.Double, value: scala.Boolean): scala.Unit = js.native
  def elementClassProp(index: scala.Double, classIndex: scala.Double, value: scala.Boolean, directiveIndex: scala.Double): scala.Unit = js.native
  def elementContainerEnd(): scala.Unit = js.native
  def elementContainerStart(index: scala.Double): scala.Unit = js.native
  def elementContainerStart(index: scala.Double, attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes): scala.Unit = js.native
  def elementContainerStart(
    index: scala.Double,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def elementContainerStart(index: scala.Double, attrs: scala.Null, localRefs: js.Array[java.lang.String]): scala.Unit = js.native
  def elementCreate(name: java.lang.String): atAngularCoreLib.srcRender3InterfacesRendererMod.RElement = js.native
  def elementCreate(
    name: java.lang.String,
    overriddenRenderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3
  ): atAngularCoreLib.srcRender3InterfacesRendererMod.RElement = js.native
  def elementEnd(): scala.Unit = js.native
  def elementProperty[T](index: scala.Double, propName: java.lang.String, value: T): scala.Unit = js.native
  def elementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: T,
    sanitizer: atAngularCoreLib.srcRender3InterfacesSanitizationMod.SanitizerFn
  ): scala.Unit = js.native
  def elementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE
  ): scala.Unit = js.native
  def elementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    sanitizer: atAngularCoreLib.srcRender3InterfacesSanitizationMod.SanitizerFn
  ): scala.Unit = js.native
  def elementStart(index: scala.Double, name: java.lang.String): scala.Unit = js.native
  def elementStart(
    index: scala.Double,
    name: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): scala.Unit = js.native
  def elementStart(
    index: scala.Double,
    name: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def elementStart(
    index: scala.Double,
    name: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def elementStyleProp(index: scala.Double, styleIndex: scala.Double): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: (nodeLib.String with java.lang.String) | java.lang.String
  ): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: (nodeLib.String with java.lang.String) | java.lang.String,
    suffix: java.lang.String
  ): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: (nodeLib.String with java.lang.String) | java.lang.String,
    suffix: java.lang.String,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactory
  ): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactory,
    suffix: java.lang.String
  ): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactory,
    suffix: java.lang.String,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStyleProp(index: scala.Double, styleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  def elementStyleProp(index: scala.Double, styleIndex: scala.Double, value: scala.Double, suffix: java.lang.String): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: scala.Double,
    suffix: java.lang.String,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStyleProp(index: scala.Double, styleIndex: scala.Double, value: scala.Null, suffix: java.lang.String): scala.Unit = js.native
  def elementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: scala.Null,
    suffix: java.lang.String,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStyling(): scala.Unit = js.native
  def elementStyling(
    classDeclarations: js.Array[
      scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags | java.lang.String
    ]
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: js.Array[
      scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags | java.lang.String
    ],
    styleDeclarations: js.Array[
      scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags | java.lang.String
    ]
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: js.Array[
      java.lang.String | scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags
    ],
    styleDeclarations: js.Array[
      java.lang.String | scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags
    ],
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: js.Array[
      java.lang.String | scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags
    ],
    styleDeclarations: js.Array[
      java.lang.String | scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags
    ],
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: js.Array[
      java.lang.String | scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags
    ],
    styleDeclarations: js.Array[
      java.lang.String | scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags
    ],
    styleSanitizer: scala.Null,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: js.Array[
      java.lang.String | scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags
    ],
    styleDeclarations: scala.Null,
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: js.Array[
      java.lang.String | scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags
    ],
    styleDeclarations: scala.Null,
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: js.Array[
      java.lang.String | scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags
    ],
    styleDeclarations: scala.Null,
    styleSanitizer: scala.Null,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: scala.Null,
    styleDeclarations: js.Array[
      scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags | java.lang.String
    ]
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: scala.Null,
    styleDeclarations: js.Array[
      java.lang.String | scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags
    ],
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: scala.Null,
    styleDeclarations: js.Array[
      java.lang.String | scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags
    ],
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: scala.Null,
    styleDeclarations: js.Array[
      java.lang.String | scala.Boolean | atAngularCoreLib.srcRender3InterfacesDefinitionMod.InitialStylingFlags
    ],
    styleSanitizer: scala.Null,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: scala.Null,
    styleDeclarations: scala.Null,
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: scala.Null,
    styleDeclarations: scala.Null,
    styleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStyling(
    classDeclarations: scala.Null,
    styleDeclarations: scala.Null,
    styleSanitizer: scala.Null,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStylingApply(index: scala.Double): scala.Unit = js.native
  def elementStylingApply(index: scala.Double, directiveIndex: scala.Double): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double, classes: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any],
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    styles: scala.Null,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double, classes: java.lang.String): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: java.lang.String,
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: java.lang.String,
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: java.lang.String,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: java.lang.String,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any],
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double, classes: java.lang.String, styles: scala.Null, directiveIndex: scala.Double): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double, classes: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: org.scalablytyped.runtime.StringDictionary[js.Any],
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: scala.Null,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double, classes: scala.Null, styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: scala.Null,
    styles: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE,
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: scala.Null,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def elementStylingMap[T](
    index: scala.Double,
    classes: scala.Null,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any],
    directiveIndex: scala.Double
  ): scala.Unit = js.native
  def elementStylingMap[T](index: scala.Double, classes: scala.Null, styles: scala.Null, directiveIndex: scala.Double): scala.Unit = js.native
  def embeddedViewEnd(): scala.Unit = js.native
  def embeddedViewStart(viewBlockId: scala.Double, consts: scala.Double, vars: scala.Double): atAngularCoreLib.srcRender3InterfacesDefinitionMod.RenderFlags = js.native
  def generateExpandoInstructionBlock(
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode,
    directiveCount: scala.Double
  ): scala.Unit = js.native
  def getBinding(bindingIndex: scala.Double): js.Any = js.native
  def getOrCreateTView(
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def getOrCreateTView(
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def getOrCreateTView(
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def getOrCreateTView(
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[_]
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def getOrCreateTView(
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: scala.Null,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[_]
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def getOrCreateTView(
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: scala.Null,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def getOrCreateTView(
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: scala.Null,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[_]
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def getOrCreateTView(
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    directives: scala.Null,
    pipes: scala.Null,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[_]
  ): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def initNodeFlags(
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode,
    index: scala.Double,
    numberOfDirectives: scala.Double
  ): scala.Unit = js.native
  def injectAttribute(attrNameToInject: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def instantiateRootComponent[T](
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[T]
  ): T = js.native
  def interpolation1(prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation2(prefix: java.lang.String, v0: js.Any, i0: java.lang.String, v1: js.Any, suffix: java.lang.String): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation3(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation4(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation5(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation6(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation7(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolation8(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def interpolationV(values: js.Array[_]): java.lang.String | atAngularCoreLib.srcRender3TokensMod.NO_CHANGE = js.native
  def listener(eventName: java.lang.String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _]): scala.Unit = js.native
  def listener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def load[T](index: scala.Double): T = js.native
  def loadQueryList[T](queryListIdx: scala.Double): atAngularCoreLib.srcLinkerMod.QueryList[T] = js.native
  def locateHostElement(
    factory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    elementOrSelector: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement
  ): atAngularCoreLib.srcRender3InterfacesRendererMod.RElement | scala.Null = js.native
  def locateHostElement(
    factory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    elementOrSelector: java.lang.String
  ): atAngularCoreLib.srcRender3InterfacesRendererMod.RElement | scala.Null = js.native
  def markDirty[T](component: T): scala.Unit = js.native
  def markViewDirty(view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): scala.Unit = js.native
  def namespaceHTML(): scala.Unit = js.native
  def namespaceMathML(): scala.Unit = js.native
  def namespaceSVG(): scala.Unit = js.native
  def nextContext[T](): T = js.native
  def nextContext[T](level: scala.Double): T = js.native
  def prefillHostVars(
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    totalHostVars: scala.Double
  ): scala.Unit = js.native
  def projection(nodeIndex: scala.Double): scala.Unit = js.native
  def projection(nodeIndex: scala.Double, selectorIndex: scala.Double): scala.Unit = js.native
  def projection(nodeIndex: scala.Double, selectorIndex: scala.Double, attrs: js.Array[java.lang.String]): scala.Unit = js.native
  def projectionDef(): scala.Unit = js.native
  def projectionDef(selectors: js.Array[atAngularCoreLib.srcRender3InterfacesProjectionMod.CssSelectorList]): scala.Unit = js.native
  def projectionDef(
    selectors: js.Array[atAngularCoreLib.srcRender3InterfacesProjectionMod.CssSelectorList],
    textSelectors: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def queueComponentIndexForCheck(previousOrParentTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode): scala.Unit = js.native
  def reference[T](index: scala.Double): T = js.native
  def refreshDescendantViews(viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): scala.Unit = js.native
  def refreshDescendantViews(
    viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    rf: atAngularCoreLib.srcRender3InterfacesDefinitionMod.RenderFlags
  ): scala.Unit = js.native
  def registerContentQuery[Q](queryList: atAngularCoreLib.srcLinkerMod.QueryList[Q], currentDirectiveIndex: scala.Double): scala.Unit = js.native
  def renderEmbeddedTemplate[T](
    viewToRender: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    context: T,
    rf: atAngularCoreLib.srcRender3InterfacesDefinitionMod.RenderFlags
  ): scala.Unit = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: scala.Null,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    directives: scala.Null,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    directives: scala.Null,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    directives: scala.Null,
    pipes: scala.Null,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: scala.Null,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: scala.Null,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: scala.Null,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: scala.Null,
    directives: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefListOrFactory,
    pipes: scala.Null,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: scala.Null,
    directives: scala.Null,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: scala.Null,
    directives: scala.Null,
    pipes: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefListOrFactory,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def renderTemplate[T](
    hostNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T],
    consts: scala.Double,
    vars: scala.Double,
    context: T,
    providedRendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    hostView: scala.Null,
    directives: scala.Null,
    pipes: scala.Null,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def scheduleTick[T](
    rootContext: atAngularCoreLib.srcRender3InterfacesViewMod.RootContext,
    flags: atAngularCoreLib.srcRender3InterfacesViewMod.RootContextFlags
  ): scala.Unit = js.native
  def setHostBindings(
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): scala.Unit = js.native
  def store[T](index: scala.Double, value: T): scala.Unit = js.native
  def storeCleanupFn(view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData, cleanupFn: js.Function): scala.Unit = js.native
  def storeCleanupWithContext(
    view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    context: js.Any,
    cleanupFn: js.Function
  ): scala.Unit = js.native
  def storeCleanupWithContext(view: scala.Null, context: js.Any, cleanupFn: js.Function): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(index: scala.Double, templateFn: scala.Null, consts: scala.Double, vars: scala.Double): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.srcRender3InterfacesNodeMod.TAttributes,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def template(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: scala.Null,
    localRefExtractor: atAngularCoreLib.srcRender3InterfacesNodeMod.LocalRefExtractor
  ): scala.Unit = js.native
  def text(index: scala.Double): scala.Unit = js.native
  def text(index: scala.Double, value: js.Any): scala.Unit = js.native
  def textBinding[T](index: scala.Double, value: T): scala.Unit = js.native
  def textBinding[T](index: scala.Double, value: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE): scala.Unit = js.native
  def tick[T](component: T): scala.Unit = js.native
  def updateBinding(bindingIndex: scala.Double, value: js.Any): js.Any = js.native
  def viewAttached(view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): scala.Boolean = js.native
}

