package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewSaveInfo...
  */
trait ITableViewSaveInfo extends js.Object {
  /**
    * List of the broom points in the database model viewer.
    * Not used in Qlik Sense.
    */
  var qBroomPoints: js.Array[ITableViewBroomPointSaveInfo]
  /**
    * List of connection points in the database model viewer.
    * Not used in Qlik Sense.
    */
  var qConnectionPoints: js.Array[ITableViewConnectionPointSaveInfo]
  /**
    * List of the tables in the database model viewer.
    */
  var qTables: js.Array[ITableViewTableWinSaveInfo]
  /**
    * Zoom factor in the database model viewer.
    * The default value is 1.0.
    */
  var qZoomFactor: scala.Double
}

