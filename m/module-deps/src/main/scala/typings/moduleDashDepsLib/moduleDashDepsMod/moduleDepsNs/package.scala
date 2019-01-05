package typings
package moduleDashDepsLib.moduleDashDepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object moduleDepsNs {
  type CacheCallback = js.Function2[
    /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
    /* res */ js.UndefOr[moduleDashDepsLib.Anon_Source], 
    scala.Unit
  ]
}
