package typings
package asyncLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", JSImport.Namespace)
@js.native
object asyncModMembers extends js.Object {
  val all: asyncLib.Anon_ArrIteratorCallbackTE = js.native
  val allLimit: asyncLib.Anon_ArrLimitIteratorCallbackT = js.native
  val allSeries: asyncLib.Anon_ArrIteratorCallbackTE = js.native
  val any: asyncLib.Anon_ArrIteratorCallbackTE = js.native
  val anyLimit: asyncLib.Anon_ArrLimitIteratorCallbackT = js.native
  val anySeries: asyncLib.Anon_ArrIteratorCallbackTE = js.native
  val concatSeries: asyncLib.Anon_ArrIteratorCallbackTR = js.native
  val detectSeries: asyncLib.Anon_ArrIteratorCallbackT = js.native
  val eachOf: asyncLib.Anon_Obj = js.native
  val eachOfLimit: asyncLib.Anon_ObjLimit = js.native
  val eachOfSeries: asyncLib.Anon_Obj = js.native
  val eachSeries: asyncLib.Anon_Arr = js.native
  val everySeries: asyncLib.Anon_ArrIteratorCallbackTE = js.native
  val filterSeries: asyncLib.Anon_ArrIteratorCallback = js.native
  val find: asyncLib.Anon_ArrIteratorCallbackT = js.native
  val findLimit: asyncLib.Anon_ArrLimitIteratorCallback = js.native
  val findSeries: asyncLib.Anon_ArrIteratorCallbackT = js.native
  val foldl: asyncLib.Anon_ArrMemo = js.native
  val foldr: asyncLib.Anon_ArrMemo = js.native
  val forEach: asyncLib.Anon_Arr = js.native
  val forEachLimit: asyncLib.Anon_ArrLimit = js.native
  val forEachOfSeries: asyncLib.Anon_Obj = js.native
  val forEachSeries: asyncLib.Anon_Arr = js.native
  val inject: asyncLib.Anon_ArrMemo = js.native
  val mapSeries: asyncLib.Anon_ArrIterator = js.native
  val mapValuesSeries: asyncLib.Anon_ObjIteratee = js.native
  val reduceRight: asyncLib.Anon_ArrMemo = js.native
  val reject: asyncLib.Anon_ArrIteratorCallback = js.native
  val rejectLimit: asyncLib.Anon_ArrLimitIterator = js.native
  val rejectSeries: asyncLib.Anon_ArrIteratorCallback = js.native
  val select: asyncLib.Anon_ArrIteratorCallback = js.native
  val selectLimit: asyncLib.Anon_ArrLimitIterator = js.native
  val selectSeries: asyncLib.Anon_ArrIteratorCallback = js.native
  val setImmediate: js.Function2[/* callback */ js.Function, /* repeated */ js.Any, scala.Unit] = js.native
  val someSeries: asyncLib.Anon_ArrIteratorCallbackTE = js.native
  @JSName("apply")
  def apply[E](fn: js.Function, args: js.Any*): AsyncFunction[_, E] = js.native
  def applyEach(fns: js.Array[js.Function], argsAndCallback: js.Any*): scala.Unit = js.native
  def applyEachSeries(fns: js.Array[js.Function], argsAndCallback: js.Any*): scala.Unit = js.native
  def asyncify(fn: js.Function): js.Function1[/* repeated */ js.Any, _] = js.native
  def auto[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E]): scala.Unit = js.native
  def auto[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E], callback: AsyncResultCallback[R, E]): scala.Unit = js.native
  def auto[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E], concurrency: scala.Double): scala.Unit = js.native
  def auto[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E], concurrency: scala.Double, callback: AsyncResultCallback[R, E]): scala.Unit = js.native
  def autoInject[E](tasks: js.Any): scala.Unit = js.native
  def autoInject[E](tasks: js.Any, callback: AsyncResultCallback[_, E]): scala.Unit = js.native
  def cargo[E](worker: js.Function2[/* tasks */ js.Array[_], /* callback */ ErrorCallback[E], scala.Unit]): AsyncCargo = js.native
  def cargo[E](
    worker: js.Function2[/* tasks */ js.Array[_], /* callback */ ErrorCallback[E], scala.Unit],
    payload: scala.Double
  ): AsyncCargo = js.native
  def compose(fns: js.Function*): js.Function = js.native
  def concat[T, R, E](arr: IterableCollection[T], iterator: AsyncResultIterator[T, js.Array[R], E]): scala.Unit = js.native
  def concat[T, R, E](
    arr: IterableCollection[T],
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def concatLimit[T, R, E](arr: IterableCollection[T], limit: scala.Double, iterator: AsyncResultIterator[T, js.Array[R], E]): scala.Unit = js.native
  def concatLimit[T, R, E](
    arr: IterableCollection[T],
    limit: scala.Double,
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def constant(values: js.Any*): js.Function = js.native
  def detect[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): scala.Unit = js.native
  def detect[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): scala.Unit = js.native
  def detectLimit[T, E](arr: IterableCollection[T], limit: scala.Double, iterator: AsyncBooleanIterator[T, E]): scala.Unit = js.native
  def detectLimit[T, E](
    arr: IterableCollection[T],
    limit: scala.Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): scala.Unit = js.native
  def dir(fn: js.Function, args: js.Any*): scala.Unit = js.native
  def doDuring[E](
    fn: AsyncVoidFunction[E],
    test: js.Function1[/* testCallback */ AsyncBooleanResultCallback[E], scala.Unit],
    callback: ErrorCallback[E]
  ): scala.Unit = js.native
  def doUntil[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, scala.Boolean],
    callback: ErrorCallback[E]
  ): scala.Unit = js.native
  def doWhilst[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, scala.Boolean],
    callback: ErrorCallback[E]
  ): scala.Unit = js.native
  def during[E](
    test: js.Function1[/* testCallback */ AsyncBooleanResultCallback[E], scala.Unit],
    fn: AsyncVoidFunction[E],
    callback: ErrorCallback[E]
  ): scala.Unit = js.native
  def each[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): scala.Unit = js.native
  def each[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): scala.Unit = js.native
  def eachLimit[T, E](arr: IterableCollection[T], limit: scala.Double, iterator: AsyncIterator[T, E]): scala.Unit = js.native
  def eachLimit[T, E](
    arr: IterableCollection[T],
    limit: scala.Double,
    iterator: AsyncIterator[T, E],
    callback: ErrorCallback[E]
  ): scala.Unit = js.native
  def ensureAsync(fn: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Function = js.native
  def every[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): scala.Unit = js.native
  def every[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def everyLimit[T, E](arr: IterableCollection[T], limit: scala.Double, iterator: AsyncBooleanIterator[T, E]): scala.Unit = js.native
  def everyLimit[T, E](
    arr: IterableCollection[T],
    limit: scala.Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def filter[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): scala.Unit = js.native
  def filter[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def filterLimit[T, E](arr: IterableCollection[T], limit: scala.Double, iterator: AsyncBooleanIterator[T, E]): scala.Unit = js.native
  def filterLimit[T, E](
    arr: IterableCollection[T],
    limit: scala.Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def forEachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): scala.Unit = js.native
  def forEachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): scala.Unit = js.native
  def forEachOfLimit[T, E](obj: IterableCollection[T], limit: scala.Double, iterator: AsyncForEachOfIterator[T, E]): scala.Unit = js.native
  def forEachOfLimit[T, E](
    obj: IterableCollection[T],
    limit: scala.Double,
    iterator: AsyncForEachOfIterator[T, E],
    callback: ErrorCallback[E]
  ): scala.Unit = js.native
  def forever[E](next: js.Function1[/* next */ ErrorCallback[E], scala.Unit], errBack: ErrorCallback[E]): scala.Unit = js.native
  def log(fn: js.Function, args: js.Any*): scala.Unit = js.native
  def map[T, R, E](arr: Dictionary[T], iterator: AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def map[T, R, E](
    arr: Dictionary[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def map[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def map[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E], callback: AsyncResultArrayCallback[R, E]): scala.Unit = js.native
  def map[T, R, E](arr: stdLib.IterableIterator[T], iterator: AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def map[T, R, E](
    arr: stdLib.IterableIterator[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def mapLimit[T, R, E](arr: IterableCollection[T], limit: scala.Double, iterator: AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def mapLimit[T, R, E](
    arr: IterableCollection[T],
    limit: scala.Double,
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def mapValues[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[
      /* value */ T, 
      /* key */ java.lang.String, 
      /* callback */ AsyncResultCallback[R, E], 
      scala.Unit
    ],
    callback: AsyncResultObjectCallback[R, E]
  ): scala.Unit = js.native
  def mapValuesLimit[T, R, E](
    obj: Dictionary[T],
    limit: scala.Double,
    iteratee: js.Function3[
      /* value */ T, 
      /* key */ java.lang.String, 
      /* callback */ AsyncResultCallback[R, E], 
      scala.Unit
    ],
    callback: AsyncResultObjectCallback[R, E]
  ): scala.Unit = js.native
  def memoize(fn: js.Function): js.Function = js.native
  def memoize(fn: js.Function, hasher: js.Function): js.Function = js.native
  def nextTick(callback: js.Function, args: js.Any*): scala.Unit = js.native
  def parallel[T, E](tasks: Dictionary[AsyncFunction[T, E]]): scala.Unit = js.native
  def parallel[T, E](tasks: Dictionary[AsyncFunction[T, E]], callback: AsyncResultObjectCallback[T, E]): scala.Unit = js.native
  def parallel[T, E](tasks: js.Array[AsyncFunction[T, E]]): scala.Unit = js.native
  def parallel[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultArrayCallback[T, E]): scala.Unit = js.native
  def parallelLimit[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: scala.Double): scala.Unit = js.native
  def parallelLimit[T, E](
    tasks: Dictionary[AsyncFunction[T, E]],
    limit: scala.Double,
    callback: AsyncResultObjectCallback[T, E]
  ): scala.Unit = js.native
  def parallelLimit[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: scala.Double): scala.Unit = js.native
  def parallelLimit[T, E](
    tasks: js.Array[AsyncFunction[T, E]],
    limit: scala.Double,
    callback: AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def priorityQueue[T, E](worker: AsyncWorker[T, E], concurrency: scala.Double): AsyncPriorityQueue[T] = js.native
  def queue[T, E](worker: AsyncWorker[T, E]): AsyncQueue[T] = js.native
  def queue[T, E](worker: AsyncWorker[T, E], concurrency: scala.Double): AsyncQueue[T] = js.native
  @JSName("queue")
  def queue_TRE[T, R, E](worker: AsyncResultIterator[T, R, E]): AsyncQueue[T] = js.native
  @JSName("queue")
  def queue_TRE[T, R, E](worker: AsyncResultIterator[T, R, E], concurrency: scala.Double): AsyncQueue[T] = js.native
  def race[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultCallback[T, E]): scala.Unit = js.native
  def reduce[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def reduce[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def reduce[T, R, E](arr: stdLib.IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def reduce[T, R, E](
    arr: stdLib.IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def reflect[T, E](fn: AsyncFunction[T, E]): js.Function1[
    /* callback */ js.Function2[/* err */ scala.Null, /* result */ asyncLib.Anon_Error[E, T], scala.Unit], 
    scala.Unit
  ] = js.native
  def reflectAll[T, E](tasks: js.Array[AsyncFunction[T, E]]): js.Array[
    js.Function1[
      /* callback */ js.Function2[/* err */ scala.Null, /* result */ asyncLib.Anon_Error[E, T], scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  def retry[T, E](
    opts: asyncLib.Anon_Times,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, scala.Unit],
    callback: AsyncResultCallback[_, E]
  ): scala.Unit = js.native
  def retry[T, E](
    opts: scala.Double,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, scala.Unit],
    callback: AsyncResultCallback[_, E]
  ): scala.Unit = js.native
  def retryable[T, E](opts: asyncLib.Anon_TimesInterval, task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
  def retryable[T, E](opts: scala.Double, task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
  def seq(fns: js.Function*): js.Function = js.native
  def series[T, E](tasks: Dictionary[AsyncFunction[T, E]]): scala.Unit = js.native
  def series[T, E](tasks: Dictionary[AsyncFunction[T, E]], callback: AsyncResultObjectCallback[T, E]): scala.Unit = js.native
  def series[T, E](tasks: js.Array[AsyncFunction[T, E]]): scala.Unit = js.native
  def series[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultArrayCallback[T, E]): scala.Unit = js.native
  def some[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): scala.Unit = js.native
  def some[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def someLimit[T, E](arr: IterableCollection[T], limit: scala.Double, iterator: AsyncBooleanIterator[T, E]): scala.Unit = js.native
  def someLimit[T, E](
    arr: IterableCollection[T],
    limit: scala.Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): scala.Unit = js.native
  def sortBy[T, V, E](arr: js.Array[T], iterator: AsyncResultIterator[T, V, E]): scala.Unit = js.native
  def sortBy[T, V, E](arr: js.Array[T], iterator: AsyncResultIterator[T, V, E], callback: AsyncResultArrayCallback[T, E]): scala.Unit = js.native
  def sortBy[T, V, E](arr: stdLib.IterableIterator[T], iterator: AsyncResultIterator[T, V, E]): scala.Unit = js.native
  def sortBy[T, V, E](
    arr: stdLib.IterableIterator[T],
    iterator: AsyncResultIterator[T, V, E],
    callback: AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def timeout[T, E](fn: AsyncFunction[T, E], milliseconds: scala.Double): AsyncFunction[T, E] = js.native
  def timeout[T, E](fn: AsyncFunction[T, E], milliseconds: scala.Double, info: js.Any): AsyncFunction[T, E] = js.native
  def timeout[T, R, E](fn: AsyncResultIterator[T, R, E], milliseconds: scala.Double): AsyncResultIterator[T, R, E] = js.native
  def timeout[T, R, E](fn: AsyncResultIterator[T, R, E], milliseconds: scala.Double, info: js.Any): AsyncResultIterator[T, R, E] = js.native
  def times[T, E](
    n: scala.Double,
    iterator: AsyncResultIterator[scala.Double, T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def timesLimit[T, E](
    n: scala.Double,
    limit: scala.Double,
    iterator: AsyncResultIterator[scala.Double, T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): scala.Unit = js.native
  def timesSeries[T, E](
    n: scala.Double,
    iterator: AsyncResultIterator[scala.Double, T, E],
    callback: AsyncResultArrayCallback[T, E]
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
    callback: AsyncResultArrayCallback[T, E]
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
    callback: AsyncResultArrayCallback[T, E]
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
    callback: AsyncResultObjectCallback[T, E]
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
    callback: AsyncResultObjectCallback[T, E]
  ): scala.Unit = js.native
  def unmemoize(fn: js.Function): js.Function = js.native
  def until[E](test: js.Function0[scala.Boolean], fn: AsyncVoidFunction[E], callback: ErrorCallback[E]): scala.Unit = js.native
  def waterfall[T, E](tasks: js.Array[js.Function]): scala.Unit = js.native
  def waterfall[T, E](tasks: js.Array[js.Function], callback: AsyncResultCallback[T, E]): scala.Unit = js.native
  def whilst[E](test: js.Function0[scala.Boolean], fn: AsyncVoidFunction[E], callback: ErrorCallback[E]): scala.Unit = js.native
  def wrapSync(fn: js.Function): js.Function = js.native
}

