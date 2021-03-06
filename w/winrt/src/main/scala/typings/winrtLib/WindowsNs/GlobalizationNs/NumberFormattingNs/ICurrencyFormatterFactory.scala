package typings
package winrtLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrencyFormatterFactory extends js.Object {
  def createCurrencyFormatterCode(currencyCode: java.lang.String): CurrencyFormatter
  def createCurrencyFormatterCodeContext(
    currencyCode: java.lang.String,
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    geographicRegion: java.lang.String
  ): CurrencyFormatter
}

