package typings
package atGoogleDashCloudDatastoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transactionMod {
  type RollbackCallback = js.Function2[/* err */ nodeLib.Error, /* rollbackResponse */ js.Object, scala.Unit]
  type RollbackResult = js.Array[js.Object]
  type TransactionCallback = js.Function3[
    /* err */ nodeLib.Error, 
    /* tx */ DatastoreTransaction, 
    /* beginTxResponse */ BeginTransactionResponse, 
    scala.Unit
  ]
  type TransactionResult = js.Tuple2[DatastoreTransaction, BeginTransactionResponse]
}
