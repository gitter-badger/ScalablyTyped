package typings
package reactDashCopyDashWriteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Provider[T /* <: js.Object */] extends js.Object {
  var Consumer: org.scalablytyped.runtime.Instantiable0[reactDashCopyDashWriteLib.reactDashCopyDashWriteMod.Consumer[T]] = js.native
  var Provider: org.scalablytyped.runtime.Instantiable0[reactDashCopyDashWriteLib.reactDashCopyDashWriteMod.Provider[T]] = js.native
  @JSName("createSelector")
  var createSelector_Original: SelectorFn[T] = js.native
  @JSName("mutate")
  var mutate_Original: Mutator[T] = js.native
  def createSelector(state: T): AnyDeepMemberOfState[T] = js.native
  def mutate(mutator: MutateFn[T]): scala.Unit = js.native
}

