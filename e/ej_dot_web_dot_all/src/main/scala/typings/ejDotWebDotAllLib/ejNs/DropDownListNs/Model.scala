package typings
package ejDotWebDotAllLib.ejNs.DropDownListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires the action before the XHR request.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, scala.Unit]] = js.undefined
  /** Fires the action when the list of items is bound to the DropDownList by xhr post calling
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit]] = js.undefined
  /** Fires the action when the xhr post calling failed on remote data binding with the DropDownList control.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, scala.Unit]] = js.undefined
  /** Fires the action when the xhr post calling succeed on remote data binding with the DropDownList control
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, scala.Unit]] = js.undefined
  /** The Virtual Scrolling(lazy loading) feature is used to display a large amount of data that you require without buffering the entire load of a huge database records in the
    * DropDownList, that is, when scrolling, an AJAX request is sent to fetch some amount of data from the server dynamically. To achieve this scenario with DropDownList, set the
    * allowVirtualScrolling to true.
    * @Default {false}
    */
  var allowVirtualScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires the action before the popup is ready to hide.
    */
  var beforePopupHide: js.UndefOr[js.Function1[/* e */ BeforePopupHideEventArgs, scala.Unit]] = js.undefined
  /** Fires the action before the popup is ready to be displayed.
    */
  var beforePopupShown: js.UndefOr[js.Function1[/* e */ BeforePopupShownEventArgs, scala.Unit]] = js.undefined
  /** Fires when the cascading happens between two DropDownList exactly after the value changes in the first dropdown and before filtering in the second Dropdown.
    */
  var cascade: js.UndefOr[js.Function1[/* e */ CascadeEventArgs, scala.Unit]] = js.undefined
  /** The cascading DropDownLists is a series of two or more DropDownLists in which each DropDownList is filtered according to the previous DropDownListâ€™s value.
    * @Default {null}
    */
  var cascadeTo: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the case sensitivity of the search operation. It supports both enableFilterSearch and enableIncrementalSearch property.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires the action when the DropDownList controlâ€™s value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires the action when the list item checkbox value is changed.
    */
  var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires the action once the DropDownList is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Dropdown widget's style and appearance can be controlled based on 13 different default built-in themes.You can customize the appearance of the dropdown by using the cssClass
    * property. You need to specify a class name in the cssClass property and the same class name is used before the class definitions wherever the custom styles are applied.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires the action when the list items is bound to the DropDownList.
    */
  var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, scala.Unit]] = js.undefined
  /** This property is used to serve data from the data services based on the query provided. To bind the data to the dropdown widget, the dataSource property is assigned with the
    * instance of the ej.DataManager.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled with the dropdown. When you enter the delimiter value, the texts after the delimiter are
    * considered as a separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,) or semi-colon (;) or
    * any other special character.
    * @Default {','}
    */
  var delimiterChar: js.UndefOr[java.lang.String] = js.undefined
  /** Fires the action when the DropDownList is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** The enabled Animation property uses the easeOutQuad animation to SlideDown and SlideUp the Popup list in 200 and 100 milliseconds, respectively.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** This property selects the item in the DropDownList when the item is entered in the Search textbox.
    * @Default {false}
    */
  var enableFilterSearch: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies to perform incremental search for the selection of items from the DropDownList with the help of this property. This helps in selecting the item by using the typed
    * character.
    * @Default {true}
    */
  var enableIncrementalSearch: js.UndefOr[scala.Boolean] = js.undefined
  /** Saves the current model value to the browser cookies for state maintenance. While refreshing the DropDownList control page, it retains the model value and it is applied from the
    * browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** This enables the resize handler to resize the popup to any size.
    * @Default {false}
    */
  var enablePopupResize: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the DropDownList textbox direction from right to left align.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** The serverfiltering is to perform filter action when text is typed in the search box and filtering will be done based on the collection which contains the matched item from entire
    * datasource. Serverfiltering will be done based on the entire items in DataSource.
    * @Default {false}
    */
  var enableServerFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /** This property is used to sort the Items in the DropDownList. By default, it sorts the items in an ascending order.
    * @Default {false}
    */
  var enableSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** This property is used to indicate whether the DropDownList control responds to the user interaction or not. By default, the control is in the enabled mode and you can disable it
    * by setting it to false.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the mapping fields for the data items of the DropDownList.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** When the enableFilterSearch property value is set to true, the values in the DropDownList shows the items starting with or containing the key word/letter typed in the Search
    * textbox.
    * @Default {ej.FilterType.Contains}
    */
  var filterType: js.UndefOr[ejDotWebDotAllLib.ejNs.FilterType | java.lang.String] = js.undefined
  /** Fires the action when the DropDownList is focused.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, scala.Unit]] = js.undefined
  /** Fires the action when the DropDownList is about to lose focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, scala.Unit]] = js.undefined
  /** Used to create visualized header for dropdown items
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the height of the DropDownList textbox.
    * @Default {null}
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** It sets the given HTML attributes for the DropDownList control such as ID, name, disabled, etc.
    * @Default {null}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Data can be fetched in the DropDownList control by using the DataSource, specifying the number of items.
    * @Default {5}
    */
  var itemsCount: js.UndefOr[scala.Double] = js.undefined
  /** The property is used to determine whether the popup list is generated dynamically.
    * @Default {false}
    */
  var loadOnDemand: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows the user to set the particular country or region language for the DropDownList.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the maximum height of the suggestion box. This property restricts the maximum height of the popup when resize is enabled.
    * @Default {null}
    */
  var maxPopupHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Defines the maximum width of the suggestion box. This property restricts the maximum width of the popup when resize is enabled.
    * @Default {null}
    */
  var maxPopupWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Defines the minimum height of the suggestion box. This property restricts the minimum height of the popup when resize is enabled.
    * @Default {null}
    */
  var minPopupHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Defines the minimum height of the suggestion box. This property restricts the minimum height of the popup when resize is enabled.
    * @Default {0}
    */
  var minPopupWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** With the help of this property, you can make a single or multi selection with the DropDownList and display the text in two modes, delimiter and visual mode. In delimiter mode, you
    * can separate the items by using the delimiter character such as comma (,) or semi-colon (;) or any other special character. In the visual mode, the items are showcased like boxes
    * with close icon in the textbox.
    * @Default {ej.MultiSelectMode.None}
    */
  var multiSelectMode: js.UndefOr[ejDotWebDotAllLib.ejNs.MultiSelectMode | java.lang.String] = js.undefined
  /** Defines the height of the suggestion popup box in the DropDownList control.
    * @Default {152px}
    */
  var popupHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Fires the action, once the popup is closed
    */
  var popupHide: js.UndefOr[js.Function1[/* e */ PopupHideEventArgs, scala.Unit]] = js.undefined
  /** Fires the action, when the popup is resized.
    */
  var popupResize: js.UndefOr[js.Function1[/* e */ PopupResizeEventArgs, scala.Unit]] = js.undefined
  /** Fires the action, when resizing a popup starts.
    */
  var popupResizeStart: js.UndefOr[js.Function1[/* e */ PopupResizeStartEventArgs, scala.Unit]] = js.undefined
  /** Fires the action, when the popup resizing is stopped.
    */
  var popupResizeStop: js.UndefOr[js.Function1[/* e */ PopupResizeStopEventArgs, scala.Unit]] = js.undefined
  /** Fires the action, once the popup is opened.
    */
  var popupShown: js.UndefOr[js.Function1[/* e */ PopupShownEventArgs, scala.Unit]] = js.undefined
  /** Defines the width of the suggestion popup box in the DropDownList control.
    * @Default {auto}
    */
  var popupWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies the query to retrieve the data from the DataSource.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Specifies that the DropDownList textbox values should be read-only.
    * @Default {false}
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires the action before filtering the list items that starts in the DropDownList when the enableFilterSearch is enabled.
    */
  var search: js.UndefOr[js.Function1[/* e */ SearchEventArgs, scala.Unit]] = js.undefined
  /** Fires the action, when the list of item is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, scala.Unit]] = js.undefined
  /** Specifies an item to be selected in the DropDownList.
    * @Default {null}
    */
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the selectedItems for the DropDownList.
    * @Default {[]}
    */
  var selectedIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** Selects multiple items in the DropDownList with the help of the checkbox control. To achieve this, enable the showCheckbox option to true.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /** DropDownList control is displayed with the popup seen.
    * @Default {false}
    */
  var showPopupOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** DropDownList textbox displayed with the rounded corner style.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** When the enableSorting property value is set to true, this property helps to sort the items either in ascending or descending order
    * @Default {ej.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[ejDotWebDotAllLib.ejNs.SortOrder | java.lang.String] = js.undefined
  /** Specifies the targetID for the DropDownListâ€™s items.
    * @Default {null}
    */
  var targetID: js.UndefOr[java.lang.String] = js.undefined
  /** By default, you can add any text or image to the DropDownList item. To customize the item layout or to create your own visualized elements, you can use this template support.
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the text value that is displayed in the DropDownList textbox.
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the jQuery validation error message in the DropDownList
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.undefined
  /** Sets the jQuery validation rules in the Dropdownlist.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Specifies the value (text content) for the DropDownList control.
    * @Default {null}
    */
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** The Virtual Scrolling feature is used to display a large amount of records in the DropDownList, that is, when scrolling, an AJAX request is sent to fetch some amount of data from
    * the server dynamically. To achieve this scenario with DropDownList, set the allowVirtualScrolling to true. You can set the itemsCount property that represents the number of items
    * to be fetched from the server on every AJAX request.
    * @Default {normal}
    */
  var virtualScrollMode: js.UndefOr[ejDotWebDotAllLib.ejNs.VirtualScrollMode | java.lang.String] = js.undefined
  /** Specifies a short hint that describes the expected value of the DropDownList control.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the width of the DropDownList textbox.
    * @Default {null}
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

