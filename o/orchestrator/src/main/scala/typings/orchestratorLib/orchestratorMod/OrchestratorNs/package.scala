package typings
package orchestratorLib.orchestratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OrchestratorNs {
  type EventNames = orchestratorLib.orchestratorLibStrings.start | orchestratorLib.orchestratorLibStrings.stop | orchestratorLib.orchestratorLibStrings.err | orchestratorLib.orchestratorLibStrings.task_start | orchestratorLib.orchestratorLibStrings.task_stop | orchestratorLib.orchestratorLibStrings.task_err | orchestratorLib.orchestratorLibStrings.task_not_found | orchestratorLib.orchestratorLibStrings.task_recursion
  /** The method export generated by orchestrator/lib/runTask.js */
  type RunTask = js.Function2[
    /* task */ TaskFunc, 
    /* done */ js.Function2[/* err */ js.Any, /* meta */ Meta, scala.Unit], 
    scala.Unit
  ]
  /** The module export of the sequencify package: https://www.npmjs.com/package/sequencify */
  type Sequencify = js.Function2[
    /* tasks */ js.Array[orchestratorLib.Anon_Dep], 
    /* names */ js.Array[java.lang.String], 
    orchestratorLib.Anon_MissingTasks
  ]
  type Strings = java.lang.String | js.Array[java.lang.String]
  /** A task, can either call a callback to indicate task completion or return a promise or a stream: (task is marked complete when promise.then() resolves/fails or stream ends)
    */
  type TaskFunc = js.Function1[
    /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    qLib.qMod.QNs.Promise[js.Any] | nodeLib.streamMod.Stream | js.Any
  ]
}
