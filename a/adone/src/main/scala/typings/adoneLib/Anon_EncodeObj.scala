package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EncodeObj extends js.Object {
  /**
    * Decodes the given string/buffer
    */
  def decode(buf: java.lang.String): js.Any = js.native
  def decode(
    buf: java.lang.String,
    reviver: js.Function3[/* holder */ js.Object, /* key */ java.lang.String, /* value */ js.Any, _]
  ): js.Any = js.native
  def decode(buf: nodeLib.Buffer): js.Any = js.native
  def decode(
    buf: nodeLib.Buffer,
    reviver: js.Function3[/* holder */ js.Object, /* key */ java.lang.String, /* value */ js.Any, _]
  ): js.Any = js.native
  /**
    * Encodes the given value
    */
  def encode(obj: js.Any): nodeLib.Buffer = js.native
  def encode(obj: js.Any, options: Anon_SpaceReplacer): nodeLib.Buffer = js.native
}

