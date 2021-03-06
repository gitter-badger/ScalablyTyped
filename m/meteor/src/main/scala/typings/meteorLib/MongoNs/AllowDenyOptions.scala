package typings
package meteorLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowDenyOptions extends js.Object {
  var fetch: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var insert: js.UndefOr[js.Function2[/* userId */ java.lang.String, /* doc */ js.Any, scala.Boolean]] = js.undefined
  var remove: js.UndefOr[js.Function2[/* userId */ java.lang.String, /* doc */ js.Any, scala.Boolean]] = js.undefined
  var transform: js.UndefOr[js.Function | scala.Null] = js.undefined
  var update: js.UndefOr[
    js.Function4[
      /* userId */ java.lang.String, 
      /* doc */ js.Any, 
      /* fieldNames */ js.Array[java.lang.String], 
      /* modifier */ js.Any, 
      scala.Boolean
    ]
  ] = js.undefined
}

