package typings
package apolloDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Store extends js.Object {
  @JSName("children")
  var children_Original: reactLib.reactMod.ReactNs.Validator[_] = js.native
  @JSName("client")
  var client_Original: reactLib.reactMod.ReactNs.Validator[_] = js.native
  var immutable: reactLib.reactMod.ReactNs.Requireable[_] = js.native
  var store: reactLib.reactMod.ReactNs.Requireable[_] = js.native
  def children(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def client(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

