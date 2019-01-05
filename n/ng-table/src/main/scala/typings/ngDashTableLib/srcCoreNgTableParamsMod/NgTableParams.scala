package typings
package ngDashTableLib.srcCoreNgTableParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/ngTableParams", "NgTableParams")
@js.native
class NgTableParams[T] () extends js.Object {
  def this(baseParameters: IParamValues[T]) = this()
  def this(baseParameters: scala.Boolean) = this()
  def this(baseParameters: IParamValues[T], baseSettings: ngDashTableLib.srcCoreNgTableSettingsMod.ISettings[T]) = this()
  def this(baseParameters: scala.Boolean, baseSettings: ngDashTableLib.srcCoreNgTableSettingsMod.ISettings[T]) = this()
  var _params: js.Any = js.native
  var _settings: js.Any = js.native
  /**
    * The page of data rows currently being displayed in the table
    */
  var data: js.Array[T] = js.native
  var defaultSettings: js.Any = js.native
  var errParamsMemento: js.Any = js.native
  var initialEvents: js.Any = js.native
  var isCommittedDataset: js.Any = js.native
  var isNullInstance: scala.Boolean = js.native
  var prevParamsMemento: js.Any = js.native
  /**
    * Returns the number of data rows per page
    */
  def count(): scala.Double = js.native
  /**
    * Sets the number of data rows per page.
    * Changes to count will cause `isDataReloadRequired` to return true
    */
  def count(count: scala.Double): this.type = js.native
  /* private */ def createComparableParams(): js.Any = js.native
  /**
    * Returns the current filter values used to restrict the set of data rows.
    * @param trim supply true to return the current filter minus any insignificant values
    * (null,  undefined and empty string)
    */
  def filter(): ngDashTableLib.srcCoreFilteringFilterFuncMod.IFilterValues = js.native
  /**
    * Sets filter values to the `filter` supplied; any existing filter will be removed
    * Changes to filter will cause `isDataReloadRequired` to return true and the current `page` to be set to 1
    */
  def filter(filter: ngDashTableLib.srcCoreFilteringFilterFuncMod.IFilterValues): this.type = js.native
  def filter(trim: scala.Boolean): ngDashTableLib.srcCoreFilteringFilterFuncMod.IFilterValues = js.native
  /**
    * Generate array of pages.
    * When no arguments supplied, the current parameter state of this `NgTableParams` instance will be used
    * @param currentPage Which page must be active
    * @param totalItems  Total quantity of items
    * @param pageSize    Quantity of items on page
    * @param maxBlocks   Quantity of blocks for pagination
    * @returns Array of pages
    */
  def generatePagesArray(): js.Array[ngDashTableLib.srcCorePagingMod.IPageButton] = js.native
  def generatePagesArray(currentPage: scala.Double): js.Array[ngDashTableLib.srcCorePagingMod.IPageButton] = js.native
  def generatePagesArray(currentPage: scala.Double, totalItems: scala.Double): js.Array[ngDashTableLib.srcCorePagingMod.IPageButton] = js.native
  def generatePagesArray(currentPage: scala.Double, totalItems: scala.Double, pageSize: scala.Double): js.Array[ngDashTableLib.srcCorePagingMod.IPageButton] = js.native
  def generatePagesArray(
    currentPage: scala.Double,
    totalItems: scala.Double,
    pageSize: scala.Double,
    maxBlocks: scala.Double
  ): js.Array[ngDashTableLib.srcCorePagingMod.IPageButton] = js.native
  /**
    * Returns the current grouping used to group the data rows
    */
  def group(): ngDashTableLib.srcCoreGroupingGroupingFuncMod.Grouping[T] = js.native
  /**
    * Sets grouping to the `field` and `sortDirection` supplied; any existing grouping will be removed
    * Changes to group will cause `isDataReloadRequired` to return true and the current `page` to be set to 1
    */
  def group(field: java.lang.String): this.type = js.native
  def group(field: java.lang.String, sortDirection: ngDashTableLib.srcCoreGroupingGroupingFuncMod.GroupSort): this.type = js.native
  /**
    * Sets grouping to the `group` supplied; any existing grouping will be removed.
    * Changes to group will cause `isDataReloadRequired` to return true and the current `page` to be set to 1
    */
  def group(group: ngDashTableLib.srcCoreGroupingGroupingFuncMod.IGroupValues): this.type = js.native
  /**
    * Sets grouping to the `group` supplied; any existing grouping will be removed.
    * If `sortDirection` is supplied, this will be assigned to the sortDirection property of `group`
    * Changes to group will cause `isDataReloadRequired` to return true and the current `page` to be set to 1
    */
  def group(group: ngDashTableLib.srcCoreGroupingGroupingFuncMod.IGroupingFunc[T]): this.type = js.native
  def group(
    group: ngDashTableLib.srcCoreGroupingGroupingFuncMod.IGroupingFunc[T],
    sortDirection: ngDashTableLib.srcCoreGroupingGroupingFuncMod.GroupSort
  ): this.type = js.native
  /**
    * Returns true when an attempt to `reload` the current `parameter` values have resulted in a failure.
    * This method will continue to return true until the `reload` is successfully called or when the
    * `parameter` values have changed
    */
  def hasErrorState(): scala.Boolean = js.native
  /**
    * Returns true if `filter` has significant filter value(s) (any value except null, undefined, or empty string),
    * otherwise false
    */
  def hasFilter(): scala.Boolean = js.native
  /**
    * Return true when a change to `filters` require the `reload` method
    * to be run so as to ensure the data presented to the user reflects these filters
    */
  def hasFilterChanges(): scala.Boolean = js.native
  /* private */ def hasGlobalSearchFieldChanges(): js.Any = js.native
  /**
    * Returns true when at least one group has been set
    */
  def hasGroup(): scala.Boolean = js.native
  /**
    * Returns true when the `group` and when supplied, the `sortDirection` matches an existing group
    */
  def hasGroup(group: java.lang.String): scala.Boolean = js.native
  def hasGroup(group: java.lang.String, sortDirection: java.lang.String): scala.Boolean = js.native
  def hasGroup(group: ngDashTableLib.srcCoreGroupingGroupingFuncMod.IGroupingFunc[T]): scala.Boolean = js.native
  def hasGroup(
    group: ngDashTableLib.srcCoreGroupingGroupingFuncMod.IGroupingFunc[T],
    sortDirection: java.lang.String
  ): scala.Boolean = js.native
  /**
    * Return true when a change to this instance should require the `reload` method
    * to be run so as to ensure the data rows presented to the user reflects the current state.
    *
    * Note that this method will return false when the `reload` method has run but fails. In this case
    * `hasErrorState` will return true.
    *
    * The built-in `ngTable` directives will watch for when this function returns true and will then call
    * the `reload` method to load its data rows
    */
  def isDataReloadRequired(): scala.Boolean = js.native
  /**
    * Returns true if sorting by the field supplied. Where direction supplied
    * the field must also be sorted by that direction to return true
    */
  def isSortBy(field: java.lang.String): scala.Boolean = js.native
  def isSortBy(field: java.lang.String, direction: java.lang.String): scala.Boolean = js.native
  /* private */ def log(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type <none> is not an array type */ args: js.Any
  ): js.Any = js.native
  /**
    * Returns sorting values in a format that can be consumed by the angular `$orderBy` filter service
    */
  def orderBy(): js.Array[java.lang.String] = js.native
  /**
    * Returns the index of the current "slice" of data rows
    */
  def page(): scala.Double = js.native
  /**
    * Sets the index of the current "slice" of data rows. The index starts at 1.
    * Changing the page number will cause `isDataReloadRequired` to return true
    */
  def page(page: scala.Double): this.type = js.native
  /**
    * Set new parameters
    */
  def parameters(): this.type = js.native
  def parameters(newParameters: IParamValues[T]): this.type = js.native
  def parameters(newParameters: IParamValues[T], parseParamsFromUrl: scala.Boolean): this.type = js.native
  def parameters(newParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
  def parameters(
    newParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    parseParamsFromUrl: scala.Boolean
  ): this.type = js.native
  @JSName("parameters")
  def parameters_IParamValues(): IParamValues[T] = js.native
  /* private */ def parseGroup(group: js.Any): js.Any = js.native
  /**
    * Trigger a reload of the data rows
    */
  def reload[TResult /* <: ngDashTableLib.srcCoreDataResultsMod.DataResult[T] */](): angularLib.angularMod.angularNs.IPromise[js.Array[TResult]] = js.native
  def reloadPages(): scala.Unit = js.native
  /* private */ def runInterceptorPipeline(fetchedData: js.Any): js.Any = js.native
  /**
    * Returns the settings for the table.
    */
  def settings(): ngDashTableLib.srcCoreNgTableSettingsMod.ISettings[T] = js.native
  /**
    * Sets the settings for the table; new setting values will be merged with the existing settings.
    * Supplying a new `dataset` will cause `isDataReloadRequired` to return true and the `ngTableEventsChannel`
    * to fire its `datasetChanged` event
    */
  def settings(newSettings: ngDashTableLib.srcCoreNgTableSettingsMod.ISettings[T]): this.type = js.native
  /**
    * Returns the current sorting used to order the data rows.
    * Changes to sorting will cause `isDataReloadRequired` to return true
    */
  def sorting(): ngDashTableLib.srcCoreSortingMod.ISortingValues = js.native
  /**
    * Sets sorting to the `field` and `direction` supplied; any existing sorting will be removed
    */
  def sorting(field: java.lang.String, direction: java.lang.String): this.type = js.native
  /**
    * Sets sorting values to the `sorting` supplied; any existing sorting will be removed.
    * Changes to sorting will cause `isDataReloadRequired` to return true
    */
  def sorting(sorting: ngDashTableLib.srcCoreSortingMod.ISortingValues): this.type = js.native
  /**
    * Returns the count of the data rows that match the current `filter`
    */
  def total(): scala.Double = js.native
  /**
    * Sets `settings().total` to the value supplied.
    * Typically you will need to set a `total` in the body of any custom `getData` function
    * you supply as a setting value to this instance.
    * @example
    * ```js
    * const tp = new NgTableParams({}, { getData: customGetData })
    * function customGetData(params) {
    *      const queryResult = // code to fetch current data rows and total //
    *      params.total(queryResult.total);
    *      return queryResult.dataRowsPage;
    * }
    * ```
    */
  def total(total: scala.Double): this.type = js.native
  /**
    * Returns the current parameter values uri-encoded. Set `asString` to
    * true for the parameters to be returned as an array of strings of the form 'paramName=value'
    * otherwise parameters returned as a key-value object
    */
  def url(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def url(asString: scala.Boolean): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
}

@JSImport("ng-table/src/core/ngTableParams", "NgTableParams")
@js.native
object NgTableParams extends js.Object {
  @JSName("$log")
  var $log: js.Any = js.native
  @JSName("$q")
  var $q: js.Any = js.native
  var ngTableDefaults: js.Any = js.native
  var ngTableEventsChannel: js.Any = js.native
  var ngTableSettings: js.Any = js.native
  def init(
    $q: angularLib.angularMod.angularNs.IQService,
    $log: angularLib.angularMod.angularNs.ILogService,
    ngTableDefaults: ngDashTableLib.srcCoreNgTableDefaultsMod.IDefaults,
    ngTableEventsChannel: ngDashTableLib.srcCoreNgTableEventsChannelMod.NgTableEventsChannel,
    ngTableSettings: ngDashTableLib.srcCoreNgTableSettingsMod.NgTableSettings
  ): scala.Unit = js.native
}

