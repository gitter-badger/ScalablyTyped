package typings
package plottableLib.plottableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Plots")
@js.native
object PlotsNs extends js.Object {
  @js.native
  /**
    * An Area Plot draws a filled region (area) between Y and Y0.
    *
    * @constructor
    */
  class Area[X] ()
    extends plottableLib.buildSrcPlotsMod.Area[X]
  
  @js.native
  /**
    * A Bar Plot draws bars growing out from a baseline to some value
    *
    * @constructor
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  class Bar[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.Bar[X, Y] {
    def this(orientation: plottableLib.buildSrcPlotsBarPlotMod.BarOrientation) = this()
  }
  
  @js.native
  /**
    * A ClusteredBar Plot groups bars across Datasets based on the primary value of the bars.
    *   On a vertical ClusteredBar Plot, the bars with the same X value are grouped.
    *   On a horizontal ClusteredBar Plot, the bars with the same Y value are grouped.
    *
    * @constructor
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  class ClusteredBar[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.ClusteredBar[X, Y] {
    def this(orientation: plottableLib.buildSrcPlotsBarPlotMod.BarOrientation) = this()
  }
  
  @js.native
  /**
    * A Line Plot draws line segments starting from the first data point to the next.
    *
    * @constructor
    */
  class Line[X] ()
    extends plottableLib.buildSrcPlotsMod.Line[X]
  
  @js.native
  /**
    * @constructor
    */
  class Pie ()
    extends plottableLib.buildSrcPlotsMod.Pie
  
  @js.native
  /**
    * A Rectangle Plot displays rectangles based on the data.
    * The left and right edges of each rectangle can be set with x() and x2().
    *   If only x() is set the Rectangle Plot will attempt to compute the correct left and right edge positions.
    * The top and bottom edges of each rectangle can be set with y() and y2().
    *   If only y() is set the Rectangle Plot will attempt to compute the correct top and bottom edge positions.
    *
    * @constructor
    * @param {Scale.Scale} xScale
    * @param {Scale.Scale} yScale
    */
  class Rectangle[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.Rectangle[X, Y]
  
  @js.native
  /**
    * A Scatter Plot draws a symbol at each data point.
    *
    * @constructor
    */
  class Scatter[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.Scatter[X, Y]
  
  @js.native
  /**
    * A Segment Plot displays line segments based on the data.
    *
    * @constructor
    */
  class Segment[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.Segment[X, Y]
  
  @js.native
  /**
    * @constructor
    */
  class StackedArea[X] ()
    extends plottableLib.buildSrcPlotsMod.StackedArea[X]
  
  @js.native
  /**
    * A StackedBar Plot stacks bars across Datasets based on the primary value of the bars.
    *   On a vertical StackedBar Plot, the bars with the same X value are stacked.
    *   On a horizontal StackedBar Plot, the bars with the same Y value are stacked.
    *
    * @constructor
    * @param {Scale} xScale
    * @param {Scale} yScale
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  class StackedBar[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.StackedBar[X, Y] {
    def this(orientation: plottableLib.buildSrcPlotsBarPlotMod.BarOrientation) = this()
  }
  
  @js.native
  class Waterfall[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.Waterfall[X, Y]
  
  val BarAlignment: plottableLib.Anon_EndMiddle = js.native
  val BarOrientation: plottableLib.Anon_Horizontal = js.native
  val CurveName: plottableLib.Anon_Basis = js.native
  val LabelsPosition: plottableLib.Anon_End = js.native
  @JSName("Animator")
  @js.native
  object AnimatorNs extends js.Object {
    var MAIN: java.lang.String = js.native
    var RESET: java.lang.String = js.native
  }
  
  @js.native
  object Area extends js.Object {
    var _Y0_KEY: js.Any = js.native
  }
  
  @js.native
  object Bar extends js.Object {
    var _BAR_AREA_CLASS: js.Any = js.native
    var _BAR_END_KEY: js.Any = js.native
    var _BAR_GAPLESS_THRESHOLD_PX: scala.Double = js.native
    var _BAR_THICKNESS_KEY: java.lang.String = js.native
    var _BAR_THICKNESS_RATIO: scala.Double = js.native
    var _LABEL_AREA_CLASS: java.lang.String = js.native
    /**
      * In the case of "start" or "end" LabelPositions, put the label this many px away
      * from the bar's length distance edge
      */
    var _LABEL_MARGIN_INSIDE_BAR: scala.Double = js.native
    var _SINGLE_BAR_DIMENSION_RATIO: scala.Double = js.native
  }
  
  @js.native
  object Pie extends js.Object {
    var _INNER_RADIUS_KEY: js.Any = js.native
    var _OUTER_RADIUS_KEY: js.Any = js.native
    var _SECTOR_VALUE_KEY: js.Any = js.native
    /* protected */ def _isValidData(value: js.Any): scala.Boolean = js.native
  }
  
  @js.native
  object Rectangle extends js.Object {
    var _X2_KEY: js.Any = js.native
    var _Y2_KEY: js.Any = js.native
  }
  
  @js.native
  object Scatter extends js.Object {
    var _LABEL_AREA_CLASS: java.lang.String = js.native
    var _LABEL_MARGIN_FROM_BUBBLE: scala.Double = js.native
    var _SIZE_KEY: js.Any = js.native
    var _SYMBOL_KEY: js.Any = js.native
  }
  
  @js.native
  object Segment extends js.Object {
    var _X2_KEY: js.Any = js.native
    var _Y2_KEY: js.Any = js.native
  }
  
  @js.native
  object StackedArea extends js.Object {
    /**
      * Given an array of Datasets and the accessor function for the key, computes the
      * set reunion (no duplicates) of the domain of each Dataset. The keys are stringified
      * before being returned.
      *
      * @param {Dataset[]} datasets The Datasets for which we extract the domain keys
      * @param {Accessor<any>} keyAccessor The accessor for the key of the data
      * @return {string[]} An array of stringified keys
      */
    /* private */ def _domainKeys(datasets: js.Any, keyAccessor: js.Any): js.Any = js.native
  }
  
  @js.native
  object StackedBar extends js.Object {
    var _EXTREMA_LABEL_MARGIN_FROM_BAR: scala.Double = js.native
  }
  
  @js.native
  object Waterfall extends js.Object {
    var _BAR_DECLINE_CLASS: js.Any = js.native
    var _BAR_GROWTH_CLASS: js.Any = js.native
    var _BAR_TOTAL_CLASS: js.Any = js.native
    var _CONNECTOR_AREA_CLASS: js.Any = js.native
    var _CONNECTOR_CLASS: js.Any = js.native
    var _TOTAL_KEY: js.Any = js.native
  }
  
}

