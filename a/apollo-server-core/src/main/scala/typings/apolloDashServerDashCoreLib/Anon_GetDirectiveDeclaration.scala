package typings
package apolloDashServerDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetDirectiveDeclaration
  extends org.scalablytyped.runtime.Instantiable1[
      /* config */ graphqlDashToolsLib.Anon_Name, 
      graphqlDashToolsLib.graphqlDashToolsMod.SchemaDirectiveVisitor
    ] {
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

