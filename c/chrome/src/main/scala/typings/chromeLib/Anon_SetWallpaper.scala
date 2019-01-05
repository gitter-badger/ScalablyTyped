package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SetWallpaper extends js.Object {
  def setWallpaper(
    details: chromeLib.chromeNs.wallpaperNs.WallpaperDetails,
    callback: js.Function1[/* thumbnail */ js.Any, scala.Unit]
  ): scala.Unit
}

