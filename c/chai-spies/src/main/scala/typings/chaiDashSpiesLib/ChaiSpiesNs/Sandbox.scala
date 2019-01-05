package typings
package chaiDashSpiesLib.ChaiSpiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sandbox extends js.Object {
  /**
    * #### chai.spy.on (function)
    *
    * Wraps an object method into spy. All calls will pass through to the original function.
    *
    * @param {Object} object
    * @param {String} methodNames names to spy on
    * @param {function} fn replacement function
    * @returns function to actually call
    */
  def on(`object`: chaiLib.Object with js.Object, methodNames: java.lang.String): js.Any = js.native
  def on(
    `object`: chaiLib.Object with js.Object,
    methodNames: java.lang.String,
    fn: js.Function1[/* parameters */ js.Array[_] | js.Any, _]
  ): js.Any = js.native
  def on(`object`: chaiLib.Object with js.Object, methodNames: js.Array[java.lang.String]): js.Any = js.native
  def on(
    `object`: chaiLib.Object with js.Object,
    methodNames: js.Array[java.lang.String],
    fn: js.Function1[/* parameters */ js.Array[_] | js.Any, _]
  ): js.Any = js.native
  /**
    * #### chai.spy.restore (function)
    *
    * Restores previously wrapped object's method.
    * Restores all spied objects of a sandbox if called without parameters.
    *
    * @function
    * @param {Object} [object]
    * @param {String|String[]} [methods] name or names
    * @return {Sandbox} Sandbox instance
    */
  def restore(): scala.Unit = js.native
  def restore(`object`: chaiLib.Object with js.Object): scala.Unit = js.native
  def restore(`object`: chaiLib.Object with js.Object, methodNames: java.lang.String): scala.Unit = js.native
  def restore(`object`: chaiLib.Object with js.Object, methodNames: js.Array[java.lang.String]): scala.Unit = js.native
}

