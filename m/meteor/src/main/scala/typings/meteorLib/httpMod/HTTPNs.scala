package typings
package meteorLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/http", "HTTP")
@js.native
object HTTPNs extends js.Object {
  trait HTTPRequest extends js.Object {
    var auth: js.UndefOr[java.lang.String] = js.undefined
    var content: js.UndefOr[java.lang.String] = js.undefined
    var data: js.UndefOr[js.Any] = js.undefined
    var followRedirects: js.UndefOr[scala.Boolean] = js.undefined
    var headers: /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.Any
      ] = js.undefined
    var params: /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.Any
      ] = js.undefined
    var query: js.UndefOr[java.lang.String] = js.undefined
    var timeout: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait HTTPResponse extends js.Object {
    var content: js.UndefOr[java.lang.String] = js.undefined
    var data: js.UndefOr[js.Any] = js.undefined
    var headers: /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.Any
      ] = js.undefined
    var statusCode: js.UndefOr[scala.Double] = js.undefined
  }
  
  def call(method: java.lang.String, url: java.lang.String): HTTPResponse = js.native
  def call(method: java.lang.String, url: java.lang.String, options: meteorLib.Anon_Content): HTTPResponse = js.native
  def call(
    method: java.lang.String,
    url: java.lang.String,
    options: meteorLib.Anon_Content,
    asyncCallback: js.Function
  ): HTTPResponse = js.native
  def call(method: java.lang.String, url: java.lang.String, options: HTTPRequest): HTTPResponse = js.native
  def call(method: java.lang.String, url: java.lang.String, options: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
  def del(url: java.lang.String): HTTPResponse = js.native
  def del(url: java.lang.String, callOptions: HTTPRequest): HTTPResponse = js.native
  def del(url: java.lang.String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
  def get(url: java.lang.String): HTTPResponse = js.native
  def get(url: java.lang.String, callOptions: HTTPRequest): HTTPResponse = js.native
  def get(url: java.lang.String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
  def post(url: java.lang.String): HTTPResponse = js.native
  def post(url: java.lang.String, callOptions: HTTPRequest): HTTPResponse = js.native
  def post(url: java.lang.String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
  def put(url: java.lang.String): HTTPResponse = js.native
  def put(url: java.lang.String, callOptions: HTTPRequest): HTTPResponse = js.native
  def put(url: java.lang.String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
}

