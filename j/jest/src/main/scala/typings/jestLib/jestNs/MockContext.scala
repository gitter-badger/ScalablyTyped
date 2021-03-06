package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockContext[T] extends js.Object {
  var calls: js.Array[js.Array[_]]
  var instances: js.Array[T]
  var invocationCallOrder: js.Array[scala.Double]
  /**
    * List of results of calls to the mock function.
    */
  var results: js.Array[MockResult]
}

