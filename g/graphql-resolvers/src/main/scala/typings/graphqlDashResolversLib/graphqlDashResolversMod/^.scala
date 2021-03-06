package typings
package graphqlDashResolversLib.graphqlDashResolversMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-resolvers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val skip: js.UndefOr[scala.Nothing] = js.native
  def allResolvers[TSource, TContext](
    resolvers: js.Array[
      graphqlDashToolsLib.distInterfacesMod.IFieldResolver[TSource, TContext, graphqlDashResolversLib.graphqlDashResolversMod.TArgs]
    ]
  ): graphqlDashToolsLib.distInterfacesMod.IFieldResolver[TSource, TContext, graphqlDashResolversLib.graphqlDashResolversMod.TArgs] = js.native
  def combineResolvers[TSource, TContext](
    resolvers: (graphqlDashToolsLib.distInterfacesMod.IFieldResolver[TSource, TContext, graphqlDashResolversLib.graphqlDashResolversMod.TArgs])*
  ): graphqlDashToolsLib.distInterfacesMod.IFieldResolver[TSource, TContext, graphqlDashResolversLib.graphqlDashResolversMod.TArgs] = js.native
  def isDependee[TSource, TContext](
    resolver: graphqlDashToolsLib.distInterfacesMod.IFieldResolver[TSource, TContext, graphqlDashResolversLib.graphqlDashResolversMod.TArgs]
  ): graphqlDashToolsLib.distInterfacesMod.IFieldResolver[TSource, TContext, graphqlDashResolversLib.graphqlDashResolversMod.TArgs] = js.native
  def pipeResolvers[TSource, TContext](
    resolvers: (graphqlDashToolsLib.distInterfacesMod.IFieldResolver[TSource, TContext, graphqlDashResolversLib.graphqlDashResolversMod.TArgs])*
  ): graphqlDashToolsLib.distInterfacesMod.IFieldResolver[TSource, TContext, graphqlDashResolversLib.graphqlDashResolversMod.TArgs] = js.native
  def resolveDependee(dependeeName: java.lang.String): graphqlDashToolsLib.distInterfacesMod.IFieldResolver[_, _, graphqlDashResolversLib.graphqlDashResolversMod.TArgs] = js.native
  def resolveDependees(dependeeNames: js.Array[java.lang.String]): graphqlDashToolsLib.distInterfacesMod.IFieldResolver[_, _, graphqlDashResolversLib.graphqlDashResolversMod.TArgs] = js.native
}

