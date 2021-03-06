package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The primary object used by text input controls to communicate with the text input server. */
@JSGlobal("Windows.UI.Text.Core.CoreTextEditContext")
@js.native
abstract class CoreTextEditContext () extends js.Object {
  /** Gets or sets a value that indicates whether the input pane should be shown automatically when focus enters your text input control. The default value is Automatic, indicating that the input pane will be shown automatically. A value of Manual indicates that your app will be responsible for showing and hiding the input pane using InputPane.TryShow and TryHide . */
  var inputPaneDisplayPolicy: CoreTextInputPaneDisplayPolicy = js.native
  /** Gets or sets a value that indicates the input scope of the text input control. */
  var inputScope: CoreTextInputScope = js.native
  /** Gets or sets a value that indicates whether the edit control is editable. */
  var isReadOnly: scala.Boolean = js.native
  /** Gets or sets a descriptive name for the text input control. An application framework usually uses properties such as "name" or "id" to identify a control, so it’s recommended that you set this property accordingly on the text input server so that input processors can better preserve the input context, and provide better suggestions. */
  var name: java.lang.String = js.native
  /** Occurs when composition has completed. */
  @JSName("oncompositioncompleted")
  var oncompositioncompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextCompositionCompletedEventArgs] = js.native
  /** Occurs when composition has started. */
  @JSName("oncompositionstarted")
  var oncompositionstarted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextCompositionStartedEventArgs] = js.native
  /** Occurs when focus was forcibly removed from a text input control. The application should handle this event to remove focus for the text input control accordingly. */
  @JSName("onfocusremoved")
  var onfocusremoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, _] = js.native
  /** Occurs when the text input server needs to apply a different format to a particular range of text. This usually happens during composition. */
  @JSName("onformatupdating")
  var onformatupdating_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextFormatUpdatingEventArgs] = js.native
  /** Occurs when the text input server needs to get the bounding box of a range of text and of the text input control itself. The application should handle this event and return the geometry information requested. */
  @JSName("onlayoutrequested")
  var onlayoutrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextLayoutRequestedEventArgs] = js.native
  /** Occurs after focus has left the text input control. */
  @JSName("onnotifyfocusleavecompleted")
  var onnotifyfocusleavecompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, _] = js.native
  /** Occurs when the text input server needs to get the text range representing the currently selected text in the text input control. The application should handle this event and return the range requested. */
  @JSName("onselectionrequested")
  var onselectionrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextSelectionRequestedEventArgs] = js.native
  /** Occurs when the text input server needs to modify the range of text currently selected in the text input control. This event could be the result of an input processor needing to select some text, or to move the caret. The text input control should set its selection range accordingly. */
  @JSName("onselectionupdating")
  var onselectionupdating_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextSelectionUpdatingEventArgs] = js.native
  /** Occurs when the text input server needs to get a range of text from the text input control. The application should handle this event and return the range requested. */
  @JSName("ontextrequested")
  var ontextrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextTextRequestedEventArgs] = js.native
  /** Occurs when the text input server needs to modify text inside the text input control. This event could be the result of a key event—such as inserting a single character—or the result of processing done by an input processor, such as auto-correction and prediction. */
  @JSName("ontextupdating")
  var ontextupdating_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextTextUpdatingEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositioncompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.compositioncompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextCompositionCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionstarted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.compositionstarted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextCompositionStartedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.focusremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_formatupdating(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.formatupdating,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextFormatUpdatingEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_layoutrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.layoutrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextLayoutRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notifyfocusleavecompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.notifyfocusleavecompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.selectionrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextSelectionRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionupdating(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.selectionupdating,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextSelectionUpdatingEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.textrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextTextRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textupdating(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.textupdating,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextTextUpdatingEventArgs]
  ): scala.Unit = js.native
  /** Notifies the text input server that focus has entered the text input control. */
  def notifyFocusEnter(): scala.Unit = js.native
  /** Notifies the text input server that focus has left the text input control. */
  def notifyFocusLeave(): scala.Unit = js.native
  /** Notifies the text input server that the layout of text inside the text input control has changed. */
  def notifyLayoutChanged(): scala.Unit = js.native
  /**
    * Notifies the text input server about any change that the text input control needs to make to the selection range. This is important in order to keep the internal state of the control and the internal state of the server synchronized.
    * @param selection The range of selection currently in effect.
    */
  def notifySelectionChanged(selection: CoreTextRange): scala.Unit = js.native
  /**
    * Notifies the text input server about any change that the text input control needs to make to the text. This is important in order to keep the internal state of the control and the internal state of the server synchronized. Since a change to the text is also likely to affect the selection range, the method takes the selection range as a parameter.
    * @param modifiedRange The range of text to replace, in terms of the state the text buffer is in prior to this text change.
    * @param newLength The length of the text that should replace modifiedRange.
    * @param newSelection The range of selection in effect after the text change.
    */
  def notifyTextChanged(modifiedRange: CoreTextRange, newLength: scala.Double, newSelection: CoreTextRange): scala.Unit = js.native
  /** Occurs when composition has completed. */
  def oncompositioncompleted(
    ev: CoreTextCompositionCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CoreTextEditContext]
  ): scala.Unit = js.native
  /** Occurs when composition has started. */
  def oncompositionstarted(
    ev: CoreTextCompositionStartedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CoreTextEditContext]
  ): scala.Unit = js.native
  /** Occurs when focus was forcibly removed from a text input control. The application should handle this event to remove focus for the text input control accordingly. */
  def onfocusremoved(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[CoreTextEditContext]): scala.Unit = js.native
  /** Occurs when the text input server needs to apply a different format to a particular range of text. This usually happens during composition. */
  def onformatupdating(ev: CoreTextFormatUpdatingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CoreTextEditContext]): scala.Unit = js.native
  /** Occurs when the text input server needs to get the bounding box of a range of text and of the text input control itself. The application should handle this event and return the geometry information requested. */
  def onlayoutrequested(
    ev: CoreTextLayoutRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CoreTextEditContext]
  ): scala.Unit = js.native
  /** Occurs after focus has left the text input control. */
  def onnotifyfocusleavecompleted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[CoreTextEditContext]): scala.Unit = js.native
  /** Occurs when the text input server needs to get the text range representing the currently selected text in the text input control. The application should handle this event and return the range requested. */
  def onselectionrequested(
    ev: CoreTextSelectionRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CoreTextEditContext]
  ): scala.Unit = js.native
  /** Occurs when the text input server needs to modify the range of text currently selected in the text input control. This event could be the result of an input processor needing to select some text, or to move the caret. The text input control should set its selection range accordingly. */
  def onselectionupdating(
    ev: CoreTextSelectionUpdatingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CoreTextEditContext]
  ): scala.Unit = js.native
  /** Occurs when the text input server needs to get a range of text from the text input control. The application should handle this event and return the range requested. */
  def ontextrequested(ev: CoreTextTextRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CoreTextEditContext]): scala.Unit = js.native
  /** Occurs when the text input server needs to modify text inside the text input control. This event could be the result of a key event—such as inserting a single character—or the result of processing done by an input processor, such as auto-correction and prediction. */
  def ontextupdating(ev: CoreTextTextUpdatingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CoreTextEditContext]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositioncompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.compositioncompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextCompositionCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionstarted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.compositionstarted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextCompositionStartedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.focusremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_formatupdating(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.formatupdating,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextFormatUpdatingEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_layoutrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.layoutrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextLayoutRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_notifyfocusleavecompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.notifyfocusleavecompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.selectionrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextSelectionRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionupdating(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.selectionupdating,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextSelectionUpdatingEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_textrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.textrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextTextRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_textupdating(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.textupdating,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextEditContext, CoreTextTextUpdatingEventArgs]
  ): scala.Unit = js.native
}

