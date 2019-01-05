package typings
package nedbLib.nedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nedb
  extends nodeLib.eventsMod.EventEmitter {
  var persistence: nedbLib.nedbMod.NedbNs.Persistence = js.native
  @JSName("addListener")
  def addListener_compactiondone(event: nedbLib.nedbLibStrings.compactionDOTdone, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Add one or several document(s) to all indexes
    */
  def addToIndexes[T](doc: T): scala.Unit = js.native
  def addToIndexes[T](doc: js.Array[T]): scala.Unit = js.native
  def count(query: js.Any): nedbLib.nedbMod.NedbNs.CursorCount = js.native
  /**
    * Count all documents matching the query
    * @param query MongoDB-style query
    */
  def count(
    query: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* n */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Ensure an index is kept for this field. Same parameters as lib/indexes
    * For now this function is synchronous, we need to test how much time it takes
    * We use an async API for consistency with the rest of the code
    * @param cb Optional callback, signature: err
    */
  def ensureIndex(options: nedbLib.nedbMod.NedbNs.EnsureIndexOptions): scala.Unit = js.native
  def ensureIndex(
    options: nedbLib.nedbMod.NedbNs.EnsureIndexOptions,
    cb: js.Function1[/* err */ nodeLib.Error with stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def find[T](query: js.Any): nedbLib.nedbMod.NedbNs.Cursor[T] = js.native
  /**
    * Find all documents matching the query
    * If no callback is passed, we return the cursor so that user can limit, skip and finally exec
    * * @param {any} query MongoDB-style query
    */
  def find[T](
    query: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* documents */ js.Array[T], scala.Unit]
  ): scala.Unit = js.native
  def find[T](query: js.Any, projection: T): nedbLib.nedbMod.NedbNs.Cursor[T] = js.native
  /**
    * Find all documents matching the query
    * If no callback is passed, we return the cursor so that user can limit, skip and finally exec
    * @param query MongoDB-style query
    * @param projection MongoDB-style projection
    */
  def find[T](
    query: js.Any,
    projection: T,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* documents */ js.Array[T], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Find one document matching the query
    * @param query MongoDB-style query
    */
  def findOne[T](
    query: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* document */ T, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Find one document matching the query
    * @param query MongoDB-style query
    * @param projection MongoDB-style projection
    */
  def findOne[T](
    query: js.Any,
    projection: T,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* document */ T, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Get an array of all the data in the database
    */
  def getAllData(): js.Array[_] = js.native
  /**
    * Return the list of candidates for a given query
    * Crude implementation for now, we return the candidates given by the first usable index if any
    * We try the following query types, in this order: basic match, $in match, comparison match
    * One way to make it better would be to enable the use of multiple indexes if the first usable index
    * returns too much data. I may do it in the future.
    *
    * TODO: needs to be moved to the Cursor module
    */
  def getCandidates(query: js.Any): scala.Unit = js.native
  /**
    * Insert a new document
    * @param cb Optional callback, signature: err, insertedDoc
    */
  def insert[T](newDoc: T): scala.Unit = js.native
  def insert[T](
    newDoc: T,
    cb: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* document */ T, scala.Unit]
  ): scala.Unit = js.native
  @JSName("listenerCount")
  def listenerCount_compactiondone(`type`: nedbLib.nedbLibStrings.compactionDOTdone): scala.Double = js.native
  @JSName("listeners")
  def listeners_compactiondone(event: nedbLib.nedbLibStrings.compactionDOTdone): js.Array[js.Function0[scala.Unit]] = js.native
  /**
    * Load the database from the datafile, and trigger the execution of buffered commands if any
    */
  def loadDatabase(): scala.Unit = js.native
  def loadDatabase(cb: js.Function1[/* err */ nodeLib.Error with stdLib.Error, scala.Unit]): scala.Unit = js.native
  @JSName("off")
  def off_compactiondone(event: nedbLib.nedbLibStrings.compactionDOTdone, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_compactiondone(event: nedbLib.nedbLibStrings.compactionDOTdone, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_compactiondone(event: nedbLib.nedbLibStrings.compactionDOTdone, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_compactiondone(event: nedbLib.nedbLibStrings.compactionDOTdone, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_compactiondone(event: nedbLib.nedbLibStrings.compactionDOTdone, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("rawListeners")
  def rawListeners_compactiondone(event: nedbLib.nedbLibStrings.compactionDOTdone): js.Array[js.Function0[scala.Unit]] = js.native
  def remove(query: js.Any): scala.Unit = js.native
  def remove(
    query: js.Any,
    cb: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* n */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Remove all docs matching the query
    * For now very naive implementation (similar to update)
    * @param options Optional options
    *                 options.multi If true, can update multiple documents (defaults to false)
    * @param cb Optional callback, signature: err, numRemoved
    *
    * @api private Use Datastore.remove which has the same signature
    */
  def remove(query: js.Any, options: nedbLib.nedbMod.NedbNs.RemoveOptions): scala.Unit = js.native
  def remove(
    query: js.Any,
    options: nedbLib.nedbMod.NedbNs.RemoveOptions,
    cb: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* n */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Remove one or several document(s) from all indexes
    */
  def removeFromIndexes[T](doc: T): scala.Unit = js.native
  def removeFromIndexes[T](doc: js.Array[T]): scala.Unit = js.native
  /**
    * Remove an index
    * @param cb Optional callback, signature: err
    */
  def removeIndex(fieldName: java.lang.String): scala.Unit = js.native
  def removeIndex(
    fieldName: java.lang.String,
    cb: js.Function1[/* err */ nodeLib.Error with stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_compactiondone(event: nedbLib.nedbLibStrings.compactionDOTdone, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Reset all currently defined indexes
    */
  def resetIndexes(newData: js.Any): scala.Unit = js.native
  /**
    * Update all docs matching query v1.7.4 and prior signature.
    * For now, very naive implementation (recalculating the whole database)
    * @param options Optional options
    *                 options.multi If true, can update multiple documents (defaults to false)
    *                 options.upsert If true, document is inserted if the query doesn't match anything
    * @param cb Optional callback, signature: err,
    *                                                    numReplaced,
    *                                                    upsert (set to true if the update was in fact an upsert)
    *
    * @api private Use Datastore.update which has the same signature
    */
  def update(query: js.Any, updateQuery: js.Any): scala.Unit = js.native
  def update(query: js.Any, updateQuery: js.Any, options: nedbLib.nedbMod.NedbNs.UpdateOptions): scala.Unit = js.native
  def update(
    query: js.Any,
    updateQuery: js.Any,
    options: nedbLib.nedbMod.NedbNs.UpdateOptions,
    cb: js.Function3[
      /* err */ nodeLib.Error with stdLib.Error, 
      /* numberOfUpdated */ scala.Double, 
      /* upsert */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def update[T](
    query: js.Any,
    updateQuery: js.Any,
    options: nedbLib.nedbMod.NedbNs.UpdateOptions,
    cb: js.Function4[
      /* err */ nodeLib.Error with stdLib.Error, 
      /* numberOfUpdated */ scala.Double, 
      /* affectedDocuments */ js.Any, 
      /* upsert */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Update one or several documents in all indexes
    * To update multiple documents, oldDoc must be an array of { oldDoc, newDoc } pairs
    * If one update violates a constraint, all changes are rolled back
    */
  def updateIndexes[T](oldDoc: T, newDoc: T): scala.Unit = js.native
  def updateIndexes[T](updates: js.Array[nedbLib.Anon_OldDoc[T]]): scala.Unit = js.native
  /**
    * Update all docs matching query v1.8 signature.
    * For now, very naive implementation (recalculating the whole database)
    * @param options Optional options
    *                 options.multi If true, can update multiple documents (defaults to false)
    *                 options.upsert If true, document is inserted if the query doesn't match anything
    * @param cb Optional callback, signature: err,
    *                                                    numAffected,
    *                                                    affectedDocuments (when returnUpdatedDocs is set to true), obj or array
    *                                                    upsert (set to true if the update was in fact an upsert)
    *
    * @api private Use Datastore.update which has the same signature
    */
  @JSName("update")
  def update_T[T](query: js.Any, updateQuery: js.Any): scala.Unit = js.native
  @JSName("update")
  def update_T[T](query: js.Any, updateQuery: js.Any, options: nedbLib.nedbMod.NedbNs.UpdateOptions): scala.Unit = js.native
}

