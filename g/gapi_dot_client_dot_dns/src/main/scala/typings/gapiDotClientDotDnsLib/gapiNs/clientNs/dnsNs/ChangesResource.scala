package typings
package gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResource extends js.Object {
  /** Atomically update the ResourceRecordSet collection. */
  def create(request: gapiDotClientDotDnsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Change]
  /** Fetch the representation of an existing Change. */
  def get(request: gapiDotClientDotDnsLib.Anon_AltChangeId): gapiDotClientLib.gapiNs.clientNs.Request[Change]
  /** Enumerate Changes to a ResourceRecordSet collection. */
  def list(request: gapiDotClientDotDnsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[ChangesListResponse]
}

