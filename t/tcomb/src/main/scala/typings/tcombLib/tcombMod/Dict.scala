package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// dict combinator
//
@js.native
trait Dict[T]
  extends Type[org.scalablytyped.runtime.StringDictionary[T]] {
  @JSName("meta")
  var meta_Dict: tcombLib.Anon_KindNameIdentityDomain[T] = js.native
  @JSName("update")
  var update_Original: tcombLib.Update[org.scalablytyped.runtime.StringDictionary[T]] = js.native
  def update(
    instance: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[T]],
    spec: tcombLib.UpdatePatch
  ): org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[T]] = js.native
}

