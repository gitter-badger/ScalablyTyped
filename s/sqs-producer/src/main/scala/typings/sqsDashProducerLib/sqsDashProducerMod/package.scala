package typings
package sqsDashProducerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqsDashProducerMod {
  type ProducerCallback[T] = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error with stdLib.Error], 
    /* data */ js.UndefOr[T], 
    js.Any
  ]
}
