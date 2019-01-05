package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableResource extends js.Object {
  /** Copies a table. */
  def copy(request: gapiDotClientDotFusiontablesLib.Anon_AltCopyPresentation): gapiDotClientLib.gapiNs.clientNs.Request[Table]
  /** Deletes a table. */
  def delete(request: gapiDotClientDotFusiontablesLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a specific table by its ID. */
  def get(request: gapiDotClientDotFusiontablesLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Table]
  /** Imports more rows into a table. */
  def importRows(request: gapiDotClientDotFusiontablesLib.Anon_AltDelimiter): gapiDotClientLib.gapiNs.clientNs.Request[Import]
  /** Imports a new table. */
  def importTable(request: gapiDotClientDotFusiontablesLib.Anon_AltDelimiterEncoding): gapiDotClientLib.gapiNs.clientNs.Request[Table]
  /** Creates a new table. */
  def insert(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Table]
  /** Retrieves a list of tables a user owns. */
  def list(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[TableList]
  /**
    * Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch
    * semantics.
    */
  def patch(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Table]
  /** Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready. */
  def replaceRows(request: gapiDotClientDotFusiontablesLib.Anon_AltDelimiter): gapiDotClientLib.gapiNs.clientNs.Request[Task]
  /** Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. */
  def update(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Table]
}

