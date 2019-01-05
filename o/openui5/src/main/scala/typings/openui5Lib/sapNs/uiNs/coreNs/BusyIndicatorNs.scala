package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.BusyIndicator")
@js.native
object BusyIndicatorNs extends js.Object {
  /**
    * Registers a handler for the "close" event
    * @param fnFunction The function to call, when the event occurs.           This function will be
    * called on the oListener-instance (if           present) or in a 'static way'.
    * @param oListener Object on which to call the given function.
    * @returns <code>this</code> to allow method chaining
    */
  def attachClose(fnFunction: js.Any): openui5Lib.Anon_AttachClose = js.native
  def attachClose(fnFunction: js.Any, oListener: js.Any): openui5Lib.Anon_AttachClose = js.native
  /**
    * Registers a handler for the "open" event.
    * @param fnFunction The function to call, when the event occurs. This           function will be
    * called on the oListener-instance (if present)           or in a 'static way'.
    * @param oListener Object on which to call the given function.
    * @returns <code>this</code> to allow method chaining
    */
  def attachOpen(fnFunction: js.Any): openui5Lib.Anon_AttachClose = js.native
  def attachOpen(fnFunction: js.Any, oListener: js.Any): openui5Lib.Anon_AttachClose = js.native
  /**
    * Unregisters a handler for the "close" event
    * @param fnFunction The callback function to unregister
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachClose(fnFunction: js.Any, oListener: js.Any): openui5Lib.Anon_AttachClose = js.native
  /**
    * Unregisters a handler for the "open" event
    * @param fnFunction The callback function to unregister
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachOpen(fnFunction: js.Any, oListener: js.Any): openui5Lib.Anon_AttachClose = js.native
  /**
    * Removes the BusyIndicator from the screen
    */
  def hide(): scala.Unit = js.native
  /**
    * Displays the BusyIndicator and starts blocking all user input.This only happens after some delay and
    * if after that delay theBusyIndicator.hide() has not yet been called in the meantime.There is a
    * certain default value for the delay, but that one can beoverridden.
    * @param iDelay The delay in milliseconds before opening the                      BusyIndicator. It is
    * not opened if hide() is called                      before end of the delay. If no delay (or no
    * valid                      delay) is given, the default value is used.
    */
  def show(iDelay: scala.Double): scala.Unit = js.native
}

