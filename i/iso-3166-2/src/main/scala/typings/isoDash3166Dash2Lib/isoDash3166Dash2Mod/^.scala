package typings
package isoDash3166Dash2Lib.isoDash3166Dash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iso-3166-2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val data: isoDash3166Dash2Lib.isoDash3166Dash2Mod.CountryInfoNs.Map = js.native
  def country(countryCodeOrName: java.lang.String): isoDash3166Dash2Lib.isoDash3166Dash2Mod.InfoOrEmptyRecord[isoDash3166Dash2Lib.isoDash3166Dash2Mod.CountryInfo] = js.native
  def subdivision(countryCodeOrFullSubdivisionCode: java.lang.String): isoDash3166Dash2Lib.isoDash3166Dash2Mod.InfoOrEmptyRecord[isoDash3166Dash2Lib.isoDash3166Dash2Mod.SubdivisionInfo] = js.native
  def subdivision(countryCodeOrFullSubdivisionCode: java.lang.String, subdivisionCodeOrName: java.lang.String): isoDash3166Dash2Lib.isoDash3166Dash2Mod.InfoOrEmptyRecord[isoDash3166Dash2Lib.isoDash3166Dash2Mod.SubdivisionInfo] = js.native
}

