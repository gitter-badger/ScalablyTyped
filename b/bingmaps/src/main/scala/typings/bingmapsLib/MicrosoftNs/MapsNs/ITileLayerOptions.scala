package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITileLayerOptions extends js.Object {
  /**
    * The number of milliseconds allowed for the tile layer image download. If the timeout occurs before the image is fully
    * downloaded, the map control considers the download a failure. The default value is 10000.
    */
  var downloadTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Allow retrieving data from CORS supported server. */
  var enableCORS: js.UndefOr[scala.Boolean] = js.undefined
  /** The tile source for the tile layer. */
  var mercator: js.UndefOr[TileSource] = js.undefined
  /** The opacity of the tile layer, defined by a number between 0 (not visible) and 1. */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies that CORS should be made with the "use-credentials" flag instead of "anonymous". */
  var useCredentialsForCORS: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean indicating whether to show or hide the tile layer. The default value is true. A value of false indicates that
    * the tile layer is hidden, although it is still an entity on the map.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** The z-index of the tile layer. */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

