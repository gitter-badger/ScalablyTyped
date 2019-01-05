package typings
package stompitLib.libClientMod.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions
  extends nodeLib.streamMod.internalNs.WritableOptions {
  def onError(err: nodeLib.Error with stdLib.Error): scala.Unit
  def onReceipt(): scala.Unit
}

