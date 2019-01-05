package typings
package nodeDashEmojiLib.nodeDashEmojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-emoji", JSImport.Namespace)
@js.native
object nodeDashEmojiModMembers extends js.Object {
  val emoji: nodeDashEmojiLib.Anon_1 = js.native
  def emojify(str: java.lang.String): java.lang.String = js.native
  def emojify(
    str: java.lang.String,
    on_missing: js.Function1[/* emoji_name */ java.lang.String, java.lang.String]
  ): java.lang.String = js.native
  def emojify(
    str: java.lang.String,
    on_missing: js.Function1[/* emoji_name */ java.lang.String, java.lang.String],
    format: js.Function2[/* code */ java.lang.String, /* name */ java.lang.String, java.lang.String]
  ): java.lang.String = js.native
  def find(emoji: java.lang.String): Emoji = js.native
  def get(emoji: java.lang.String): java.lang.String = js.native
  def hasEmoji(str: java.lang.String): scala.Boolean = js.native
  def random(): Emoji = js.native
  def replace(str: java.lang.String, callback: js.Function1[/* emoji */ Emoji, java.lang.String]): java.lang.String = js.native
  def search(searchTerm: java.lang.String): js.Array[Emoji] = js.native
  def strip(str: java.lang.String): java.lang.String = js.native
  def unemojify(str: java.lang.String): java.lang.String = js.native
  def which(emoji_code: java.lang.String): java.lang.String = js.native
}

