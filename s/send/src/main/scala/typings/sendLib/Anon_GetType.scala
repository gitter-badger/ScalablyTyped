package typings
package sendLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetType extends js.Object {
  val default_type: java.lang.String = js.native
  def define(mimes: mimeLib.mimeMod.TypeMap): scala.Unit = js.native
  def define(mimes: mimeLib.mimeMod.TypeMap, force: scala.Boolean): scala.Unit = js.native
  def getExtension(mime: java.lang.String): java.lang.String | scala.Null = js.native
  def getType(path: java.lang.String): java.lang.String | scala.Null = js.native
}

