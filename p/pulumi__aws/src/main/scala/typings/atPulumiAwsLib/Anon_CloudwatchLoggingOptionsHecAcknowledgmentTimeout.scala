package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeout extends js.Object {
  var cloudwatchLoggingOptions: Anon_EnabledLogGroupName
  var hecAcknowledgmentTimeout: js.UndefOr[scala.Double] = js.undefined
  var hecEndpoint: java.lang.String
  var hecEndpointType: js.UndefOr[java.lang.String] = js.undefined
  var hecToken: java.lang.String
  var processingConfiguration: js.UndefOr[Anon_EnabledProcessors] = js.undefined
  var retryDuration: js.UndefOr[scala.Double] = js.undefined
  var s3BackupMode: js.UndefOr[java.lang.String] = js.undefined
}

