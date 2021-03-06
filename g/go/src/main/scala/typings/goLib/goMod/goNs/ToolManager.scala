package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This special Tool is responsible for managing all of the Diagram's
  * mode-less tools.
  */
@js.native
trait ToolManager extends Tool {
  /**Gets or sets the mode-less ActionTool, normally one of the .mouseDownTools.*/
  var actionTool: ActionTool = js.native
  /**Gets or sets the mode-less ClickCreatingTool, normally one of the .mouseUpTools.*/
  var clickCreatingTool: ClickCreatingTool = js.native
  /**Gets or sets the mode-less ClickSelectingTool, normally one of the .mouseUpTools.*/
  var clickSelectingTool: ClickSelectingTool = js.native
  /**Gets or sets the mode-less ContextMenuTool, normally one of the .mouseUpTools.*/
  var contextMenuTool: ContextMenuTool = js.native
  /**This read-only property returns the currently showing tooltip, or null if there is none.*/
  var currentToolTip: Adornment = js.native
  /**Gets or sets the mode-less DragSelectingTool, normally one of the .mouseMoveTools.*/
  var dragSelectingTool: DragSelectingTool = js.native
  /**Gets or sets the distance in view coordinates within which a mouse down-and-up is considered a click and beyond which a mouse movement is considered a drag.*/
  var dragSize: Size = js.native
  /**Gets or sets the mode-less DraggingTool, normally one of the .mouseMoveTools.*/
  var draggingTool: DraggingTool = js.native
  /**Gets or sets the time between when the mouse stops moving and a hold event, in milliseconds.*/
  var holdDelay: scala.Double = js.native
  /**Gets or sets the time between when the mouse stops moving and a hover event, in milliseconds.*/
  var hoverDelay: scala.Double = js.native
  /**Gets or sets the mode-less LinkReshapingTool, normally one of the .mouseDownTools.*/
  var linkReshapingTool: LinkReshapingTool = js.native
  /**Gets or sets the mode-less LinkingTool, normally one of the .mouseMoveTools.*/
  var linkingTool: LinkingTool = js.native
  /**This read-only property returns the list of Tools that might be started upon a mouse-down event.*/
  var mouseDownTools: List[Tool] = js.native
  /**This read-only property returns the list of Tools that might be started upon a mouse-move event.*/
  var mouseMoveTools: List[Tool] = js.native
  /**This read-only property returns the list of Tools that might be started upon a mouse-up event.*/
  var mouseUpTools: List[Tool] = js.native
  /**Gets or sets the ToolManager's mouse wheel behavior.*/
  var mouseWheelBehavior: EnumValue = js.native
  /**Gets or sets the mode-less PanningTool, normally one of the .mouseMoveTools.*/
  var panningTool: PanningTool = js.native
  /**Gets or sets the mode-less RelinkingTool, normally one of the .mouseDownTools.*/
  var relinkingTool: RelinkingTool = js.native
  /**Gets or sets the mode-less ResizingTool, normally one of the .mouseDownTools.*/
  var resizingTool: ResizingTool = js.native
  /**Gets or sets the mode-less RotatingTool, normally one of the .mouseDownTools.*/
  var rotatingTool: RotatingTool = js.native
  /**Gets or sets the mode-less TextEditingTool, normally one of the .mouseUpTools.*/
  var textEditingTool: TextEditingTool = js.native
  /**
    * Implement the standard behavior for mouse hover and mouse hold events, called by .doWaitAfter when the mouse has not moved for a period of time.
    */
  def doMouseHover(): scala.Unit = js.native
  /**
    * Implement the standard behavior for tooltips, called by .doWaitAfter when the mouse has not moved for a period of time.
    */
  def doToolTip(): scala.Unit = js.native
  /**
    * Find a mouse tool of a given name.
    * @param {string} name
    */
  def findTool(name: java.lang.String): Tool = js.native
  /**
    * Hide any tooltip.
    */
  def hideToolTip(): scala.Unit = js.native
  /**
    * Initialize the three mouse tool lists with instances of the standard tools.
    */
  def initializeStandardTools(): scala.Unit = js.native
  /**
    * This is called by .showToolTip to position the part within the viewport.
    * @param {Adornment} tooltip
    * @param {GraphObject} obj The GraphObject getting the tooltip.
    */
  def positionToolTip(tooltip: Adornment, obj: GraphObject): scala.Unit = js.native
  /**
    * Replace a mouse tool of a given name with a new tool.
    * @param {string} name the type of tool, such as "Dragging" or "ClickSelecting".
    * @param {Tool} newtool If null, any tool that the search finds will just be removed
    * from the list in which it was found.
    */
  def replaceTool(name: java.lang.String, newtool: Tool): Tool = js.native
  /**
    * Show a tooltip Adornment.
    * @param {Adornment} tooltip
    * @param {GraphObject} obj The GraphObject getting the tooltip; this is null if the tooltip is being shown for the diagram background.
    */
  def showToolTip(tooltip: Adornment, obj: GraphObject): scala.Unit = js.native
}

