package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays a SplitView which renders a collapsable pane next to arbitrary HTML content.
  **/
@JSGlobal("WinJS.UI.SplitView")
@js.native
/**
  * Creates a new SplitView.
  * @constructor
  * @param element The DOM element hosts the new SplitView.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class SplitView () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  /**
    * Gets or sets the display mode of the SplitView's pane when it is closed.
    **/
  var closedDisplayMode: java.lang.String = js.native
  /**
    * Gets the DOM element that hosts the SplitView's content.
    **/
  var contentElement: stdLib.HTMLElement = js.native
  /**
    * Gets the DOM element that hosts the SplitView control.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * Gets or sets the display mode of the SplitView's pane when it is open.
    **/
  var openedDisplayMode: java.lang.String = js.native
  /**
    * Gets the DOM element that hosts the SplitView pane.
    **/
  var paneElement: stdLib.HTMLElement = js.native
  /**
    * Gets or sets whether the SpitView's pane is currently open.
    **/
  var paneOpened: scala.Boolean = js.native
  /**
    * Gets or sets the placement of the SplitView's pane.
    **/
  var panePlacement: java.lang.String = js.native
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Closes the SplitView's pane.
    **/
  def closePane(): scala.Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
    * Disposes this control.
    **/
  def dispose(): scala.Unit = js.native
  /**
    * Raised immediately after the pane is fully closed.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterclose(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Raised immediately after the pane is fully open.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafteropen(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Raised just before closing the pane. Call preventDefault on this event to stop the pane from closing.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeclose(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Raised just before opening the pane. Call preventDefault on this event to stop the pane from opening.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeopen(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Opens the SplitView's pane.
    **/
  def openPane(): scala.Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function): scala.Unit = js.native
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
}

/**
  * Displays a SplitView which renders a collapsable pane next to arbitrary HTML content.
  **/
@JSGlobal("WinJS.UI.SplitView")
@js.native
object SplitView extends js.Object {
  /**
    * Display options for a SplitView's pane when it is closed.
    **/
  var ClosedDisplayMode: winjsLib.Anon_Inline = js.native
  /**
    * Display options for a SplitView's pane when it is open.
    **/
  var OpenedDisplayMode: winjsLib.Anon_InlineOverlay = js.native
  /**
    * Placement options for a SplitView's pane.
    **/
  var PanePlacement: winjsLib.Anon_BottomLeft = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
}

