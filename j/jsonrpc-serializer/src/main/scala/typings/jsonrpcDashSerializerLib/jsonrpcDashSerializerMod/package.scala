package typings
package jsonrpcDashSerializerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonrpcDashSerializerMod {
  type PayloadType = jsonrpcDashSerializerLib.jsonrpcDashSerializerLibStrings.request | jsonrpcDashSerializerLib.jsonrpcDashSerializerLibStrings.notification | jsonrpcDashSerializerLib.jsonrpcDashSerializerLibStrings.success | jsonrpcDashSerializerLib.jsonrpcDashSerializerLibStrings.error
  type errorHandler = js.Function1[/* errors */ js.Array[java.lang.String] | scala.Null, scala.Unit]
}
