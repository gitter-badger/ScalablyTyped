package typings
package atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PublisherNs {
  type PublishCallback = js.Function2[
    /* error */ (nodeLib.Error with stdLib.Error) | scala.Null, 
    /* messageId */ java.lang.String, 
    scala.Unit
  ]
}
