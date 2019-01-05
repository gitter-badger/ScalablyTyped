package typings
package apolloDashServerDashExpressLib.apolloDashServerDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "SchemaDirectiveVisitor")
@js.native
class SchemaDirectiveVisitor protected ()
  extends graphqlDashToolsLib.graphqlDashToolsMod.SchemaDirectiveVisitor {
  protected def this(config: graphqlDashToolsLib.Anon_Name) = this()
}

@JSImport("apollo-server-express", "SchemaDirectiveVisitor")
@js.native
object SchemaDirectiveVisitor extends js.Object {
  /* protected */ def getDeclaredDirectives(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    directiveVisitors: org.scalablytyped.runtime.StringDictionary[graphqlDashToolsLib.Anon_GetDirectiveDeclaration]
  ): org.scalablytyped.runtime.StringDictionary[graphqlLib.graphqlMod.GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: java.lang.String, schema: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLDirective = js.native
  def visitSchemaDirectives(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    directiveVisitors: org.scalablytyped.runtime.StringDictionary[graphqlDashToolsLib.Anon_GetDirectiveDeclaration]
  ): org.scalablytyped.runtime.StringDictionary[js.Array[graphqlDashToolsLib.distSchemaVisitorMod.SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    directiveVisitors: org.scalablytyped.runtime.StringDictionary[graphqlDashToolsLib.Anon_GetDirectiveDeclaration],
    context: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): org.scalablytyped.runtime.StringDictionary[js.Array[graphqlDashToolsLib.distSchemaVisitorMod.SchemaDirectiveVisitor]] = js.native
}

