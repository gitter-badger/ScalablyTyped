package typings
package xmlcreateLib.xmlcreateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate", "XmlAttribute")
@js.native
class XmlAttribute protected ()
  extends xmlcreateLib.libNodesXmlAttributeMod.default {
  def this(name: java.lang.String, value: js.Array[xmlcreateLib.libNodesXmlNodeMod.default]) = this()
  /**
    * Initializes a new instance of the {@link XmlAttribute} class.
    *
    * @param name The name of the XML attribute.
    * @param value The initial value of the XML attribute. Additional children
    *              can be added later. Only {@link XmlAttributeText},
    *              {@link XmlCharRef}, and {@link XmlEntityRef} nodes are
    *              permitted.
    */
  def this(name: java.lang.String, value: xmlcreateLib.libNodesXmlNodeMod.default) = this()
}

