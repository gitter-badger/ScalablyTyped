package typings
package anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  /**
    * Adapter name e.g. 'mysql'
    */
  var adapter: js.UndefOr[anyDashDbLib.anyDashDbMod.Adapter] = js.undefined
  /**
    * Rollback automatically on error, default true
    */
  var autoRollback: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * SQL statement for beginning a transaction, default 'BEGIN'
    */
  var begin: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback for transaction
    */
  var callback: js.UndefOr[
    js.Function2[
      /* error */ nodeLib.Error with stdLib.Error, 
      /* transaction */ Transaction, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * SQL statement for committing a transaction, default 'COMMIT'
    */
  var commit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * SQL statement for rolling back a transaction, default 'ROLLBACK'
    */
  var rollback: js.UndefOr[java.lang.String] = js.undefined
}

