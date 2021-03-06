package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeySystemAccess extends js.Object {
  val keySystem: java.lang.String
  def createMediaKeys(): js.Promise[MediaKeys]
  def getConfiguration(): MediaKeySystemConfiguration
}

@JSGlobal("MediaKeySystemAccess")
@js.native
object MediaKeySystemAccess
  extends org.scalablytyped.runtime.Instantiable0[MediaKeySystemAccess]

