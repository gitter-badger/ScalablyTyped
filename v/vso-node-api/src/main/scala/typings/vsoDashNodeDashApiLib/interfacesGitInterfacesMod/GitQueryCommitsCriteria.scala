package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitQueryCommitsCriteria extends js.Object {
  /**
    * Number of entries to skip
    */
  @JSName("$skip")
  var $skip: scala.Double
  /**
    * Maximum number of entries to retrieve
    */
  @JSName("$top")
  var $top: scala.Double
  /**
    * Alias or display name of the author
    */
  var author: java.lang.String
  /**
    * If provided, the earliest commit in the graph to search
    */
  var compareVersion: GitVersionDescriptor
  /**
    * If true, don't include delete history entries
    */
  var excludeDeletes: scala.Boolean
  /**
    * If provided, a lower bound for filtering commits alphabetically
    */
  var fromCommitId: java.lang.String
  /**
    * If provided, only include history entries created after this date (string)
    */
  var fromDate: java.lang.String
  /**
    * What Git history mode should be used. This only applies to the search criteria when Ids = null.
    */
  var historyMode: GitHistoryMode
  /**
    * If provided, specifies the exact commit ids of the commits to fetch. May not be combined with other parameters.
    */
  var ids: js.Array[java.lang.String]
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: scala.Boolean
  /**
    * Whether to include linked work items
    */
  var includeWorkItems: scala.Boolean
  /**
    * Path of item to search under
    */
  var itemPath: java.lang.String
  /**
    * If provided, identifies the commit or branch to search
    */
  var itemVersion: GitVersionDescriptor
  /**
    * If provided, an upper bound for filtering commits alphabetically
    */
  var toCommitId: java.lang.String
  /**
    * If provided, only include history entries created before this date (string)
    */
  var toDate: java.lang.String
  /**
    * Alias or display name of the committer
    */
  var user: java.lang.String
}

