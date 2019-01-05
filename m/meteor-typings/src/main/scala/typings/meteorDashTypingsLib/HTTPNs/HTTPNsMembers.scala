package typings
package meteorDashTypingsLib.HTTPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTTP")
@js.native
object HTTPNsMembers extends js.Object {
  def call(method: java.lang.String, url: java.lang.String): HTTPResponse = js.native
  def call(method: java.lang.String, url: java.lang.String, options: meteorDashTypingsLib.Anon_Content): HTTPResponse = js.native
  def call(
    method: java.lang.String,
    url: java.lang.String,
    options: meteorDashTypingsLib.Anon_Content,
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

