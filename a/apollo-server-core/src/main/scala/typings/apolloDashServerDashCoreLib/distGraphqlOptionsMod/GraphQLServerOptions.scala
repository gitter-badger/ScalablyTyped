package typings
package apolloDashServerDashCoreLib.distGraphqlOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServerOptions[TContext, TRootValue] extends js.Object {
  var cache: js.UndefOr[apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache] = js.undefined
  var cacheControl: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify CacheControlExtensionOptions */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify CacheControlExtensionOptions */ js.Any
  ] = js.undefined
  var context: js.UndefOr[TContext | js.Function0[scala.Nothing]] = js.undefined
  var dataSources: js.UndefOr[js.Function0[DataSources[TContext]]] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
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
  var persistedQueries: js.UndefOr[PersistedQueryOptions] = js.undefined
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
    (js.Function1[/* parsedQuery */ graphqlLib.languageAstMod.DocumentNode, TRootValue]) | TRootValue
  ] = js.undefined
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  var tracing: js.UndefOr[scala.Boolean] = js.undefined
  var validationRules: js.UndefOr[
    (apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[js.Function1[/* context */ graphqlLib.graphqlMod.ValidationContext, _]]) with (coreDashJsLib.Array[js.Function1[/* context */ graphqlLib.graphqlMod.ValidationContext, _]]) with (js.Array[js.Function1[/* context */ graphqlLib.graphqlMod.ValidationContext, _]])
  ] = js.undefined
}

