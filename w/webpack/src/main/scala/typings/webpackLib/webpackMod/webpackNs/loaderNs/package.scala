package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loaderNs {
  type loaderCallback = js.Function3[
    /* err */ js.UndefOr[(nodeLib.Error with stdLib.Error) | scala.Null], 
    /* content */ js.UndefOr[java.lang.String | nodeLib.Buffer], 
    /* sourceMap */ js.UndefOr[sourceDashMapLib.sourceDashMapMod.RawSourceMap], 
    scala.Unit
  ]
}
