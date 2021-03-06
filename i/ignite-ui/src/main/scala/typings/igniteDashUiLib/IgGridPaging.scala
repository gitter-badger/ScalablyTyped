package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridPaging
  extends /**
	 * Option for igGridPaging
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Leading label text for the drop down from where the page index can be switched. Use option [locale.currentPageDropDownLeadingLabel](ui.iggridpaging#options:locale.currentPageDropDownLeadingLabel).
  	 */
  var currentPageDropDownLeadingLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the page index drop down. Use option [locale.currentPageDropDownTooltip](ui.iggridpaging#options:locale.currentPageDropDownTooltip).
  	 */
  var currentPageDropDownTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Trailing label text for the drop down from where the page index can be switched. Use option [locale.currentPageDropDownTrailingLabel](ui.iggridpaging#options:locale.currentPageDropDownTrailingLabel).
  	 */
  var currentPageDropDownTrailingLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Current page index that's bound in the data source and rendered in the UI.
  	 *
  	 */
  var currentPageIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Drop down width for the page size and page index drop downs.
  	 *
  	 */
  var defaultDropDownWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Time in milliseconds for which page drop down will wait for keystrokes before changing the page.
  	 *
  	 */
  var delayOnPageChanged: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text for the first page label. Use option [locale.firstPageLabelText](ui.iggridpaging#options:locale.firstPageLabelText).
  	 */
  var firstPageLabelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the first page button. Use option [locale.firstPageTooltip](ui.iggridpaging#options:locale.firstPageTooltip).
  	 */
  var firstPageTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 *
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text for the last page label. Use option [locale.lastPageLabelText](ui.iggridpaging#options:locale.lastPageLabelText).
  	 */
  var lastPageLabelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the last page button. Use option [locale.lastPageTooltip](ui.iggridpaging#options:locale.lastPageTooltip).
  	 */
  var lastPageTooltip: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[IgGridPagingLocale] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text for the next page label. Use option [locale.nextPageLabelText](ui.iggridpaging#options:locale.nextPageLabelText).
  	 */
  var nextPageLabelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the next page button. Use option [locale.nextPageTooltip](ui.iggridpaging#options:locale.nextPageTooltip).
  	 */
  var nextPageTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets/Gets the number of pages which if exceeded a drop down list of page indices is displayed. If the number of pages is less than or equal to this option then buttons for each page are displayed.
  	 *
  	 */
  var pageCountLimit: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Event fired after the page index is changed , but before grid data rebinds
  	 */
  var pageIndexChanged: js.UndefOr[PageIndexChangedEvent] = js.undefined
  /**
  	 * Event fired before the page index is changed.
  	 * Return false in order to cancel page index changing.
  	 */
  var pageIndexChanging: js.UndefOr[PageIndexChangingEvent] = js.undefined
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested page index.
  	 *
  	 */
  var pageIndexUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Number of records loaded and displayed per page.
  	 *
  	 */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Event fired after the page size is changed from the page size dropdown.
  	 */
  var pageSizeChanged: js.UndefOr[PageSizeChangedEvent] = js.undefined
  /**
  	 * Event fired when the page size is about to be changed from the page size dropdown.
  	 * Return false in order to cancel page size changing.
  	 */
  var pageSizeChanging: js.UndefOr[PageSizeChangingEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text rendered in front of the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
  	 * Use option [locale.pageSizeDropDownLabel](ui.iggridpaging#options:locale.pageSizeDropDownLabel).
  	 */
  var pageSizeDropDownLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Page size dropdown location, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true. Can be rendered above the grid header or inside the pager, next to the page links.
  	 *
  	 *
  	 * Valid values:
  	 * "above" The page size drop down will be rendered above the grid header.
  	 * "inpager" The page size drop down will be rendered next to page links.
  	 */
  var pageSizeDropDownLocation: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the page size drop down. Use option [locale.pageSizeDropDownTooltip](ui.iggridpaging#options:locale.pageSizeDropDownTooltip).
  	 */
  var pageSizeDropDownTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Trailing text for the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
  	 * Use option [locale.pageSizeDropDownTrailingLabel](ui.iggridpaging#options:locale.pageSizeDropDownTrailingLabel).
  	 */
  var pageSizeDropDownTrailingLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Predefined page sizes that are available to the end user to switch their grid paging to, through a drop down in the grid header.
  	 *
  	 */
  var pageSizeList: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested page size.
  	 *
  	 */
  var pageSizeUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text templates of buttons that navigate to a particular page. The format string follows the [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax. See also the [pageCountLimit](ui.iggridpaging#options:pageCountLimit) option.
  	 * Use option [locale.pageTooltipFormat](ui.iggridpaging#options:locale.pageTooltipFormat).
  	 */
  var pageTooltipFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Custom pager records label template - in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax.
  	 * Use option [locale.pagerRecordsLabelTemplate](ui.iggridpaging#options:locale.pagerRecordsLabelTemplate).
  	 */
  var pagerRecordsLabelTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the pager records label. Use option [locale.pagerRecordsLabelTooltip](ui.iggridpaging#options:locale.pagerRecordsLabelTooltip).
  	 */
  var pagerRecordsLabelTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired after the pager footer is rendered
  	 */
  var pagerRendered: js.UndefOr[PagerRenderedEvent] = js.undefined
  /**
  	 * Event fired before the pager footer is rendered (the whole area below the grid records).
  	 *  Event fired after the page size is changed from the page size dropdown.
  	 */
  var pagerRendering: js.UndefOr[PagerRenderingEvent] = js.undefined
  /**
  	 * Enables/disables paging persistence between states.
  	 *
  	 */
  var persist: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text for the previous page label. Use option [locale.prevPageLabelText](ui.iggridpaging#options:locale.prevPageLabelText).
  	 */
  var prevPageLabelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the previous page button. Use option [locale.prevPageTooltip](ui.iggridpaging#options:locale.prevPageTooltip).
  	 */
  var prevPageTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The property in the response data, when using remote data source, that will hold the total number of records in the data source.
  	 *
  	 */
  var recordCountKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Option specifying whether to render the first and last page navigation buttons.
  	 *
  	 */
  var showFirstLastPages: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If false, a dropdown allowing to change the page size will not be rendered in the UI.
  	 *
  	 */
  var showPageSizeDropDown: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Option specifying whether to show summary label for the currently rendered records or not.
  	 *
  	 */
  var showPagerRecordsLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Option specifying whether to render the previous and next page navigation buttons.
  	 *
  	 */
  var showPrevNextPages: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Type of paging. Delegates all paging functionality to the [$.ig.DataSource](ig.datasource).
  	 *
  	 *
  	 * Valid values:
  	 * "remote" Paging is performed by a remote end-point.
  	 * "local" Paging is performed locally by the [$.ig.DataSource](ig.datasource).
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Number of page buttons, adjacent to and including the [active page](ui.iggridpaging#options:currentPageIndex), that are constantly visible. For the invisible pages, previous and next buttons are used.
  	 *
  	 */
  var visiblePageCount: js.UndefOr[scala.Double] = js.undefined
}

