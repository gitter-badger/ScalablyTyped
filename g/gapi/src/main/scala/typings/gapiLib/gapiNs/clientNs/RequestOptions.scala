package typings
package gapiLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /**
    * The HTTP request body (applies to PUT or POST).
    */
  var body: js.UndefOr[js.Any] = js.undefined
  /**
    * If supplied, the request is executed immediately and no gapi.client.HttpRequest object is returned
    */
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Additional HTTP request headers
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
    * The HTTP request method to use. Default is GET
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL params in key-value pair form
    */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
    * The URL to handle the request
    */
  var path: java.lang.String
}

