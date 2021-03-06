package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  /** The MIME type of the attachment. */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /** The URL for the content. */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the attachment. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates that the contentUrl is not available because the attachment content is still being processed. If the caller wishes to retrieve the content,
    * it should try again later.
    */
  var isProcessingContent: js.UndefOr[scala.Boolean] = js.undefined
}

