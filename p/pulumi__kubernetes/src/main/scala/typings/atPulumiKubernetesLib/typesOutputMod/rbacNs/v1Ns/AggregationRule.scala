package typings
package atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
  */
trait AggregationRule extends js.Object {
  /**
    * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and
    * create the rules. If any of the selectors match, then the ClusterRole's permissions will be
    * added
    */
  val clusterRoleSelectors: js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector]
}

