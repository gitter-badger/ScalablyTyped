package typings
package reactDashInputDashMaskLib.reactDashInputDashMaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement with stdLib.HTMLInputElement] {
  /**
    * Show mask even in empty input without focus.
    */
  var alwaysShowMask: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * In case you need to implement more complex masking behavior, you can provide
    * beforeMaskedValueChange function to change masked value and cursor position
    * before it will be applied to the input.
    */
  var beforeMaskedValueChange: js.UndefOr[
    js.Function4[
      /* newState */ InputState, 
      /* oldState */ InputState, 
      /* userInput */ java.lang.String, 
      /* maskOptions */ MaskOptions, 
      InputState
    ]
  ] = js.undefined
  /**
    * Defines format characters with characters as keys and corresponding RegExp string as values. Default ones:
    * ```
    * {
    *   "9": "[0-9]",
    *   "a": "[A-Za-z]",
    *   "*": "[A-Za-z0-9]"
    * }```
    */
  var formatChars: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Use inputRef instead of ref if you need input node to manage focus, selection, etc.
    */
  var inputRef: js.UndefOr[
    reactLib.reactMod.ReactNs.Ref[reactLib.HTMLInputElement with stdLib.HTMLInputElement]
  ] = js.undefined
  /**
    * Mask string. Format characters are:
    * * `9`: `0-9`
    * * `a`: `A-Z, a-z`
    * * `\*`: `A-Z, a-z, 0-9`
    *
    * Any character can be escaped with backslash, which usually will appear as double backslash in JS strings.
    * For example, German phone mask with unremoveable prefix +49 will look like `mask="+4\\9 99 999 99"` or `mask={"+4\\\\9 99 999 99"}`
    */
  var mask: java.lang.String
  /**
    * Character to cover unfilled editable parts of mask. Default character is "_". If set to null, unfilled parts will be empty, like in ordinary input.
    */
  var maskChar: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

