package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OptionGroup extends js.Object

@JSImport("@ionic/cli-framework/lib/help", "OptionGroup")
@js.native
object OptionGroup extends js.Object {
  @js.native
  sealed trait Advanced
    extends atIonicCliDashFrameworkLib.libHelpMod.OptionGroup
  
  @js.native
  sealed trait Beta
    extends atIonicCliDashFrameworkLib.libHelpMod.OptionGroup
  
  @js.native
  sealed trait Deprecated
    extends atIonicCliDashFrameworkLib.libHelpMod.OptionGroup
  
  @js.native
  sealed trait Experimental
    extends atIonicCliDashFrameworkLib.libHelpMod.OptionGroup
  
  @js.native
  sealed trait Hidden
    extends atIonicCliDashFrameworkLib.libHelpMod.OptionGroup
  
  /* "advanced" */ val Advanced: Advanced with java.lang.String = js.native
  /* "beta" */ val Beta: Beta with java.lang.String = js.native
  /* "deprecated" */ val Deprecated: Deprecated with java.lang.String = js.native
  /* "experimental" */ val Experimental: Experimental with java.lang.String = js.native
  /* "hidden" */ val Hidden: Hidden with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atIonicCliDashFrameworkLib.libHelpMod.OptionGroup with java.lang.String] = js.native
}

