package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dynamsoft")
@js.native
object DynamsoftNs extends js.Object {
  @JSName("Lib")
  @js.native
  object LibNs extends js.Object {
    /*ignored
      Addon_Events  Addon_Sendback_Events  AttachAndShowImage  BIO  DOM  DynamicLoadAddonFuns  DynamicWebTwain  EnumMouseButton
      Errors  Events  IntToColorStr  LS  OnGetImageByURL  OnGetImageFromServer  Path  ProgressBar  UI  Uri
      addEventListener  ajax  all  appendMessage  appendRichMessage  aryControlLoadImage  attachAddon  attachProperty
      base64  bio  cancelFrome  clearMessage  closeAll  closeProgress  colorStrToInt  config  css  currentStyle
      debug*/
    var detect: dwtLib.Anon_Ssl = js.native
    /*ignored
      detectButton  dialog  dialogShowStatus  dlgProgress  dlgRef  drawBoxBorder  drawImageWithHermite
      each  empty  endsWith
      */
    var env: dwtLib.Anon_WSSession = js.native
  }
  
  @JSName("WebTwainEnv")
  @js.native
  object WebTwainEnvNs extends js.Object {
    var ActiveXInstallWithCAB: scala.Boolean = js.native
    var ActiveXVersion: java.lang.String = js.native
    var AutoLoad: scala.Boolean = js.native
    var Containers: js.Array[dwtLib.Container] = js.native
    var Debug: scala.Boolean = js.native
    var DynamicContainers: js.Array[java.lang.String] = js.native
    var IfUpdateService: scala.Boolean = js.native
    var IfUseActiveXForIE10Plus: scala.Boolean = js.native
    var JSVersion: java.lang.String = js.native
    /*ignored
      OnWebTwainReady
      */
    var PluginVersion: java.lang.String = js.native
    var ProductKey: java.lang.String = js.native
    var ResourcesPath: java.lang.String = js.native
    var ServerVersionInfo: java.lang.String = js.native
    var Trial: scala.Boolean = js.native
    var UseDefaultInstallUI: scala.Boolean = js.native
    var initQueue: js.Array[js.Any] = js.native
    var inited: scala.Boolean = js.native
    def CloseDialog(): scala.Unit = js.native
    def CreateDWTObject(
      newObjID: java.lang.String,
      ip: java.lang.String,
      port: java.lang.String,
      portSSL: java.lang.String,
      successFn: js.Function1[/* dwtObject */ dwtLib.WebTwain, scala.Unit],
      failurefn: js.Function1[/* repeated */ js.Any, scala.Unit]
    ): scala.Unit = js.native
    def CreateDWTObject(
      newObjID: java.lang.String,
      ip: java.lang.String,
      port: java.lang.String,
      portSSL: scala.Double,
      successFn: js.Function1[/* dwtObject */ dwtLib.WebTwain, scala.Unit],
      failurefn: js.Function1[/* repeated */ js.Any, scala.Unit]
    ): scala.Unit = js.native
    def CreateDWTObject(
      newObjID: java.lang.String,
      ip: java.lang.String,
      port: scala.Double,
      portSSL: java.lang.String,
      successFn: js.Function1[/* dwtObject */ dwtLib.WebTwain, scala.Unit],
      failurefn: js.Function1[/* repeated */ js.Any, scala.Unit]
    ): scala.Unit = js.native
    def CreateDWTObject(
      newObjID: java.lang.String,
      ip: java.lang.String,
      port: scala.Double,
      portSSL: scala.Double,
      successFn: js.Function1[/* dwtObject */ dwtLib.WebTwain, scala.Unit],
      failurefn: js.Function1[/* repeated */ js.Any, scala.Unit]
    ): scala.Unit = js.native
    def CreateDWTObject(
      newObjID: java.lang.String,
      ip: scala.Double,
      port: java.lang.String,
      portSSL: java.lang.String,
      successFn: js.Function1[/* dwtObject */ dwtLib.WebTwain, scala.Unit],
      failurefn: js.Function1[/* repeated */ js.Any, scala.Unit]
    ): scala.Unit = js.native
    def CreateDWTObject(
      newObjID: java.lang.String,
      ip: scala.Double,
      port: java.lang.String,
      portSSL: scala.Double,
      successFn: js.Function1[/* dwtObject */ dwtLib.WebTwain, scala.Unit],
      failurefn: js.Function1[/* repeated */ js.Any, scala.Unit]
    ): scala.Unit = js.native
    def CreateDWTObject(
      newObjID: java.lang.String,
      ip: scala.Double,
      port: scala.Double,
      portSSL: java.lang.String,
      successFn: js.Function1[/* dwtObject */ dwtLib.WebTwain, scala.Unit],
      failurefn: js.Function1[/* repeated */ js.Any, scala.Unit]
    ): scala.Unit = js.native
    def CreateDWTObject(
      newObjID: java.lang.String,
      ip: scala.Double,
      port: scala.Double,
      portSSL: scala.Double,
      successFn: js.Function1[/* dwtObject */ dwtLib.WebTwain, scala.Unit],
      failurefn: js.Function1[/* repeated */ js.Any, scala.Unit]
    ): scala.Unit = js.native
    def CreateDWTObject(
      newObjID: java.lang.String,
      successFn: js.Function1[/* dwtObject */ dwtLib.WebTwain, scala.Unit],
      failurefn: js.Function1[/* repeated */ js.Any, scala.Unit]
    ): scala.Unit = js.native
    def DeleteDWTObject(objID: java.lang.String): scala.Unit = js.native
    def GetWebTwain(cid: java.lang.String): dwtLib.WebTwain = js.native
    def Load(): scala.Unit = js.native
    /*ignored
      OnWebTwainInitMessage  OnWebTwainNeedUpgrade  OnWebTwainNeedUpgradeWebJavascript  OnWebTwainNotFound  OnWebTwainOldPluginNotAllowed
      */
    def OnWebTwainPostExecute(): scala.Unit = js.native
    def OnWebTwainPreExecute(): scala.Unit = js.native
    def RegisterEvent(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
    def RemoveAllAuthorizations(): scala.Unit = js.native
    def ShowDialog(
      _dialogWidth: scala.Double,
      _dialogHeight: scala.Double,
      _strDialogMessageWithHtmlFormat: java.lang.String,
      _bChangeImage: scala.Boolean,
      bHideCloseButton: scala.Boolean
    ): scala.Unit = js.native
    def Unload(): scala.Unit = js.native
  }
  
}

