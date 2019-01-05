package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetAcceptLanguages extends js.Object {
  def detectLanguage(
    text: java.lang.String,
    callback: js.Function1[/* result */ chromeLib.chromeNs.i18nNs.LanguageDetectionResult, scala.Unit]
  ): scala.Unit = js.native
  def getAcceptLanguages(callback: js.Function1[/* languages */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def getMessage(messageName: java.lang.String): java.lang.String = js.native
  def getMessage(messageName: java.lang.String, substitutions: js.Any): java.lang.String = js.native
  def getUILanguage(): java.lang.String = js.native
}

