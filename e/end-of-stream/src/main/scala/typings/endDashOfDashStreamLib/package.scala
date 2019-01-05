package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object endDashOfDashStreamLib {
  type Callback = js.Function1[/* error */ js.UndefOr[(nodeLib.Error with stdLib.Error) | scala.Null], scala.Unit]
  type Stream = nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.WritableStream
}
