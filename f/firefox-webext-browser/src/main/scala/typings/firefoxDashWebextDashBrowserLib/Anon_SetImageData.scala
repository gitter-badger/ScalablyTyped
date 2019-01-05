package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SetImageData extends js.Object {
  /* clipboard functions */
  /**
    * Copy an image to the clipboard. The image is re-encoded before it is written to the clipboard. If the image is
    * invalid, the clipboard is not modified.
    * @param imageData The image data to be copied.
    * @param imageType The type of imageData.
    */
  def setImageData(
    imageData: firefoxDashWebextDashBrowserLib.browserNs.clipboardNs.ArrayBuffer,
    imageType: firefoxDashWebextDashBrowserLib.browserNs.clipboardNs._SetImageData
  ): js.Promise[scala.Unit]
}

