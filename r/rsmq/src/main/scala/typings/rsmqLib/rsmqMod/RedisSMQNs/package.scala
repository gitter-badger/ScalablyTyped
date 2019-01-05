package typings
package rsmqLib.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RedisSMQNs {
  type CallbackT[R] = js.Function2[
    /* e */ js.UndefOr[nodeLib.Error with stdLib.Error], 
    /* res */ js.UndefOr[R], 
    scala.Unit
  ]
}
