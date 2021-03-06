package typings
package markerclustererplusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClusterIcon")
@js.native
class ClusterIcon protected ()
  extends googlemapsLib.googleNs.mapsNs.OverlayView {
  /**
    * A cluster icon.
    *
    * @param cluster The cluster with which the icon is to be associated.
    * @param [styles] An array of {@link ClusterIconStyle} defining the cluster icons
    *       to use for various cluster sizes.
    */
  def this(cluster: Cluster, styles: js.Array[ClusterIconStyle]) = this()
  /**
    * Creates the cssText style parameter based on the position of the icon.
    *
    * @param pos The position of the icon.
    * @return The CSS style text.
    */
  def createCss(pos: googlemapsLib.googleNs.mapsNs.Point): java.lang.String = js.native
  /**
    * Returns the position at which to place the DIV depending on the latlng.
    *
    * @param latLng The position in latlng.
    * @return The position in pixels.
    */
  def `getPosFromLatLng_`(latLng: googlemapsLib.googleNs.mapsNs.LatLng): googlemapsLib.googleNs.mapsNs.Point = js.native
  /**
    * Hides the icon.
    */
  def hide(): scala.Unit = js.native
  /**
    * Sets the position at which to center the icon.
    *
    * @param center The latlng to set as the center.
    */
  def setCenter(center: googlemapsLib.googleNs.mapsNs.LatLng): scala.Unit = js.native
  /**
    * Positions and shows the icon.
    */
  def show(): scala.Unit = js.native
  /**
    * Sets the icon styles to the appropriate element in the styles array.
    *
    * @param style The icon label text and styles index.
    */
  def useStyle(style: ClusterIconInfo): scala.Unit = js.native
}

