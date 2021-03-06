package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libCompactableMod.CompactableComposition11[F, G] {
  def filter[A](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]],
    p: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]]
  def filterMap[A, B](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, B]]
  def partition[A](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]],
    p: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]]
  ]
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, RL]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, RR]]
  ]
}

