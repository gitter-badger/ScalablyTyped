package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Instance
// ~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/instance.js
//
/**
  * Options used for Instance.increment method
  */
trait InstanceIncrementDecrementOptions extends js.Object {
  /**
    * The number to increment by
    *
    * Defaults to 1
    */
  var by: js.UndefOr[scala.Double] = js.undefined
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  /**
    * A hash of attributes to describe your search. See above for examples.
    */
  var where: js.UndefOr[AnyWhereOptions | (js.Array[col | and | or | java.lang.String])] = js.undefined
}

