package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdId extends js.Object {
  /** Select only event tags that belong to this ad. */
  var adId: js.UndefOr[java.lang.String] = js.undefined
  /** Select only event tags that belong to this advertiser. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Select only event tags that belong to this campaign. */
  var campaignId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Examine only the specified campaign or advertiser's event tags for matching selector criteria. When set to false, the parent advertiser and parent
    * campaign of the specified ad or campaign is examined as well. In addition, when set to false, the status field is examined as well, along with the
    * enabledByDefault field. This parameter can not be set to true when adId is specified as ads do not define their own even tags.
    */
  var definitionsOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Select only enabled event tags. What is considered enabled or disabled depends on the definitionsOnly parameter. When definitionsOnly is set to true,
    * only the specified advertiser or campaign's event tags' enabledByDefault field is examined. When definitionsOnly is set to false, the specified ad or
    * specified campaign's parent advertiser's or parent campaign's event tags' enabledByDefault and status fields are examined as well.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Select only event tags with the specified event tag types. Event tag types can be used to specify whether to use a third-party pixel, a third-party
    * JavaScript URL, or a third-party click-through URL for either impression or click tracking.
    */
  var eventTagTypes: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only event tags with these IDs. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "eventtag&#42;2015" will return objects with names like "eventtag June
    * 2015", "eventtag April 2015", or simply "eventtag 2015". Most of the searches also add wildcards implicitly at the start and the end of the search
    * string. For example, a search string of "eventtag" will match objects with name "my eventtag", "eventtag 2015", or simply "eventtag".
    */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

