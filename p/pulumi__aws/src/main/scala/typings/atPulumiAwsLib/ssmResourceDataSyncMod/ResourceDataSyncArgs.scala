package typings
package atPulumiAwsLib.ssmResourceDataSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceDataSyncArgs extends js.Object {
  /**
    * Name for the configuration.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Amazon S3 configuration details for the sync.
    */
  val s3Destination: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketNameKmsKeyArnPrefixRegion]
}

