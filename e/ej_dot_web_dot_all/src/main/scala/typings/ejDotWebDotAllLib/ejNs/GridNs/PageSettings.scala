package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSettings extends js.Object {
  /** Gets or sets a value that indicates whether to define which page to display currently in the grid
    * @Default {1}
    */
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates whether to pass the current page information as a query string along with the URL while navigating to other page.
    * @Default {false}
    */
  var enableQueryString: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enables pager template for the grid.
    * @Default {false}
    */
  var enableTemplates: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to define the number of pages displayed in the pager for navigation
    * @Default {8}
    */
  var pageCount: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates whether to define the number of records displayed per page
    * @Default {12}
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets different page size values to the Dropdown in Grid Pager, by which number of records in a page can be changed dynamically.
    * @Default {[]}
    */
  var pageSizeList: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates whether to define the number of pages to print. See printMode.
    * @Default {ej.Grid.PrintMode.AllPages}
    */
  var printMode: js.UndefOr[PrintMode | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to enables default pager for the grid.
    * @Default {false}
    */
  var showDefaults: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to add the template as a pager template for grid.
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Get the value of total number of pages in the grid. The totalPages value is calculated based on page size and total records of grid
    * @Default {null}
    */
  var totalPages: js.UndefOr[scala.Double] = js.undefined
  /** Get the value of total number of records which is bound to the grid. The totalRecordsCount value is calculated based on dataSource bound to the grid.
    * @Default {null}
    */
  var totalRecordsCount: js.UndefOr[scala.Double] = js.undefined
}

