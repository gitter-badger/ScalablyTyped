package typings
package shrinkDashRayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CacheSize extends js.Object {
  var brotli: Anon_Lgblock = js.native
  var cacheSize: scala.Double = js.native
  @JSName("filter")
  var filter_Original: FilterFunction = js.native
  var threshold: scala.Double = js.native
  var zlib: stdLib.Partial[Anon_Flush] = js.native
  def cache(req: stdLib.Request, res: stdLib.Response): scala.Boolean = js.native
  def filter(req: stdLib.Request, res: stdLib.Response): scala.Boolean = js.native
}

