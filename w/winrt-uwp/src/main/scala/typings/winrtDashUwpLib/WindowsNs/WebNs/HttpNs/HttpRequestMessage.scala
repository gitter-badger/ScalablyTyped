package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an HTTP request message including headers. */
@JSGlobal("Windows.Web.Http.HttpRequestMessage")
@js.native
/** Initializes a new instance of the HttpRequestMessage class. */
class HttpRequestMessage () extends js.Object {
  /**
    * Initializes a new instance of the HttpRequestMessage class with an HTTP method and a request Uri .
    * @param method The HTTP method to perform
    * @param uri The Uri to request.
    */
  def this(method: HttpMethod, uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri) = this()
  /** Gets or sets the HTTP content to send to the server on the HttpRequestMessage object. */
  var content: IHttpContent = js.native
  /** Gets the collection of the HTTP request headers associated with the HttpRequestMessage . */
  var headers: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpRequestHeaderCollection = js.native
  /** Gets or sets the HTTP method to be performed on the request URI. */
  var method: HttpMethod = js.native
  /** Gets a set of properties on the HttpRequestMessage instance that are for use by the developer. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, _] = js.native
  /** Gets or sets the Uri used for the HttpRequestMessage object. */
  var requestUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Get information about the underlying transport socket used by an HTTP connection. */
  var transportInformation: HttpTransportInformation = js.native
  /** Closes the HttpRequestMessage instance and releases allocated resources. */
  def close(): scala.Unit = js.native
}

