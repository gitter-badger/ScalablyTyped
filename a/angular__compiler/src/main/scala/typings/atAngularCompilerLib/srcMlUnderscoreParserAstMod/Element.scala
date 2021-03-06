package typings
package atAngularCompilerLib.srcMlUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "Element")
@js.native
class Element protected () extends Node {
  def this(name: java.lang.String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, endSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: scala.Null, endSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, endSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message) = this()
  def this(name: java.lang.String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, endSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node) = this()
  def this(name: java.lang.String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, endSourceSpan: scala.Null, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message) = this()
  def this(name: java.lang.String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, endSourceSpan: scala.Null, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node) = this()
  def this(name: java.lang.String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: scala.Null, endSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message) = this()
  def this(name: java.lang.String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: scala.Null, endSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node) = this()
  def this(name: java.lang.String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: scala.Null, endSourceSpan: scala.Null, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message) = this()
  def this(name: java.lang.String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: scala.Null, endSourceSpan: scala.Null, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node) = this()
  var attrs: js.Array[Attribute] = js.native
  var children: js.Array[Node] = js.native
  var endSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan | scala.Null = js.native
  var i18n: js.UndefOr[
    atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message | atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node
  ] = js.native
  var name: java.lang.String = js.native
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var startSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan | scala.Null = js.native
  /* CompleteClass */
  override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

