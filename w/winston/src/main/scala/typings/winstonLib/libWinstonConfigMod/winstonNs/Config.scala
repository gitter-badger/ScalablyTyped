package typings
package winstonLib.libWinstonConfigMod.winstonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var allColors: AbstractConfigSetColors
  var cli: winstonLib.Anon_Levels
  var npm: winstonLib.Anon_LevelsColors
  var syslog: winstonLib.Anon_LevelsColorsSyslogConfigSetLevels
  def addColors(colors: AbstractConfigSetColors): scala.Unit
}

