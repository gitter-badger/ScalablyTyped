package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qlik", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def callRepository(path: java.lang.String, method: java.lang.String, body: java.lang.String): js.Promise[_] = js.native
  def currApp(reference: js.Object): qlikLib.qlikMod.App = js.native
  def getAppList(callback: js.Array[qlikLib.qlikMod.App], config: qlikLib.qlikMod.GetAppConfig): scala.Unit = js.native
  def getExtensionList(callback: js.Array[_]): js.Promise[_] = js.native
  def getGlobal(config: qlikLib.qlikMod.GetGlobalConfig): qlikLib.qlikMod.Global = js.native
  def openApp(appId: java.lang.String, config: qlikLib.qlikMod.GetAppConfig): qlikLib.qlikMod.App = js.native
  def registerExtension(id: java.lang.String, impl: qlikLib.qlikMod.Extension, metadata: js.Object): scala.Unit = js.native
  def resize(): scala.Unit = js.native
  def resize(ID: java.lang.String): scala.Unit = js.native
  def setLanguage(lang: qlikLib.qlikMod.LanguageCodesNs.ALL): scala.Unit = js.native
  def setOnError(
    onError: js.Function1[/* error */ qlikLib.qlikMod.Error, scala.Unit],
    onWarning: js.Function1[/* warning */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def table(ext: js.Object): scala.Unit = js.native
  def table(ext: js.Object, path: java.lang.String): scala.Unit = js.native
}

