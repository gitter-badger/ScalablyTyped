package typings
package reactDashDynamicDashNumberLib.reactDashDynamicDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-dynamic-number.react-dynamic-number.Omit<react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<react.HTMLInputElement & std.HTMLInputElement>, react.HTMLInputElement & std.HTMLInputElement>, 'ref' | 'value' | 'onChange' | 'placeholder'> ]:? react-dynamic-number.react-dynamic-number.Omit<react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<react.HTMLInputElement & std.HTMLInputElement>, react.HTMLInputElement & std.HTMLInputElement>, 'ref' | 'value' | 'onChange' | 'placeholder'>[P]} */ trait DynamicNumberProps extends js.Object {
  var fraction: js.UndefOr[scala.Double] = js.undefined
  var integer: js.UndefOr[scala.Double] = js.undefined
  var negative: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement with stdLib.HTMLInputElement], 
      /* modelValue */ scala.Double, 
      /* viewValue */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var positive: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[
    reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.DOT | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.`,`
  ] = js.undefined
  var thousand: js.UndefOr[
    scala.Boolean | (reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.` `)
  ] = js.undefined
  var value: js.UndefOr[
    scala.Double | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.Empty
  ] = js.undefined
}

