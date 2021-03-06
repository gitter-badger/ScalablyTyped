package typings
package atHyperlorisTysonLib.distTypesAnnotationsJsonPropertyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonPropertyOptions extends js.Object {
  /**
    * It can be used to force Tyson to ignore this property during
    * the serialization or deserialization process.
    */
  var access: js.UndefOr[Access] = js.undefined
  /**
    * Indicates the name of the key on the JSON, this is very useful
    * if you need to have a different name on the class.
    * Eg. If you mark your private property with "_"
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Property that indicates whether a value is expected for property
    * during deserialization or not. If the value is missing on the JSON,
    * an exception is thrown.
    * Default value: false
    */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies a type of the property.
    * This is mandatory for arrays (single and multi-type).
    * NOTE: if it's a Date object, you MUST specify the type!
    */
  var `type`: js.UndefOr[atHyperlorisTysonLib.distTypesReflectTypeTokenMod.ClassType[_] | js.Array[_]] = js.undefined
}

