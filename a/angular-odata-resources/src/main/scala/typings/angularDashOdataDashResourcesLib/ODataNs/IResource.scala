package typings
package angularDashOdataDashResourcesLib.ODataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance calls always return the the promise of the request which retrieved the object
// https://github.com/angular/angular.js/blob/v1.2.0/src/ngResource/resource.js#L538-L546
@js.native
trait IResource[T] extends js.Object {
  /** the promise of the original server interaction that created this instance. **/
  @JSName("$promise")
  var $promise: angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$resolved")
  var $resolved: scala.Boolean = js.native
  @JSName("$delete")
  def $delete(): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object, success: angularLib.angularMod.Global.Function with js.Function): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(
    params: js.Object,
    success: angularLib.angularMod.Global.Function with js.Function,
    error: angularLib.angularMod.Global.Function with js.Function
  ): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(success: angularLib.angularMod.Global.Function with js.Function): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(
    success: angularLib.angularMod.Global.Function with js.Function,
    error: angularLib.angularMod.Global.Function with js.Function
  ): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$get")
  def $get(): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object, success: angularLib.angularMod.Global.Function with js.Function): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$get")
  def $get(
    params: js.Object,
    success: angularLib.angularMod.Global.Function with js.Function,
    error: angularLib.angularMod.Global.Function with js.Function
  ): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$get")
  def $get(success: angularLib.angularMod.Global.Function with js.Function): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$get")
  def $get(
    success: angularLib.angularMod.Global.Function with js.Function,
    error: angularLib.angularMod.Global.Function with js.Function
  ): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$query")
  def $query(): angularLib.angularMod.angularNs.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object): angularLib.angularMod.angularNs.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object, success: angularLib.angularMod.Global.Function with js.Function): angularLib.angularMod.angularNs.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(
    params: js.Object,
    success: angularLib.angularMod.Global.Function with js.Function,
    error: angularLib.angularMod.Global.Function with js.Function
  ): angularLib.angularMod.angularNs.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(success: angularLib.angularMod.Global.Function with js.Function): angularLib.angularMod.angularNs.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(
    success: angularLib.angularMod.Global.Function with js.Function,
    error: angularLib.angularMod.Global.Function with js.Function
  ): angularLib.angularMod.angularNs.IPromise[IResourceArray[T]] = js.native
  @JSName("$remove")
  def $remove(): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object, success: angularLib.angularMod.Global.Function with js.Function): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(
    params: js.Object,
    success: angularLib.angularMod.Global.Function with js.Function,
    error: angularLib.angularMod.Global.Function with js.Function
  ): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(success: angularLib.angularMod.Global.Function with js.Function): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(
    success: angularLib.angularMod.Global.Function with js.Function,
    error: angularLib.angularMod.Global.Function with js.Function
  ): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$save")
  def $save(): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object, success: angularLib.angularMod.Global.Function with js.Function): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$save")
  def $save(
    params: js.Object,
    success: angularLib.angularMod.Global.Function with js.Function,
    error: angularLib.angularMod.Global.Function with js.Function
  ): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$save")
  def $save(success: angularLib.angularMod.Global.Function with js.Function): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$save")
  def $save(
    success: angularLib.angularMod.Global.Function with js.Function,
    error: angularLib.angularMod.Global.Function with js.Function
  ): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$update")
  def $update(): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$update")
  def $update(params: js.Object): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$update")
  def $update(params: js.Object, success: angularLib.angularMod.Global.Function with js.Function): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$update")
  def $update(
    params: js.Object,
    success: angularLib.angularMod.Global.Function with js.Function,
    error: angularLib.angularMod.Global.Function with js.Function
  ): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$update")
  def $update(success: angularLib.angularMod.Global.Function with js.Function): angularLib.angularMod.angularNs.IPromise[T] = js.native
  @JSName("$update")
  def $update(
    success: angularLib.angularMod.Global.Function with js.Function,
    error: angularLib.angularMod.Global.Function with js.Function
  ): angularLib.angularMod.angularNs.IPromise[T] = js.native
}

