package typings
package heremapsLib.HNs.clusteringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface represents a data point which does not belong to a cluster.
  */
trait INoisePoint extends js.Object {
  /**
    * This method returns data which coresponds to this noise point.
    * @returns {*}
    */
  def getData(): js.Any
  /**
    * Returns the minimum zoom level where this item is not part of another cluster
    * @returns {number}
    */
  def getMinZoom(): scala.Double
  /**
    * Returns the geographical position of this cluster result.
    * @returns {H.geo.Point}
    */
  def getPosition(): heremapsLib.HNs.geoNs.Point
  /**
    * Returns the weight of this cluster result.
    * @returns {number}
    */
  def getWeight(): scala.Double
  /**
    * To indicate whether this cluster result is a cluster or noise point
    * @returns {boolean}
    */
  def isCluster(): scala.Boolean
}

