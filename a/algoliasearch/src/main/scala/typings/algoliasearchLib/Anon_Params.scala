package typings
package algoliasearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.UndefOr[Anon_Query] = js.undefined
  /**
    * Objects to promote as hits. Each object must contain the following fields
    */
  var promote: js.UndefOr[js.Array[Anon_ObjectID]] = js.undefined
  /**
    *  Custom JSON object that will be appended to the userData array in the response.
    * This object is not interpreted by the API. It is limited to 1kB of minified JSON.
    */
  var userData: js.UndefOr[js.Object] = js.undefined
}

