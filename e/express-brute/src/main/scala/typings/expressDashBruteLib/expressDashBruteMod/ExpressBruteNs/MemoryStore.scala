package typings
package expressDashBruteLib.expressDashBruteMod.ExpressBruteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryStore extends js.Object {
  /**
    * @summary Gets key value.
    * @param {string}      key     The key name.
    * @param {Function}    callbck The callback.
    */
  def get(
    key: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, scala.Unit]
  ): scala.Unit
  /**
    * @summary Deletes the key.
    * @param {string}      key      The name.
    * @param {Function}    callback The callback.
    */
  def reset(key: java.lang.String, callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit
  /**
    * @summary Sets the key value.
    * @param {string}      key      The name.
    * @param {string}      value    The value.
    * @param {number}      lifetime The lifetime.
    * @param {Function}    callback The callback.
    */
  def set(
    key: java.lang.String,
    value: js.Any,
    lifetime: scala.Double,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit
}

