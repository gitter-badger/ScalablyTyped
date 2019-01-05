package typings
package typescriptDashServicesLib.TypeScriptNs.PullHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullHelpers")
@js.native
object PullHelpersNsMembers extends js.Object {
  def diagnosticFromDecl(decl: typescriptDashServicesLib.TypeScriptNs.PullDecl, diagnosticKey: java.lang.String): typescriptDashServicesLib.TypeScriptNs.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typescriptDashServicesLib.TypeScriptNs.PullDecl,
    diagnosticKey: java.lang.String,
    _arguments: js.Array[_]
  ): typescriptDashServicesLib.TypeScriptNs.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typescriptDashServicesLib.TypeScriptNs.PullDecl,
    diagnosticKey: java.lang.String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typescriptDashServicesLib.TypeScriptNs.Location]
  ): typescriptDashServicesLib.TypeScriptNs.Diagnostic = js.native
  def getAccessorSymbol(
    getterOrSetter: typescriptDashServicesLib.TypeScriptNs.AST,
    semanticInfoChain: typescriptDashServicesLib.TypeScriptNs.SemanticInfoChain
  ): typescriptDashServicesLib.TypeScriptNs.PullAccessorSymbol = js.native
  def getGetterAndSetterFunction(
    funcDecl: typescriptDashServicesLib.TypeScriptNs.AST,
    semanticInfoChain: typescriptDashServicesLib.TypeScriptNs.SemanticInfoChain
  ): typescriptDashServicesLib.Anon_Getter = js.native
  def getRootType(`type`: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol): typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol = js.native
  def getSignatureForFuncDecl(functionDecl: typescriptDashServicesLib.TypeScriptNs.PullDecl): typescriptDashServicesLib.Anon_Signature = js.native
  def isExportedSymbolInClodule(symbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol): scala.Boolean = js.native
  def isNameNumeric(name: java.lang.String): scala.Boolean = js.native
  def isSymbolDeclaredInScopeChain(
    symbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol
  ): scala.Boolean = js.native
  def isSymbolLocal(symbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol): scala.Boolean = js.native
  def resolveDeclaredSymbolToUseType(symbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol): scala.Unit = js.native
  def symbolIsEnum(source: typescriptDashServicesLib.TypeScriptNs.PullSymbol): scala.Boolean = js.native
  def symbolIsModule(symbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol): scala.Boolean = js.native
  def typeSymbolsAreIdentical(
    a: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol,
    b: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol
  ): scala.Boolean = js.native
  def walkPullTypeSymbolStructure(
    typeSymbol: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol,
    walker: PullTypeSymbolStructureWalker
  ): scala.Unit = js.native
}

