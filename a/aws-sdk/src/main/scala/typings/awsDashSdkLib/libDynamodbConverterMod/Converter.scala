package typings
package awsDashSdkLib.libDynamodbConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/dynamodb/converter", "Converter")
@js.native
class Converter () extends js.Object

@JSImport("aws-sdk/lib/dynamodb/converter", "Converter")
@js.native
object Converter extends js.Object {
  def input(data: js.Any): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue = js.native
  def input(data: js.Any, options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue = js.native
  def marshall(data: org.scalablytyped.runtime.StringDictionary[js.Any]): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap = js.native
  def marshall(
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
  ): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap = js.native
  def output(data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue): js.Any = js.native
  def output(
    data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue,
    options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
  ): js.Any = js.native
  def unmarshall(data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def unmarshall(
    data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap,
    options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

