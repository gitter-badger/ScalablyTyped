package typings
package electronDashPackagerLib.electronDashPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electronPackagerNs {
  type arch = electronDashPackagerLib.electronDashPackagerLibStrings.ia32 | electronDashPackagerLib.electronDashPackagerLibStrings.x64 | electronDashPackagerLib.electronDashPackagerLibStrings.armv7l | electronDashPackagerLib.electronDashPackagerLibStrings.arm64 | electronDashPackagerLib.electronDashPackagerLibStrings.mips64el | electronDashPackagerLib.electronDashPackagerLibStrings.all
  /**
    * Callback which is called when electron-packager is done.
    *
    * @param err - Contains errors if any.
    * @param appPaths - Path(s) to the newly created application(s).
    */
  type finalCallback = js.Function2[
    /* err */ nodeLib.Error, 
    /* appPaths */ java.lang.String | js.Array[java.lang.String], 
    scala.Unit
  ]
  type ignoreFunction = js.Function1[/* path */ java.lang.String, scala.Boolean]
  type onCompleteFn = js.Function5[
    /* buildPath */ java.lang.String, 
    /* electronVersion */ java.lang.String, 
    /* platform */ java.lang.String, 
    /* arch */ java.lang.String, 
    /* callbackFn */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  type platform = electronDashPackagerLib.electronDashPackagerLibStrings.linux | electronDashPackagerLib.electronDashPackagerLibStrings.win32 | electronDashPackagerLib.electronDashPackagerLibStrings.darwin | electronDashPackagerLib.electronDashPackagerLibStrings.mas | electronDashPackagerLib.electronDashPackagerLibStrings.all
}
