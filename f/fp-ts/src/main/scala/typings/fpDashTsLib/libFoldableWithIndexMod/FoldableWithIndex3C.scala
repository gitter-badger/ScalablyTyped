package typings
package fpDashTsLib.libFoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FoldableWithIndex3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I, U, L]
  extends fpDashTsLib.libFoldable2vMod.Foldable2v3C[F, U, L] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    b: B,
    f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]
  ): B
  def reduceWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    b: B,
    f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]
  ): B
}
