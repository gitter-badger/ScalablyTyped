package typings
package antdLib.antdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Table")
@js.native
class Table[T] protected ()
  extends antdLib.libTableMod.default[T] {
  def this(props: antdLib.libTableInterfaceMod.TableProps[T]) = this()
}

@JSImport("antd", "Table")
@js.native
object Table extends js.Object {
  var Column: org.scalablytyped.runtime.Instantiable0[antdLib.libTableColumnMod.default[js.Object]] = js.native
  var ColumnGroup: antdLib.Anon_ANTTABLECOLUMNGROUP = js.native
  var defaultProps: antdLib.Anon_DataSourcePrefixCls = js.native
  var propTypes: antdLib.Anon_DataSourceColumns = js.native
}

