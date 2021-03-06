package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the bullet graph.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Toggles the visibility of the range stroke color of the labels.
    * @Default {false}
    */
  var applyRangeStrokeToLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** Toggles the visibility of the range stroke color of the ticks.
    * @Default {false}
    */
  var applyRangeStrokeToTicks: js.UndefOr[scala.Boolean] = js.undefined
  /** Contains property to customize the caption in bullet graph.
    */
  var captionSettings: js.UndefOr[CaptionSettings] = js.undefined
  /** Comparative measure bar in bullet graph render till the specified value.
    * @Default {0}
    */
  var comparativeMeasureValue: js.UndefOr[scala.Double] = js.undefined
  /** Fires, on double clicking the bullet graph.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Fires on rendering the caption of bullet graph.
    */
  var drawCaption: js.UndefOr[js.Function1[/* e */ DrawCaptionEventArgs, scala.Unit]] = js.undefined
  /** Fires on rendering the category.
    */
  var drawCategory: js.UndefOr[js.Function1[/* e */ DrawCategoryEventArgs, scala.Unit]] = js.undefined
  /** Fires on rendering the comparative measure symbol.
    */
  var drawComparativeMeasureSymbol: js.UndefOr[js.Function1[/* e */ DrawComparativeMeasureSymbolEventArgs, scala.Unit]] = js.undefined
  /** Fires on rendering the feature measure bar.
    */
  var drawFeatureMeasureBar: js.UndefOr[js.Function1[/* e */ DrawFeatureMeasureBarEventArgs, scala.Unit]] = js.undefined
  /** Fires on rendering the indicator of bullet graph.
    */
  var drawIndicator: js.UndefOr[js.Function1[/* e */ DrawIndicatorEventArgs, scala.Unit]] = js.undefined
  /** Fires on rendering the labels.
    */
  var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, scala.Unit]] = js.undefined
  /** Fires on rendering the qualitative ranges.
    */
  var drawQualitativeRanges: js.UndefOr[js.Function1[/* e */ DrawQualitativeRangesEventArgs, scala.Unit]] = js.undefined
  /** Fires on rendering the ticks.
    */
  var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, scala.Unit]] = js.undefined
  /** Toggles the animation of bullet graph.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies to convert the date object to string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether bullet graph has to be responsive while resizing.
    * @Default {true}
    */
  var enableResizing: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the direction of flow in bullet graph. Neither it may be backward nor forward.
    * @Default {forward}
    */
  var flowDirection: js.UndefOr[FlowDirection | java.lang.String] = js.undefined
  /** Specifies the height of the bullet graph.
    * @Default {90}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Sets a value whether to make the bullet graph responsive on resize.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires on loading bullet graph.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Name of the culture based on which bulletgraph should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Bullet graph will render in the specified orientation.
    * @Default {horizontal}
    */
  var orientation: js.UndefOr[Orientation | java.lang.String] = js.undefined
  /** Size of the qualitative range depends up on the specified value.
    * @Default {32}
    */
  var qualitativeRangeSize: js.UndefOr[scala.Double] = js.undefined
  /** Contains property to customize the qualitative ranges.
    */
  var qualitativeRanges: js.UndefOr[js.Array[QualitativeRange]] = js.undefined
  /** Length of the quantitative range depends up on the specified value.
    * @Default {475}
    */
  var quantitativeScaleLength: js.UndefOr[scala.Double] = js.undefined
  /** Contains all the properties to customize quantitative scale.
    */
  var quantitativeScaleSettings: js.UndefOr[QuantitativeScaleSettings] = js.undefined
  /** Fires, on right clicking the bullet graph.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, scala.Unit]] = js.undefined
  /** By specifying this property the user can change the theme of the bullet graph.
    * @Default {flatlight}
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /** Contains all the properties to customize tooltip.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
  /** Feature measure bar in bullet graph render till the specified value.
    * @Default {0}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the width of the bullet graph.
    * @Default {595}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

