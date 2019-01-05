package typings
package atBlueprintjsCoreLib.libEsmComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components", JSImport.Namespace)
@js.native
object libEsmComponentsModMembers extends js.Object {
  val Blockquote: reactLib.reactMod.ReactNs.StatelessComponent[
    (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement with stdLib.HTMLElement]) with (atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLElement with stdLib.HTMLElement])
  ] = js.native
  val Breadcrumb: reactLib.reactMod.ReactNs.SFC[atBlueprintjsCoreLib.libEsmComponentsBreadcrumbsBreadcrumbMod.IBreadcrumbProps] = js.native
  val Code: reactLib.reactMod.ReactNs.StatelessComponent[
    (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement with stdLib.HTMLElement]) with (atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLElement with stdLib.HTMLElement])
  ] = js.native
  val ContextMenu: atBlueprintjsCoreLib.Anon_Show = js.native
  val Expander: reactLib.reactMod.ReactNs.SFC[js.Object] = js.native
  val H1: reactLib.reactMod.ReactNs.StatelessComponent[
    (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLHeadingElement with stdLib.HTMLHeadingElement]) with (atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLHeadingElement with stdLib.HTMLHeadingElement])
  ] = js.native
  val H2: reactLib.reactMod.ReactNs.StatelessComponent[
    (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLHeadingElement with stdLib.HTMLHeadingElement]) with (atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLHeadingElement with stdLib.HTMLHeadingElement])
  ] = js.native
  val H3: reactLib.reactMod.ReactNs.StatelessComponent[
    (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLHeadingElement with stdLib.HTMLHeadingElement]) with (atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLHeadingElement with stdLib.HTMLHeadingElement])
  ] = js.native
  val H4: reactLib.reactMod.ReactNs.StatelessComponent[
    (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLHeadingElement with stdLib.HTMLHeadingElement]) with (atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLHeadingElement with stdLib.HTMLHeadingElement])
  ] = js.native
  val H5: reactLib.reactMod.ReactNs.StatelessComponent[
    (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLHeadingElement with stdLib.HTMLHeadingElement]) with (atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLHeadingElement with stdLib.HTMLHeadingElement])
  ] = js.native
  val H6: reactLib.reactMod.ReactNs.StatelessComponent[
    (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLHeadingElement with stdLib.HTMLHeadingElement]) with (atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLHeadingElement with stdLib.HTMLHeadingElement])
  ] = js.native
  val HandleInteractionKind: atBlueprintjsCoreLib.Anon_LOCK = js.native
  val HandleType: atBlueprintjsCoreLib.Anon_FULL = js.native
  val Label: reactLib.reactMod.ReactNs.StatelessComponent[
    (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLLabelElement with stdLib.HTMLLabelElement]) with (atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLLabelElement with stdLib.HTMLLabelElement])
  ] = js.native
  val OL: reactLib.reactMod.ReactNs.StatelessComponent[
    (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLOListElement with stdLib.HTMLOListElement]) with (atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLOListElement with stdLib.HTMLOListElement])
  ] = js.native
  val PopoverInteractionKind: atBlueprintjsCoreLib.Anon_CLICK = js.native
  val PopoverPosition: atBlueprintjsCoreLib.Anon_AUTO = js.native
  val Pre: reactLib.reactMod.ReactNs.StatelessComponent[
    (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement with stdLib.HTMLElement]) with (atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLElement with stdLib.HTMLElement])
  ] = js.native
  val UL: reactLib.reactMod.ReactNs.StatelessComponent[
    (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLUListElement with stdLib.HTMLUListElement]) with (atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLUListElement with stdLib.HTMLUListElement])
  ] = js.native
  def ContextMenuTarget[T /* <: atBlueprintjsCoreLib.libEsmCommonConstructorMod.IConstructor[
    atBlueprintjsCoreLib.libEsmComponentsContextDashMenuContextMenuTargetMod.IContextMenuTargetComponent
  ] */](WrappedComponent: T): atBlueprintjsCoreLib.Anon_Args with T = js.native
  def HotkeysTarget[T /* <: atBlueprintjsCoreLib.libEsmCommonConstructorMod.IConstructor[
    atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysTargetMod.IHotkeysTargetComponent
  ] */](WrappedComponent: T): atBlueprintjsCoreLib.Anon_ArgsDisplayName with T = js.native
  def comboMatches(
    a: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo,
    b: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
  ): scala.Boolean = js.native
  def getKeyCombo(e: reactLib.KeyboardEvent with stdLib.KeyboardEvent): atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo = js.native
  def getKeyComboString(e: reactLib.KeyboardEvent with stdLib.KeyboardEvent): java.lang.String = js.native
  def hideHotkeysDialog(): scala.Unit = js.native
  def parseKeyCombo(combo: java.lang.String): atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo = js.native
  def setHotkeysDialogProps(
    props: stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysDialogMod.IHotkeysDialogProps]
  ): scala.Unit = js.native
}

