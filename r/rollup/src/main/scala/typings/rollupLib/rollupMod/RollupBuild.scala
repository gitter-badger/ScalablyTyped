package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupBuild extends js.Object {
  var cache: RollupCache
  var getTimings: js.UndefOr[js.Function0[SerializedTimings]] = js.undefined
  var watchFiles: js.Array[java.lang.String]
  def generate(outputOptions: OutputOptions): js.Promise[RollupOutput]
  def write(options: OutputOptions): js.Promise[RollupOutput]
}

