package typings
package easyDashXapiDashSupertestLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOptions extends js.Object {
  /**
  		 * Keep sockets around in a pool to be used by other requests in the future. Default = false
  		 */
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
  		 * Only relevant if keepAlive is set to true.
  		 */
  var keepAliveMsecs: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
  		 */
  var maxFreeSockets: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
  		 */
  var maxSockets: js.UndefOr[scala.Double] = js.undefined
}

