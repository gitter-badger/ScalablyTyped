package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "VCard")
@js.native
class VCard () extends DAVObject {
  def this(options: VCardOptions) = this()
  var addressBook: AddressBook = js.native
  var addressData: java.lang.String = js.native
}

