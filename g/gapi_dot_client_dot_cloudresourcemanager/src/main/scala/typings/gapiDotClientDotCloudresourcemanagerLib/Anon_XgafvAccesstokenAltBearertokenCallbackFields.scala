package typings
package gapiDotClientDotCloudresourcemanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XgafvAccesstokenAltBearertokenCallbackFields extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An expression for filtering the results of the request.  Filter rules are
    * case insensitive. The fields eligible for filtering are:
    *
    * + `name`
    * + `id`
    * + <code>labels.<em>key</em></code> where &#42;key&#42; is the name of a label
    *
    * Some examples of using labels as filters:
    *
    * |Filter|Description|
    * |------|-----------|
    * |name:how&#42;|The project's name starts with "how".|
    * |name:Howl|The project's name is `Howl` or `howl`.|
    * |name:HOWL|Equivalent to above.|
    * |NAME:howl|Equivalent to above.|
    * |labels.color:&#42;|The project has the label `color`.|
    * |labels.color:red|The project's label `color` has the value `red`.|
    * |labels.color:red&nbsp;labels.size:big|The project's label `color` has the value `red` and its label `size` has the value `big`.
    *
    * If you specify a filter that has both `parent.type` and `parent.id`, then
    * the `resourcemanager.projects.list` permission is checked on the parent.
    * If the user has this permission, all projects under the parent will be
    * returned after remaining filters have been applied. If the user lacks this
    * permission, then all projects for which the user has the
    * `resourcemanager.projects.get` permission will be returned after remaining
    * filters have been applied. If no filter is specified, the call will return
    * projects for which the user has `resourcemanager.projects.get` permissions.
    *
    * Optional.
    */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of Projects to return in the response.
    * The server can return fewer Projects than requested.
    * If unspecified, server picks an appropriate default.
    *
    * Optional.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * A pagination token returned from a previous call to ListProjects
    * that indicates from where listing should continue.
    *
    * Optional.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

