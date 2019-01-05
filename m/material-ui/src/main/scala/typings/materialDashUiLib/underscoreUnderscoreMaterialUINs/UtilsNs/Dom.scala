package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.UtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom extends js.Object {
  def addClass(el: reactLib.Element with stdLib.Element, className: java.lang.String): scala.Unit
  def forceRedraw(el: reactLib.HTMLElement with stdLib.HTMLElement): scala.Unit
  def getStyleAttributeAsNumber(el: reactLib.HTMLElement with stdLib.HTMLElement, attr: java.lang.String): scala.Double
  def hasClass(el: reactLib.Element with stdLib.Element, className: java.lang.String): scala.Boolean
  def isDescendant(parent: stdLib.Node, child: stdLib.Node): scala.Boolean
  def offset(el: reactLib.Element with stdLib.Element): materialDashUiLib.Anon_Top
  def removeClass(el: reactLib.Element with stdLib.Element, className: java.lang.String): scala.Unit
  def toggleClass(el: reactLib.Element with stdLib.Element, className: java.lang.String): scala.Unit
  def withoutTransition(el: reactLib.HTMLElement with stdLib.HTMLElement, callback: js.Function0[scala.Unit]): scala.Unit
}

