package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.EventManager")
@js.native
class EventManager () extends js.Object

@JSGlobal("Ext.EventManager")
@js.native
object EventManager extends js.Object {
  /** [Property] (Object) */
  var idleEvent: js.Any = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/Ext.Element/HTMLElement/Window The html element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function/String The handler function the event invokes. A String parameter is assumed to be method name in scope object, or Element object if no scope is provided.
  		* @param scope Object The scope (this reference) in which the handler function is executed. Defaults to the Element.
  		* @param options Object An object containing handler configuration properties. This may contain any of the following properties (See Ext.Element.addListener for examples of how to use these options.):
  		*/
  def addListener(): scala.Unit = js.native
  def addListener(el: js.Any): scala.Unit = js.native
  def addListener(el: js.Any, eventName: java.lang.String): scala.Unit = js.native
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any): scala.Unit = js.native
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any): scala.Unit = js.native
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Get the id of the element
  		* @param element HTMLElement/Ext.Element The element to get the id for.
  		* @returns String id
  		*/
  def getId(): java.lang.String = js.native
  def getId(element: js.Any): java.lang.String = js.native
  /** [Method] Indicates which event to use for getting key presses
  		* @returns String The appropriate event name.
  		*/
  def getKeyEvent(): java.lang.String = js.native
  /** [Method] Gets the x coordinate from the event
  		* @param event Object The event
  		* @returns Number The x coordinate
  		*/
  def getPageX(): scala.Double = js.native
  def getPageX(event: js.Any): scala.Double = js.native
  /** [Method] Gets the x amp y coordinate from the event
  		* @param event Object The event
  		* @returns Number[] The x/y coordinate
  		*/
  def getPageXY(): extjsLib.ExtNs.Array = js.native
  def getPageXY(event: js.Any): extjsLib.ExtNs.Array = js.native
  /** [Method] Gets the y coordinate from the event
  		* @param event Object The event
  		* @returns Number The y coordinate
  		*/
  def getPageY(): scala.Double = js.native
  def getPageY(event: js.Any): scala.Double = js.native
  /** [Method] Gets the related target from the event
  		* @param event Object The event
  		* @returns HTMLElement The related target.
  		*/
  def getRelatedTarget(): stdLib.HTMLElement = js.native
  def getRelatedTarget(event: js.Any): stdLib.HTMLElement = js.native
  /** [Method] Gets the target of the event
  		* @param event Object The event
  		* @returns HTMLElement target
  		*/
  def getTarget(): stdLib.HTMLElement = js.native
  def getTarget(event: js.Any): stdLib.HTMLElement = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/Ext.Element/HTMLElement/Window The html element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function/String The handler function the event invokes. A String parameter is assumed to be method name in scope object, or Element object if no scope is provided.
  		* @param scope Object The scope (this reference) in which the handler function is executed. Defaults to the Element.
  		* @param options Object An object containing handler configuration properties. This may contain any of the following properties (See Ext.Element.addListener for examples of how to use these options.):
  		*/
  def on(): scala.Unit = js.native
  def on(el: js.Any): scala.Unit = js.native
  def on(el: js.Any, eventName: java.lang.String): scala.Unit = js.native
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any): scala.Unit = js.native
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any): scala.Unit = js.native
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Adds a listener to be notified when the document is ready before onload and before images are loaded
  		* @param fn Function The method the event invokes.
  		* @param scope Object The scope (this reference) in which the handler function executes. Defaults to the browser window.
  		* @param options Object Options object as passed to Ext.Element.addListener.
  		*/
  def onDocumentReady(): scala.Unit = js.native
  def onDocumentReady(fn: js.Any): scala.Unit = js.native
  def onDocumentReady(fn: js.Any, scope: js.Any): scala.Unit = js.native
  def onDocumentReady(fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Adds a listener to be notified when the browser window is resized and provides resize event buffering 100 millisecon
  		* @param fn Function The handler function the window resize event invokes.
  		* @param scope Object The scope (this reference) in which the handler function executes. Defaults to the browser window.
  		* @param options Boolean Options object as passed to Ext.Element.addListener
  		*/
  def onWindowResize(): scala.Unit = js.native
  def onWindowResize(fn: js.Any): scala.Unit = js.native
  def onWindowResize(fn: js.Any, scope: js.Any): scala.Unit = js.native
  def onWindowResize(fn: js.Any, scope: js.Any, options: scala.Boolean): scala.Unit = js.native
  /** [Method] Adds a listener to be notified when the browser window is unloaded
  		* @param fn Function The handler function the window unload event invokes.
  		* @param scope Object The scope (this reference) in which the handler function executes. Defaults to the browser window.
  		* @param options Boolean Options object as passed to Ext.Element.addListener
  		*/
  def onWindowUnload(): scala.Unit = js.native
  def onWindowUnload(fn: js.Any): scala.Unit = js.native
  def onWindowUnload(fn: js.Any, scope: js.Any): scala.Unit = js.native
  def onWindowUnload(fn: js.Any, scope: js.Any, options: scala.Boolean): scala.Unit = js.native
  /** [Method] This strategy has minimal benefits for Sencha solutions that build themselves ie  */
  def pollScroll(): scala.Unit = js.native
  /** [Method] Prevents the browsers default handling of the event
  		* @param event Event The event to prevent the default
  		*/
  def preventDefault(): scala.Unit = js.native
  def preventDefault(event: stdLib.Event): scala.Unit = js.native
  /** [Method] Recursively removes all previous added listeners from an element and its children
  		* @param el String/Ext.Element/HTMLElement/Window The id or html element from which to remove all event handlers.
  		* @param eventName String The name of the event.
  		*/
  def purgeElement(): scala.Unit = js.native
  def purgeElement(el: js.Any): scala.Unit = js.native
  def purgeElement(el: js.Any, eventName: java.lang.String): scala.Unit = js.native
  /** [Method] Removes all event handers from an element
  		* @param el String/Ext.Element/HTMLElement/Window The id or html element from which to remove all event handlers.
  		*/
  def removeAll(): scala.Unit = js.native
  def removeAll(el: js.Any): scala.Unit = js.native
  /** [Method] Removes an event handler from an element
  		* @param el String/Ext.Element/HTMLElement/Window The id or html element from which to remove the listener.
  		* @param eventName String The name of the event.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		*/
  def removeListener(): scala.Unit = js.native
  def removeListener(el: js.Any): scala.Unit = js.native
  def removeListener(el: js.Any, eventName: java.lang.String): scala.Unit = js.native
  def removeListener(el: js.Any, eventName: java.lang.String, fn: js.Any): scala.Unit = js.native
  def removeListener(el: js.Any, eventName: java.lang.String, fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Removes the passed window resize listener
  		* @param fn Function The method the event invokes
  		* @param scope Object The scope of handler
  		*/
  def removeResizeListener(): scala.Unit = js.native
  def removeResizeListener(fn: js.Any): scala.Unit = js.native
  def removeResizeListener(fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Removes the passed window unload listener
  		* @param fn Function The method the event invokes
  		* @param scope Object The scope of handler
  		*/
  def removeUnloadListener(): scala.Unit = js.native
  def removeUnloadListener(fn: js.Any): scala.Unit = js.native
  def removeUnloadListener(fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Stop the event preventDefault and stopPropagation
  		* @param event Event The event to stop
  		*/
  def stopEvent(): scala.Unit = js.native
  def stopEvent(event: stdLib.Event): scala.Unit = js.native
  /** [Method] Cancels bubbling of the event
  		* @param event Event The event to stop bubbling.
  		*/
  def stopPropagation(): scala.Unit = js.native
  def stopPropagation(event: stdLib.Event): scala.Unit = js.native
  /** [Method] Removes an event handler from an element
  		* @param el String/Ext.Element/HTMLElement/Window The id or html element from which to remove the listener.
  		* @param eventName String The name of the event.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		*/
  def un(): scala.Unit = js.native
  def un(el: js.Any): scala.Unit = js.native
  def un(el: js.Any, eventName: java.lang.String): scala.Unit = js.native
  def un(el: js.Any, eventName: java.lang.String, fn: js.Any): scala.Unit = js.native
  def un(el: js.Any, eventName: java.lang.String, fn: js.Any, scope: js.Any): scala.Unit = js.native
}

