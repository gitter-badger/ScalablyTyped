package typings
package atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IAMNs {
  type GetPolicyCallback = js.Function3[
    /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
    /* policy */ Policy, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type SetPolicyCallback = js.Function3[
    /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
    /* policy */ Policy, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type TestPermissionsCallback = js.Function3[
    /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
    /* permissions */ java.lang.String | js.Array[java.lang.String], 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
}
