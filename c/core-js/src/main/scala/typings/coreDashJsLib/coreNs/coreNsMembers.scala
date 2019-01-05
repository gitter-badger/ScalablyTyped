package typings
package coreDashJsLib.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("core")
@js.native
object coreNsMembers extends js.Object {
  val Array: coreDashJsLib.Anon_From = js.native
  val Date: coreDashJsLib.Anon_Now = js.native
  val Dict: coreDashJsLib.DictConstructor = js.native
  val Function: coreDashJsLib.Anon_Bind = js.native
  val Map: nodeLib.MapConstructor with stdLib.MapConstructor = js.native
  val Math: coreDashJsLib.Anon_Clz32 = js.native
  val Number: coreDashJsLib.Anon_EPSILON = js.native
  val Object: coreDashJsLib.Anon_GetPrototypeOf = js.native
  val Promise: stdLib.PromiseConstructor = js.native
  val RegExp: coreDashJsLib.Anon_Escape = js.native
  val Set: nodeLib.SetConstructor with stdLib.SetConstructor = js.native
  val String: coreDashJsLib.Anon_CodePointAt = js.native
  val WeakMap: nodeLib.WeakMapConstructor with stdLib.WeakMapConstructor = js.native
  val WeakSet: nodeLib.WeakSetConstructor with stdLib.WeakSetConstructor = js.native
  val `_`: scala.Boolean = js.native
  val global: js.Any = js.native
  val log: coreDashJsLib.Log = js.native
  val version: java.lang.String = js.native
  @JSName("$for")
  def $for[T](iterable: nodeLib.Iterable[T] with stdLib.Iterable[T]): coreDashJsLib.$for[T] = js.native
  def addLocale(lang: java.lang.String, locale: Locale): coreDashJsLib.Anon_Version = js.native
  def clearImmediate(handle: scala.Double): scala.Unit = js.native
  def delay(msec: scala.Double): js.Promise[scala.Unit] = js.native
  def getIterator[T](iterable: nodeLib.Iterable[T] with stdLib.Iterable[T]): nodeLib.Iterator[T] with stdLib.Iterator[T] = js.native
  def isIterable(value: js.Any): scala.Boolean = js.native
  def locale(): java.lang.String = js.native
  def locale(lang: java.lang.String): java.lang.String = js.native
  def setImmediate(expression: js.Any, args: js.Any*): scala.Double = js.native
  def setInterval(handler: js.Any): scala.Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): scala.Double = js.native
  def setTimeout(handler: js.Any): scala.Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): scala.Double = js.native
}

