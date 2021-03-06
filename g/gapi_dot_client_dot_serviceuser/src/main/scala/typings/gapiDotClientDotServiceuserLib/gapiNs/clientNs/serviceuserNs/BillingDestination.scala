package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingDestination extends js.Object {
  /**
    * Names of the metrics to report to this billing destination.
    * Each name must be defined in Service.metrics section.
    */
  var metrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The monitored resource type. The type must be defined in
    * Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[java.lang.String] = js.undefined
}

