package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinksResource extends js.Object {
  /**
    * Creates a sink that exports specified log entries to a destination. The export of newly-ingested log entries begins immediately, unless the sink's
    * writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
    */
  def create(request: gapiDotClientDotLoggingLib.Anon_XgafvAccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[LogSink]
  /** Deletes a sink. If the sink has a unique writer_identity, then that service account is also deleted. */
  def delete(request: gapiDotClientDotLoggingLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a sink. */
  def get(request: gapiDotClientDotLoggingLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[LogSink]
  /** Lists sinks. */
  def list(request: gapiDotClientDotLoggingLib.Anon_XgafvAccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListSinksResponse]
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter. The updated sink
    * might also have a new writer_identity; see the unique_writer_identity field.
    */
  def patch(request: gapiDotClientDotLoggingLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[LogSink]
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter. The updated sink
    * might also have a new writer_identity; see the unique_writer_identity field.
    */
  def update(request: gapiDotClientDotLoggingLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[LogSink]
}

