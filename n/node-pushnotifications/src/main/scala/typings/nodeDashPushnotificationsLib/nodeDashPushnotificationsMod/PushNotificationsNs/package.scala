package typings
package nodeDashPushnotificationsLib.nodeDashPushnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PushNotificationsNs {
  type Callback = js.Function2[/* err */ js.Any, /* result */ js.Any, scala.Unit]
  type PushMethod = js.Function3[
    /* regIds */ js.Array[java.lang.String], 
    /* data */ Data, 
    /* settings */ Settings, 
    scala.Unit
  ]
}
