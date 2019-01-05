package typings
package atUifabricMergeDashStylesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIStyleSetMod {
  type Diff[T /* <: java.lang.String */, U /* <: java.lang.String */] = /* import warning: ImportType.apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type IConcatenatedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] = atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.IConcatenatedStyleSet with js.Any with atUifabricMergeDashStylesLib.Anon_SubComponentStylesTStyleSet[TStyleSet]
  type IProcessedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] = atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.IProcessedStyleSet with js.Any with atUifabricMergeDashStylesLib.Anon_SubComponentStylesTStyleSetMapToFunctionType[TStyleSet]
  type IStyleSet[TStyleSet /* <: js.Object */] = atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.IStyleSet with js.Any with atUifabricMergeDashStylesLib.Anon_SubComponentStyles[TStyleSet]
  type Omit[U, K /* <: java.lang.String */] = stdLib.Pick[U, Diff[java.lang.String, K]]
  type __MapToFunctionType[T] = (stdLib.Extract[T, js.Function]) | (js.Function1[/* repeated */ js.Any, stdLib.Partial[T]])
}
