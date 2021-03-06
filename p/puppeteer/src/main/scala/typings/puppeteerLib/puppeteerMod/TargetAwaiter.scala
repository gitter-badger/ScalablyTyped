package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetAwaiter extends js.Object {
  def waitForTarget(predicate: js.Function1[/* target */ Target, scala.Boolean]): js.Promise[Target] = js.native
  def waitForTarget(predicate: js.Function1[/* target */ Target, scala.Boolean], options: Timeoutable): js.Promise[Target] = js.native
}

