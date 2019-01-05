package typings
package fakerLib.FakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakerStatic extends js.Object {
  var address: fakerLib.Anon_ZipCode
  var commerce: fakerLib.Anon_Color
  var company: fakerLib.Anon_Suffixes
  var database: fakerLib.Anon_Column
  var date: fakerLib.Anon_Past
  var finance: fakerLib.Anon_Account
  var hacker: fakerLib.Anon_Abbreviation
  var helpers: fakerLib.Anon_Randomize
  var image: fakerLib.Anon_Image
  var internet: fakerLib.Anon_Avatar
  var locale: java.lang.String
  var lorem: fakerLib.Anon_Word
  var name: fakerLib.Anon_FirstName
  var phone: fakerLib.Anon_PhoneNumber
  var random: fakerLib.Anon_Number
  var system: fakerLib.Anon_FileName
  def fake(str: java.lang.String): java.lang.String
  def seed(value: scala.Double): scala.Unit
  def setLocale(locale: java.lang.String): scala.Unit
}

