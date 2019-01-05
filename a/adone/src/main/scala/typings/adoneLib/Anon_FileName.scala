package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileName extends js.Object {
  def commonFileExt(): java.lang.String
  def commonFileName(ext: java.lang.String, `type`: java.lang.String): java.lang.String
  def commonFileType(): java.lang.String
  def directoryPath(): java.lang.String
  def fileExt(mimeType: java.lang.String): java.lang.String
  def fileName(ext: java.lang.String, `type`: java.lang.String): java.lang.String
  def filePath(): java.lang.String
  def fileType(): java.lang.String
  def mimeType(): java.lang.String
  def semver(): java.lang.String
}

@js.native
trait Anon_Filename extends js.Object {
  val INs: Anon_IP = js.native
  def ansi(): stdLib.RegExp = js.native
  def filename(): stdLib.RegExp = js.native
  def idn(): stdLib.RegExp = js.native
  def ip(): stdLib.RegExp = js.native
  def ip(options: adoneLib.adoneNs.regexNs.INs.IPNs.Options): stdLib.RegExp = js.native
  def ip4(): stdLib.RegExp = js.native
  def ip4(options: adoneLib.adoneNs.regexNs.INs.IPNs.Options): stdLib.RegExp = js.native
  def ip6(): stdLib.RegExp = js.native
  def ip6(options: adoneLib.adoneNs.regexNs.INs.IPNs.Options): stdLib.RegExp = js.native
  def protocol(): stdLib.RegExp = js.native
  def punycode(): stdLib.RegExp = js.native
  def shebang(): stdLib.RegExp = js.native
  def uri(): stdLib.RegExp = js.native
  def uuid4(): stdLib.RegExp = js.native
  def uuid5(): stdLib.RegExp = js.native
}

