package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Http
  * @class Used to send and receive HTTP requests.
  * @description Create a new Http instance. Note: By default a PlayCanvas application creates an instance of this object at `pc.http`.
  */
@JSGlobal("pc.Http")
@js.native
class Http () extends js.Object {
  def del(url: java.lang.String, options: js.Function): scala.Unit = js.native
  def del(url: java.lang.String, options: js.Function, callback: js.Function): scala.Unit = js.native
  /**
    * @function
    * @name pc.Http#del
    * @description Perform an HTTP DELETE request to the given url
    * @param {Object} url The URL to make the request to
    * @param {Object} [options] Additional options
    * @param {Object} [options.headers] HTTP headers to add to the request
    * @param {Boolean} [options.async] Make the request asynchronously (default: true)
    * @param {Object} [options.cache] If false, then add a timestamp to the request to prevent caching
    * @param {Boolean} [options.withCredentials] Send cookies with this request (default: true)
    * @param {String} [options.responseType] Override the response type
    * @param {Document | Object} [options.postdata] Data to send in the body of the request.
    * Some content types are handled automatically, If postdata is an XML Document it is handled, if the Content-Type header is set to 'application/json' then
    * the postdata is JSON stringified, otherwise by default the data is sent as form-urlencoded
    * @param {Function} callback The callback used when the response has returned. Passed (err, data) where data is the response (format depends on response type, text, Object, ArrayBuffer, XML) and err is the error code.
    */
  def del(url: java.lang.String, options: playcanvasLib.Anon_Headers): scala.Unit = js.native
  def del(url: java.lang.String, options: playcanvasLib.Anon_Headers, callback: js.Function): scala.Unit = js.native
  def get(url: java.lang.String, options: js.Function): scala.Unit = js.native
  def get(url: java.lang.String, options: js.Function, callback: js.Function): scala.Unit = js.native
  /**
    * @function
    * @name pc.Http#get
    * @description Perform an HTTP GET request to the given url.
    * @param {String} url
    * @param {Object} [options] Additional options
    * @param {Object} [options.headers] HTTP headers to add to the request
    * @param {Boolean} [options.async] Make the request asynchronously (default: true)
    * @param {Object} [options.cache] If false, then add a timestamp to the request to prevent caching
    * @param {Boolean} [options.withCredentials] Send cookies with this request (default: true)
    * @param {String} [options.responseType] Override the response type
    * @param {Document | Object} [options.postdata] Data to send in the body of the request.
    * Some content types are handled automatically, If postdata is an XML Document it is handled, if the Content-Type header is set to 'application/json' then
    * the postdata is JSON stringified, otherwise by default the data is sent as form-urlencoded
    * @param {Object} [options.cache] If false, then add a timestamp to the request to prevent caching
    * @param {Function} callback The callback used when the response has returned. Passed (err, data) where data is the response (format depends on response type, text, Object, ArrayBuffer, XML) and err is the error code.
    * @example
    * pc.http.get("http://example.com/", function (err, response) {
    *     console.log(response);
    * });
    */
  def get(url: java.lang.String, options: playcanvasLib.Anon_Headers): scala.Unit = js.native
  def get(url: java.lang.String, options: playcanvasLib.Anon_Headers, callback: js.Function): scala.Unit = js.native
  def post(url: java.lang.String, data: js.Object, options: js.Function): scala.Unit = js.native
  def post(url: java.lang.String, data: js.Object, options: js.Function, callback: js.Function): scala.Unit = js.native
  def post(url: java.lang.String, data: js.Object, options: playcanvasLib.Anon_HeadersAsync): scala.Unit = js.native
  def post(
    url: java.lang.String,
    data: js.Object,
    options: playcanvasLib.Anon_HeadersAsync,
    callback: js.Function
  ): scala.Unit = js.native
  def post(url: java.lang.String, data: stdLib.Document, options: js.Function): scala.Unit = js.native
  def post(url: java.lang.String, data: stdLib.Document, options: js.Function, callback: js.Function): scala.Unit = js.native
  /**
    * @function
    * @name pc.Http#post
    * @description Perform an HTTP POST request to the given url
    * @param {String} url The URL to make the request to
    * @param {Object} [options] Additional options
    * @param {Object} [options.headers] HTTP headers to add to the request
    * @param {Boolean} [options.async] Make the request asynchronously (default: true)
    * @param {Object} [options.cache] If false, then add a timestamp to the request to prevent caching
    * @param {Boolean} [options.withCredentials] Send cookies with this request (default: true)
    * @param {String} [options.responseType] Override the response type
    * @param {Object} data Data to send in the body of the request.
    * Some content types are handled automatically, If postdata is an XML Document it is handled, if the Content-Type header is set to 'application/json' then
    * the postdata is JSON stringified, otherwise by default the data is sent as form-urlencoded
    * @param {Function} callback The callback used when the response has returned. Passed (err, data) where data is the response (format depends on response type, text, Object, ArrayBuffer, XML) and err is the error code.
    */
  def post(url: java.lang.String, data: stdLib.Document, options: playcanvasLib.Anon_HeadersAsync): scala.Unit = js.native
  def post(
    url: java.lang.String,
    data: stdLib.Document,
    options: playcanvasLib.Anon_HeadersAsync,
    callback: js.Function
  ): scala.Unit = js.native
  def put(url: java.lang.String, data: js.Object, options: js.Function): scala.Unit = js.native
  def put(url: java.lang.String, data: js.Object, options: js.Function, callback: js.Function): scala.Unit = js.native
  def put(url: java.lang.String, data: js.Object, options: playcanvasLib.Anon_HeadersAsync): scala.Unit = js.native
  def put(
    url: java.lang.String,
    data: js.Object,
    options: playcanvasLib.Anon_HeadersAsync,
    callback: js.Function
  ): scala.Unit = js.native
  def put(url: java.lang.String, data: stdLib.Document, options: js.Function): scala.Unit = js.native
  def put(url: java.lang.String, data: stdLib.Document, options: js.Function, callback: js.Function): scala.Unit = js.native
  /**
    * @function
    * @name pc.Http#put
    * @description Perform an HTTP PUT request to the given url
    * @param {String} url The URL to make the request to
    * @param {Object} [options] Additional options
    * @param {Object} [options.headers] HTTP headers to add to the request
    * @param {Boolean} [options.async] Make the request asynchronously (default: true)
    * @param {Object} [options.cache] If false, then add a timestamp to the request to prevent caching
    * @param {Boolean} [options.withCredentials] Send cookies with this request (default: true)
    * @param {String} [options.responseType] Override the response type
    * @param {Object} [options.cache] If false, then add a timestamp to the request to prevent caching
    * @param {Document | Object} data Data to send in the body of the request.
    * Some content types are handled automatically, If postdata is an XML Document it is handled, if the Content-Type header is set to 'application/json' then
    * the postdata is JSON stringified, otherwise by default the data is sent as form-urlencoded
    * @param {Function} callback The callback used when the response has returned. Passed (err, data) where data is the response (format depends on response type, text, Object, ArrayBuffer, XML) and err is the error code.
    */
  def put(url: java.lang.String, data: stdLib.Document, options: playcanvasLib.Anon_HeadersAsync): scala.Unit = js.native
  def put(
    url: java.lang.String,
    data: stdLib.Document,
    options: playcanvasLib.Anon_HeadersAsync,
    callback: js.Function
  ): scala.Unit = js.native
  def request(method: java.lang.String, url: java.lang.String, options: js.Function): scala.Unit = js.native
  def request(method: java.lang.String, url: java.lang.String, options: js.Function, callback: js.Function): scala.Unit = js.native
  /**
    * @function
    * @name pc.Http#request
    * @description Make a general purpose HTTP request.
    * @param {String} method The HTTP method "GET", "POST", "PUT", "DELETE"
    * @param {String} url The url to make the request to
    * @param {Object} [options] Additional options
    * @param {Object} [options.headers] HTTP headers to add to the request
    * @param {Boolean} [options.async] Make the request asynchronously (default: true)
    * @param {Object} [options.cache] If false, then add a timestamp to the request to prevent caching
    * @param {Boolean} [options.withCredentials] Send cookies with this request (default: true)
    * @param {String} [options.responseType] Override the response type
    * @param {Document|Object} [options.postdata] Data to send in the body of the request.
    * Some content types are handled automatically, If postdata is an XML Document it is handled, if the Content-Type header is set to 'application/json' then
    * the postdata is JSON stringified, otherwise by default the data is sent as form-urlencoded
    * @param {Function} callback The callback used when the response has retured. Passed (err, data) where data is the response (format depends on response type, text, Object, ArrayBuffer, XML) and err is the error code.
    */
  def request(method: java.lang.String, url: java.lang.String, options: playcanvasLib.Anon_Headers): scala.Unit = js.native
  def request(
    method: java.lang.String,
    url: java.lang.String,
    options: playcanvasLib.Anon_Headers,
    callback: js.Function
  ): scala.Unit = js.native
}

