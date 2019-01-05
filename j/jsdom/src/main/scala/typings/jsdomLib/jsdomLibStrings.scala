package typings
package jsdomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsdomLibStrings {
  @js.native
  sealed trait dangerously extends js.Object
  
  @js.native
  sealed trait jsdomError extends js.Object
  
  @js.native
  sealed trait `outside-only` extends js.Object
  
  @js.native
  sealed trait usable extends js.Object
  
  def dangerously: dangerously = "dangerously".asInstanceOf[dangerously]
  def jsdomError: jsdomError = "jsdomError".asInstanceOf[jsdomError]
  def `outside-only`: `outside-only` = "outside-only".asInstanceOf[`outside-only`]
  def usable: usable = "usable".asInstanceOf[usable]
}

