package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxHint's window.
  */
trait ASPxClientHintWindow extends js.Object {
  def SetContent(html: js.Object, options: ASPxClientHintOptions): scala.Unit
  def SetContentLoading(): scala.Unit
  /**
    * Forces the ASPxClientHint's window to recalculate its position.
    */
  def UpdatePosition(): scala.Unit
}

