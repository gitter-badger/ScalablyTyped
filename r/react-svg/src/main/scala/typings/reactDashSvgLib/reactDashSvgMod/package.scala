package typings
package reactDashSvgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSvgMod {
  type OnInjected = js.Function2[
    /* error */ (nodeLib.Error with stdLib.Error) | scala.Null, 
    /* svg */ js.UndefOr[reactLib.SVGSVGElement with stdLib.SVGSVGElement], 
    scala.Unit
  ]
}
