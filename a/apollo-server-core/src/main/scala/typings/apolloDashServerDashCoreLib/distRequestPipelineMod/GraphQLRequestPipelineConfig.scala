package typings
package apolloDashServerDashCoreLib.distRequestPipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLRequestPipelineConfig[TContext] extends js.Object {
  var cacheControl: js.UndefOr[
    apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheControlExtensionOptions
  ] = js.undefined
  var dataSources: js.UndefOr[js.Function0[DataSources[TContext]]] = js.undefined
  var extensions: js.UndefOr[apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[js.Function0[_]]] = js.undefined
  var fieldResolver: js.UndefOr[
    graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, TContext, ScalablyTyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var formatError: js.UndefOr[js.Function] = js.undefined
  var formatResponse: js.UndefOr[js.Function] = js.undefined
  var persistedQueries: js.UndefOr[apolloDashServerDashCoreLib.distGraphqlOptionsMod.PersistedQueryOptions] = js.undefined
  var plugins: js.UndefOr[
    apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
    ]
  ] = js.undefined
  var rootValue: js.UndefOr[
    (js.Function1[/* document */ graphqlLib.languageAstMod.DocumentNode, _]) | js.Any
  ] = js.undefined
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  var tracing: js.UndefOr[scala.Boolean] = js.undefined
  var validationRules: js.UndefOr[
    apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[apolloDashServerDashCoreLib.distRequestPipelineAPIMod.ValidationRule]
  ] = js.undefined
}
