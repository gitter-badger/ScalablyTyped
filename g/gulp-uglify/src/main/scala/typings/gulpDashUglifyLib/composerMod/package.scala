package typings
package gulpDashUglifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object composerMod {
  type Composer = js.Function2[
    /* uglify */ Uglify, 
    /* log */ Logger, 
    (js.Function1[
      /* options */ js.UndefOr[gulpDashUglifyLib.gulpDashUglifyMod.GulpUglifyNs.Options], 
      nodeLib.NodeJSNs.ReadWriteStream
    ]) with gulpDashUglifyLib.Anon_GulpUglify
  ]
}
