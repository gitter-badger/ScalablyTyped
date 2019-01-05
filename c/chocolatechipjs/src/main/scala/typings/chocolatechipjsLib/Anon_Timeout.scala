package typings
package chocolatechipjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Timeout extends js.Object {
  /**
    * The optional name for the callback when the server response will execute.
    * The default value is "callback".
    * However some sites may use a different name for their JSONP function.
    * Consult the documentation on the site to ascertain the correct value for this callback.
    */
  var callbackName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This value determines whether the callbacks and script associate with JSONP persist or are purged after the request returns. By default this is set to true, meaning that they will be purged.
    */
  var clear: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A number representing milliseconds to express when to refect a JSONP request.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

