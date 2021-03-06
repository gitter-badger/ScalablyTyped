package typings
package apolloDashEngineDashReportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/signature", JSImport.Namespace)
@js.native
object distSignatureMod extends js.Object {
  def defaultSignature(ast: graphqlLib.languageAstMod.DocumentNode, operationName: java.lang.String): java.lang.String = js.native
  def dropUnusedDefinitions(ast: graphqlLib.languageAstMod.DocumentNode, operationName: java.lang.String): graphqlLib.languageAstMod.DocumentNode = js.native
  def hideLiterals(ast: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
  def printWithReducedWhitespace(ast: graphqlLib.languageAstMod.DocumentNode): java.lang.String = js.native
  def removeAliases(ast: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
  def sortAST(ast: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
}

