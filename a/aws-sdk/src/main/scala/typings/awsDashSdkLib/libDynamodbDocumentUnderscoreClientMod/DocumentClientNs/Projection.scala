package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  /**
    * Represents the non-key attribute names which will be projected into the index. For local secondary indexes, the total count of NonKeyAttributes summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.
    */
  var NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList] = js.undefined
  /**
    * The set of attributes that are projected into the index:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes are in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.  
    */
  var ProjectionType: js.UndefOr[ProjectionType] = js.undefined
}

