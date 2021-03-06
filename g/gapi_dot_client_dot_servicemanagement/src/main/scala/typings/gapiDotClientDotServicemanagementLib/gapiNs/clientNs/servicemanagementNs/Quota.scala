package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quota extends js.Object {
  /** List of `QuotaLimit` definitions for the service. */
  var limits: js.UndefOr[js.Array[QuotaLimit]] = js.undefined
  /**
    * List of `MetricRule` definitions, each one mapping a selected method to one
    * or more metrics.
    */
  var metricRules: js.UndefOr[js.Array[MetricRule]] = js.undefined
}

