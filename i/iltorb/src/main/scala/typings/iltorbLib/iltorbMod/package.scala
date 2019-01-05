package typings
package iltorbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iltorbMod {
  type IltorbCallback = js.Function2[
    /* err */ js.UndefOr[(nodeLib.Error with stdLib.Error) | scala.Null], 
    /* output */ nodeLib.Buffer, 
    scala.Unit
  ]
}
