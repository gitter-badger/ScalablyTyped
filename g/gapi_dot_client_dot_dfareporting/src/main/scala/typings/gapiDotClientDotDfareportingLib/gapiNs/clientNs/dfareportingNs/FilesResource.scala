package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesResource extends js.Object {
  /** Retrieves a report file by its report ID and file ID. This method supports media download. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsFileId): gapiDotClientLib.gapiNs.clientNs.Request[File] = js.native
  /** Retrieves a report file. This method supports media download. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsFileIdKey): gapiDotClientLib.gapiNs.clientNs.Request[File] = js.native
  /** Lists files for a user profile. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyMaxResultsOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[FileList] = js.native
  /** Lists files for a report. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyMaxResultsOauthtokenPageToken): gapiDotClientLib.gapiNs.clientNs.Request[FileList] = js.native
}

