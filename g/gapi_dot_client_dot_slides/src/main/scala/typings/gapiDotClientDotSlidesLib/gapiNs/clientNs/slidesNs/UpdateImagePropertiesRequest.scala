package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateImagePropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.
    *
    * At least one field must be specified. The root `imageProperties` is
    * implied and should not be specified. A single `"&#42;"` can be used as
    * short-hand for listing every field.
    *
    * For example to update the image outline color, set `fields` to
    * `"outline.outlineFill.solidFill.color"`.
    *
    * To reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The image properties to update. */
  var imageProperties: js.UndefOr[ImageProperties] = js.undefined
  /** The object ID of the image the updates are applied to. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

