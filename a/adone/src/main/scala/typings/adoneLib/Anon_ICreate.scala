package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ICreate extends js.Object {
  val DROPPED: js.Symbol = js.native
  val INs: js.Any = js.native
  var RateLimiter: org.scalablytyped.runtime.Instantiable3[
    /* tokensPerInterval */ js.UndefOr[/* tokensPerInterval */ scala.Double], 
    /* interval */ js.UndefOr[/* interval */ scala.Double], 
    /* fireImmediately */ js.UndefOr[/* fireImmediately */ scala.Boolean], 
    adoneLib.adoneNs.utilNs.throttleNs.RateLimiter
  ] = js.native
  def create(): adoneLib.adoneNs.utilNs.throttleNs.INs.CreateFunction = js.native
  def create(options: adoneLib.adoneNs.utilNs.throttleNs.INs.Options): adoneLib.adoneNs.utilNs.throttleNs.INs.CreateFunction = js.native
  def create[R](fn: js.Function0[R]): js.Function0[js.Promise[R]] = js.native
  def create[R](fn: js.Function0[R], options: adoneLib.adoneNs.utilNs.throttleNs.INs.Options): js.Function0[js.Promise[R]] = js.native
  def create[R](fn: js.Function1[/* repeated */ js.Any, R]): js.Function1[/* repeated */ js.Any, js.Promise[R]] = js.native
  def create[R](
    fn: js.Function1[/* repeated */ js.Any, R],
    options: adoneLib.adoneNs.utilNs.throttleNs.INs.Options
  ): js.Function1[/* repeated */ js.Any, js.Promise[R]] = js.native
  def create[T1, T2, R](fn: js.Function2[/* a */ T1, /* b */ T2, R]): js.Function2[/* a */ T1, /* b */ T2, js.Promise[R]] = js.native
  def create[T1, T2, R](
    fn: js.Function2[/* a */ T1, /* b */ T2, R],
    options: adoneLib.adoneNs.utilNs.throttleNs.INs.Options
  ): js.Function2[/* a */ T1, /* b */ T2, js.Promise[R]] = js.native
  def create[T1, T2, T3, R](fn: js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R]): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[R]] = js.native
  def create[T1, T2, T3, R](
    fn: js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R],
    options: adoneLib.adoneNs.utilNs.throttleNs.INs.Options
  ): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[R]] = js.native
  def create[T1, T2, T3, T4, R](fn: js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R]): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[R]] = js.native
  def create[T1, T2, T3, T4, R](
    fn: js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R],
    options: adoneLib.adoneNs.utilNs.throttleNs.INs.Options
  ): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[R]] = js.native
  def create[T1, T2, T3, T4, T5, R](fn: js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R]): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, js.Promise[R]] = js.native
  def create[T1, T2, T3, T4, T5, R](
    fn: js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R],
    options: adoneLib.adoneNs.utilNs.throttleNs.INs.Options
  ): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, js.Promise[R]] = js.native
  @JSName("create")
  def create_T1R[T1, R](fn: js.Function1[/* a */ T1, R]): js.Function1[/* a */ T1, js.Promise[R]] = js.native
  @JSName("create")
  def create_T1R[T1, R](fn: js.Function1[/* a */ T1, R], options: adoneLib.adoneNs.utilNs.throttleNs.INs.Options): js.Function1[/* a */ T1, js.Promise[R]] = js.native
}

