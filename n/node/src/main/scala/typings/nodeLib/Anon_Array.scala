package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Array
  extends org.scalablytyped.runtime.Instantiable2[/* str */ java.lang.String, /* encoding */ java.lang.String, Buffer]
     with org.scalablytyped.runtime.Instantiable1[
      (/* array */ js.Array[js.Any]) | (/* size */ scala.Double) | (/* str */ java.lang.String) | (/* size */ stdLib.Uint8Array), 
      Buffer
    ] {
  def byteLength(string: java.lang.String): scala.Double = js.native
  def byteLength(string: java.lang.String, encoding: java.lang.String): scala.Double = js.native
  def concat(list: js.Array[Buffer]): Buffer = js.native
  def concat(list: js.Array[Buffer], totalLength: scala.Double): Buffer = js.native
  def isBuffer(obj: js.Any): scala.Boolean = js.native
}

