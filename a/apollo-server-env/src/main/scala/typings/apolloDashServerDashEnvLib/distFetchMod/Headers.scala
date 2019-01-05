package typings
package apolloDashServerDashEnvLib.distFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env/dist/fetch", "Headers")
@js.native
class Headers ()
  extends nodeLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]]
     with stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]] {
  def this(init: HeadersInit) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator_Headers: js.Function0[
    (nodeLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]]) with (stdLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]])
  ] = js.native
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def delete(name: java.lang.String): scala.Unit = js.native
  def entries(): (nodeLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]]) with (stdLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]]) = js.native
  def get(name: java.lang.String): java.lang.String | scala.Null = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def keys(): nodeLib.Iterator[java.lang.String] with stdLib.Iterator[java.lang.String] = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def values(): nodeLib.Iterator[js.Array[java.lang.String]] with stdLib.Iterator[js.Array[java.lang.String]] = js.native
}

