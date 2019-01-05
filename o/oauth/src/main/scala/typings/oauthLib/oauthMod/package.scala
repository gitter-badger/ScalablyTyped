package typings
package oauthLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oauthMod {
  type dataCallback = js.Function3[
    /* err */ oauthLib.Anon_StatusCode, 
    /* result */ js.UndefOr[java.lang.String | nodeLib.Buffer], 
    /* response */ js.UndefOr[nodeLib.httpMod.IncomingMessage], 
    js.Any
  ]
  type oauth1tokenCallback = js.Function4[
    /* err */ oauthLib.Anon_StatusCode, 
    /* token */ java.lang.String, 
    /* token_secret */ java.lang.String, 
    /* parsedQueryString */ js.Any, 
    js.Any
  ]
  type oauth2tokenCallback = js.Function4[
    /* err */ oauthLib.Anon_StatusCode, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* result */ js.Any, 
    js.Any
  ]
}
