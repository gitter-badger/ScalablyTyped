package typings
package heremapsLib.HNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type defines options which can be used to initialize the map.
  * @property center {H.geo.IPoint=} - The initial center of the map, default is {lat:0, lng: 0}
  * @property zoom {number=} - The initial zoom level of the map, default is 0 respectively the minimal zoom level of the base map
  * @property bounds {H.geo.Rect=} - The view bounds to be displayed on the map. If provided, it takes precedence over center and zoom. and zoom if provided)
  * @property layers {Array<H.map.layer.Layer>=} - A list of layers to render on top of the base map
  * @property engineType: {H.Map.EngineType=} - The initial engine type to use, default is P2D
  * @property pixelRatio {number} - The pixelRatio to use for over-sampling in cases of high-resolution displays, default is 1
  * @property imprint {H.map.Imprint.Options=} - The imprint options or null to suppress the imprint
  * @property renderBaseBackground {H.Map.BackgroundRange=} - Object describes how many cached zoom levels should be used as a base map background while base map tiles are loading.
  * Example: {lower: 3, higher: 2}
  * @property autoColor {boolean=} - Indicates whether the UI's colors should automatically adjusted to the base layer, default is true. Up to now only the copyright style will be adjusted.
  * See H.map.layer.Layer.Options#dark
  * @property margin {number=} - The size in pixel of the supplemental area to render for each side of the map
  * @property padding {H.map.ViewPort.Padding=} - The padding in pixels for each side of the map
  * @property fixedCenter {boolean=} - Indicates whether the center of the map should remain unchanged if the viewport's size or padding has been changed, default is true
  */
trait Options extends js.Object {
  var autoColor: js.UndefOr[scala.Boolean] = js.undefined
  var bounds: js.UndefOr[heremapsLib.HNs.geoNs.Rect] = js.undefined
  var center: js.UndefOr[heremapsLib.HNs.geoNs.IPoint] = js.undefined
  var engineType: js.UndefOr[EngineType] = js.undefined
  var fixedCenter: js.UndefOr[scala.Boolean] = js.undefined
  var imprint: js.UndefOr[heremapsLib.HNs.mapNs.ImprintNs.Options] = js.undefined
  var layers: js.UndefOr[js.Array[heremapsLib.HNs.mapNs.layerNs.Layer]] = js.undefined
  var margin: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[heremapsLib.HNs.mapNs.ViewPortNs.Padding] = js.undefined
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var renderBaseBackground: js.UndefOr[BackgroundRange] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

