package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logging extends js.Object {
  /**
    * Logging configurations for sending logs to the consumer project.
    * There can be multiple consumer destinations, each one must have a
    * different monitored resource type. A log can be used in at most
    * one consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[LoggingDestination]] = js.undefined
  /**
    * Logging configurations for sending logs to the producer project.
    * There can be multiple producer destinations, each one must have a
    * different monitored resource type. A log can be used in at most
    * one producer destination.
    */
  var producerDestinations: js.UndefOr[js.Array[LoggingDestination]] = js.undefined
}

