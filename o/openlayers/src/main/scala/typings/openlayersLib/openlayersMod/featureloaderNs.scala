package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "featureloader")
@js.native
object featureloaderNs extends js.Object {
  /**
    * Create an XHR feature loader for a `url` and `format`. The feature loader
    * loads features (with XHR), parses the features, and adds them to the
    * vector tile.
    * @param url Feature URL service.
    * @param format Feature format.
    * @return The feature loader.
    * @api
    */
  def tile(url: java.lang.String, format: openlayersLib.openlayersMod.formatNs.Feature): openlayersLib.openlayersMod.FeatureLoader = js.native
  def tile(
    url: openlayersLib.openlayersMod.FeatureUrlFunction,
    format: openlayersLib.openlayersMod.formatNs.Feature
  ): openlayersLib.openlayersMod.FeatureLoader = js.native
  /**
    * Create an XHR feature loader for a `url` and `format`. The feature loader
    * loads features (with XHR), parses the features, and adds them to the
    * vector source.
    * @param url Feature URL service.
    * @param format Feature format.
    * @return The feature loader.
    * @api
    */
  def xhr(url: java.lang.String, format: openlayersLib.openlayersMod.formatNs.Feature): openlayersLib.openlayersMod.FeatureLoader = js.native
  def xhr(
    url: openlayersLib.openlayersMod.FeatureUrlFunction,
    format: openlayersLib.openlayersMod.formatNs.Feature
  ): openlayersLib.openlayersMod.FeatureLoader = js.native
}

