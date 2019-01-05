package typings
package meteorDashCollectionDashHooksLib.mongoMod.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection[T] extends js.Object {
  var after: meteorDashCollectionDashHooksLib.Anon_FindHookUserIdSelector[T]
  var before: meteorDashCollectionDashHooksLib.Anon_FindHookUserId[T]
  var direct: meteorDashCollectionDashHooksLib.Anon_FindSelectorOptions[T]
  var hookOptions: meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.GlobalHookOptions
}

