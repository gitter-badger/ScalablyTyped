package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Before extends js.Object {
  def apply(before: scala.Double, number: scala.Double): js.Promise[js.Array[webgmeLib.GmeStorageNs.CommitObject]] = js.native
  def apply(
    before: scala.Double,
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeStorageNs.CommitObject]]
  ): scala.Unit = js.native
  def apply(before: webgmeLib.GmeStorageNs.CommitHash, number: scala.Double): js.Promise[js.Array[webgmeLib.GmeStorageNs.CommitObject]] = js.native
  def apply(
    before: webgmeLib.GmeStorageNs.CommitHash,
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeStorageNs.CommitObject]]
  ): scala.Unit = js.native
}

