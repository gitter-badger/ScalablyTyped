package typings
package firebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NextSnapshot extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ nodeLib.Error with stdLib.Error, scala.Unit]] = js.undefined
  var next: js.UndefOr[
    js.Function1[
      /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot, 
      scala.Unit
    ]
  ] = js.undefined
}

