package typings
package meteorDashCollectionDashHooksLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection[T] extends js.Object {
  var after: meteorDashCollectionDashHooksLib.Anon_FindHook[T]
  var before: meteorDashCollectionDashHooksLib.Anon_Find[T]
  var direct: meteorDashCollectionDashHooksLib.Anon_FindSelector[T]
  var hookOptions: meteorDashCollectionDashHooksLib.CollectionHooksNs.GlobalHookOptions
}

