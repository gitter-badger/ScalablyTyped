package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbarOptions extends js.Object {
  /**
    * @description Animation name. Available animations are `"fade"`, `"slide"` and `"none"`.
    */
  var animation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @description Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    */
  var animationOptions: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    */
  var callback: js.UndefOr[coreDashJsLib.Function with js.Function] = js.undefined
  /**
    * @description If true the page will not be changed.
    */
  var keepPage: js.UndefOr[scala.Boolean] = js.undefined
}

