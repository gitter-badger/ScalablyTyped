package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Writable
  extends nodeLib.streamMod.Writable {
  var _writableState: WritableState = js.native
  // static WritableState: WritableState;
  // private static realHasInstance: (obj: any) => boolean;
  var destroyed: scala.Boolean = js.native
  def _undestroy(): scala.Unit = js.native
  def destroy(
    error: nodeLib.Error with stdLib.Error,
    callback: js.Function1[/* error */ js.UndefOr[(nodeLib.Error with stdLib.Error) | scala.Null], scala.Unit]
  ): this.type = js.native
}

