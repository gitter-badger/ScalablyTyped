package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamDashToDashStringLib {
  type Callback = js.Function2[
    /* error */ js.UndefOr[nodeLib.Error with stdLib.Error], 
    /* str */ java.lang.String, 
    scala.Unit
  ]
}
