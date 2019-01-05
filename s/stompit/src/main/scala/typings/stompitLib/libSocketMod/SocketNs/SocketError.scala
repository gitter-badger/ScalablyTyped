package typings
package stompitLib.libSocketMod.SocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketError
  extends stdLib.Error {
  def isApplicationError(): scala.Boolean
  def isProtocolError(): scala.Boolean
  def isTransportError(): scala.Boolean
}

