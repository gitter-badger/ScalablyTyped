package typings
package enhancedDashResolveLib.libSyncAsyncFileSystemDecoratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncAsyncFileSystemDecorator extends js.Object {
  var fs: enhancedDashResolveLib.libCommonDashTypesMod.AbstractInputFileSystem
  var readFile: js.UndefOr[
    js.Function2[
      /* filename */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
        /* data */ js.UndefOr[nodeLib.Buffer], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var readJson: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
        /* data */ js.UndefOr[js.Any], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var readdir: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
        /* files */ js.UndefOr[js.Array[java.lang.String]], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var readlink: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
        /* linkString */ js.UndefOr[java.lang.String], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var stat: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
        /* stats */ js.UndefOr[nodeLib.fsMod.Stats], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
}

