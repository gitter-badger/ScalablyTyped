package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object knexLib {
  type Callback = js.Function1[/* repeated */ js.Any, scala.Unit]
  type Client = js.Function1[/* repeated */ js.Any, scala.Unit]
  type ColumnName = java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Knex.Raw */ js.Any) | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type TableName = java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Knex.Raw */ js.Any)
  type Value = java.lang.String | scala.Double | scala.Boolean | stdLib.Date | js.Array[java.lang.String] | js.Array[scala.Double] | js.Array[stdLib.Date] | js.Array[scala.Boolean] | nodeLib.Buffer | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Knex.Raw */ js.Any)
}
