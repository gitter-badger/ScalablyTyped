package typings
package reactDashMentionsLib.reactDashMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionsInputProps extends js.Object {
  /**
    * If set to `true` spaces will not interrupt matching suggestions
    */
  var allowSpaceInQuery: js.UndefOr[scala.Boolean] = js.undefined
  var children: reactLib.reactMod.ReactNs.ReactElement[MentionProps] | js.Array[reactLib.reactMod.ReactNs.ReactElement[MentionProps]]
  var className: js.UndefOr[java.lang.String] = js.undefined
  var displayTransform: js.UndefOr[DisplayTransformFunc] = js.undefined
  var markup: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ (reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLInputElement with stdLib.HTMLInputElement]) | (reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLTextAreaElement with stdLib.HTMLTextAreaElement]), 
      /* clickedSuggestion */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[OnChangeHandlerFunc] = js.undefined
  var onKeyDown: js.UndefOr[
    js.Function1[
      /* event */ (reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLTextAreaElement with stdLib.HTMLTextAreaElement]) | (reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement with stdLib.HTMLInputElement]), 
      scala.Unit
    ]
  ] = js.undefined
  var onSelect: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.UIEvent[reactLib.Element], scala.Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var regex: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * If set to `true` a regular text input element will be rendered
    * instead of a textarea
    */
  var singleLine: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var suggestionsPortalHost: js.UndefOr[reactLib.Element with stdLib.Element] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

