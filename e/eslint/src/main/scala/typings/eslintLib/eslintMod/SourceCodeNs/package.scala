package typings
package eslintLib.eslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SourceCodeNs {
  type CursorWithCountOptions = scala.Double | FilterPredicate | eslintLib.Anon_IncludeCommentsFilterCount
  type CursorWithSkipOptions = scala.Double | FilterPredicate | eslintLib.Anon_IncludeCommentsFilter
  type FilterPredicate = js.Function1[
    /* tokenOrComment */ eslintLib.eslintMod.ASTNs.Token | estreeLib.estreeMod.Comment, 
    scala.Boolean
  ]
  type ParserServices = js.Any
}
