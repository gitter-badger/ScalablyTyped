package typings
package antdLib.libConfigDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigConsumerProps extends js.Object {
  var getPopupContainer: js.UndefOr[
    js.Function1[/* triggerNode */ js.UndefOr[reactLib.HTMLElement], reactLib.HTMLElement]
  ] = js.native
  @JSName("renderEmpty")
  var renderEmpty_Original: antdLib.libConfigDashProviderRenderEmptyMod.RenderEmptyHandler = js.native
  var rootPrefixCls: js.UndefOr[java.lang.String] = js.native
  def getPrefixCls(suffixCls: java.lang.String): java.lang.String = js.native
  def getPrefixCls(suffixCls: java.lang.String, customizePrefixCls: java.lang.String): java.lang.String = js.native
  def renderEmpty(): reactLib.reactMod.ReactNs.ReactNode = js.native
  def renderEmpty(componentName: java.lang.String): reactLib.reactMod.ReactNs.ReactNode = js.native
}

