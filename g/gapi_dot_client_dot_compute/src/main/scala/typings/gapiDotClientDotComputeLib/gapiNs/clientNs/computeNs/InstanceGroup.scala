package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroup extends js.Object {
  /** [Output Only] The creation timestamp for this instance group in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output Only] The fingerprint of the named ports. The system uses this fingerprint to detect conflicts when multiple users change the named ports
    * concurrently.
    */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] A unique identifier for this instance group, generated by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The resource type, which is always compute#instanceGroup for instance groups. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Assigns a name to a port number. For example: {name: "http", port: 80}
    *
    * This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example:
    * [{name: "http", port: 80},{name: "http", port: 8080}]
    *
    * Named ports apply to all instances in this instance group.
    */
  var namedPorts: js.UndefOr[js.Array[NamedPort]] = js.undefined
  /** The URL of the network to which all instances in the instance group belong. */
  var network: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the region where the instance group is located (for regional resources). */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The URL for this instance group. The server generates this URL. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The total number of instances in the instance group. */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** The URL of the subnetwork to which all instances in the instance group belong. */
  var subnetwork: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The URL of the zone where the instance group is located (for zonal resources). */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

