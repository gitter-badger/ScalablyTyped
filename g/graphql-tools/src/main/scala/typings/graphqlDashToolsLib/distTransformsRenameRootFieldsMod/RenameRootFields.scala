package typings
package graphqlDashToolsLib.distTransformsRenameRootFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Lifted 3 members from Set(graphql-tools.graphql-tools/dist/Interfaces.Transform) */ @js.native
trait RenameRootFields extends js.Object {
  var transformRequest: js.UndefOr[
    js.Function1[
      /* originalRequest */ graphqlDashToolsLib.distInterfacesMod.Request, 
      graphqlDashToolsLib.distInterfacesMod.Request
    ]
  ] = js.native
  var transformResult: js.UndefOr[
    js.Function1[
      /* result */ graphqlDashToolsLib.distInterfacesMod.Result, 
      graphqlDashToolsLib.distInterfacesMod.Result
    ]
  ] = js.native
  var transformSchema: js.UndefOr[
    js.Function1[
      /* schema */ graphqlLib.graphqlMod.GraphQLSchema, 
      graphqlLib.graphqlMod.GraphQLSchema
    ]
  ] = js.native
  var transformer: js.Any = js.native
  def transformSchema(originalSchema: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLSchema = js.native
}

