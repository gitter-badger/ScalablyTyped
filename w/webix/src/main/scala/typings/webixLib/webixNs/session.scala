package typings
package webixLib.webixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait session extends js.Object {
  def clear(): scala.Unit
  def get(name: java.lang.String): js.Any
  def put(name: java.lang.String, value: js.Any): scala.Unit
  def remove(name: java.lang.String): scala.Unit
}

