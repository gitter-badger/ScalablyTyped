package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Resource")
@js.native
class Resource ()
  extends cesiumLib.cesiumMod.CesiumNs.Resource {
  def this(options: cesiumLib.Anon_UrlQueryParametersTemplateValues) = this()
}

@JSImport("cesium", "Resource")
@js.native
object Resource extends js.Object {
  var DEFAULT: cesiumLib.cesiumMod.CesiumNs.Resource = js.native
  val isBlobSupported: scala.Boolean = js.native
  def delete(): js.UndefOr[js.Promise[_]] = js.native
  def delete(options: cesiumLib.Anon_UrlData): js.UndefOr[js.Promise[_]] = js.native
  def fetch(): js.UndefOr[js.Promise[_]] = js.native
  def fetch(options: cesiumLib.Anon_UrlQueryParameters): js.UndefOr[js.Promise[_]] = js.native
  def fetchArrayBuffer(): js.UndefOr[js.Promise[stdLib.ArrayBuffer]] = js.native
  def fetchArrayBuffer(options: cesiumLib.Anon_UrlQueryParametersTemplateValues): js.UndefOr[js.Promise[stdLib.ArrayBuffer]] = js.native
  def fetchBlob(): js.UndefOr[js.Promise[stdLib.Blob]] = js.native
  def fetchBlob(options: cesiumLib.Anon_UrlQueryParametersTemplateValues): js.UndefOr[js.Promise[stdLib.Blob]] = js.native
  def fetchImage(): js.UndefOr[js.Promise[_]] = js.native
  def fetchImage(options: cesiumLib.Anon_UrlQueryParametersTemplateValuesHeaders): js.UndefOr[js.Promise[_]] = js.native
  def fetchJson(): js.UndefOr[js.Promise[_]] = js.native
  def fetchJson(options: cesiumLib.Anon_UrlQueryParametersTemplateValues): js.UndefOr[js.Promise[_]] = js.native
  def fetchJsonp(): js.UndefOr[js.Promise[_]] = js.native
  def fetchJsonp(options: cesiumLib.Anon_UrlQueryParametersTemplateValuesHeadersProxy): js.UndefOr[js.Promise[_]] = js.native
  def fetchText(): js.UndefOr[js.Promise[java.lang.String]] = js.native
  def fetchText(options: cesiumLib.Anon_UrlQueryParametersTemplateValues): js.UndefOr[js.Promise[java.lang.String]] = js.native
  def fetchXml(): js.UndefOr[js.Promise[stdLib.XMLDocument]] = js.native
  def fetchXml(options: cesiumLib.Anon_UrlQueryParametersTemplateValues): js.UndefOr[js.Promise[stdLib.XMLDocument]] = js.native
  def head(): js.UndefOr[js.Promise[_]] = js.native
  def head(options: cesiumLib.Anon_UrlQueryParameters): js.UndefOr[js.Promise[_]] = js.native
  def options(): js.UndefOr[js.Promise[_]] = js.native
  def options(options: cesiumLib.Anon_UrlQueryParameters): js.UndefOr[js.Promise[_]] = js.native
  def patch(): js.UndefOr[js.Promise[_]] = js.native
  def patch(options: cesiumLib.Anon_UrlData): js.UndefOr[js.Promise[_]] = js.native
  def post(): js.UndefOr[js.Promise[_]] = js.native
  def post(options: cesiumLib.Anon_UrlData): js.UndefOr[js.Promise[_]] = js.native
  def put(): js.UndefOr[js.Promise[_]] = js.native
  def put(options: cesiumLib.Anon_UrlData): js.UndefOr[js.Promise[_]] = js.native
}

