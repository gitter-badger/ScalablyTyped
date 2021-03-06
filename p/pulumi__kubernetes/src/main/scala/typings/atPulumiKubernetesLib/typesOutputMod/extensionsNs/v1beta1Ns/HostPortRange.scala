package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.
  * It requires both the start and end to be defined. Deprecated: use HostPortRange from policy
  * API Group instead.
  */
trait HostPortRange extends js.Object {
  /**
    * max is the end of the range, inclusive.
    */
  val max: scala.Double
  /**
    * min is the start of the range, inclusive.
    */
  val min: scala.Double
}

