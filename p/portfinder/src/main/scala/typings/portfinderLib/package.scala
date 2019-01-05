package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object portfinderLib {
  type PortfinderCallback = js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* port */ scala.Double, scala.Unit]
}
