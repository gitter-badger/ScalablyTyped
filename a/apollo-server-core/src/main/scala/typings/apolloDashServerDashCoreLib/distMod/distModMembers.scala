package typings
package apolloDashServerDashCoreLib.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist", JSImport.Namespace)
@js.native
object distModMembers extends js.Object {
  val GraphQLUpload: js.UndefOr[graphqlLib.graphqlMod.GraphQLScalarType] = js.native
  val defaultPlaygroundOptions: apolloDashServerDashCoreLib.Anon_Version = js.native
  val processFileUploads: js.UndefOr[
    js.Function3[
      /* request */ apolloDashServerDashCoreLib.graphqlDashUploadMod.Request, 
      /* response */ apolloDashServerDashCoreLib.graphqlDashUploadMod.Response, 
      /* options */ js.UndefOr[apolloDashServerDashCoreLib.graphqlDashUploadMod.ApolloUploadOptions], 
      js.Promise[js.Any]
    ]
  ] = js.native
  def convertNodeHttpToRequest(req: nodeLib.httpMod.IncomingMessage): apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request = js.native
  def createPlaygroundOptions(): js.UndefOr[
    atApollographqlGraphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod.RenderPageOptions
  ] = js.native
  def createPlaygroundOptions(playground: apolloDashServerDashCoreLib.distPlaygroundMod.PlaygroundConfig): js.UndefOr[
    atApollographqlGraphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod.RenderPageOptions
  ] = js.native
  def formatApolloErrors(errors: js.Array[stdLib.Error]): js.Array[apolloDashServerDashErrorsLib.apolloDashServerDashErrorsMod.ApolloError] = js.native
  def formatApolloErrors(errors: js.Array[stdLib.Error], options: apolloDashServerDashErrorsLib.Anon_Formatter): js.Array[apolloDashServerDashErrorsLib.apolloDashServerDashErrorsMod.ApolloError] = js.native
  def gql(template: java.lang.String, substitutions: js.Any*): graphqlLib.languageAstMod.DocumentNode = js.native
  def gql(template: stdLib.TemplateStringsArray, substitutions: js.Any*): graphqlLib.languageAstMod.DocumentNode = js.native
  def resolveGraphqlOptions(
    options: apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _],
    args: js.Any*
  ): js.Promise[
    apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]
  ] = js.native
  def resolveGraphqlOptions(
    options: js.Function1[
      /* repeated */ js.Any, 
      (js.Promise[
        apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]
      ]) | (apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _])
    ],
    args: js.Any*
  ): js.Promise[
    apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]
  ] = js.native
  def runHttpQuery(
    handlerArguments: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[_] with coreDashJsLib.Array[_] with js.Array[_],
    request: apolloDashServerDashCoreLib.distRunHttpQueryMod.HttpQueryRequest
  ): js.Promise[apolloDashServerDashCoreLib.distRunHttpQueryMod.HttpQueryResponse] = js.native
  def toApolloError(error: stdLib.Error with apolloDashServerDashErrorsLib.Anon_Extensions): stdLib.Error with apolloDashServerDashErrorsLib.Anon_ExtensionsRecord = js.native
  def toApolloError(error: stdLib.Error with apolloDashServerDashErrorsLib.Anon_Extensions, code: java.lang.String): stdLib.Error with apolloDashServerDashErrorsLib.Anon_ExtensionsRecord = js.native
}

