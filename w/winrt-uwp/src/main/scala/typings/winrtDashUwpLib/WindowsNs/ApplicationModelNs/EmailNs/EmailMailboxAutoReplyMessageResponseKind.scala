package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxAutoReplyMessageResponseKind extends js.Object

/** Defines the encoding schema used for automatic replies. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAutoReplyMessageResponseKind")
@js.native
object EmailMailboxAutoReplyMessageResponseKind extends js.Object {
  /** The autoreply message is encoded as HTML. */
  @js.native
  sealed trait html
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxAutoReplyMessageResponseKind
  
  /** The autoreply message is encoded as plain text. */
  @js.native
  sealed trait plainText
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxAutoReplyMessageResponseKind
  
  val html: html with java.lang.String = js.native
  val plainText: plainText with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxAutoReplyMessageResponseKind with java.lang.String
  ] = js.native
}

