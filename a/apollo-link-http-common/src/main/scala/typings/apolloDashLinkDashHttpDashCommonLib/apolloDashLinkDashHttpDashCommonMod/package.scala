package typings
package apolloDashLinkDashHttpDashCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apolloDashLinkDashHttpDashCommonMod {
  type ClientParseError = stdLib.Error with apolloDashLinkDashHttpDashCommonLib.Anon_ParseError
  type ServerError = stdLib.Error with apolloDashLinkDashHttpDashCommonLib.Anon_Response
  type ServerParseError = stdLib.Error with apolloDashLinkDashHttpDashCommonLib.Anon_ResponseStatusCode
  type UriFunction = js.Function1[/* operation */ apolloDashLinkLib.libTypesMod.Operation, java.lang.String]
}
