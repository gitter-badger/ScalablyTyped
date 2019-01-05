package typings
package dynogelsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynogelsMod {
  type DynogelsItemCallback = js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* data */ Item, scala.Unit]
  type LifeCycleAction = dynogelsLib.dynogelsLibStrings.create | dynogelsLib.dynogelsLibStrings.update | dynogelsLib.dynogelsLibStrings.destroy
  type QueryFilterChain = ExtendedChain[Query]
  type QueryWhereChain = BaseChain[Query]
  type tableResolve = js.Function0[java.lang.String]
}
