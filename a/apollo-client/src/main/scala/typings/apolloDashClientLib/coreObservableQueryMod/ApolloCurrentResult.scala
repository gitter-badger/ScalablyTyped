package typings
package apolloDashClientLib.coreObservableQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloCurrentResult[T] extends js.Object {
  var data: T | js.Object
  var error: js.UndefOr[apolloDashClientLib.errorsApolloErrorMod.ApolloError] = js.undefined
  var errors: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLError]] = js.undefined
  var loading: scala.Boolean
  var networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  var partial: js.UndefOr[scala.Boolean] = js.undefined
}

