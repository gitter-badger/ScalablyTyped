package typings
package apolloDashServerDashCoreLib.distRequestPipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestPipelineConfig[TContext] extends js.Object {
  var cacheControl: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify CacheControlExtensionOptions */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify CacheControlExtensionOptions */ js.Any
  ] = js.undefined
  var dataSources: js.UndefOr[js.Function0[DataSources[TContext]]] = js.undefined
  var extensions: js.UndefOr[
    (apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[
      js.Function0[
        /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify GraphQLExtension */ _
      ]
    ]) with (coreDashJsLib.Array[
      js.Function0[
        /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify GraphQLExtension */ _
      ]
    ]) with (js.Array[
      js.Function0[
        /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify GraphQLExtension */ _
      ]
    ])
  ] = js.undefined
  var fieldResolver: js.UndefOr[
    graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, TContext, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var formatError: js.UndefOr[coreDashJsLib.Function with js.Function] = js.undefined
  var formatResponse: js.UndefOr[coreDashJsLib.Function with js.Function] = js.undefined
  var persistedQueries: js.UndefOr[apolloDashServerDashCoreLib.distGraphqlOptionsMod.PersistedQueryOptions] = js.undefined
  var plugins: js.UndefOr[
    (apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
    ]) with (coreDashJsLib.Array[
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
    ]) with (js.Array[
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
    ])
  ] = js.undefined
  var rootValue: js.UndefOr[
    (js.Function1[/* document */ graphqlLib.languageAstMod.DocumentNode, _]) | js.Any
  ] = js.undefined
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  var tracing: js.UndefOr[scala.Boolean] = js.undefined
  var validationRules: js.UndefOr[
    apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[apolloDashServerDashCoreLib.distRequestPipelineAPIMod.ValidationRule] with coreDashJsLib.Array[apolloDashServerDashCoreLib.distRequestPipelineAPIMod.ValidationRule] with js.Array[apolloDashServerDashCoreLib.distRequestPipelineAPIMod.ValidationRule]
  ] = js.undefined
}

