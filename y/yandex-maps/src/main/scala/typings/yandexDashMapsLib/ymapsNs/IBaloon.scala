package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*Interfaces*/
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.ymapsNs.IChild because var conflicts: events. Inlined getParent, setParent, setParent */ @js.native
trait IBaloon[T]
  extends IPopup[T]
     with IFreezable {
  def autoPan(): js.Promise[T] = js.native
}

