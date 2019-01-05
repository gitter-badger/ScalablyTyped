package typings
package stompitLib.stompitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", JSImport.Namespace)
@js.native
object stompitModMembers extends js.Object {
  def connect(optionsOrPath: java.lang.String): stompitLib.libClientMod.namespaced = js.native
  def connect(
    optionsOrPath: java.lang.String,
    connectionListener: js.Function2[
      /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
      /* client */ stompitLib.libClientMod.namespaced, 
      scala.Unit
    ]
  ): stompitLib.libClientMod.namespaced = js.native
  def connect(optionsOrPath: stompitLib.libConnectMod.connectNs.ConnectOptions): stompitLib.libClientMod.namespaced = js.native
  def connect(
    optionsOrPath: stompitLib.libConnectMod.connectNs.ConnectOptions,
    connectionListener: js.Function2[
      /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
      /* client */ stompitLib.libClientMod.namespaced, 
      scala.Unit
    ]
  ): stompitLib.libClientMod.namespaced = js.native
  def connect(port: scala.Double): stompitLib.libClientMod.namespaced = js.native
  def connect(port: scala.Double, host: java.lang.String): stompitLib.libClientMod.namespaced = js.native
  def connect(
    port: scala.Double,
    host: java.lang.String,
    connectionListener: js.Function2[
      /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
      /* client */ stompitLib.libClientMod.namespaced, 
      scala.Unit
    ]
  ): stompitLib.libClientMod.namespaced = js.native
}

