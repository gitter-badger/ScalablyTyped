package typings
package hoekLib.hoekMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReachOptions extends js.Object {
  /** Value to return if the path or value is not present. Default is undefined. */
  var default: js.UndefOr[js.Any] = js.undefined
  /** Allow traversing functions for properties? */
  var functions: js.UndefOr[scala.Boolean] = js.undefined
  /** String to split chain path on. Defaults to ".". */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /** Throw an error on missing member? Default is false. */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

