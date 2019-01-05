package typings
package chaiDashAsDashPromisedLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedInclude extends js.Object {
  var all: PromisedKeyFilter = js.native
  var any: PromisedKeyFilter = js.native
  var deep: PromisedDeep = js.native
  @JSName("keys")
  var keys_Original: PromisedKeys = js.native
  @JSName("members")
  var members_Original: PromisedMembers = js.native
  var ordered: PromisedOrdered = js.native
  def apply(value: chaiLib.Object with js.Object): PromisedAssertion = js.native
  def apply(value: chaiLib.Object with js.Object, message: java.lang.String): PromisedAssertion = js.native
  def apply(value: java.lang.String): PromisedAssertion = js.native
  def apply(value: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def apply(value: scala.Double): PromisedAssertion = js.native
  def apply(value: scala.Double, message: java.lang.String): PromisedAssertion = js.native
  def keys(keys: java.lang.String*): PromisedAssertion = js.native
  def keys(keys: chaiLib.Object with js.Object): PromisedAssertion = js.native
  def keys(keys: js.Array[_]): PromisedAssertion = js.native
  def members(set: js.Array[_]): PromisedAssertion = js.native
  def members(set: js.Array[_], message: java.lang.String): PromisedAssertion = js.native
}

