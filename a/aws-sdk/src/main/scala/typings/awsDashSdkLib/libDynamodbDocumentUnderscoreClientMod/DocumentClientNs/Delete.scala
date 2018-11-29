package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Delete extends js.Object {
  /**
       * A condition that must be satisfied in order for a conditional delete to succeed.
       */
  var ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined
  /**
       * One or more substitution tokens for attribute names in an expression.
       */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  /**
       * One or more values that can be substituted in an expression.
       */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
  /**
       * The primary key of the item to be deleted. Each element consists of an attribute name and a value for that attribute.
       */
  var Key: Key
  /**
       * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Delete condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
       */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
  /**
       * Name of the table in which the item to be deleted resides.
       */
  var TableName: TableName
}
