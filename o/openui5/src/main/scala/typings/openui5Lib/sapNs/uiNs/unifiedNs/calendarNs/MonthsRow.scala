package typings
package openui5Lib.sapNs.uiNs.unifiedNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.calendar.MonthsRow")
@js.native
class MonthsRow protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new <code>MonthsRow</code>.It shows a calendar with month granularity<b>Note:</b>
    * This is used inside the CalendarMonthInterval, not for standalone usage.Accepts an object literal
    * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
    * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): MonthsRow = js.native
  def addAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): MonthsRow = js.native
  /**
    * Adds some selectedDate to the aggregation <code>selectedDates</code>.
    * @param oSelectedDate the selectedDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSelectedDate(oSelectedDate: openui5Lib.sapNs.uiNs.unifiedNs.DateRange): MonthsRow = js.native
  /**
    * Adds some specialDate to the aggregation <code>specialDates</code>.
    * @param oSpecialDate the specialDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSpecialDate(oSpecialDate: openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange): MonthsRow = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>focus</code> event of this
    * <code>sap.ui.unified.calendar.MonthsRow</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.calendar.MonthsRow</code> itself.Month focus changed
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.calendar.MonthsRow</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachFocus(oData: js.Any, fnFunction: js.Any): MonthsRow = js.native
  def attachFocus(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MonthsRow = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
    * <code>sap.ui.unified.calendar.MonthsRow</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.calendar.MonthsRow</code> itself.Month selection changed
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.calendar.MonthsRow</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelect(oData: js.Any, fnFunction: js.Any): MonthsRow = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MonthsRow = js.native
  /**
    * Checks if a date is focusable in the current rendered output.This means that if it is not rendered,
    * it is not focusable.
    * @param oDate JavaScript Date object for focused date.
    * @returns flag if focusable
    */
  def checkDateFocusable(oDate: js.Any): scala.Boolean = js.native
  /**
    * Destroys all the selectedDates in the aggregation <code>selectedDates</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySelectedDates(): MonthsRow = js.native
  /**
    * Destroys all the specialDates in the aggregation <code>specialDates</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySpecialDates(): MonthsRow = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>focus</code> event of this
    * <code>sap.ui.unified.calendar.MonthsRow</code>.The passed function and listener object must match
    * the ones used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachFocus(fnFunction: js.Any, oListener: js.Any): MonthsRow = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.ui.unified.calendar.MonthsRow</code>.The passed function and listener object must match
    * the ones used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): MonthsRow = js.native
  /**
    * Displays the month of a given date without setting the focus
    * @param oDate JavaScript Date object for focused date.
    * @returns <code>this</code> to allow method chaining
    */
  def displayDate(oDate: js.Any): MonthsRow = js.native
  /**
    * Fires event <code>focus</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>date</code> of type <code>object</code>First date, as JavaScript Date
    * object, of the month that is focused.</li><li><code>notVisible</code> of type <code>boolean</code>If
    * set, the focused date is not rendered yet. (This happens by navigating out of the visible
    * area.)</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireFocus(mArguments: js.Any): MonthsRow = js.native
  /**
    * Fires event <code>select</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): MonthsRow = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>date</code>.A date as JavaScript Date object. The month
    * including this date is rendered and this date is focused initially (if no other focus is set).If the
    * date property is not in the range <code>startDate</code> + <code>months</code> in the rendering
    * phase,it is set to the <code>startDate</code>.So after setting the <code>startDate</code> the date
    * should be set to be in the visible range.
    * @returns Value of property <code>date</code>
    */
  def getDate(): js.Any = js.native
  /**
    * Gets current value of property <code>intervalSelection</code>.If set, interval selection is
    * allowedDefault value is <code>false</code>.
    * @returns Value of property <code>intervalSelection</code>
    */
  def getIntervalSelection(): scala.Boolean = js.native
  /**
    * ID of the element which is the current target of the association <code>legend</code>, or
    * <code>null</code>.
    * @since 1.38.5
    */
  def getLegend(): js.Any = js.native
  /**
    * Gets current value of property <code>months</code>.Number of months displayedDefault value is
    * <code>12</code>.
    * @returns Value of property <code>months</code>
    */
  def getMonths(): scala.Double = js.native
  /**
    * Gets content of aggregation <code>selectedDates</code>.Date ranges for selected dates.If
    * <code>singleSelection</code> is set, only the first entry is used.<b>Note:</b> Even if only one day
    * is selected, the whole corresponding month is selected.
    */
  def getSelectedDates(): js.Array[openui5Lib.sapNs.uiNs.unifiedNs.DateRange] = js.native
  /**
    * Gets current value of property <code>showHeader</code>.If set, a header with the years is shown to
    * visualize what month belongs to what year.Default value is <code>false</code>.
    * @returns Value of property <code>showHeader</code>
    */
  def getShowHeader(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>singleSelection</code>.If set, only a single month or interval,
    * if intervalSelection is enabled, can be selected<b>Note:</b> Selection of multiple intervals is not
    * supported in the current version.Default value is <code>true</code>.
    * @returns Value of property <code>singleSelection</code>
    */
  def getSingleSelection(): scala.Boolean = js.native
  /**
    * Gets content of aggregation <code>specialDates</code>.Date ranges with type to visualize special
    * months in the row.If one day is assigned to more than one type, only the first one will be
    * used.<b>Note:</b> Even if only one day is set as a special day, the whole corresponding month is
    * displayed in this way.
    */
  def getSpecialDates(): js.Array[openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange] = js.native
  /**
    * Gets current value of property <code>startDate</code>.Start date, as JavaScript Date object, of the
    * row. The month of this date is the first month of the displayed row.
    * @returns Value of property <code>startDate</code>
    */
  def getStartDate(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.DateRange</code> in the aggregation
    * <code>selectedDates</code>.and returns its index if found or -1 otherwise.
    * @param oSelectedDate The selectedDate whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSelectedDate(oSelectedDate: openui5Lib.sapNs.uiNs.unifiedNs.DateRange): scala.Double = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.DateTypeRange</code> in the aggregation
    * <code>specialDates</code>.and returns its index if found or -1 otherwise.
    * @param oSpecialDate The specialDate whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSpecialDate(oSpecialDate: openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange): scala.Double = js.native
  /**
    * Inserts a selectedDate into the aggregation <code>selectedDates</code>.
    * @param oSelectedDate the selectedDate to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the selectedDate should be inserted at; for            
    * a negative value of <code>iIndex</code>, the selectedDate is inserted at position 0; for a value    
    *         greater than the current size of the aggregation, the selectedDate is inserted at           
    *  the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSelectedDate(oSelectedDate: openui5Lib.sapNs.uiNs.unifiedNs.DateRange, iIndex: scala.Double): MonthsRow = js.native
  /**
    * Inserts a specialDate into the aggregation <code>specialDates</code>.
    * @param oSpecialDate the specialDate to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the specialDate should be inserted at; for            
    * a negative value of <code>iIndex</code>, the specialDate is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the specialDate is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSpecialDate(oSpecialDate: openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange, iIndex: scala.Double): MonthsRow = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Removes all the controls from the aggregation <code>selectedDates</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSelectedDates(): js.Array[openui5Lib.sapNs.uiNs.unifiedNs.DateRange] = js.native
  /**
    * Removes all the controls from the aggregation <code>specialDates</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSpecialDates(): js.Array[openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: scala.Double): js.Any = js.native
  def removeSelectedDate(vSelectedDate: java.lang.String): openui5Lib.sapNs.uiNs.unifiedNs.DateRange = js.native
  def removeSelectedDate(vSelectedDate: openui5Lib.sapNs.uiNs.unifiedNs.DateRange): openui5Lib.sapNs.uiNs.unifiedNs.DateRange = js.native
  /**
    * Removes a selectedDate from the aggregation <code>selectedDates</code>.
    * @param vSelectedDate The selectedDate to remove or its index or id
    * @returns The removed selectedDate or <code>null</code>
    */
  def removeSelectedDate(vSelectedDate: scala.Double): openui5Lib.sapNs.uiNs.unifiedNs.DateRange = js.native
  def removeSpecialDate(vSpecialDate: java.lang.String): openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange = js.native
  def removeSpecialDate(vSpecialDate: openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange): openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange = js.native
  /**
    * Removes a specialDate from the aggregation <code>specialDates</code>.
    * @param vSpecialDate The specialDate to remove or its index or id
    * @returns The removed specialDate or <code>null</code>
    */
  def removeSpecialDate(vSpecialDate: scala.Double): openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange = js.native
  /**
    * Sets a new value for property <code>date</code>.A date as JavaScript Date object. The month
    * including this date is rendered and this date is focused initially (if no other focus is set).If the
    * date property is not in the range <code>startDate</code> + <code>months</code> in the rendering
    * phase,it is set to the <code>startDate</code>.So after setting the <code>startDate</code> the date
    * should be set to be in the visible range.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param oDate New value for property <code>date</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDate(oDate: js.Any): MonthsRow = js.native
  /**
    * Sets a new value for property <code>intervalSelection</code>.If set, interval selection is
    * allowedWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @param bIntervalSelection New value for property <code>intervalSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntervalSelection(bIntervalSelection: scala.Boolean): MonthsRow = js.native
  /**
    * Sets the associated <code>legend</code>.
    * @since 1.38.5
    * @param oLegend ID of an element which becomes the new target of this legend association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLegend(oLegend: js.Any): MonthsRow = js.native
  def setLegend(oLegend: openui5Lib.sapNs.uiNs.unifiedNs.CalendarLegend): MonthsRow = js.native
  /**
    * Sets a new value for property <code>months</code>.Number of months displayedWhen called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>12</code>.
    * @param iMonths New value for property <code>months</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMonths(iMonths: scala.Double): MonthsRow = js.native
  /**
    * Sets a new value for property <code>showHeader</code>.If set, a header with the years is shown to
    * visualize what month belongs to what year.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bShowHeader New value for property <code>showHeader</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowHeader(bShowHeader: scala.Boolean): MonthsRow = js.native
  /**
    * Sets a new value for property <code>singleSelection</code>.If set, only a single month or interval,
    * if intervalSelection is enabled, can be selected<b>Note:</b> Selection of multiple intervals is not
    * supported in the current version.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bSingleSelection New value for property <code>singleSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSingleSelection(bSingleSelection: scala.Boolean): MonthsRow = js.native
  /**
    * Sets a new value for property <code>startDate</code>.Start date, as JavaScript Date object, of the
    * row. The month of this date is the first month of the displayed row.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param oStartDate New value for property <code>startDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStartDate(oStartDate: js.Any): MonthsRow = js.native
}

