package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Schema builder
//
@js.native
trait SchemaBuilder extends ChainableInterface {
  def alterTable(tableName: java.lang.String, callback: js.Function1[/* tableBuilder */ CreateTableBuilder, _]): SchemaBuilder = js.native
  def createTable(tableName: java.lang.String, callback: js.Function1[/* tableBuilder */ CreateTableBuilder, _]): SchemaBuilder = js.native
  def createTableIfNotExists(tableName: java.lang.String, callback: js.Function1[/* tableBuilder */ CreateTableBuilder, _]): SchemaBuilder = js.native
  def dropTable(tableName: java.lang.String): SchemaBuilder = js.native
  def dropTableIfExists(tableName: java.lang.String): SchemaBuilder = js.native
  def hasColumn(tableName: java.lang.String, columnName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = js.native
  def hasTable(tableName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = js.native
  def raw(statement: java.lang.String): SchemaBuilder = js.native
  def renameTable(oldTableName: java.lang.String, newTableName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def table(tableName: java.lang.String, callback: js.Function1[/* tableBuilder */ AlterTableBuilder, _]): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def withSchema(schemaName: java.lang.String): SchemaBuilder = js.native
}

