package typings
package heremapsLib.HNs.geoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("H.geo.LineString")
@js.native
/**
  * Constructor
  * @param opt_latLngAlts {number[]=} - An optional array of latitude, longitude and altitude triples to initialize the LineString with.
  * @param opt_ctx {H.geo.AltitudeContext=} - An optional altitude context for all altitudes contained in this LineString.
  * @throws {H.lang.InvalidArgumentError} - in case of invalid lat, lng, alt values
  */
class LineString () extends js.Object {
  def this(opt_latLngAlts: js.Array[scala.Double]) = this()
  def this(opt_latLngAlts: js.Array[scala.Double], opt_ctx: AltitudeContext) = this()
  /**
    * A utility method to iterate over the points of a line string.
    * @param eachFn {function(lat, lng, alt, index)} - The function to invoke for every point. It gets the point's latitude, longitude, altitude and index as arguments.
    * @param opt_start {number=} - The point's start index (inclusive) to iterate from, defaults to 0.
    * @param opt_end {number=} - The point's end index (exclusive) to iterate to, defaults to Infinity.
    */
  def eachLatLngAlt(
    eachFn: js.Function4[
      /* lat */ Latitude, 
      /* lng */ Longitude, 
      /* alt */ Altitude, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def eachLatLngAlt(
    eachFn: js.Function4[
      /* lat */ Latitude, 
      /* lng */ Longitude, 
      /* alt */ Altitude, 
      /* index */ scala.Double, 
      scala.Unit
    ],
    opt_start: scala.Double
  ): scala.Unit = js.native
  def eachLatLngAlt(
    eachFn: js.Function4[
      /* lat */ Latitude, 
      /* lng */ Longitude, 
      /* alt */ Altitude, 
      /* index */ scala.Double, 
      scala.Unit
    ],
    opt_start: scala.Double,
    opt_end: scala.Double
  ): scala.Unit = js.native
  /**
    * Checks whether the geometry is equal to the geometry supplied by the caller.
    * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
    * @param other {any} - The geometry to check against
    * @return {boolean} - true if the two geometries are equal, otherwise false
    */
  def equals(other: js.Any): scala.Boolean = js.native
  /**
    * This method extracts a H.geo.Point from this LineString at the virtual point index.
    * If the extracted point has an alt value, the LineString's altitude context will be supplied to the point.
    * @param pointIndex {number} - the virtual point index in the LineString
    * @param opt_out {H.geo.Point=} - an optional point object to store the lat, lng, alt values
    * @return {H.geo.Point} - Returns either the 'opt_out' point object or a new point object.
    */
  def extractPoint(pointIndex: scala.Double): Point = js.native
  def extractPoint(pointIndex: scala.Double, opt_out: Point): Point = js.native
  /**
    * This method returns the bounding box of this LineString.
    * Note: The LineString is treated as an open path. If the bounding rectangle for a closed shape is required, the closing leg must be merged in an extra step.
    * @return {H.geo.Rect} - This LineString's bounding rectangle
    */
  def getBounds(): Rect = js.native
  /**
    * To obtain the number of times that this LineString cross the International Date Line.
    * @param opt_asClosed {boolean=} - Indicates whether the LineString is treated as closed (the LineString's last and first coordinates form the closing leg of a polygon).
    * It defaults to false.
    * @return {number}
    */
  def getDBCs(): scala.Double = js.native
  def getDBCs(opt_asClosed: scala.Boolean): scala.Double = js.native
  /**
    * Returns the vertices of the line segments as an array of alternating latitude, longitude and altitude coordinates.
    * The returned array must be treated as read-only to not violate the integrity of the line-string.
    * @return {number[]} - Returns the raw lat, lng, alt values of this LineString
    */
  def getLatLngAltArray(): js.Array[scala.Double] = js.native
  /**
    * This method return the number of points stored in this LineString.
    * @return {number} - The number of points in this LineString
    */
  def getPointCount(): scala.Double = js.native
  /**
    * This method inserts one set of lat, lng, alt values into the LineString at the specified index.
    * @param index {number} - the index at which to add the element
    * @param lat {H.geo.Latitude} - the latitude to insert
    * @param lng {H.geo.Longitude} - the longitude to insert
    * @param alt {H.geo.Altitude} - the altitude to insert
    */
  def insertLatLngAlt(index: scala.Double, lat: Latitude, lng: Longitude, alt: Altitude): scala.Unit = js.native
  /**
    * This method inserts the lat, lng, alt values of a H.geo.Point into the list at the specified index.
    * @param pointIndex {number}
    * @param geoPoint {H.geo.IPoint}
    */
  def insertPoint(pointIndex: scala.Double, geoPoint: IPoint): scala.Unit = js.native
  /**
    * This method pushes a lat, lng, alt to the end of this LineString.
    * @param lat {H.geo.Latitude}
    * @param lng {H.geo.Longitude}
    * @param alt {H.geo.Altitude}
    * @throws {H.lang.InvalidArgumentError} - in case of invalid lat, lng, alt value
    */
  def pushLatLngAlt(lat: Latitude, lng: Longitude, alt: Altitude): scala.Unit = js.native
  /**
    * This method pushes the lat, lng, alt values of a {H.geo.Point} to the end of this LineString.
    * @param geoPoint {H.geo.IPoint}
    * @throws {H.lang.InvalidArgumentError} - in case of invalid geoPoint argument
    */
  def pushPoint(geoPoint: IPoint): scala.Unit = js.native
  /**
    * This method removes one set of lat, lng, alt values from the LineString at the specified index
    * @param index {number}
    */
  def removeLatLngAlt(index: scala.Double): scala.Unit = js.native
  /**
    * This method removes one set of lat, lng, alt values from this LineString at the virtual point index specified.
    * @param pointIndex {number} - the virtual point index
    */
  def removePoint(pointIndex: scala.Double): scala.Unit = js.native
  /**
    * This method splices the LineString at the provided index, removing the specified number of items at that index and inserting the lat, lng, alt array.
    * @param index {number} - The index at which to splice
    * @param opt_nRemove {number=} - The number of lat, lng, alt values to remove
    * @param opt_latLngAlts {number[]=} - The lat, lng, alt values to add
    * @return {number[]} - An array of removed elements
    * @throws {H.lang.InvalidArgumentError} - in case of invalid opt_latLngAlts argument
    */
  def spliceLatLngAlts(index: scala.Double): js.Array[scala.Double] = js.native
  def spliceLatLngAlts(index: scala.Double, opt_nRemove: scala.Double): js.Array[scala.Double] = js.native
  def spliceLatLngAlts(index: scala.Double, opt_nRemove: scala.Double, opt_latLngAlts: js.Array[scala.Double]): js.Array[scala.Double] = js.native
}

@JSGlobal("H.geo.LineString")
@js.native
object LineString extends js.Object {
  /**
    * This method initializes a new LineString with an array of lat, lng values. Arrays are expected to have an even length with the format [lat, lng, lat, lng, ...].
    * @param latLngs {number[]} - the array of lat, lng value.
    * @return {H.geo.LineString} - The LineString containing the lat, lng values
    * @throws {H.lang.InvalidArgumentError} - throws an error in case the latLngs array has an odd length
    */
  def fromLatLngArray(latLngs: js.Array[scala.Double]): heremapsLib.HNs.geoNs.LineString = js.native
  /**
    * To obtain whether a leg (formed by the given two longitudes) crosses the International Date Line.
    * @param lng1 {H.geo.Longitude} - The start longitude of the leg
    * @param lng2 {H.geo.Longitude} - The end longitude of the leg
    * @return {boolean}
    */
  def isDBC(lng1: heremapsLib.HNs.geoNs.Longitude, lng2: heremapsLib.HNs.geoNs.Longitude): scala.Boolean = js.native
}

