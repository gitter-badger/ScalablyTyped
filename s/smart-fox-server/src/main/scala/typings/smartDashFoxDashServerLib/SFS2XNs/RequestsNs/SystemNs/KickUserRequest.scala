package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.KickUserRequest")
@js.native
class KickUserRequest protected () extends js.Object {
  /**
    * Creates a new KickUserRequest instance.
    * @param {number} userId       The id of the user to be kicked.
    * @param {string} [message=null]      A custom message to be delivered to the user before kicking him; if null, the default message configured in the SmartFoxServer 2X Administration Tool is used.
    * @param {number} [delaySeconds=5] The number of seconds after which the user is kicked after receiving the kick message.
    */
  def this(userId: scala.Double) = this()
  def this(userId: scala.Double, message: java.lang.String) = this()
  def this(userId: scala.Double, message: java.lang.String, delaySeconds: scala.Double) = this()
}

