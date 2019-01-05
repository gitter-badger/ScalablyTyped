package typings
package atUirouterCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "Transition")
@js.native
class Transition protected ()
  extends atUirouterCoreLib.libTransitionMod.Transition {
  /**
    * Creates a new Transition object.
    *
    * If the target state is not valid, an error is thrown.
    *
    * @internalapi
    *
    * @param fromPath The path of [[PathNode]]s from which the transition is leaving.  The last node in the `fromPath`
    *        encapsulates the "from state".
    * @param targetState The target state and parameters being transitioned to (also, the transition options)
    * @param router The [[UIRouter]] instance
    */
  def this(fromPath: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode], targetState: atUirouterCoreLib.libStateTargetStateMod.TargetState, router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
}

@JSImport("@uirouter/core", "Transition")
@js.native
object Transition extends js.Object {
  /** @hidden */
  var diToken: atUirouterCoreLib.Anon_DiToken = js.native
}

