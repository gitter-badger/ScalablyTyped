package typings
package atAngularCompilerLib.srcRender3R3UnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "BoundText")
@js.native
class BoundText protected () extends Node {
  def this(value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message) = this()
  def this(value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node) = this()
  var i18n: js.UndefOr[
    atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message | atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node
  ] = js.native
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

