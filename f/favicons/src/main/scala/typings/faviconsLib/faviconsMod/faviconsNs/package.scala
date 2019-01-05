package typings
package faviconsLib.faviconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object faviconsNs {
  type Callback = js.Function2[
    /* error */ (nodeLib.Error with stdLib.Error) | scala.Null, 
    /* response */ FavIconResponse, 
    scala.Unit
  ]
}
