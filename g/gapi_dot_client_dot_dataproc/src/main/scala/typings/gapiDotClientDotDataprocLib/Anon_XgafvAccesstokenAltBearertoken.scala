package typings
package gapiDotClientDotDataprocLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XgafvAccesstokenAltBearertoken extends js.Object {
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
  /** Required. The cluster name. */
  var clusterName: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Required. The ID of the Google Cloud Platform project the cluster belongs to. */
  var projectId: java.lang.String
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The Cloud Dataproc region in which to handle the request. */
  var region: java.lang.String
  /**
    * Required. Specifies the path, relative to Cluster, of the field to update. For example, to change the number of workers in a cluster to 5, the
    * update_mask parameter would be specified as config.worker_config.num_instances, and the PATCH request body would specify the new value, as follows:
    * {
    * "config":{
    * "workerConfig":{
    * "numInstances":"5"
    * }
    * }
    * }
    * Similarly, to change the number of preemptible workers in a cluster to 5, the update_mask parameter would be
    * config.secondary_worker_config.num_instances, and the PATCH request body would be set as follows:
    * {
    * "config":{
    * "secondaryWorkerConfig":{
    * "numInstances":"5"
    * }
    * }
    * }
    * <strong>Note:</strong> Currently, only the following fields can be updated:<table>  <tbody>  <tr>  <td><strong>Mask</strong></td>
    * <td><strong>Purpose</strong></td>  </tr>  <tr>  <td><strong><em>labels</em></strong></td>  <td>Update labels</td>  </tr>  <tr>
    * <td><strong><em>config.worker_config.num_instances</em></strong></td>  <td>Resize primary worker group</td>  </tr>  <tr>
    * <td><strong><em>config.secondary_worker_config.num_instances</em></strong></td>  <td>Resize secondary worker group</td>  </tr>  </tbody>  </table>
    */
  var updateMask: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

