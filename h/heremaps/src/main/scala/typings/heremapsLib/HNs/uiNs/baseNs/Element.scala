package typings
package heremapsLib.HNs.uiNs.baseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("H.ui.base.Element")
@js.native
/**
  * Constructor
  * @param opt_elementType {string=} - the type of HTML element this UI element renders as, default is 'div'
  * @param opt_className {string=} - an optional class name to be used on this element
  */
class Element ()
  extends heremapsLib.HNs.utilNs.EventTarget {
  def this(opt_elementType: java.lang.String) = this()
  def this(opt_elementType: java.lang.String, opt_className: java.lang.String) = this()
  /**
    * This method adds a CSS class to this UI element (if it is not already present).
    * @param className {string} - the CSS class name to add
    * @returns {H.ui.base.Element} - this UI element instance
    */
  def addClass(className: java.lang.String): Element = js.native
  /**
    * This method returns a previously stored arbitrary data from this element.
    * @returns {*} - the previously stored data object or null if not data was stored.
    */
  def getData(): js.Any = js.native
  /**
    * This method returns the HTML element this UI element renders.
    *
    * Note: Before the UI element was rendered the method returns null.
    * @returns {?HTMLElement} - the element
    */
  def getElement(): stdLib.HTMLElement = js.native
  /**
    * Returns the visibility of this element.
    * @returns {boolean} - visibility
    */
  def getVisibility(): scala.Boolean = js.native
  /**
    * This method returns this UI element's disabled state as a boolean value.
    * @returns {boolean} - true if the element is disabled, false otherwise
    */
  def isDisabled(): scala.Boolean = js.native
  /**
    * This method removes a CSS class from this UI element (if it is present).
    * @param className {string} - the CSS class name to remove
    * @returns {H.ui.base.Element} - this UI element instance
    */
  def removeClass(className: java.lang.String): Element = js.native
  /**
    * This method is the concrete implementation of the UI element. This method receives the pre-rendered HTML element which may be modified by deriving classes.
    * @param element {Element} - this UI element's HTML representation
    * @param doc {Document} - the HTML document into which the element is currently being rendered
    */
  def renderInternal(element: heremapsLib.HNs.uiNs.ES6Element, doc: stdLib.Document): scala.Unit = js.native
  /**
    * This method stores arbitrary data with this UI element.
    * @param data {*} - the data to be stored
    */
  def setData(data: js.Any): scala.Unit = js.native
  /**
    * This method set's the disabled state of this UI element.
    * @param disabled {boolean} - true to disable the element, false to enable it
    * @param opt_force {boolean=} - an optional boolean flag indicating that the value should be set and propagated even if it is the same as the current state
    * @returns {H.ui.base.Element} - this element instance
    */
  def setDisabled(disabled: scala.Boolean): heremapsLib.HNs.uiNs.ES6Element = js.native
  def setDisabled(disabled: scala.Boolean, opt_force: scala.Boolean): heremapsLib.HNs.uiNs.ES6Element = js.native
  /**
    * Sets the visibility of this element.
    * @param visibility {boolean} - visibility
    */
  def setVisibility(visibility: scala.Boolean): scala.Unit = js.native
}

