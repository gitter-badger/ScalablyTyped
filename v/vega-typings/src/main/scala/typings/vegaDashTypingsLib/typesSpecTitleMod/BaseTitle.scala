package typings
package vegaDashTypingsLib.typesSpecTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTitle[N, S, C, FW, A, TB, F, AN] extends js.Object {
  var align: js.UndefOr[A] = js.undefined
  /**
    * The anchor position for placing the title. One of `"start"`, `"middle"`, or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
    */
  var anchor: js.UndefOr[AN] = js.undefined
  /**
    * Angle in degrees of title text.
    */
  var angle: js.UndefOr[N] = js.undefined
  /**
    * Vertical text baseline for title text. One of `"top"`, `"middle"`, `"bottom"`, or `"alphabetic"`.
    */
  var baseline: js.UndefOr[TB] = js.undefined
  /**
    * Text color for title text.
    */
  var color: js.UndefOr[C] = js.undefined
  /**
    * Font name for title text.
    */
  var font: js.UndefOr[S] = js.undefined
  /**
    * Font size in pixels for title text.
    *
    * __Default value:__ `10`.
    *
    * @minimum 0
    */
  var fontSize: js.UndefOr[N] = js.undefined
  /**
    * Font weight for title text.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var fontWeight: js.UndefOr[FW] = js.undefined
  /**
    * The reference frame for the anchor position, one of `"bounds"` (to anchor relative to the full bounding box) or `"group"` (to anchor relative to the group width or height).
    */
  var frame: js.UndefOr[F] = js.undefined
  /**
    * The maximum allowed length in pixels of legend labels.
    *
    * @minimum 0
    */
  var limit: js.UndefOr[N] = js.undefined
  /**
    * The orthogonal offset in pixels by which to displace the title from its position along the edge of the chart.
    */
  var offset: js.UndefOr[N] = js.undefined
  /**
    * Default title orientation (`"top"`, `"bottom"`, `"left"`, or `"right"`)
    */
  var orient: js.UndefOr[TitleOrient] = js.undefined
}

