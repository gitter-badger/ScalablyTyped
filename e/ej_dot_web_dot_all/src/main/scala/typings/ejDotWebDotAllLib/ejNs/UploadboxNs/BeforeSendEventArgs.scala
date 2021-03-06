package typings
package ejDotWebDotAllLib.ejNs.UploadboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeSendEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Selected FileList Object.
    */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the Uploadbox model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** XHR-AJAX Object for reference.
    */
  var xhr: js.UndefOr[js.Any] = js.undefined
}

