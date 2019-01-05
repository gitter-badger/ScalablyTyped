package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "APIConstructor")
@js.native
class APIConstructor () extends js.Object {
  def error(message: java.lang.String, details: java.lang.String): nodalLib.Anon_MetaData = js.native
  def format(obj: js.Any): nodalLib.Anon_Meta = js.native
  def format(obj: js.Any, arrInterface: js.Array[java.lang.String]): nodalLib.Anon_Meta = js.native
  def meta(total: scala.Double, count: scala.Double, offset: scala.Double, error: js.Any): nodalLib.Anon_Total = js.native
  def meta(
    total: scala.Double,
    count: scala.Double,
    offset: scala.Double,
    error: js.Any,
    summary: java.lang.String
  ): nodalLib.Anon_Total = js.native
  def meta(
    total: scala.Double,
    count: scala.Double,
    offset: scala.Double,
    error: js.Any,
    summary: java.lang.String,
    resource: js.Any
  ): nodalLib.Anon_Total = js.native
  def meta(
    total: scala.Double,
    count: scala.Double,
    offset: scala.Double,
    error: js.Any,
    summary: scala.Null,
    resource: js.Any
  ): nodalLib.Anon_Total = js.native
  def resourceFromArray(arr: js.Array[_]): nodalLib.Anon_Name = js.native
  def resourceFromModelArray(modelArray: js.Any, arrInterface: js.Any): js.Any = js.native
  def response(itemArray: js.Any, arrInterface: js.Any): nodalLib.Anon_Meta = js.native
  def response(itemArray: js.Any, arrInterface: js.Any, useResource: scala.Boolean): nodalLib.Anon_Meta = js.native
  def spoof(obj: js.Any): nodalLib.Anon_Meta = js.native
  def spoof(obj: js.Any, useResource: scala.Boolean): nodalLib.Anon_Meta = js.native
}

