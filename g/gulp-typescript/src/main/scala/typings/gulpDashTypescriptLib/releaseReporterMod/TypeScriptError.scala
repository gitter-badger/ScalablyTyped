package typings
package gulpDashTypescriptLib.releaseReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeScriptError
  extends stdLib.Error {
  var diagnostic: typescriptLib.typescriptMod.tsNs.Diagnostic
  var endPosition: js.UndefOr[gulpDashTypescriptLib.Anon_Position] = js.undefined
  var file: js.UndefOr[gulpDashTypescriptLib.releaseTypesMod.VinylFile] = js.undefined
  var fullFilename: js.UndefOr[java.lang.String] = js.undefined
  var relativeFilename: js.UndefOr[java.lang.String] = js.undefined
  var startPosition: js.UndefOr[gulpDashTypescriptLib.Anon_Position] = js.undefined
  var tsFile: js.UndefOr[typescriptLib.typescriptMod.tsNs.SourceFile] = js.undefined
}

