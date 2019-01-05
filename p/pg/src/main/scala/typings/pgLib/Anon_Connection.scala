package typings
package pgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  var Client: org.scalablytyped.runtime.Instantiable1[
    /* config */ js.UndefOr[/* config */ java.lang.String | pgLib.pgMod.ClientConfig], 
    pgLib.pgMod.Client
  ]
  var ClientBase: org.scalablytyped.runtime.Instantiable1[
    /* config */ js.UndefOr[/* config */ java.lang.String | pgLib.pgMod.ClientConfig], 
    pgLib.pgMod.ClientBase
  ]
  var Connection: org.scalablytyped.runtime.Instantiable1[
    /* config */ js.UndefOr[/* config */ pgLib.pgMod.ConnectionConfig], 
    pgLib.pgMod.Connection
  ]
  var Events: org.scalablytyped.runtime.Instantiable0[pgLib.pgMod.Events]
  var Pool: org.scalablytyped.runtime.Instantiable1[/* config */ js.UndefOr[/* config */ pgLib.pgMod.PoolConfig], pgLib.pgMod.Pool]
  var Query: org.scalablytyped.runtime.Instantiable0[pgLib.pgMod.Query]
  val defaults: pgLib.pgMod.Defaults with pgLib.pgMod.ClientConfig
  val native: (/* import warning: ImportType.apply Failed type conversion: typeof Pg */ js.Any) | scala.Null
}

