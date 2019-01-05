package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale extends js.Object {
  /** Specify backgroundColor for the scale of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specify border for scales of circular gauge
    * @Default {Object}
    */
  var border: js.UndefOr[ScalesBorder] = js.undefined
  /** Specify the custom labels for the scales.
    * @Default {Array}
    */
  var customLabels: js.UndefOr[js.Array[ScalesCustomLabel]] = js.undefined
  /** Specify scale direction of circular gauge. See
    * @Default {Clockwise}
    */
  var direction: js.UndefOr[(Direction with ejDotWebDotAllLib.ejNs.Direction) | java.lang.String] = js.undefined
  /** Specify representing state of circular gauge
    * @Default {Array}
    */
  var indicators: js.UndefOr[js.Array[ScalesIndicator]] = js.undefined
  /** Specify the text values displayed in a meaningful manner alongside the ticks of circular gauge
    * @Default {Array}
    */
  var labels: js.UndefOr[js.Array[ScalesLabel]] = js.undefined
  /** Specify majorIntervalValue of circular gauge
    * @Default {10}
    */
  var majorIntervalValue: js.UndefOr[scala.Double] = js.undefined
  /** Specify maximum scale value of circular gauge
    * @Default {null}
    */
  var maximum: js.UndefOr[scala.Double] = js.undefined
  /** Specify minimum scale value of circular gauge
    * @Default {null}
    */
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /** Specify minorIntervalValue of circular gauge
    * @Default {2}
    */
  var minorIntervalValue: js.UndefOr[scala.Double] = js.undefined
  /** Specify opacity value of circular gauge
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specify pointer cap of circular gauge
    * @Default {Object}
    */
  var pointerCap: js.UndefOr[ScalesPointerCap] = js.undefined
  /** Specify pointers value of circular gauge
    * @Default {Array}
    */
  var pointers: js.UndefOr[js.Array[ScalesPointer]] = js.undefined
  /** Specify scale radius of circular gauge
    * @Default {170}
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /** Specify ranges value of circular gauge
    * @Default {Array}
    */
  var ranges: js.UndefOr[js.Array[ScalesRange]] = js.undefined
  /** Specify shadowOffset value of circular gauge
    * @Default {0}
    */
  var shadowOffset: js.UndefOr[scala.Double] = js.undefined
  /** Specify showIndicators of circular gauge
    * @Default {false}
    */
  var showIndicators: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify showLabels of circular gauge
    * @Default {true}
    */
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify showPointers of circular gauge
    * @Default {true}
    */
  var showPointers: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify showRanges of circular gauge
    * @Default {false}
    */
  var showRanges: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify showScaleBar of circular gauge
    * @Default {false}
    */
  var showScaleBar: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify showTicks of circular gauge
    * @Default {true}
    */
  var showTicks: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify scaleBar size of circular gauge
    * @Default {6}
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** Specify startAngle of circular gauge
    * @Default {115}
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /** Specify subGauge of circular gauge
    * @Default {Array}
    */
  var subGauges: js.UndefOr[js.Array[ScalesSubGauge]] = js.undefined
  /** Specify sweepAngle of circular gauge
    * @Default {310}
    */
  var sweepAngle: js.UndefOr[scala.Double] = js.undefined
  /** Specify ticks of circular gauge
    * @Default {Array}
    */
  var ticks: js.UndefOr[js.Array[ScalesTick]] = js.undefined
}

