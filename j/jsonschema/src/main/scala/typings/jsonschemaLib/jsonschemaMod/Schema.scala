package typings
package jsonschemaLib.jsonschemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$schema")
  var $schema: js.UndefOr[java.lang.String] = js.undefined
  var additionalItems: js.UndefOr[scala.Boolean | Schema] = js.undefined
  var additionalProperties: js.UndefOr[scala.Boolean | Schema] = js.undefined
  var allOf: js.UndefOr[js.Array[Schema]] = js.undefined
  var anyOf: js.UndefOr[js.Array[Schema]] = js.undefined
  var definitions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Schema]] = js.undefined
  var dependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Schema | js.Array[java.lang.String]]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var enum: js.UndefOr[js.Array[_]] = js.undefined
  var exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined
  var exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[Schema | js.Array[Schema]] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var maxProperties: js.UndefOr[scala.Double] = js.undefined
  var maximum: js.UndefOr[scala.Double] = js.undefined
  var minItems: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var minProperties: js.UndefOr[scala.Double] = js.undefined
  var minimum: js.UndefOr[scala.Double] = js.undefined
  var multipleOf: js.UndefOr[scala.Double] = js.undefined
  var not: js.UndefOr[Schema] = js.undefined
  var oneOf: js.UndefOr[js.Array[Schema]] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var patternProperties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Schema]] = js.undefined
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Schema]] = js.undefined
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
}

