package typings
package bucksLib.BucksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bucks extends js.Object {
  /**
    * Add a task.
    * @param task Function added async chain
    */
  def add(task: TaskWithNext): Bucks = js.native
  /**
    * Add delay execution.
    * @param ms number millisecond for delaying
    */
  def delay(ms: scala.Double): Bucks = js.native
  /**
    * Destroy this object and call last callback function.
    * @param err If specify err and no callback, throw to execute failure callback
    */
  def destroy(): Bucks = js.native
  def destroy(err: stdLib.Error): Bucks = js.native
  /**
    * Called when destroy async chain.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Add a empty task.
    */
  def empty(): Bucks = js.native
  /**
    * Complete creating async chain and start executing.
    * @param callback Last callback function
    * @param errback Handler for occurring error in last callback function
    */
  def end(): scala.Unit = js.native
  def end(callback: Task): scala.Unit = js.native
  def end(callback: Task, errback: js.Function1[/* err */ stdLib.Error, _]): scala.Unit = js.native
  /**
    * Add a task called only in case of error.
    * @param onError Function called only in case of error
    */
  def error(onError: js.Function2[/* err */ stdLib.Error, /* next */ js.UndefOr[Task], _]): Bucks = js.native
  /**
    * Add tasks in asynchronous way and join their results.
    * @param tasks Functions called in asynchronous way and join their results
    */
  def parallel(tasks: js.Array[TaskWithNext]): Bucks = js.native
  /**
    * Add a task called only in case of success.
    * @param onSuccess Function called only in case of success
    */
  def `then`(onSuccess: js.Function2[/* res */ js.Any, /* next */ js.UndefOr[Task], _]): Bucks = js.native
  /**
    * Add tasks in asynchronous way and join their results.
    * @param tasks Functions added async chain
    */
  def waterfall(tasks: js.Array[TaskWithNext]): Bucks = js.native
}

