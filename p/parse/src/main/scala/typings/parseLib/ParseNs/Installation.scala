package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Every Parse application installed on a device registered for
  * push notifications has an associated Installation object.
  */
@JSGlobal("Parse.Installation")
@js.native
class Installation () extends Object {
  var appIdentifier: java.lang.String = js.native
  var appName: java.lang.String = js.native
  var appVersion: java.lang.String = js.native
  var badge: js.Any = js.native
  var channelUris: java.lang.String = js.native
  var channels: js.Array[java.lang.String] = js.native
  var deviceToken: java.lang.String = js.native
  var deviceType: java.lang.String = js.native
  var installationId: java.lang.String = js.native
  var parseVersion: java.lang.String = js.native
  var pushType: java.lang.String = js.native
  var timeZone: js.Any = js.native
}

