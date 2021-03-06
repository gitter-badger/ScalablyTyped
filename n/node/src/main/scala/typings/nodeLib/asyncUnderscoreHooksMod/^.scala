package typings
package nodeLib.asyncUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async_hooks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Registers functions to be called for different lifetime events of each async operation.
    * @param options the callbacks to register
    * @return an AsyncHooks instance used for disabling and enabling hooks
    */
  def createHook(options: nodeLib.asyncUnderscoreHooksMod.HookCallbacks): nodeLib.asyncUnderscoreHooksMod.AsyncHook = js.native
  /**
    * Returns the asyncId of the current execution context.
    */
  def executionAsyncId(): scala.Double = js.native
  /**
    * Returns the ID of the resource responsible for calling the callback that is currently being executed.
    */
  def triggerAsyncId(): scala.Double = js.native
}

