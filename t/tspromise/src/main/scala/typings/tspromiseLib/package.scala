package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tspromiseLib {
  type NodeCallback[T] = js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* value */ T, scala.Unit]
}
