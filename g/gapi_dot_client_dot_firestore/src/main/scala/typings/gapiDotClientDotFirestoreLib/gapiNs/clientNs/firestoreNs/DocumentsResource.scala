package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentsResource extends js.Object {
  /**
    * Gets multiple documents.
    *
    * Documents returned by this method are not guaranteed to be returned in the
    * same order that they were requested.
    */
  def batchGet(request: gapiDotClientDotFirestoreLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[BatchGetDocumentsResponse]
  /** Starts a new transaction. */
  def beginTransaction(request: gapiDotClientDotFirestoreLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[BeginTransactionResponse]
  /** Commits a transaction, while optionally updating documents. */
  def commit(request: gapiDotClientDotFirestoreLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[CommitResponse]
  /** Creates a new document. */
  def createDocument(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Document]
  /** Deletes a document. */
  def delete(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a single document. */
  def get(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Document]
  /** Lists documents. */
  def list(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackCollectionId): gapiDotClientLib.gapiNs.clientNs.Request[ListDocumentsResponse]
  /** Lists all the collection IDs underneath a document. */
  def listCollectionIds(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ListCollectionIdsResponse]
  /** Listens to changes. */
  def listen(request: gapiDotClientDotFirestoreLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListenResponse]
  /** Updates or inserts a document. */
  def patch(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackCurrentDocumentexists): gapiDotClientLib.gapiNs.clientNs.Request[Document]
  /** Rolls back a transaction. */
  def rollback(request: gapiDotClientDotFirestoreLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Runs a query. */
  def runQuery(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[RunQueryResponse]
  /** Streams batches of document updates and deletes, in order. */
  def write(request: gapiDotClientDotFirestoreLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[WriteResponse]
}

