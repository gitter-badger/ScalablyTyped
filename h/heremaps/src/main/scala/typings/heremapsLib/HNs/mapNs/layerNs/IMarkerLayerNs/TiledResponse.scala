package typings
package heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type represents a response object returned by the H.map.layer.IMarkerLayer#requestMarkers function.
  * @property number {number} - of returned tiles
  * @property requested {number} - number of requested tiles
  * @property objects {Array<H.map.AbstractMarker>} - the marker objects within requested tiled area
  */
trait TiledResponse extends js.Object {
  var number: scala.Double
  var objects: js.Array[heremapsLib.HNs.mapNs.AbstractMarker]
  var requested: scala.Double
}

