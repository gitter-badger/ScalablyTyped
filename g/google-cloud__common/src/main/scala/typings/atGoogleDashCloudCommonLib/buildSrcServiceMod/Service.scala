package typings
package atGoogleDashCloudCommonLib.buildSrcServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common/build/src/service", "Service")
@js.native
class Service protected () extends js.Object {
  /**
    * Service is a base class, meant to be inherited from by a "service," like
    * BigQuery or Storage.
    *
    * This handles making authenticated requests by exposing a `makeReq_`
    * function.
    *
    * @constructor
    * @alias module:common/service
    *
    * @param {object} config - Configuration object.
    * @param {string} config.baseUrl - The base URL to make API requests to.
    * @param {string[]} config.scopes - The scopes required for the request.
    * @param {object=} options - [Configuration object](#/docs).
    */
  def this(config: ServiceConfig) = this()
  def this(config: ServiceConfig, options: ServiceOptions) = this()
  var Promise: stdLib.PromiseConstructor = js.native
  var authClient: googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth = js.native
  var baseUrl: java.lang.String = js.native
  var getCredentials: js.Any = js.native
  var globalInterceptors: js.Any = js.native
  var interceptors: js.Any = js.native
  @JSName("makeAuthenticatedRequest")
  var makeAuthenticatedRequest_Original: atGoogleDashCloudCommonLib.buildSrcUtilMod.MakeAuthenticatedRequest = js.native
  var packageJson: js.Any = js.native
  var projectId: java.lang.String = js.native
  var projectIdRequired: js.Any = js.native
  @JSName("requestModule")
  var requestModule_Original: atGoogleDashCloudCommonLib.Anon_Request with (requestLib.requestMod.requestNs.RequestAPI[
    requestLib.requestMod.requestNs.Request, 
    requestLib.requestMod.requestNs.CoreOptions, 
    requestLib.requestMod.requestNs.RequiredUriUrl
  ]) = js.native
  /**
    * Get and update the Service's project ID.
    *
    * @param {function} callback - The callback function.
    */
  def getProjectId(): js.Promise[java.lang.String] = js.native
  def getProjectId(
    callback: js.Function2[
      /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
      /* projectId */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* protected */ def getProjectIdAsync(): js.Promise[java.lang.String] = js.native
  def makeAuthenticatedRequest(reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions): scala.Unit | atGoogleDashCloudCommonLib.buildSrcUtilMod.Abortable = js.native
  def makeAuthenticatedRequest(
    reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions,
    callback: atGoogleDashCloudCommonLib.buildSrcUtilMod.BodyResponseCallback
  ): scala.Unit | atGoogleDashCloudCommonLib.buildSrcUtilMod.Abortable = js.native
  def makeAuthenticatedRequest(
    reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions,
    options: atGoogleDashCloudCommonLib.buildSrcUtilMod.MakeAuthenticatedRequestOptions
  ): scala.Unit | atGoogleDashCloudCommonLib.buildSrcUtilMod.Abortable = js.native
  @JSName("makeAuthenticatedRequest")
  def makeAuthenticatedRequest_Duplexify(reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions): duplexifyLib.duplexifyMod.duplexifyNs.Duplexify = js.native
  /**
    * Make an authenticated API request.
    *
    * @private
    *
    * @param {object} reqOpts - Request options that are passed to `request`.
    * @param {string} reqOpts.uri - A URI relative to the baseUrl.
    * @param {function} callback - The callback function passed to `request`.
    */
  def request(reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions): js.Promise[requestLib.requestMod.requestNs.Response] = js.native
  def request(
    reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions,
    callback: atGoogleDashCloudCommonLib.buildSrcUtilMod.BodyResponseCallback
  ): scala.Unit = js.native
  def requestModule(
    options: requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions
  ): requestLib.requestMod.requestNs.Request = js.native
  def requestModule(
    options: requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): requestLib.requestMod.requestNs.Request = js.native
  def requestModule(uri: java.lang.String): requestLib.requestMod.requestNs.Request = js.native
  def requestModule(uri: java.lang.String, callback: requestLib.requestMod.requestNs.RequestCallback): requestLib.requestMod.requestNs.Request = js.native
  def requestModule(uri: java.lang.String, options: requestLib.requestMod.requestNs.CoreOptions): requestLib.requestMod.requestNs.Request = js.native
  def requestModule(
    uri: java.lang.String,
    options: requestLib.requestMod.requestNs.CoreOptions,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): requestLib.requestMod.requestNs.Request = js.native
  /**
    * Make an authenticated API request.
    *
    * @private
    *
    * @param {object} reqOpts - Request options that are passed to `request`.
    * @param {string} reqOpts.uri - A URI relative to the baseUrl.
    */
  def requestStream(reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions): requestLib.requestMod.requestNs.Request = js.native
  /**
    * Make an authenticated API request.
    *
    * @private
    *
    * @param {object} reqOpts - Request options that are passed to `request`.
    * @param {string} reqOpts.uri - A URI relative to the baseUrl.
    * @param {function} callback - The callback function passed to `request`.
    */
  def `request_`(reqOpts: StreamRequestOptions): requestLib.requestMod.requestNs.Request = js.native
  def `request_`(reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions): js.Promise[requestLib.requestMod.requestNs.Response] = js.native
}

