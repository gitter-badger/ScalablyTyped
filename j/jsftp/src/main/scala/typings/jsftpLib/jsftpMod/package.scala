package typings
package jsftpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsftpMod {
  type ErrorCallback = js.Function1[/* err */ nodeLib.Error with stdLib.Error, scala.Unit]
  type GetCallback = js.Function2[
    /* err */ nodeLib.Error with stdLib.Error, 
    /* socket */ nodeLib.netMod.Socket, 
    scala.Unit
  ]
  type ListCallback = js.Function2[
    /* err */ nodeLib.Error with stdLib.Error, 
    /* dirContents */ java.lang.String, 
    scala.Unit
  ]
  type LsCallback = js.Function2[
    /* err */ nodeLib.Error with stdLib.Error, 
    /* res */ js.Array[jsftpLib.Anon_Name], 
    scala.Unit
  ]
  type RawCallback = js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* data */ jsftpLib.Anon_Code, scala.Unit]
}
