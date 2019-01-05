package typings
package chaiDashJqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tick extends js.Object {
  /**
    * The rate (in milliseconds) at which animations fire.
    */
  var interval: scala.Double
  /**
    * Globally disable all animations.
    */
  var off: scala.Boolean
  var speeds: Anon_Slow
  var step: js.Any
  def stop(): scala.Unit
  def tick(): scala.Unit
}

