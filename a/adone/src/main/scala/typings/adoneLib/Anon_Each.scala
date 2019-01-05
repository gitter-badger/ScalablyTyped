package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Each extends js.Object {
  def all[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def all[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def allLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def allLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def allSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def allSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def any[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def any[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def anyLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def anyLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def anySeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def anySeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  @JSName("apply")
  def apply[E](fn: js.Function, args: js.Any*): asyncLib.asyncMod.AsyncFunction[_, E] = js.native
  def applyEach(fns: js.Array[js.Function], argsAndCallback: js.Any*): scala.Unit = js.native
  def applyEachSeries(fns: js.Array[js.Function], argsAndCallback: js.Any*): scala.Unit = js.native
  def asyncify(fn: js.Function): js.Function1[/* repeated */ js.Any, _] = js.native
  def auto[R /* <: asyncLib.asyncMod.Dictionary[_] */, E](tasks: asyncLib.asyncMod.AsyncAutoTasks[R, E]): scala.Unit = js.native
  def auto[R /* <: asyncLib.asyncMod.Dictionary[_] */, E](
    tasks: asyncLib.asyncMod.AsyncAutoTasks[R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def auto[R /* <: asyncLib.asyncMod.Dictionary[_] */, E](tasks: asyncLib.asyncMod.AsyncAutoTasks[R, E], concurrency: scala.Double): scala.Unit = js.native
  def auto[R /* <: asyncLib.asyncMod.Dictionary[_] */, E](
    tasks: asyncLib.asyncMod.AsyncAutoTasks[R, E],
    concurrency: scala.Double,
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def autoInject[E](tasks: js.Any): scala.Unit = js.native
  def autoInject[E](tasks: js.Any, callback: asyncLib.asyncMod.AsyncResultCallback[_, E]): scala.Unit = js.native
  def cargo[E](
    worker: js.Function2[
      /* tasks */ js.Array[_], 
      /* callback */ asyncLib.asyncMod.ErrorCallback[E], 
      scala.Unit
    ]
  ): asyncLib.asyncMod.AsyncCargo = js.native
  def cargo[E](
    worker: js.Function2[
      /* tasks */ js.Array[_], 
      /* callback */ asyncLib.asyncMod.ErrorCallback[E], 
      scala.Unit
    ],
    payload: scala.Double
  ): asyncLib.asyncMod.AsyncCargo = js.native
  def compose(fns: js.Function*): js.Function = js.native
  def concat[T, R, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, js.Array[R], E]
  ): scala.Unit = js.native
  def concat[T, R, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, js.Array[R], E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def concatLimit[T, R, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, js.Array[R], E]
  ): scala.Unit = js.native
  def concatLimit[T, R, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, js.Array[R], E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def concatSeries[T, R, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, js.Array[R], E]
  ): scala.Unit = js.native
  def concatSeries[T, R, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, js.Array[R], E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def constant(values: js.Any*): js.Function = js.native
  def detect[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def detect[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[T, E]
  ): scala.Unit = js.native
  def detectLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def detectLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[T, E]
  ): scala.Unit = js.native
  def detectSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def detectSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[T, E]
  ): scala.Unit = js.native
  def dir(fn: js.Function, args: js.Any*): scala.Unit = js.native
  def doDuring[E](
    fn: asyncLib.asyncMod.AsyncVoidFunction[E],
    test: js.Function1[/* testCallback */ asyncLib.asyncMod.AsyncBooleanResultCallback[E], scala.Unit],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def doUntil[T, E](
    fn: asyncLib.asyncMod.AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, scala.Boolean],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def doWhilst[T, E](
    fn: asyncLib.asyncMod.AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, scala.Boolean],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def during[E](
    test: js.Function1[/* testCallback */ asyncLib.asyncMod.AsyncBooleanResultCallback[E], scala.Unit],
    fn: asyncLib.asyncMod.AsyncVoidFunction[E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def each[T, E](arr: asyncLib.asyncMod.IterableCollection[T], iterator: asyncLib.asyncMod.AsyncIterator[T, E]): scala.Unit = js.native
  def each[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def eachLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncIterator[T, E]
  ): scala.Unit = js.native
  def eachLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def eachOf[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E]
  ): scala.Unit = js.native
  def eachOf[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def eachOfLimit[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E]
  ): scala.Unit = js.native
  def eachOfLimit[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def eachOfSeries[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E]
  ): scala.Unit = js.native
  def eachOfSeries[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def eachSeries[T, E](arr: asyncLib.asyncMod.IterableCollection[T], iterator: asyncLib.asyncMod.AsyncIterator[T, E]): scala.Unit = js.native
  def eachSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def ensureAsync(fn: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Function = js.native
  def every[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def every[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def everyLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def everyLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def everySeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def everySeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def filter[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def filter[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def filterLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def filterLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def filterSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def filterSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def find[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def find[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[T, E]
  ): scala.Unit = js.native
  def findLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def findLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[T, E]
  ): scala.Unit = js.native
  def findSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def findSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[T, E]
  ): scala.Unit = js.native
  def foldl[T, R, E](arr: js.Array[T], memo: R, iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def foldl[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def foldl[T, R, E](arr: stdLib.IterableIterator[T], memo: R, iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def foldl[T, R, E](
    arr: stdLib.IterableIterator[T],
    memo: R,
    iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def foldr[T, R, E](arr: js.Array[T], memo: R, iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def foldr[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def foldr[T, R, E](arr: stdLib.IterableIterator[T], memo: R, iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def foldr[T, R, E](
    arr: stdLib.IterableIterator[T],
    memo: R,
    iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def forEach[T, E](arr: asyncLib.asyncMod.IterableCollection[T], iterator: asyncLib.asyncMod.AsyncIterator[T, E]): scala.Unit = js.native
  def forEach[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def forEachLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncIterator[T, E]
  ): scala.Unit = js.native
  def forEachLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def forEachOf[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E]
  ): scala.Unit = js.native
  def forEachOf[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def forEachOfLimit[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E]
  ): scala.Unit = js.native
  def forEachOfLimit[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def forEachOfSeries[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E]
  ): scala.Unit = js.native
  def forEachOfSeries[T, E](
    obj: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncForEachOfIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def forEachSeries[T, E](arr: asyncLib.asyncMod.IterableCollection[T], iterator: asyncLib.asyncMod.AsyncIterator[T, E]): scala.Unit = js.native
  def forEachSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncIterator[T, E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def forever[E](
    next: js.Function1[/* next */ asyncLib.asyncMod.ErrorCallback[E], scala.Unit],
    errBack: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def inject[T, R, E](arr: js.Array[T], memo: R, iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def inject[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def inject[T, R, E](arr: stdLib.IterableIterator[T], memo: R, iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def inject[T, R, E](
    arr: stdLib.IterableIterator[T],
    memo: R,
    iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def log(fn: js.Function, args: js.Any*): scala.Unit = js.native
  def map[T, R, E](arr: asyncLib.asyncMod.Dictionary[T], iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def map[T, R, E](
    arr: asyncLib.asyncMod.Dictionary[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def map[T, R, E](arr: js.Array[T], iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def map[T, R, E](
    arr: js.Array[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def map[T, R, E](arr: stdLib.IterableIterator[T], iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def map[T, R, E](
    arr: stdLib.IterableIterator[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def mapLimit[T, R, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E]
  ): scala.Unit = js.native
  def mapLimit[T, R, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def mapSeries[T, R, E](arr: asyncLib.asyncMod.Dictionary[T], iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def mapSeries[T, R, E](
    arr: asyncLib.asyncMod.Dictionary[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def mapSeries[T, R, E](arr: js.Array[T], iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def mapSeries[T, R, E](
    arr: js.Array[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def mapSeries[T, R, E](arr: stdLib.IterableIterator[T], iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def mapSeries[T, R, E](
    arr: stdLib.IterableIterator[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def mapValues[T, R, E](
    obj: asyncLib.asyncMod.Dictionary[T],
    iteratee: js.Function3[
      /* value */ T, 
      /* key */ java.lang.String, 
      /* callback */ asyncLib.asyncMod.AsyncResultCallback[R, E], 
      scala.Unit
    ],
    callback: asyncLib.asyncMod.AsyncResultObjectCallback[R, E]
  ): scala.Unit = js.native
  def mapValuesLimit[T, R, E](
    obj: asyncLib.asyncMod.Dictionary[T],
    limit: scala.Double,
    iteratee: js.Function3[
      /* value */ T, 
      /* key */ java.lang.String, 
      /* callback */ asyncLib.asyncMod.AsyncResultCallback[R, E], 
      scala.Unit
    ],
    callback: asyncLib.asyncMod.AsyncResultObjectCallback[R, E]
  ): scala.Unit = js.native
  def mapValuesSeries[T, R, E](
    obj: asyncLib.asyncMod.Dictionary[T],
    iteratee: js.Function3[
      /* value */ T, 
      /* key */ java.lang.String, 
      /* callback */ asyncLib.asyncMod.AsyncResultCallback[R, E], 
      scala.Unit
    ],
    callback: asyncLib.asyncMod.AsyncResultObjectCallback[R, E]
  ): scala.Unit = js.native
  def memoize(fn: js.Function): js.Function = js.native
  def memoize(fn: js.Function, hasher: js.Function): js.Function = js.native
  def nextTick(callback: js.Function, args: js.Any*): scala.Unit = js.native
  def parallel[T, E](tasks: asyncLib.asyncMod.Dictionary[asyncLib.asyncMod.AsyncFunction[T, E]]): scala.Unit = js.native
  def parallel[T, E](
    tasks: asyncLib.asyncMod.Dictionary[asyncLib.asyncMod.AsyncFunction[T, E]],
    callback: asyncLib.asyncMod.AsyncResultObjectCallback[T, E]
  ): scala.Unit = js.native
  def parallel[T, E](tasks: js.Array[asyncLib.asyncMod.AsyncFunction[T, E]]): scala.Unit = js.native
  def parallel[T, E](
    tasks: js.Array[asyncLib.asyncMod.AsyncFunction[T, E]],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def parallelLimit[T, E](tasks: asyncLib.asyncMod.Dictionary[asyncLib.asyncMod.AsyncFunction[T, E]], limit: scala.Double): scala.Unit = js.native
  def parallelLimit[T, E](
    tasks: asyncLib.asyncMod.Dictionary[asyncLib.asyncMod.AsyncFunction[T, E]],
    limit: scala.Double,
    callback: asyncLib.asyncMod.AsyncResultObjectCallback[T, E]
  ): scala.Unit = js.native
  def parallelLimit[T, E](tasks: js.Array[asyncLib.asyncMod.AsyncFunction[T, E]], limit: scala.Double): scala.Unit = js.native
  def parallelLimit[T, E](
    tasks: js.Array[asyncLib.asyncMod.AsyncFunction[T, E]],
    limit: scala.Double,
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def priorityQueue[T, E](worker: asyncLib.asyncMod.AsyncWorker[T, E], concurrency: scala.Double): asyncLib.asyncMod.AsyncPriorityQueue[T] = js.native
  def queue[T, E](worker: asyncLib.asyncMod.AsyncWorker[T, E]): asyncLib.asyncMod.AsyncQueue[T] = js.native
  def queue[T, E](worker: asyncLib.asyncMod.AsyncWorker[T, E], concurrency: scala.Double): asyncLib.asyncMod.AsyncQueue[T] = js.native
  @JSName("queue")
  def queue_TRE[T, R, E](worker: asyncLib.asyncMod.AsyncResultIterator[T, R, E]): asyncLib.asyncMod.AsyncQueue[T] = js.native
  @JSName("queue")
  def queue_TRE[T, R, E](worker: asyncLib.asyncMod.AsyncResultIterator[T, R, E], concurrency: scala.Double): asyncLib.asyncMod.AsyncQueue[T] = js.native
  def race[T, E](
    tasks: js.Array[asyncLib.asyncMod.AsyncFunction[T, E]],
    callback: asyncLib.asyncMod.AsyncResultCallback[T, E]
  ): scala.Unit = js.native
  def reduce[T, R, E](arr: js.Array[T], memo: R, iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def reduce[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def reduce[T, R, E](arr: stdLib.IterableIterator[T], memo: R, iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def reduce[T, R, E](
    arr: stdLib.IterableIterator[T],
    memo: R,
    iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def reduceRight[T, R, E](arr: js.Array[T], memo: R, iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def reduceRight[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def reduceRight[T, R, E](arr: stdLib.IterableIterator[T], memo: R, iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def reduceRight[T, R, E](
    arr: stdLib.IterableIterator[T],
    memo: R,
    iterator: asyncLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: asyncLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def reflect[T, E](fn: asyncLib.asyncMod.AsyncFunction[T, E]): js.Function1[
    /* callback */ js.Function2[/* err */ scala.Null, /* result */ asyncLib.Anon_Error[E, T], scala.Unit], 
    scala.Unit
  ] = js.native
  def reflectAll[T, E](tasks: js.Array[asyncLib.asyncMod.AsyncFunction[T, E]]): js.Array[
    js.Function1[
      /* callback */ js.Function2[/* err */ scala.Null, /* result */ asyncLib.Anon_Error[E, T], scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  def reject[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def reject[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def rejectLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def rejectLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def rejectSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def rejectSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def retry[T, E](
    opts: asyncLib.Anon_Times,
    task: js.Function2[
      /* callback */ asyncLib.asyncMod.AsyncResultCallback[T, E], 
      /* results */ js.Any, 
      scala.Unit
    ],
    callback: asyncLib.asyncMod.AsyncResultCallback[_, E]
  ): scala.Unit = js.native
  def retry[T, E](
    opts: scala.Double,
    task: js.Function2[
      /* callback */ asyncLib.asyncMod.AsyncResultCallback[T, E], 
      /* results */ js.Any, 
      scala.Unit
    ],
    callback: asyncLib.asyncMod.AsyncResultCallback[_, E]
  ): scala.Unit = js.native
  def retryable[T, E](opts: asyncLib.Anon_TimesInterval, task: asyncLib.asyncMod.AsyncFunction[T, E]): asyncLib.asyncMod.AsyncFunction[T, E] = js.native
  def retryable[T, E](opts: scala.Double, task: asyncLib.asyncMod.AsyncFunction[T, E]): asyncLib.asyncMod.AsyncFunction[T, E] = js.native
  def select[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def select[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def selectLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def selectLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def selectSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def selectSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def seq(fns: js.Function*): js.Function = js.native
  def series[T, E](tasks: asyncLib.asyncMod.Dictionary[asyncLib.asyncMod.AsyncFunction[T, E]]): scala.Unit = js.native
  def series[T, E](
    tasks: asyncLib.asyncMod.Dictionary[asyncLib.asyncMod.AsyncFunction[T, E]],
    callback: asyncLib.asyncMod.AsyncResultObjectCallback[T, E]
  ): scala.Unit = js.native
  def series[T, E](tasks: js.Array[asyncLib.asyncMod.AsyncFunction[T, E]]): scala.Unit = js.native
  def series[T, E](
    tasks: js.Array[asyncLib.asyncMod.AsyncFunction[T, E]],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def setImmediate(callback: js.Function, args: js.Any*): scala.Unit = js.native
  def some[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def some[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def someLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def someLimit[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def someSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def someSeries[T, E](
    arr: asyncLib.asyncMod.IterableCollection[T],
    iterator: asyncLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: asyncLib.asyncMod.AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def sortBy[T, V, E](arr: js.Array[T], iterator: asyncLib.asyncMod.AsyncResultIterator[T, V, E]): scala.Unit = js.native
  def sortBy[T, V, E](
    arr: js.Array[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, V, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def sortBy[T, V, E](arr: stdLib.IterableIterator[T], iterator: asyncLib.asyncMod.AsyncResultIterator[T, V, E]): scala.Unit = js.native
  def sortBy[T, V, E](
    arr: stdLib.IterableIterator[T],
    iterator: asyncLib.asyncMod.AsyncResultIterator[T, V, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def timeout[T, E](fn: asyncLib.asyncMod.AsyncFunction[T, E], milliseconds: scala.Double): asyncLib.asyncMod.AsyncFunction[T, E] = js.native
  def timeout[T, E](fn: asyncLib.asyncMod.AsyncFunction[T, E], milliseconds: scala.Double, info: js.Any): asyncLib.asyncMod.AsyncFunction[T, E] = js.native
  def timeout[T, R, E](fn: asyncLib.asyncMod.AsyncResultIterator[T, R, E], milliseconds: scala.Double): asyncLib.asyncMod.AsyncResultIterator[T, R, E] = js.native
  def timeout[T, R, E](fn: asyncLib.asyncMod.AsyncResultIterator[T, R, E], milliseconds: scala.Double, info: js.Any): asyncLib.asyncMod.AsyncResultIterator[T, R, E] = js.native
  def times[T, E](
    n: scala.Double,
    iterator: asyncLib.asyncMod.AsyncResultIterator[scala.Double, T, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def timesLimit[T, E](
    n: scala.Double,
    limit: scala.Double,
    iterator: asyncLib.asyncMod.AsyncResultIterator[scala.Double, T, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def timesSeries[T, E](
    n: scala.Double,
    iterator: asyncLib.asyncMod.AsyncResultIterator[scala.Double, T, E],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: js.Array[T],
    acc: js.Array[R],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ scala.Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: js.Array[T],
    acc: js.Array[R],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ scala.Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: js.Array[T],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ scala.Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: js.Array[T],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ scala.Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ],
    callback: asyncLib.asyncMod.AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: org.scalablytyped.runtime.StringDictionary[T],
    acc: org.scalablytyped.runtime.StringDictionary[R],
    iteratee: js.Function4[
      /* acc */ org.scalablytyped.runtime.StringDictionary[R], 
      /* item */ T, 
      /* key */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: org.scalablytyped.runtime.StringDictionary[T],
    acc: org.scalablytyped.runtime.StringDictionary[R],
    iteratee: js.Function4[
      /* acc */ org.scalablytyped.runtime.StringDictionary[R], 
      /* item */ T, 
      /* key */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ],
    callback: asyncLib.asyncMod.AsyncResultObjectCallback[T, E]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: org.scalablytyped.runtime.StringDictionary[T],
    iteratee: js.Function4[
      /* acc */ org.scalablytyped.runtime.StringDictionary[R], 
      /* item */ T, 
      /* key */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def transform[T, R, E](
    arr: org.scalablytyped.runtime.StringDictionary[T],
    iteratee: js.Function4[
      /* acc */ org.scalablytyped.runtime.StringDictionary[R], 
      /* item */ T, 
      /* key */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], scala.Unit], 
      scala.Unit
    ],
    callback: asyncLib.asyncMod.AsyncResultObjectCallback[T, E]
  ): scala.Unit = js.native
  def unmemoize(fn: js.Function): js.Function = js.native
  def until[E](
    test: js.Function0[scala.Boolean],
    fn: asyncLib.asyncMod.AsyncVoidFunction[E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def waterfall[T, E](tasks: js.Array[js.Function]): scala.Unit = js.native
  def waterfall[T, E](tasks: js.Array[js.Function], callback: asyncLib.asyncMod.AsyncResultCallback[T, E]): scala.Unit = js.native
  def whilst[E](
    test: js.Function0[scala.Boolean],
    fn: asyncLib.asyncMod.AsyncVoidFunction[E],
    callback: asyncLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def wrapSync(fn: js.Function): js.Function = js.native
}

