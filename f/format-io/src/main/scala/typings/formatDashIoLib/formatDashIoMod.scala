package typings
package formatDashIoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("format-io", JSImport.Namespace)
@js.native
object formatDashIoMod extends js.Object {
  def addSlashToEnd(path: java.lang.String): java.lang.String = js.native
  def size(size: scala.Double): java.lang.String = js.native
  @JSName("permissions")
  @js.native
  object permissionsNs extends js.Object {
    /**
      * Converts Unix-like permissions from symbolic to numeric notation.
      * @param perm A string of Unix-like permission in symbolic notation.
      * @returns A representation of the permissions in numeric notation.
      */
    def numeric(perm: java.lang.String): java.lang.String = js.native
    /**
      * Converts Unix-like permissions from numeric to symbolic notation.
      * @param perm A string of Unix-like permission in numeric notation.
      * @returns A representation of the permissions in symbolic notation.
      */
    def symbolic(perm: java.lang.String): java.lang.String = js.native
  }
  
}

