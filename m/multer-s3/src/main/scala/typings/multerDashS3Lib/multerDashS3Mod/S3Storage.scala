package typings
package multerDashS3Lib.multerDashS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Storage extends js.Object {
  def apply(): multerLib.multerMod.multerNs.StorageEngine = js.native
  def apply(options: Options): multerLib.multerMod.multerNs.StorageEngine = js.native
  def AUTO_CONTENT_TYPE(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request with multerLib.multerMod.Global.ExpressNs.Request,
    file: multerLib.multerMod.Global.ExpressNs.MulterNs.File,
    callback: js.Function3[
      /* error */ js.Any, 
      /* mime */ js.UndefOr[java.lang.String], 
      /* stream */ js.UndefOr[nodeLib.NodeJSNs.ReadableStream], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DEFAULT_CONTENT_TYPE(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request with multerLib.multerMod.Global.ExpressNs.Request,
    file: multerLib.multerMod.Global.ExpressNs.MulterNs.File,
    callback: js.Function2[/* error */ js.Any, /* mime */ js.UndefOr[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
}

