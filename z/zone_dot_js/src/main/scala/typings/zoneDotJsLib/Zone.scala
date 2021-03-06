package typings
package zoneDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zone extends js.Object {
  /**
    * @returns {string} The Zone name (useful for debugging)
    */
  var name: java.lang.String = js.native
  /**
    *
    * @returns {Zone} The parent Zone.
    */
  var parent: Zone | scala.Null = js.native
  /**
    * Allows the zone to intercept canceling of scheduled Task.
    *
    * The interception is configured using [ZoneSpec.onCancelTask]. The default canceler invokes
    * the [Task.cancelFn].
    *
    * @param task
    * @returns {any}
    */
  def cancelTask(task: Task): js.Any = js.native
  /**
    * Used to create a child zone.
    *
    * @param zoneSpec A set of rules which the child zone should follow.
    * @returns {Zone} A new child zone.
    */
  def fork(zoneSpec: ZoneSpec): Zone = js.native
  /**
    * Returns a value associated with the `key`.
    *
    * If the current zone does not have a key, the request is delegated to the parent zone. Use
    * [ZoneSpec.properties] to configure the set of properties associated with the current zone.
    *
    * @param key The key to retrieve.
    * @returns {any} The value for the key, or `undefined` if not found.
    */
  def get(key: java.lang.String): js.Any = js.native
  /**
    * Returns a Zone which defines a `key`.
    *
    * Recursively search the parent Zone until a Zone which has a property `key` is found.
    *
    * @param key The key to use for identification of the returned zone.
    * @returns {Zone} The Zone which defines the `key`, `null` if not found.
    */
  def getZoneWith(key: java.lang.String): Zone | scala.Null = js.native
  /**
    * Invokes a function in a given zone.
    *
    * The invocation of `callback` can be intercepted by declaring [ZoneSpec.onInvoke].
    *
    * @param callback The function to invoke.
    * @param applyThis
    * @param applyArgs
    * @param source A unique debug location of the API being invoked.
    * @returns {any} Value from the `callback` function.
    */
  def run[T](callback: js.Function): T = js.native
  def run[T](callback: js.Function, applyThis: js.Any): T = js.native
  def run[T](callback: js.Function, applyThis: js.Any, applyArgs: js.Array[_]): T = js.native
  def run[T](callback: js.Function, applyThis: js.Any, applyArgs: js.Array[_], source: java.lang.String): T = js.native
  /**
    * Invokes a function in a given zone and catches any exceptions.
    *
    * Any exceptions thrown will be forwarded to [Zone.HandleError].
    *
    * The invocation of `callback` can be intercepted by declaring [ZoneSpec.onInvoke]. The
    * handling of exceptions can be intercepted by declaring [ZoneSpec.handleError].
    *
    * @param callback The function to invoke.
    * @param applyThis
    * @param applyArgs
    * @param source A unique debug location of the API being invoked.
    * @returns {any} Value from the `callback` function.
    */
  def runGuarded[T](callback: js.Function): T = js.native
  def runGuarded[T](callback: js.Function, applyThis: js.Any): T = js.native
  def runGuarded[T](callback: js.Function, applyThis: js.Any, applyArgs: js.Array[_]): T = js.native
  def runGuarded[T](callback: js.Function, applyThis: js.Any, applyArgs: js.Array[_], source: java.lang.String): T = js.native
  /**
    * Execute the Task by restoring the [Zone.currentTask] in the Task's zone.
    *
    * @param task to run
    * @param applyThis
    * @param applyArgs
    * @returns {*}
    */
  def runTask(task: Task): js.Any = js.native
  def runTask(task: Task, applyThis: js.Any): js.Any = js.native
  def runTask(task: Task, applyThis: js.Any, applyArgs: js.Any): js.Any = js.native
  /**
    * Schedule an EventTask.
    *
    * @param source
    * @param callback
    * @param data
    * @param customSchedule
    * @param customCancel
    */
  def scheduleEventTask(source: java.lang.String, callback: js.Function): EventTask = js.native
  def scheduleEventTask(source: java.lang.String, callback: js.Function, data: TaskData): EventTask = js.native
  def scheduleEventTask(
    source: java.lang.String,
    callback: js.Function,
    data: TaskData,
    customSchedule: js.Function1[/* task */ Task, scala.Unit]
  ): EventTask = js.native
  def scheduleEventTask(
    source: java.lang.String,
    callback: js.Function,
    data: TaskData,
    customSchedule: js.Function1[/* task */ Task, scala.Unit],
    customCancel: js.Function1[/* task */ Task, scala.Unit]
  ): EventTask = js.native
  /**
    * Schedule a MacroTask.
    *
    * @param source
    * @param callback
    * @param data
    * @param customSchedule
    * @param customCancel
    */
  def scheduleMacroTask(source: java.lang.String, callback: js.Function): MacroTask = js.native
  def scheduleMacroTask(source: java.lang.String, callback: js.Function, data: TaskData): MacroTask = js.native
  def scheduleMacroTask(
    source: java.lang.String,
    callback: js.Function,
    data: TaskData,
    customSchedule: js.Function1[/* task */ Task, scala.Unit]
  ): MacroTask = js.native
  def scheduleMacroTask(
    source: java.lang.String,
    callback: js.Function,
    data: TaskData,
    customSchedule: js.Function1[/* task */ Task, scala.Unit],
    customCancel: js.Function1[/* task */ Task, scala.Unit]
  ): MacroTask = js.native
  /**
    * Schedule a MicroTask.
    *
    * @param source
    * @param callback
    * @param data
    * @param customSchedule
    */
  def scheduleMicroTask(source: java.lang.String, callback: js.Function): MicroTask = js.native
  def scheduleMicroTask(source: java.lang.String, callback: js.Function, data: TaskData): MicroTask = js.native
  def scheduleMicroTask(
    source: java.lang.String,
    callback: js.Function,
    data: TaskData,
    customSchedule: js.Function1[/* task */ Task, scala.Unit]
  ): MicroTask = js.native
  /**
    * Schedule an existing Task.
    *
    * Useful for rescheduling a task which was already canceled.
    *
    * @param task
    */
  def scheduleTask[T /* <: Task */](task: T): T = js.native
  /**
    * Wraps a callback function in a new function which will properly restore the current zone upon
    * invocation.
    *
    * The wrapped function will properly forward `this` as well as `arguments` to the `callback`.
    *
    * Before the function is wrapped the zone can intercept the `callback` by declaring
    * [ZoneSpec.onIntercept].
    *
    * @param callback the function which will be wrapped in the zone.
    * @param source A unique debug location of the API being wrapped.
    * @returns {function(): *} A function which will invoke the `callback` through [Zone.runGuarded].
    */
  def wrap[F /* <: js.Function */](callback: F, source: java.lang.String): F = js.native
}

