package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cellNavNs {
  type navigateHandler[TEntity] = js.Function2[/* newRowCol */ IRowCol[TEntity], /* oldRowCol */ IRowCol[TEntity], scala.Unit]
  type viewportKeyDownHandler[TEntity] = js.Function2[
    /* event */ angularLib.JQueryKeyEventObject with jqueryLib.JQueryKeyEventObject, 
    /* rowCol */ IRowCol[TEntity], 
    scala.Unit
  ]
  type viewportKeyPressHandler[TEntity] = js.Function2[
    /* event */ angularLib.JQueryKeyEventObject with jqueryLib.JQueryKeyEventObject, 
    /* rowCol */ IRowCol[TEntity], 
    scala.Unit
  ]
}
