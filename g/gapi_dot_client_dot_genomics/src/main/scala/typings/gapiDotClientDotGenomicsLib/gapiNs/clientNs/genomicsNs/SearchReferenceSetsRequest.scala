package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReferenceSetsRequest extends js.Object {
  /**
    * If present, return reference sets for which a prefix of any of
    * sourceAccessions
    * match any of these strings. Accession numbers typically have a main number
    * and a version, for example `NC_000001.11`.
    */
  var accessions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If present, return reference sets for which a substring of their
    * `assemblyId` matches this string (case insensitive).
    */
  var assemblyId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If present, return reference sets for which the
    * md5checksum matches exactly.
    */
  var md5checksums: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 1024. The maximum value is 4096.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

