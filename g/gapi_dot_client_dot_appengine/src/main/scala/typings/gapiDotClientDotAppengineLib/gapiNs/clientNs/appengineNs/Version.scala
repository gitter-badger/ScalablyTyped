package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  /**
    * Serving configuration for Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if view=FULL
    * is set.
    */
  var apiConfig: js.UndefOr[ApiConfigHandler] = js.undefined
  /** Automatic scaling is based on request rate, response latencies, and other application metrics. */
  var automaticScaling: js.UndefOr[AutomaticScaling] = js.undefined
  /**
    * A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes
    * idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
    */
  var basicScaling: js.UndefOr[BasicScaling] = js.undefined
  /** Metadata settings that are supplied to this version to enable beta runtime features. */
  var betaSettings: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Time that this version was created.@OutputOnly */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** Email address of the user who created this version.@OutputOnly */
  var createdBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#staticfileshandler) does not specify its own expiration
    * time.Only returned in GET requests if view=FULL is set.
    */
  var defaultExpiration: js.UndefOr[java.lang.String] = js.undefined
  /** Code and application artifacts that make up this version.Only returned in GET requests if view=FULL is set. */
  var deployment: js.UndefOr[Deployment] = js.undefined
  /** Total size in bytes of all the files that are included in this version and curerntly hosted on the App Engine disk.@OutputOnly */
  var diskUsageBytes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible Service Proxy will be provided to serve the API
    * implemented by the app.
    */
  var endpointsApiService: js.UndefOr[EndpointsApiService] = js.undefined
  /** App Engine execution environment for this version.Defaults to standard. */
  var env: js.UndefOr[java.lang.String] = js.undefined
  /** Environment variables available to the application.Only returned in GET requests if view=FULL is set. */
  var envVariables: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set. */
  var errorHandlers: js.UndefOr[js.Array[ErrorHandler]] = js.undefined
  /**
    * An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request
    * handlers are not attempted.Only returned in GET requests if view=FULL is set.
    */
  var handlers: js.UndefOr[js.Array[UrlMap]] = js.undefined
  /**
    * Configures health checking for VM instances. Unhealthy instances are stopped and replaced with new instances. Only applicable for VM runtimes.Only
    * returned in GET requests if view=FULL is set.
    */
  var healthCheck: js.UndefOr[HealthCheck] = js.undefined
  /**
    * Relative name of the version within the service. Example: v1. Version names can contain only lowercase letters, numbers, or hyphens. Reserved names:
    * "default", "latest", and any name with the prefix "ah-".
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Before an application can receive email or XMPP messages, the application must be configured to enable the service. */
  var inboundServices: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Instance class that is used to run this version. Valid values are:
    * AutomaticScaling: F1, F2, F4, F4_1G
    * ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling.
    */
  var instanceClass: js.UndefOr[java.lang.String] = js.undefined
  /** Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set. */
  var libraries: js.UndefOr[js.Array[Library]] = js.undefined
  /**
    * Configures liveness health checking for VM instances. Unhealthy instances are stopped and replaced with new instancesOnly returned in GET requests if
    * view=FULL is set.
    */
  var livenessCheck: js.UndefOr[LivenessCheck] = js.undefined
  /** A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time. */
  var manualScaling: js.UndefOr[ManualScaling] = js.undefined
  /** Full path to the Version resource in the API. Example: apps/myapp/services/default/versions/v1.@OutputOnly */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Extra network settings. Only applicable for App Engine flexible environment versions. */
  var network: js.UndefOr[Network] = js.undefined
  /** Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set. */
  var nobuildFilesRegex: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Configures readiness health checking for VM instances. Unhealthy instances are not put into the backend traffic rotation.Only returned in GET requests
    * if view=FULL is set.
    */
  var readinessCheck: js.UndefOr[ReadinessCheck] = js.undefined
  /** Machine resources for this version. Only applicable for VM runtimes. */
  var resources: js.UndefOr[Resources] = js.undefined
  /** Desired runtime. Example: python27. */
  var runtime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at
    * https://cloud.google.com/appengine/docs/standard/<language>/config/appref
    */
  var runtimeApiVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an
    * invalid value. Defaults to SERVING.
    */
  var servingStatus: js.UndefOr[java.lang.String] = js.undefined
  /** Whether multiple requests can be dispatched to this version at once. */
  var threadsafe: js.UndefOr[scala.Boolean] = js.undefined
  /** Serving URL for this version. Example: "https://myversion-dot-myservice-dot-myapp.appspot.com"@OutputOnly */
  var versionUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to deploy this version in a container on a virtual machine. */
  var vm: js.UndefOr[scala.Boolean] = js.undefined
}

