package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The FilterInfo object is a container that describes a Filter object without requiring a Filter to be Added to the process chain. See the FilterInfos
  * property on the ImageProcess object for details on accessing FilterInfo objects.
  */
@JSGlobal("WIA.FilterInfo")
@js.native
class FilterInfo protected () extends js.Object {
  /** Returns a technical Description of what the filter does and how to use it in a filter chain */
  val Description: java.lang.String = js.native
  /** Returns the FilterID for this filter */
  val FilterID: java.lang.String = js.native
  /** Returns the FilterInfo Name */
  val Name: java.lang.String = js.native
  var `WIA.FilterInfo_typekey`: FilterInfo = js.native
}

