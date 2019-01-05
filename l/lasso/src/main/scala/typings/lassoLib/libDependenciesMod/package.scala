package typings
package lassoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDependenciesMod {
  type Callback = js.Function2[
    /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
    /* result */ js.UndefOr[js.Any], 
    js.Any
  ]
}
