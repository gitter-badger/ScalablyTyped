package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnSuccessResponseData extends js.Object {
  var data: js.UndefOr[knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.Json] = js.undefined
  var onFailure: js.UndefOr[
    js.Function2[
      /* responseData */ java.lang.String, 
      /* externalServerResponse */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ExternalServerResponse, 
      scala.Unit
    ]
  ] = js.undefined
  var onSuccess: js.UndefOr[
    js.Function2[
      /* responseData */ java.lang.String, 
      /* externalServerResponse */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ExternalServerResponse, 
      scala.Unit
    ]
  ] = js.undefined
}

