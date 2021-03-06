package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreTableToPointInTimeInput extends js.Object {
  /**
    * Time in the past to restore the table to.
    */
  var RestoreDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * Name of the source table that is being restored.
    */
  var SourceTableName: TableName
  /**
    * The name of the new table to which it must be restored to.
    */
  var TargetTableName: TableName
  /**
    * Restore the table to the latest possible time. LatestRestorableDateTime is typically 5 minutes before the current time. 
    */
  var UseLatestRestorableTime: js.UndefOr[BooleanObject] = js.undefined
}

