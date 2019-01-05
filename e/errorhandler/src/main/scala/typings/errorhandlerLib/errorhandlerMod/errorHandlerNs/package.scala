package typings
package errorhandlerLib.errorhandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object errorHandlerNs {
  type LoggingCallback = js.Function4[
    /* err */ nodeLib.Error with stdLib.Error, 
    /* str */ java.lang.String, 
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    scala.Unit
  ]
}
