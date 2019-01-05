package typings
package roslibLib.roslibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "ActionClient")
@js.native
class ActionClient protected ()
  extends roslibLib.roslibMod.ROSLIBNs.ActionClient {
  /**
  		 * An actionlib action client.
  		 *
  		 * Emits the following events:
  		 *  * 'timeout' - if a timeout occurred while sending a goal
  		 *  * 'status' - the status messages received from the action server
  		 *  * 'feedback' -  the feedback messages received from the action server
  		 *  * 'result' - the result returned from the action server
  		 *
  		 *  @constructor
  		 *  @param options - object with following keys:
  		 *   * ros - the ROSLIB.Ros connection handle
  		 *   * serverName - the action server name, like /fibonacci
  		 *   * actionName - the action message name, like 'actionlib_tutorials/FibonacciAction'
  		 *   * timeout - the timeout length when connecting to the action server
  		 */
  def this(options: roslibLib.Anon_RosServerName) = this()
  /**
  		 * Cancel all goals associated with this ActionClient.
  		 */
  /* CompleteClass */
  override def cancel(): scala.Unit = js.native
}

