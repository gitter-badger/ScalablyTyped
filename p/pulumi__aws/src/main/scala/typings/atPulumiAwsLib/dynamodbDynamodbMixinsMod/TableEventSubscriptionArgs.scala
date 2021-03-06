package typings
package atPulumiAwsLib.dynamodbDynamodbMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableEventSubscriptionArgs extends js.Object {
  /**
    * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB.
    */
  val batchSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The position in the stream where AWS Lambda should start reading. Must be one of either `TRIM_HORIZON` or `LATEST`.
    */
  val startingPosition: atPulumiAwsLib.atPulumiAwsLibStrings.TRIM_HORIZON | atPulumiAwsLib.atPulumiAwsLibStrings.LATEST
}

