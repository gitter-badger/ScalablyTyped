package typings
package gapiDotClientDotClassroomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAltBearertokenCallback extends js.Object {
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
  /**
    * Identifier of the course.
    * This identifier can be either the Classroom-assigned identifier or an
    * alias.
    */
  var courseId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Identifier of the course work. */
  var id: java.lang.String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Mask that identifies which fields on the course work to update.
    * This field is required to do an update. The update fails if invalid
    * fields are specified. If a field supports empty values, it can be cleared
    * by specifying it in the update mask and not in the CourseWork object. If a
    * field that does not support empty values is included in the update mask and
    * not set in the CourseWork object, an `INVALID_ARGUMENT` error will be
    * returned.
    *
    * The following fields may be specified by teachers:
    *
    * &#42; `title`
    * &#42; `description`
    * &#42; `state`
    * &#42; `due_date`
    * &#42; `due_time`
    * &#42; `max_points`
    * &#42; `scheduled_time`
    * &#42; `submission_modification_mode`
    */
  var updateMask: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

