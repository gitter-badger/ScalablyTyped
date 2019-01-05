package typings
package reduxDashPromiseLib.reduxDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxMod {
  type PromiseAction[S] = js.Function2[
    /* dispatch */ Dispatch[S] with reduxLib.reduxMod.Dispatch[S], 
    /* getState */ js.UndefOr[js.Function0[S]], 
    js.Any
  ]
}
