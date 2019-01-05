package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_From extends js.Object {
  def concat[T](array: stdLib.ArrayLike[T], items: (Array[T] | T)*): Array[T] = js.native
  def copyWithin[T](array: stdLib.ArrayLike[T], target: scala.Double, start: scala.Double): Array[T] = js.native
  def copyWithin[T](array: stdLib.ArrayLike[T], target: scala.Double, start: scala.Double, end: scala.Double): Array[T] = js.native
  def entries[T](array: stdLib.ArrayLike[T]): (nodeLib.IterableIterator[js.Tuple2[scala.Double, T]]) with (stdLib.IterableIterator[js.Tuple2[scala.Double, T]]) = js.native
  def every[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean]
  ): scala.Boolean = js.native
  def every[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean],
    thisArg: js.Any
  ): scala.Boolean = js.native
  def fill[T](array: stdLib.ArrayLike[T], value: T): Array[T] = js.native
  def fill[T](array: stdLib.ArrayLike[T], value: T, start: scala.Double): Array[T] = js.native
  def fill[T](array: stdLib.ArrayLike[T], value: T, start: scala.Double, end: scala.Double): Array[T] = js.native
  def filter[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean]
  ): Array[T] = js.native
  def filter[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean],
    thisArg: js.Any
  ): Array[T] = js.native
  def find[T](
    array: stdLib.ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ Array[T], scala.Boolean]
  ): T = js.native
  def find[T](
    array: stdLib.ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ Array[T], scala.Boolean],
    thisArg: js.Any
  ): T = js.native
  def findIndex[T](array: stdLib.ArrayLike[T], predicate: js.Function1[/* value */ T, scala.Boolean]): scala.Double = js.native
  def findIndex[T](array: stdLib.ArrayLike[T], predicate: js.Function1[/* value */ T, scala.Boolean], thisArg: js.Any): scala.Double = js.native
  def forEach[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit]
  ): scala.Unit = js.native
  def forEach[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def from[T](arrayLike: nodeLib.Iterable[T] with stdLib.Iterable[T]): Array[T] = js.native
  def from[T](arrayLike: stdLib.ArrayLike[T]): Array[T] = js.native
  def from[T, U](
    arrayLike: nodeLib.Iterable[T] with stdLib.Iterable[T],
    mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U]
  ): Array[U] = js.native
  def from[T, U](
    arrayLike: nodeLib.Iterable[T] with stdLib.Iterable[T],
    mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U],
    thisArg: js.Any
  ): Array[U] = js.native
  def from[T, U](arrayLike: stdLib.ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U]): Array[U] = js.native
  def from[T, U](
    arrayLike: stdLib.ArrayLike[T],
    mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U],
    thisArg: js.Any
  ): Array[U] = js.native
  def includes[T](array: stdLib.ArrayLike[T], value: T): scala.Boolean = js.native
  def includes[T](array: stdLib.ArrayLike[T], value: T, fromIndex: scala.Double): scala.Boolean = js.native
  def indexOf[T](array: stdLib.ArrayLike[T], searchElement: T): scala.Double = js.native
  def indexOf[T](array: stdLib.ArrayLike[T], searchElement: T, fromIndex: scala.Double): scala.Double = js.native
  def isArray(arg: js.Any): /* is core-js.Array<any> */ scala.Boolean = js.native
  def join[T](array: stdLib.ArrayLike[T]): java.lang.String = js.native
  def join[T](array: stdLib.ArrayLike[T], separator: java.lang.String): java.lang.String = js.native
  def keys[T](array: stdLib.ArrayLike[T]): nodeLib.IterableIterator[scala.Double] with stdLib.IterableIterator[scala.Double] = js.native
  def lastIndexOf[T](array: stdLib.ArrayLike[T], earchElement: T): scala.Double = js.native
  def lastIndexOf[T](array: stdLib.ArrayLike[T], earchElement: T, fromIndex: scala.Double): scala.Double = js.native
  def map[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], U]
  ): Array[U] = js.native
  def map[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], U],
    thisArg: js.Any
  ): Array[U] = js.native
  def of[T](items: T*): Array[T] = js.native
  def pop[T](array: stdLib.ArrayLike[T]): T = js.native
  def push[T](array: stdLib.ArrayLike[T], items: T*): scala.Double = js.native
  def reduce[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      T
    ]
  ): T = js.native
  def reduce[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  def reduceRight[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      T
    ]
  ): T = js.native
  def reduceRight[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  @JSName("reduceRight")
  def reduceRight_TUU[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  @JSName("reduce")
  def reduce_TUU[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  def reverse[T](array: stdLib.ArrayLike[T]): Array[T] = js.native
  def shift[T](array: stdLib.ArrayLike[T]): T = js.native
  def slice[T](array: stdLib.ArrayLike[T]): Array[T] = js.native
  def slice[T](array: stdLib.ArrayLike[T], start: scala.Double): Array[T] = js.native
  def slice[T](array: stdLib.ArrayLike[T], start: scala.Double, end: scala.Double): Array[T] = js.native
  def some[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean]
  ): scala.Boolean = js.native
  def some[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean],
    thisArg: js.Any
  ): scala.Boolean = js.native
  def sort[T](array: stdLib.ArrayLike[T]): Array[T] = js.native
  def sort[T](array: stdLib.ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, scala.Double]): Array[T] = js.native
  def splice[T](array: stdLib.ArrayLike[T], start: scala.Double): Array[T] = js.native
  def splice[T](array: stdLib.ArrayLike[T], start: scala.Double, deleteCount: scala.Double, items: T*): Array[T] = js.native
  def turn[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ Array[T], 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ Array[T], 
      scala.Unit
    ]
  ): Array[T] = js.native
  def turn[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ Array[T], 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ Array[T], 
      scala.Unit
    ],
    memo: Array[T]
  ): Array[T] = js.native
  def turn[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit],
    memo: U
  ): U = js.native
  @JSName("turn")
  def turn_TUU[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit]
  ): U = js.native
  def unshift[T](array: stdLib.ArrayLike[T], items: T*): scala.Double = js.native
  def values[T](array: stdLib.ArrayLike[T]): nodeLib.IterableIterator[T] with stdLib.IterableIterator[T] = js.native
}

