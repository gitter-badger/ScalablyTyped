package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "JSONLoader")
@js.native
class JSONLoader () extends Loader {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  var withCredentials: scala.Boolean = js.native
  def load(url: java.lang.String): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function2[/* geometry */ Geometry, /* materials */ js.Array[Material], scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function2[/* geometry */ Geometry, /* materials */ js.Array[Material], scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function2[/* geometry */ Geometry, /* materials */ js.Array[Material], scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def parse(json: js.Any): threeLib.Anon_Geometry = js.native
  def parse(json: js.Any, texturePath: java.lang.String): threeLib.Anon_Geometry = js.native
  def setTexturePath(value: java.lang.String): scala.Unit = js.native
}

