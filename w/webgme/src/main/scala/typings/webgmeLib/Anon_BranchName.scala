package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BranchName extends js.Object {
  def apply(
    branchName: webgmeLib.GmeCommonNs.Name,
    parents: webgmeLib.GmeStorageNs.CommitHash,
    rootHash: webgmeLib.CoreNs.ObjectHash,
    coreObjects: webgmeLib.CoreNs.DataObject,
    msg: java.lang.String
  ): js.Promise[webgmeLib.GmeStorageNs.CommitResult] = js.native
  def apply(
    branchName: webgmeLib.GmeCommonNs.Name,
    parents: webgmeLib.GmeStorageNs.CommitHash,
    rootHash: webgmeLib.CoreNs.ObjectHash,
    coreObjects: webgmeLib.CoreNs.DataObject,
    msg: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitResult]
  ): scala.Unit = js.native
}

