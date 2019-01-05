package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "util")
@js.native
object utilNs extends js.Object {
  @js.native
  class TextDecoder ()
    extends nodeLib.utilMod.TextDecoder {
    def this(encoding: java.lang.String) = this()
    def this(encoding: java.lang.String, options: nodeLib.Anon_Fatal) = this()
  }
  
  @js.native
  class TextEncoder ()
    extends nodeLib.utilMod.TextEncoder
  
  val inspect: nodeLib.Anon_Object = js.native
  def callbackify(fn: js.Function0[js.Promise[scala.Unit]]): js.Function1[
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[T1](fn: js.Function1[/* arg1 */ T1, js.Promise[scala.Unit]]): js.Function2[
    /* arg1 */ T1, 
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[T1, T2](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[scala.Unit]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[T1, T2, T3](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[scala.Unit]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[T1, T2, T3, T4](
    fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[scala.Unit]]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[T1, T2, T3, T4, T5](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      js.Promise[scala.Unit]
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  def callbackify[T1, T2, T3, T4, T5, T6](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      js.Promise[scala.Unit]
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2T3T4T5T6TResult[T1, T2, T3, T4, T5, T6, TResult](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      js.Promise[TResult]
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2T3T4T5TResult[T1, T2, T3, T4, T5, TResult](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      js.Promise[TResult]
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2T3T4TResult[T1, T2, T3, T4, TResult](fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[TResult]]): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2T3TResult[T1, T2, T3, TResult](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[TResult]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1T2TResult[T1, T2, TResult](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[TResult]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_T1TResult[T1, TResult](fn: js.Function1[/* arg1 */ T1, js.Promise[TResult]]): js.Function2[
    /* arg1 */ T1, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  @JSName("callbackify")
  def callbackify_TResult[TResult](fn: js.Function0[js.Promise[TResult]]): js.Function1[
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ TResult, scala.Unit], 
    scala.Unit
  ] = js.native
  /** @deprecated since v0.11.3 - use `console.error()` instead. */
  def debug(string: java.lang.String): scala.Unit = js.native
  def debuglog(key: java.lang.String): js.Function2[/* msg */ java.lang.String, /* repeated */ js.Any, scala.Unit] = js.native
  def deprecate[T /* <: js.Function */](fn: T, message: java.lang.String): T = js.native
  /** @deprecated since v0.11.3 - use `console.error()` instead. */
  def error(param: js.Any*): scala.Unit = js.native
  def format(format: js.Any, param: js.Any*): java.lang.String = js.native
  def formatWithOptions(inspectOptions: nodeLib.utilMod.InspectOptions, format: java.lang.String, param: js.Any*): java.lang.String = js.native
  def inherits(constructor: js.Any, superConstructor: js.Any): scala.Unit = js.native
  /** @deprecated since v4.0.0 - use `Array.isArray()` instead. */
  def isArray(`object`: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'boolean'` instead. */
  def isBoolean(`object`: js.Any): /* is boolean */ scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `Buffer.isBuffer()` instead. */
  def isBuffer(`object`: js.Any): /* is node.Buffer */ scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `util.types.isDate()` instead. */
  def isDate(`object`: js.Any): /* is std.Date */ scala.Boolean = js.native
  def isDeepStrictEqual(val1: js.Any, val2: js.Any): scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `util.types.isNativeError()` instead. */
  def isError(`object`: js.Any): /* is node.Error */ scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'function'` instead. */
  def isFunction(`object`: js.Any): scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `value === null` instead. */
  def isNull(`object`: js.Any): /* is null */ scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `value === null || value === undefined` instead. */
  def isNullOrUndefined(`object`: js.Any): scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'number'` instead. */
  def isNumber(`object`: js.Any): /* is number */ scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `value !== null && typeof value === 'object'` instead. */
  def isObject(`object`: js.Any): scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `(typeof value !== 'object' && typeof value !== 'function') || value === null` instead. */
  def isPrimitive(`object`: js.Any): scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `util.types.isRegExp()` instead. */
  def isRegExp(`object`: js.Any): /* is std.RegExp */ scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'string'` instead. */
  def isString(`object`: js.Any): /* is string */ scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `typeof value === 'symbol'` instead. */
  def isSymbol(`object`: js.Any): /* is symbol */ scala.Boolean = js.native
  /** @deprecated since v4.0.0 - use `value === undefined` instead. */
  def isUndefined(`object`: js.Any): /* is undefined */ scala.Boolean = js.native
  /** @deprecated since v0.11.3 - use a third party module instead. */
  def log(string: java.lang.String): scala.Unit = js.native
  /** @deprecated since v0.11.3 - use `console.log()` instead. */
  def print(param: js.Any*): scala.Unit = js.native
  def promisify(fn: js.Function): js.Function = js.native
  def promisify(
    fn: js.Function1[
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): js.Function0[js.Promise[scala.Unit]] = js.native
  def promisify[T1](
    fn: js.Function2[
      /* arg1 */ T1, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* arg1 */ T1, js.Promise[scala.Unit]] = js.native
  def promisify[TCustom /* <: js.Function */](fn: nodeLib.utilMod.CustomPromisify[TCustom]): TCustom = js.native
  def promisify[T1, T2](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[scala.Unit]] = js.native
  def promisify[T1, T2, T3](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[scala.Unit]] = js.native
  def promisify[T1, T2, T3, T4](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[scala.Unit]] = js.native
  def promisify[T1, T2, T3, T4, T5](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    js.Promise[scala.Unit]
  ] = js.native
  @JSName("promisify")
  def promisify_T1T2T3T4T5TResult[T1, T2, T3, T4, T5, TResult](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ TResult, scala.Unit], 
      scala.Unit
    ]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    js.Promise[TResult]
  ] = js.native
  @JSName("promisify")
  def promisify_T1T2T3T4TResult[T1, T2, T3, T4, TResult](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ TResult, scala.Unit], 
      scala.Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[TResult]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3TResult[T1, T2, T3, TResult](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ TResult, scala.Unit], 
      scala.Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[TResult]] = js.native
  @JSName("promisify")
  def promisify_T1T2TResult[T1, T2, TResult](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ TResult, scala.Unit], 
      scala.Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[TResult]] = js.native
  @JSName("promisify")
  def promisify_T1TResult[T1, TResult](
    fn: js.Function2[
      /* arg1 */ T1, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ TResult, scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* arg1 */ T1, js.Promise[TResult]] = js.native
  @JSName("promisify")
  def promisify_TResult[TResult](
    fn: js.Function1[
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ TResult, scala.Unit], 
      scala.Unit
    ]
  ): js.Function0[js.Promise[TResult]] = js.native
  /** @deprecated since v0.11.3 - use `console.log()` instead. */
  def puts(param: js.Any*): scala.Unit = js.native
  @JSName("promisify")
  @js.native
  object promisifyNs extends js.Object {
    val custom: js.Symbol = js.native
  }
  
  @JSName("types")
  @js.native
  object typesNs extends js.Object {
    def isAnyArrayBuffer(`object`: js.Any): scala.Boolean = js.native
    def isArgumentsObject(`object`: js.Any): /* is std.IArguments */ scala.Boolean = js.native
    def isArrayBuffer(`object`: js.Any): /* is std.ArrayBuffer */ scala.Boolean = js.native
    def isAsyncFunction(`object`: js.Any): scala.Boolean = js.native
    def isBooleanObject(`object`: js.Any): /* is std.Boolean */ scala.Boolean = js.native
    def isBoxedPrimitive(`object`: js.Any): scala.Boolean = js.native
    def isDataView(`object`: js.Any): /* is std.DataView */ scala.Boolean = js.native
    def isDate(`object`: js.Any): /* is std.Date */ scala.Boolean = js.native
    def isExternal(`object`: js.Any): scala.Boolean = js.native
    def isFloat32Array(`object`: js.Any): /* is std.Float32Array */ scala.Boolean = js.native
    def isFloat64Array(`object`: js.Any): /* is std.Float64Array */ scala.Boolean = js.native
    def isGeneratorFunction(`object`: js.Any): scala.Boolean = js.native
    def isGeneratorObject(`object`: js.Any): scala.Boolean = js.native
    def isInt16Array(`object`: js.Any): /* is std.Int16Array */ scala.Boolean = js.native
    def isInt32Array(`object`: js.Any): /* is std.Int32Array */ scala.Boolean = js.native
    def isInt8Array(`object`: js.Any): /* is std.Int8Array */ scala.Boolean = js.native
    def isMap(`object`: js.Any): scala.Boolean = js.native
    def isMapIterator(`object`: js.Any): scala.Boolean = js.native
    def isNativeError(`object`: js.Any): /* is node.Error */ scala.Boolean = js.native
    def isNumberObject(`object`: js.Any): /* is std.Number */ scala.Boolean = js.native
    def isPromise(`object`: js.Any): scala.Boolean = js.native
    def isProxy(`object`: js.Any): scala.Boolean = js.native
    def isRegExp(`object`: js.Any): /* is std.RegExp */ scala.Boolean = js.native
    def isSet(`object`: js.Any): scala.Boolean = js.native
    def isSetIterator(`object`: js.Any): scala.Boolean = js.native
    def isSharedArrayBuffer(`object`: js.Any): scala.Boolean = js.native
    def isStringObject(`object`: js.Any): scala.Boolean = js.native
    def isSymbolObject(`object`: js.Any): scala.Boolean = js.native
    def isTypedArray(`object`: js.Any): /* is node.NodeJS.TypedArray */ scala.Boolean = js.native
    def isUint16Array(`object`: js.Any): /* is std.Uint16Array */ scala.Boolean = js.native
    def isUint32Array(`object`: js.Any): /* is std.Uint32Array */ scala.Boolean = js.native
    def isUint8Array(`object`: js.Any): /* is std.Uint8Array */ scala.Boolean = js.native
    def isUint8ClampedArray(`object`: js.Any): /* is std.Uint8ClampedArray */ scala.Boolean = js.native
    def isWeakMap(`object`: js.Any): scala.Boolean = js.native
    def isWeakSet(`object`: js.Any): scala.Boolean = js.native
    def isWebAssemblyCompiledModule(`object`: js.Any): scala.Boolean = js.native
  }
  
}

