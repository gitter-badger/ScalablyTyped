package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var authProvider: js.UndefOr[cassandraDashDriverLib.cassandraDashDriverMod.authNs.AuthProvider] = js.undefined
  var contactPoints: js.Array[java.lang.String]
  var encoding: js.UndefOr[cassandraDashDriverLib.Anon_Map] = js.undefined
  var isMetadataSyncEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var keyspace: js.UndefOr[java.lang.String] = js.undefined
  var maxPrepared: js.UndefOr[scala.Double] = js.undefined
  var policies: js.UndefOr[cassandraDashDriverLib.Anon_LoadBalancing] = js.undefined
  var pooling: js.UndefOr[cassandraDashDriverLib.Anon_HeartBeatInterval] = js.undefined
  var prepareOnAllHosts: js.UndefOr[scala.Boolean] = js.undefined
  var profiles: js.UndefOr[js.Array[ExecutionProfile]] = js.undefined
  var promiseFactory: js.UndefOr[
    js.Function1[
      /* handler */ js.Function1[
        /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], scala.Unit], 
        scala.Unit
      ], 
      js.Promise[_]
    ]
  ] = js.undefined
  var protocolOptions: js.UndefOr[cassandraDashDriverLib.Anon_Port] = js.undefined
  var queryOptions: js.UndefOr[QueryOptions] = js.undefined
  var rePrepareOnUp: js.UndefOr[scala.Boolean] = js.undefined
  var refreshSchemaDelay: js.UndefOr[scala.Double] = js.undefined
  var socketOptions: js.UndefOr[cassandraDashDriverLib.Anon_ConnectTimeout] = js.undefined
  var sslOptions: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
}

