package typings
package numbroLib.numbroMod.numbroNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumbroLanguage extends js.Object {
  var abbreviations: numbroLib.Anon_Thousand
  var byteFormat: js.UndefOr[Format] = js.undefined
  var currency: numbroLib.Anon_Symbol
  var currencyFormat: js.UndefOr[Format] = js.undefined
  var defaults: js.UndefOr[Format] = js.undefined
  var delimiters: numbroLib.Anon_Thousands
  var formats: numbroLib.Anon_FourDigits
  var languageTag: java.lang.String
  var ordinalFormat: js.UndefOr[Format] = js.undefined
  var percentageFormat: js.UndefOr[Format] = js.undefined
  def ordinal(num: scala.Double): java.lang.String
}

