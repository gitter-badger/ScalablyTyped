package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var log: dynogelsLib.dynogelsMod.Log = js.native
  var types: dynogelsLib.Anon_BinarySet = js.native
  def Set(args: js.Any*): js.Any = js.native
  def createTables(callback: js.Function1[/* err */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def createTables(
    options: dynogelsLib.dynogelsMod.DynogelsGlobalOptions,
    callback: js.Function1[/* err */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def createTables(
    options: org.scalablytyped.runtime.StringDictionary[dynogelsLib.dynogelsMod.CreateTablesOptions],
    callback: js.Function1[/* err */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def define(modelName: java.lang.String, config: dynogelsLib.dynogelsMod.ModelConfiguration): dynogelsLib.dynogelsMod.Model = js.native
  def dynamoDriver(dynamoDB: dynogelsLib.dynogelsMod.AWSNs.DynamoDB): dynogelsLib.dynogelsMod.AWSNs.DynamoDB = js.native
  def reset(): scala.Unit = js.native
}

