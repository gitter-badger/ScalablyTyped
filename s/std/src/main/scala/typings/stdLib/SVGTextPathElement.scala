package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGTextPathElement
  extends SVGTextContentElement
     with SVGURIReference {
  val TEXTPATH_METHODTYPE_ALIGN: scala.Double = js.native
  val TEXTPATH_METHODTYPE_STRETCH: scala.Double = js.native
  val TEXTPATH_METHODTYPE_UNKNOWN: scala.Double = js.native
  val TEXTPATH_SPACINGTYPE_AUTO: scala.Double = js.native
  val TEXTPATH_SPACINGTYPE_EXACT: scala.Double = js.native
  val TEXTPATH_SPACINGTYPE_UNKNOWN: scala.Double = js.native
  val method: SVGAnimatedEnumeration = js.native
  val spacing: SVGAnimatedEnumeration = js.native
  val startOffset: SVGAnimatedLength = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("SVGTextPathElement")
@js.native
object SVGTextPathElement
  extends org.scalablytyped.runtime.Instantiable0[SVGTextPathElement] {
  val TEXTPATH_METHODTYPE_ALIGN: scala.Double = js.native
  val TEXTPATH_METHODTYPE_STRETCH: scala.Double = js.native
  val TEXTPATH_METHODTYPE_UNKNOWN: scala.Double = js.native
  val TEXTPATH_SPACINGTYPE_AUTO: scala.Double = js.native
  val TEXTPATH_SPACINGTYPE_EXACT: scala.Double = js.native
  val TEXTPATH_SPACINGTYPE_UNKNOWN: scala.Double = js.native
}

