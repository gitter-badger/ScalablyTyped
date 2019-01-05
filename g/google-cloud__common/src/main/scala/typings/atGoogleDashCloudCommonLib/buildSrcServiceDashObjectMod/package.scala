package typings
package atGoogleDashCloudCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcServiceDashObjectMod {
  type CreateCallback[T] = js.Function3[
    /* err */ atGoogleDashCloudCommonLib.buildSrcUtilMod.ApiError | scala.Null, 
    /* instance */ js.UndefOr[T | scala.Null], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type CreateResponse[T] = js.Array[T | js.Any]
  type DeleteCallback = js.Function2[
    /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type ExistsCallback = js.Function2[
    /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
    /* exists */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type GetMetadataCallback = js.Function3[
    /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
    /* metadata */ js.UndefOr[Metadata | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type GetResponse[T] = js.Tuple2[T, requestLib.requestMod.requestNs.Response]
  type InstanceResponseCallback[T] = js.Function3[
    /* err */ atGoogleDashCloudCommonLib.buildSrcUtilMod.ApiError | scala.Null, 
    /* instance */ js.UndefOr[T | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type Metadata = js.Any
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[(nodeLib.Error with stdLib.Error) | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type SetMetadataResponse = js.Array[requestLib.requestMod.requestNs.Response]
}
