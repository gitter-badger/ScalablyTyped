package typings
package vscodeDashLanguageclientLib.libWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFolderWorkspaceMiddleware extends js.Object {
  var didChangeWorkspaceFolders: js.UndefOr[
    vscodeDashLanguageclientLib.libClientMod.NextSignature[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VWorkspaceFoldersChangeEvent */ _, 
      scala.Unit
    ]
  ] = js.undefined
  var workspaceFolders: js.UndefOr[
    vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersRequestNs.MiddlewareSignature
  ] = js.undefined
}

