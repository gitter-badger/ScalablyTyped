package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProcessOptions extends js.Object {
  /** The array of arguments to pass to the command. */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The command to execute. */
  var command: java.lang.String
  /** The callback which receives a single argument containing the exit status. */
  var exit: js.UndefOr[js.Function1[/* code */ scala.Double, scala.Unit]] = js.undefined
  /** The options object to pass to Node's ChildProcess.spawn method. */
  var options: js.UndefOr[SpawnProcessOptions] = js.undefined
  /**
    *  The callback that receives a single argument which contains the standard
    *  error output from the command.
    */
  var stderr: js.UndefOr[js.Function1[/* data */ java.lang.String, scala.Unit]] = js.undefined
  /**
    *  The callback that receives a single argument which contains the standard
    *  output from the command.
    */
  var stdout: js.UndefOr[js.Function1[/* data */ java.lang.String, scala.Unit]] = js.undefined
}

