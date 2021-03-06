package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface implemented by classes supporting behaviors
  */
trait IBehaviorAware[T] extends js.Object {
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  def addBehavior(behavior: Behavior[T]): T
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  def getBehaviorByName(name: java.lang.String): Nullable[Behavior[T]]
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  def removeBehavior(behavior: Behavior[T]): T
}

