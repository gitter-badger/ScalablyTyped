package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptDashServicesLib.TypeScriptNs.IClassElementSyntax because Already inherited */ @JSGlobal("TypeScript.IndexMemberDeclarationSyntax")
@js.native
class IndexMemberDeclarationSyntax protected () extends SyntaxNode {
  def this(modifiers: ISyntaxList, indexSignature: IndexSignatureSyntax, semicolonToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var indexSignature: IndexSignatureSyntax = js.native
  var modifiers: ISyntaxList = js.native
  var semicolonToken: ISyntaxToken = js.native
  def update(modifiers: ISyntaxList, indexSignature: IndexSignatureSyntax, semicolonToken: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
  def withIndexSignature(indexSignature: IndexSignatureSyntax): IndexMemberDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): IndexMemberDeclarationSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
}

@JSGlobal("TypeScript.IndexMemberDeclarationSyntax")
@js.native
object IndexMemberDeclarationSyntax extends js.Object {
  def create(
    indexSignature: typescriptDashServicesLib.TypeScriptNs.IndexSignatureSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.IndexMemberDeclarationSyntax = js.native
  def create1(indexSignature: typescriptDashServicesLib.TypeScriptNs.IndexSignatureSyntax): typescriptDashServicesLib.TypeScriptNs.IndexMemberDeclarationSyntax = js.native
}

