package typings
package markDotJsLib.markDotJsMod.MarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkRegExpOptions extends js.Object {
  var acrossElements: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var done: js.UndefOr[js.Function1[/* marksTotal */ scala.Double, scala.Unit]] = js.undefined
  var each: js.UndefOr[js.Function1[/* element */ stdLib.Element, scala.Unit]] = js.undefined
  var element: js.UndefOr[java.lang.String] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filter: js.UndefOr[
    js.Function4[
      /* textNode */ stdLib.Element, 
      /* term */ java.lang.String, 
      /* marksSoFar */ scala.Double, 
      /* marksTotal */ scala.Double, 
      scala.Boolean
    ]
  ] = js.undefined
  var iframes: js.UndefOr[scala.Boolean] = js.undefined
  var iframesTimeout: js.UndefOr[scala.Double] = js.undefined
  var ignoreGroups: js.UndefOr[scala.Double] = js.undefined
  var log: js.UndefOr[js.Object] = js.undefined
  var noMatch: js.UndefOr[js.Function1[/* term */ java.lang.String, scala.Unit]] = js.undefined
}

