package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartSeries object, for use in "chartSeries.set({ ... })". */
trait ChartSeriesUpdateData extends js.Object {
  /**
    *
    * Returns or sets the group for the specified series. Read/Write
    *
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisGroup | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Primary | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Secondary
  ] = js.undefined
  /**
    *
    * Encapsulates the bin options only for histogram chart and pareto chart.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var binOptions: js.UndefOr[ChartBinOptionsUpdateData] = js.undefined
  /**
    *
    * Encapsulates the options for the Box & Whisker chart.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var boxwhiskerOptions: js.UndefOr[ChartBoxwhiskerOptionsUpdateData] = js.undefined
  /**
    *
    * Returns or sets the scale factor for bubbles in the specified chart group. Can be an integer value from 0 (zero) to 300, corresponding to a percentage of the default size. Applies only to bubble charts. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var bubbleScale: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the chart type of a series. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 83 */ js.Any
  ] = js.undefined
  /**
    *
    * Represents a collection of all dataLabels in the series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsUpdateData] = js.undefined
  /**
    *
    * Represents the doughnut hole size of a chart series.  Only valid on doughnut and doughnutExploded charts.
    Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var doughnutHoleSize: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie). Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var explosion: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Boolean value representing if the series is filtered or not. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var filtered: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360. Read/Write
    *
    * [Api set: ExcelApi 1.8]
    */
  var firstSliceAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the formatting of a chart series, which includes fill and line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartSeriesFormatUpdateData] = js.undefined
  /**
    *
    * Represents the gap width of a chart series.  Only valid on bar and column charts, as well as
    specific classes of line and pie charts.  Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var gapWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the Color for maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMaximumColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets the type for maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMaximumType: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartGradientStyleType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ExtremeValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Number | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percent
  ] = js.undefined
  /**
    *
    * Returns or sets the maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMaximumValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the Color for midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMidpointColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets the type for midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMidpointType: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartGradientStyleType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ExtremeValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Number | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percent
  ] = js.undefined
  /**
    *
    * Returns or sets the midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMidpointValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the Color for minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMinimumColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets the type for minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMinimumType: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartGradientStyleType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ExtremeValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Number | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percent
  ] = js.undefined
  /**
    *
    * Returns or sets the minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMinimumValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets series gradient style of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientStyle: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartGradientStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TwoPhaseColor | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreePhaseColor
  ] = js.undefined
  /**
    *
    * Boolean value representing if the series has data labels or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabels: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the fill color for negative data points in a series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var invertColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * True if Microsoft Excel inverts the pattern in the item when it corresponds to a negative number. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var invertIfNegative: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Encapsulates the options for the Map chart.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var mapOptions: js.UndefOr[ChartMapOptionsUpdateData] = js.undefined
  /**
    *
    * Represents markers background color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents markers foreground color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents marker size of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents marker style of a chart series. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartMarkerStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Square | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.X | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Star | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Circle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Plus | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Picture
  ] = js.undefined
  /**
    *
    * Represents the name of a series in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Specifies how bars and columns are positioned. Can be a value between – 100 and 100. Applies only to 2-D bar and 2-D column charts. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var overlap: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets series parent label strategy area of a treemap chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var parentLabelStrategy: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartParentLabelStrategy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Banner | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Overlapping
  ] = js.undefined
  /**
    *
    * Represents the plot order of a chart series within the chart group.
    *
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the size of the secondary section of either a pie of pie chart or a bar of pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var secondPlotSize: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets if connector lines show in a waterfall chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showConnectorLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * True if Microsoft Excel show leaderlines for each datalabel in series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showLeaderLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the series has a shadow or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the series is smooth or not. Only applicable to line and scatter charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var smooth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the way the two sections of either a pie of pie chart or a bar of pie chart are split. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var splitType: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartSplitType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SplitByPosition | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SplitByValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SplitByPercentValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SplitByCustomSplit
  ] = js.undefined
  /**
    *
    * Returns or sets the threshold value separating the two sections of either a pie of pie chart or a bar of pie chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var splitValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * True if Microsoft Excel assigns a different color or pattern to each data marker. The chart must contain only one series. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var varyByCategories: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the error bar object for a chart series.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var xerrorBars: js.UndefOr[ChartErrorBarsUpdateData] = js.undefined
  /**
    *
    * Represents the error bar object for a chart series.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var yerrorBars: js.UndefOr[ChartErrorBarsUpdateData] = js.undefined
}

