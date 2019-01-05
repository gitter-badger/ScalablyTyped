package typings
package reduxDashSagaLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SagaIteratorClone
  extends stdLib.IterableIterator[
      reduxDashSagaLib.effectsMod.Effect | js.Array[reduxDashSagaLib.effectsMod.Effect]
    ]
     with nodeLib.IterableIterator[
      reduxDashSagaLib.effectsMod.Effect | js.Array[reduxDashSagaLib.effectsMod.Effect]
    ]

