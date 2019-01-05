package typings
package xmlLib.xmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml", JSImport.Namespace)
@js.native
object xmlModMembers extends js.Object {
  def apply(): java.lang.String = js.native
  def apply(xmlObject: xmlLib.XmlObject | js.Array[xmlLib.XmlObject]): java.lang.String = js.native
  def apply(
    xmlObject: xmlLib.XmlObject | js.Array[xmlLib.XmlObject],
    options: scala.Boolean | java.lang.String | Option
  ): java.lang.String = js.native
  def apply(xmlObject: xmlLib.XmlObject | js.Array[xmlLib.XmlObject], options: xmlLib.Anon_Stream): nodeLib.NodeJSNs.ReadableStream = js.native
  def Element(xmlObjects: xmlLib.XmlObject*): ElementObject = js.native
  def element(xmlObjects: xmlLib.XmlObject*): ElementObject = js.native
}

