package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describing options available for gettings the logs
  */
trait LogsOptions extends js.Object {
  /**
    * The index to request logs from
    */
  var indexName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the maximum number of entries to retrieve starting at the offset.
    * default: 10
    * maximum: 1000
    * https://github.com/algolia/algoliasearch-client-js#get-logs---getlogs
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify the first entry to retrieve (0-based, 0 is the most recent log entry).
    * default: 0
    * https://github.com/algolia/algoliasearch-client-js#get-logs---getlogs
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * @deprecated
    * Retrieve only logs with an HTTP code different than 200 or 201
    * https://github.com/algolia/algoliasearch-client-js#get-logs---getlogs
    */
  var onlyErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the type of logs to retrieve
    * 'query' Retrieve only the queries
    * 'build' Retrieve only the build operations
    * 'error' Retrieve only the errors (same as onlyErrors parameters)
    * https://github.com/algolia/algoliasearch-client-js#get-logs---getlogs
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

