package typings
package kerberosLib.kerberosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializeClientOptions extends js.Object {
  /**
    * @description Optional integer used to set GSS flags. (e.g. GSS_C_DELEG_FLAG|GSS_C_MUTUAL_FLAG|GSS_C_SEQUENCE_FLAG will allow for forwarding credentials to the remote host)
    */
  var gssFlag: js.UndefOr[scala.Double] = js.undefined
  /**
    * @description Optional GSS mech OID. Defaults to None (GSS_C_NO_OID). Other possible values are `GSS_MECH_OID_KRB5`, `GSS_MECH_OID_SPNEGO`
    */
  var mechOID: js.UndefOr[scala.Double] = js.undefined
  /**
    * @description Optional string containing the client principal in the form '`user@realm`'
    */
  var principal: js.UndefOr[java.lang.String] = js.undefined
}

