package typings
package socketclusterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scworkerMod {
  type middlewareFunction = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify SCServer.SCServerOptions */ /* options */ js.Any, 
    /* next */ js.Function1[
      /* error */ js.UndefOr[java.lang.String | (nodeLib.Error with stdLib.Error)], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
