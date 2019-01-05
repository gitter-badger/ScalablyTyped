package typings
package gapiDotClientDotTranslateLib.gapiNs.clientNs.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagesResource extends js.Object {
  /**
    * Supported language code, generally consisting of its ISO 639-1
    * identifier. (E.g. 'en', 'ja'). In certain cases, BCP-47 codes including
    * language + region identifiers are returned (e.g. 'zh-TW' and 'zh-CH')
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** Human readable name of the language localized to the target language. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Returns a list of supported languages for translation. */
  def list(request: gapiDotClientDotTranslateLib.Anon_Xgafv): gapiDotClientLib.gapiNs.clientNs.Request[LanguagesListResponse]
}

